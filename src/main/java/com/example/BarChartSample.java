package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class BarChartSample extends Application {
    final static String iskandar = "Muhammad Iskandar";
    final static String syaifullah = "Muhammad Nur Syaifullah";
    final static String warana = "Muhammad Ridho Waradana";
    final static String pagas = "Pagas Pandhu Tanoyo";
    final static String pilar = "Pilar Rangga Saputra";
 
    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Data Absensi MSIB selama 7 bulan");
        xAxis.setLabel("bulan");       
        yAxis.setLabel("Jumlah");
 
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Juni");       
        series1.getData().add(new XYChart.Data(iskandar, 4));
        series1.getData().add(new XYChart.Data(syaifullah, 4));
        series1.getData().add(new XYChart.Data(warana, 1));
        series1.getData().add(new XYChart.Data(pagas, 4));
        series1.getData().add(new XYChart.Data(pilar, 4));      
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("July");
        series2.getData().add(new XYChart.Data(iskandar, 3));
        series2.getData().add(new XYChart.Data(syaifullah, 4));
        series2.getData().add(new XYChart.Data(warana, 0));
        series2.getData().add(new XYChart.Data(pagas, 4));
        series2.getData().add(new XYChart.Data(pilar, 3));  
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Agustus");
        series3.getData().add(new XYChart.Data(iskandar, 3));
        series3.getData().add(new XYChart.Data(syaifullah, 3));
        series3.getData().add(new XYChart.Data(warana,3));
        series3.getData().add(new XYChart.Data(pagas, 1));
        series3.getData().add(new XYChart.Data(pilar, 2));  

        XYChart.Series series4 = new XYChart.Series();
        series4.setName("September");
        series4.getData().add(new XYChart.Data(iskandar, 4));
        series4.getData().add(new XYChart.Data(syaifullah, 4));
        series4.getData().add(new XYChart.Data(warana,2));
        series4.getData().add(new XYChart.Data(pagas, 2));
        series4.getData().add(new XYChart.Data(pilar, 2));  
        
        XYChart.Series series5 = new XYChart.Series();
        series5.setName("Cctober");
        series5.getData().add(new XYChart.Data(iskandar, 3));
        series5.getData().add(new XYChart.Data(syaifullah, 4));
        series5.getData().add(new XYChart.Data(warana,2));
        series5.getData().add(new XYChart.Data(pagas, 3));
        series5.getData().add(new XYChart.Data(pilar, 1)); 

        XYChart.Series series6 = new XYChart.Series();
        series6.setName("November");
        series6.getData().add(new XYChart.Data(iskandar, 4));
        series6.getData().add(new XYChart.Data(syaifullah, 3));
        series6.getData().add(new XYChart.Data(warana,3));
        series6.getData().add(new XYChart.Data(pagas, 3));
        series6.getData().add(new XYChart.Data(pilar, 3)); 

        XYChart.Series series7 = new XYChart.Series();
        series7.setName("December");
        series7.getData().add(new XYChart.Data(iskandar, 4));
        series7.getData().add(new XYChart.Data(syaifullah, 2));
        series7.getData().add(new XYChart.Data(warana,4));
        series7.getData().add(new XYChart.Data(pagas, 4));
        series7.getData().add(new XYChart.Data(pilar, 3)); 

        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1, series2, series3, series4, series5, series6, series7);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}