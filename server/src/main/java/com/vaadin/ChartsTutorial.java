package com.vaadin;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.servlet.annotation.WebServlet;

import com.vaadin.ChartsData.ShoeSizeInfo;
import com.vaadin.ChartsData.WeatherInfo;
import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.model.AxisType;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.model.DataProviderSeries;
import com.vaadin.addon.charts.model.DataSeries;
import com.vaadin.addon.charts.model.DataSeriesItem;
import com.vaadin.addon.charts.model.PlotOptionsColumn;
import com.vaadin.addon.charts.model.PlotOptionsLine;
import com.vaadin.addon.charts.model.YAxis;
import com.vaadin.addon.charts.model.style.SolidColor;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("mytheme")
@SuppressWarnings("serial")
public class ChartsTutorial extends UI
{

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = ChartsTutorial.class, widgetset = "com.vaadin.AppWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);

        ChartsData data = new ChartsData();
        layout.addComponent(getShoeSizeChart(data));
        layout.addComponent(getWeatherChart(data));
    }

    private Chart getShoeSizeChart(ChartsData data) {
        Chart chart = new Chart();
        Configuration conf = chart.getConfiguration();
        conf.setTitle("Shoe size per age for boys and girls");

        conf.getChart().setType(ChartType.LINE);

        DataSeries girls = new DataSeries("Girls");
        for(ShoeSizeInfo shoeSizeInfo : data.getGirlsData()) {
            // Shoe size on the X-axis, age on the Y-axis
            girls.add(new DataSeriesItem(
                    shoeSizeInfo.getSize(),
                    shoeSizeInfo.getAgeMonths() / 12.0f));
        }
        conf.addSeries(girls);
        conf.getxAxis().setTitle("Shoe size (EU)");
        conf.getyAxis().setTitle("Age (Years)");

        DataSeries boys = new DataSeries("Boys");
        for(ShoeSizeInfo shoeSizeInfo : data.getBoysData()) {
            // Shoe size on the X-axis, age on the Y-axis
            boys.add(new DataSeriesItem(
                    shoeSizeInfo.getSize(),
                    shoeSizeInfo.getAgeMonths() / 12.0f));
        }
        conf.addSeries(boys);

        PlotOptionsLine girlsOpts = new PlotOptionsLine();
        girlsOpts.setColor(SolidColor.HOTPINK);
        girls.setPlotOptions(girlsOpts);
        PlotOptionsLine boysOpts = new PlotOptionsLine();
        boysOpts.setColor(SolidColor.BLUE);
        boys.setPlotOptions(boysOpts);
        return chart;
    }

    private Chart getWeatherChart(ChartsData data) {
        Chart chart = new Chart();
        Configuration conf = chart.getConfiguration();
        conf.setTitle("Turku, Finland 2013");

        conf.getChart().setType(ChartType.LINE);

        ListDataProvider<WeatherInfo> weatherDataProvider = DataProvider
                .ofCollection(data.getWeatherData());

        weatherDataProvider.addFilter(point -> {
            LocalDateTime date = LocalDateTime.ofInstant(point.getInstant(),
                    ZoneId.of("Europe/Helsinki"));
            return date.getDayOfWeek() == DayOfWeek.SUNDAY;
        });

        DataProviderSeries<WeatherInfo> temp = new DataProviderSeries<>(
                weatherDataProvider);
        temp.setName("Temperature");
        temp.setX(WeatherInfo::getInstant);
        temp.setY(WeatherInfo::getMaxTemp);

        conf.getxAxis().setTitle("Date");
        conf.getxAxis().setType(AxisType.DATETIME);
        conf.getyAxis().setTitle("Temperature (°C)");

        DataProviderSeries<WeatherInfo> humidity = new DataProviderSeries<>(
                weatherDataProvider);
        humidity.setName("Humidity");
        humidity.setX(WeatherInfo::getInstant);
        humidity.setY(WeatherInfo::getMeanHumidity);
        humidity.setPlotOptions(new PlotOptionsColumn());

        conf.addSeries(humidity);
        conf.addSeries(temp);

        YAxis humidityYAxis = new YAxis();
        humidityYAxis.setTitle("Humidity (%)");
        humidityYAxis.setMin(0);
        humidityYAxis.setMax(150);
        humidityYAxis.setOpposite(true);
        conf.addyAxis(humidityYAxis);
        humidity.setyAxis(humidityYAxis);

        return chart;
    }

}
