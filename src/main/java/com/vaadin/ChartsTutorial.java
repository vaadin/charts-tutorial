package com.vaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.ChartsData.ShoeSizeInfo;
import com.vaadin.ChartsData.WeatherInfo;
import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.ChartOptions;
import com.vaadin.addon.charts.model.AxisType;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.model.DataSeries;
import com.vaadin.addon.charts.model.DataSeriesItem;
import com.vaadin.addon.charts.model.Options3d;
import com.vaadin.addon.charts.model.PlotOptionsColumn;
import com.vaadin.addon.charts.model.PlotOptionsLine;
import com.vaadin.addon.charts.model.YAxis;
import com.vaadin.addon.charts.model.style.SolidColor;
import com.vaadin.addon.charts.themes.VaadinLightTheme;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
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

        ChartOptions.get().setTheme(new VaadinLightTheme());

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

        DataSeries temp = new DataSeries("Temperature");
        for (int i=0; i<data.getWeatherData().size(); i+=14) {
            WeatherInfo weatherInfo = data.getWeatherData().get(i);
            // Date on the X-axis, mean temperature on the Y-axis
            temp.add(new DataSeriesItem(
                    weatherInfo.getDate(),
                    weatherInfo.getMaxTemp()));
        }
        conf.getxAxis().setTitle("Date");
        conf.getxAxis().setType(AxisType.DATETIME);
        conf.getyAxis().setTitle("Temperature (°C)");

        DataSeries humidity = new DataSeries("Humidity");
        for (int i=0; i<data.getWeatherData().size(); i+=14) {
            WeatherInfo weatherInfo = data.getWeatherData().get(i);
            // Date on the X-axis, humidity on the Y-axis
            humidity.add(new DataSeriesItem(
                    weatherInfo.getDate(),
                    weatherInfo.getMeanHumidity()));
        }
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

        Options3d options3d = new Options3d();
        options3d.setAlpha(10);
        options3d.setBeta(10);
        options3d.setEnabled(true);
        conf.getChart().setOptions3d(options3d);

        return chart;
    }

}
