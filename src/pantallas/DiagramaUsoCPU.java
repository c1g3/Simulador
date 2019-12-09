/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javax.swing.JFrame;

/**
 *
 * @author Juan
 */
public class DiagramaUsoCPU {
    private static PieChart pieChart;
    
    public DiagramaUsoCPU(int usoCPU,int clock){
        initAndShowGui(usoCPU,clock);
    }
    
    private static void initAndShowGui(int usoCPU, int clock){
        JFrame frame = new JFrame();
        final JFXPanel fxpanel = new JFXPanel();
        frame.add(fxpanel);
        frame.setSize(500, 375);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pieChart = new PieChart();
        Integer porcentaje = (usoCPU*100)/clock;
        PieChart.Data slice1 = new PieChart.Data("CPU activa "+porcentaje.toString()+"%", usoCPU);
        porcentaje = ((clock-usoCPU)*100)/clock;
        PieChart.Data slice2 = new PieChart.Data("CPU inactiva "+porcentaje.toString()+"%", clock - usoCPU);
        
        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.setTitle("Porcentaje de Uso de CPU");
        
        
        Platform.runLater(new Runnable(){
            @Override
            public void run(){
                initFX(fxpanel);
            }
        });
    }
    
    private static void initFX(JFXPanel panel){
        Scene scene = createScene();
        panel.setScene(scene);
    }
    
    private static Scene createScene(){
        Group root = new Group(pieChart);
        Scene scene = new Scene(root, Color.ALICEBLUE);
        return(scene);
    }    
    
}
