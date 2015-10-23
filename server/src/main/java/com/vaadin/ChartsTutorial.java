package com.vaadin;

import com.vaadin.ChartsData.ShoeSizeInfo;
import com.vaadin.ChartsData.WeatherInfo;
import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.model.AxisType;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.model.ContainerDataSeries;
import com.vaadin.addon.charts.model.DataSeries;
import com.vaadin.addon.charts.model.DataSeriesItem;
import com.vaadin.addon.charts.model.PlotOptionsColumn;
import com.vaadin.addon.charts.model.PlotOptionsLine;
import com.vaadin.addon.charts.model.YAxis;
import com.vaadin.addon.charts.model.style.SolidColor;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Container.Filter;
import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.filter.Compare.Equal;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import javax.servlet.annotation.WebServlet;
import java.util.Date;

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

        BeanItemContainer<WeatherInfo> weatherContainer =
                new BeanItemContainer<WeatherInfo>(
                        WeatherInfo.class, data.getWeatherData());

        ContainerDataSeries temp = new ContainerDataSeries(weatherContainer);
        temp.setName("Temperature");
        temp.setXPropertyId("date");    // will call WeatherInfo.getDate()
        temp.setYPropertyId("maxTemp"); // will call WeatherInfo.getMaxTemp()

        conf.getxAxis().setTitle("Date");
        conf.getxAxis().setType(AxisType.DATETIME);
        conf.getyAxis().setTitle("Temperature (°C)");

        ContainerDataSeries humidity = new ContainerDataSeries(weatherContainer);
        humidity.setName("Humidity");
        humidity.setXPropertyId("date");            // will call WeatherInfo.getDate()
        humidity.setYPropertyId("meanHumidity");    // will call WeatherInfo.getMeanHumidity()
        humidity.setPlotOptions(new PlotOptionsColumn());

        weatherContainer.addContainerFilter(new Filter() {
            @Override
            public boolean passesFilter(Object o, Item item) throws UnsupportedOperationException {
                Date date = (Date)item.getItemProperty("date").getValue();
                return date.getDay() == 0;
            }

            @Override
            public boolean appliesToProperty(Object o) {
                return "date".equals(o);
            }
        });

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
