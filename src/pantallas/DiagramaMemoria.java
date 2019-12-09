/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import static pantallas.DiagramaGantt.cargarGanttCPU;
import static pantallas.DiagramaGantt.cargarGanttES;
import simuladorso.model.Memoria;
import simuladorso.model.Particion;
import simuladorso.model.Proceso;

/**
 *
 * @author Juan
 */
public class DiagramaMemoria {
    private static StackedBarChart<Number,String> stackedBarChart;
    private static List<List<String>> listaParticiones;
    public static ScrollPane scrollPane;
    private static Group root;
    
    public DiagramaMemoria(){
        listaParticiones = new ArrayList<List<String>>();
    }
    
    public static void construirDiagrama(Memoria memoria,int clock){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                initAndShowGui(memoria,clock);
            }
        });
    }
    
    private static void initAndShowGui(Memoria memoria,int clock){
        JFrame frame = new JFrame();
        final JFXPanel fxpanel = new JFXPanel();
        frame.add(fxpanel);
        frame.setSize(375, 375);
        //frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Tiempo");
        NumberAxis yAxis = new NumberAxis(0,memoria.getTamMemoria(),memoria.getTamanoSo());
        yAxis.setLabel("Direcciones");
        yAxis.setMinWidth(100);
        yAxis.setMaxWidth(100);
        yAxis.setMinorTickLength(10);
        stackedBarChart = new StackedBarChart<Number,String>(yAxis, xAxis);
        stackedBarChart.setMinWidth(1300);
        stackedBarChart.setMaxWidth(6000);
        stackedBarChart.setMinHeight(5000);
        stackedBarChart.setMaxHeight(6000);
        stackedBarChart.setLayoutX(40);
        stackedBarChart.setCategoryGap(100);
        stackedBarChart.setTitle("Diagrama de Memoria"); 
           
        cargarDiagramaMemoria(memoria,clock);
        
        Platform.runLater(new Runnable(){
            @Override
            public void run(){
                initFX(fxpanel);
            }
        });
    }
    
    public static void cargarListaDiagrama(List<Particion> lista, Integer clock){
        for (Particion particion : lista){
            List<String> datosParticion = new ArrayList<String>();
            datosParticion.add(particion.getTamParticion().toString());
            datosParticion.add(particion.getIdParticion().toString());
            Proceso proceso = particion.getProceso();
            if (proceso == null){
                datosParticion.add("-");
            }
            else{
                datosParticion.add(proceso.getNombreProceso().toString());
            }
            datosParticion.add(particion.getFragmentacion().toString());
            datosParticion.add(clock.toString());
            listaParticiones.add(datosParticion);
        }
    }
    
    private static void cargarDiagramaMemoria(Memoria memoria,int clock){
        List<String> list = new ArrayList<String>();
        list.add(memoria.getTamanoSo().toString());
        list.add("SO");
        list.add("-");
        list.add("-");
        for (Integer x=clock-1;x >= 0;x--){
            XYChart.Series series = new XYChart.Series<>();
            final XYChart.Data<Number, String> data = new XYChart.Data<>(Integer.parseInt(list.get(0)), x.toString());
            data.nodeProperty().addListener((observable, oldValue, newValue) -> {
                displayLabelForData(data, list.get(1)+"\nTam: "+list.get(0));
            });
            series.getData().add(data);
            stackedBarChart.getData().add(series);
        }
        for (List<String> lista : listaParticiones){
            XYChart.Series series = new XYChart.Series<>();
            final XYChart.Data<Number, String> data = new XYChart.Data<>(Integer.parseInt(lista.get(0)), lista.get(4));
            data.nodeProperty().addListener((observable, oldValue, newValue) -> {
                if (!lista.get(0).equals("0")){
                    displayLabelForData(data, "Part: "+lista.get(1)+"\nTam: "+lista.get(0)+"\nProceso: "+lista.get(2)+"\nFrag: "+lista.get(3));
                }
            });
            series.getData().add(data);
            stackedBarChart.getData().add(series);
        }
    }
    
    private static void initFX(JFXPanel panel){
        Scene scene = createScene();
        panel.setScene(scene);
    }
    
    private static Scene createScene(){
        root = new Group(stackedBarChart);
        ScrollPane scrollPaneCreated = new ScrollPane();
        scrollPaneCreated.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPaneCreated.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        //scrollPaneCreated.hbarPolicyProperty();
        //scrollPaneCreated.fitToWidthProperty().setValue(true);
        scrollPaneCreated.setContent(root);
        scrollPane = scrollPaneCreated;
        Scene scene = new Scene(scrollPane, Color.ALICEBLUE);
        return(scene);
    }
    
    private static void displayLabelForData(XYChart.Data<Number, String> data, String nombre) {
        final Node node = data.getNode();
        final Text dataText = new Text(nombre);
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
        
}
