/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javafx.scene.chart.*;
import javafx.scene.control.ScrollPane;
import simuladorso.model.Proceso;

/**
 *
 * @author Juan
 */
public class DiagramaGantt {
    private static StackedBarChart<Number,String> stackedBarChart;
    
    public DiagramaGantt(List<Proceso> listaCPU,List<Proceso> listaES){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                initAndShowGui(listaCPU,listaES);
            }
        });

    }
    
    private static void initAndShowGui(List<Proceso> listaCPU,List<Proceso> listaES){
        JFrame frame = new JFrame();
        final JFXPanel fxpanel = new JFXPanel();
        frame.add(fxpanel);
        frame.setSize(6000, 375);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis(0,listaCPU.size(),1);
        yAxis.setLabel("Tiempo");
        yAxis.setMinWidth(100);
        yAxis.setMaxWidth(100);
        yAxis.setMinorTickLength(10);
        stackedBarChart = new StackedBarChart<Number,String>(yAxis, xAxis);
        stackedBarChart.setMinWidth(1200);
        stackedBarChart.setMaxWidth(6000);
        stackedBarChart.setLayoutX(40);
        stackedBarChart.setCategoryGap(100);
        stackedBarChart.setTitle("Diagrama de Gantt"); 
        ScrollPane scrollPaneCreated = new ScrollPane();
        scrollPaneCreated.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPaneCreated.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        cargarGanttES(listaES);
        cargarGanttCPU(listaCPU);    
            
        Platform.runLater(new Runnable(){
            @Override
            public void run(){
                initFX(fxpanel);
            }
        });
    }
    
    public static void cargarGanttCPU(List<Proceso> listaCPU){
        for (Proceso proceso : listaCPU){
            XYChart.Series series = new XYChart.Series<>();
            final String nombre;
            if (proceso == null){
                nombre = "null";
            }
            else{
                nombre = proceso.getNombreProceso().toString();
            }
            series.setName(nombre);
            final XYChart.Data<Number, String> data = new XYChart.Data<>(1, "CPU");
            data.nodeProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                if (nombre.equals("null")){
                    displayLabelForData(data,"-");
                }else {
                    displayLabelForData(data, nombre);
                }
            }
            });
            series.getData().add(data);
            stackedBarChart.getData().add(series);
        }
    }
    
    public static void cargarGanttES(List<Proceso> listaES){
        for (Proceso proceso : listaES){
            XYChart.Series series = new XYChart.Series<>();
            final String nombre;
            if (proceso == null){
                nombre = "null";
            }
            else{
                nombre = proceso.getNombreProceso().toString();
            }
            series.setName(nombre);
            final XYChart.Data<Number, String> data = new XYChart.Data<>(1, "E/S");
            data.nodeProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                if (nombre.equals("null")){
                    displayLabelForData(data,"-");
                }else {
                    displayLabelForData(data, nombre);
                }
            }
            });
            series.getData().add(data);
            stackedBarChart.getData().add(series);
        }
    }
    
    private static void displayLabelForData(XYChart.Data<Number, String> data, String idProceso) {
        final Node node = data.getNode();
        final Text dataText = new Text(idProceso);
        node.parentProperty().addListener((ov, oldParent, parent) -> {
            Group parentGroup = (Group) parent;
            parentGroup.getChildren().add(dataText);
        });

        node.boundsInParentProperty().addListener((ov, oldBounds, bounds) -> {
            dataText.setLayoutX(
                    Math.round(
                            bounds.getMinX() + bounds.getWidth() / 2 - dataText.prefWidth(-1) / 2
                    )
            );
            dataText.setLayoutY(
                    Math.round(
                            bounds.getMinY() - dataText.prefHeight(-1) * (-1.5)
                    )
            );
        });
    }
    
    private static void initFX(JFXPanel panel){
        Scene scene = createScene();
        panel.setScene(scene);
    }
    
    private static Scene createScene(){
        Group root = new Group(stackedBarChart);
        Scene scene = new Scene(root, Color.ALICEBLUE);
        return(scene);
    }
    
}
