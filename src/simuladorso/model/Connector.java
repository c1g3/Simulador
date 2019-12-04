/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
/**
 *
 * @author Juan
 */
public class Connector {
    Connection c = null;
    Statement stmt = null;
    
    public Connector(){
        //try connect to DB
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:SimuladorDB.sqlite");
            System.out.println("Connected to DB OK...");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void crearTabla(){
        try{
            this.stmt = c.createStatement();
            stmt.executeUpdate("Create table if not exists proceso(idProceso integer primary key,"+
            "tamProceso integer not null, tiempoArribo integer not null, rafaga text not null, prioridad text not null)");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void eliminarProceso(Integer idProceso){
        try{
            this.stmt = c.createStatement();
            stmt.executeUpdate("delete from proceso where proceso.idProceso ="+idProceso);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void insertarProceso(Integer idProceso, Integer tamProceso, Integer tiempoArribo, String rafaga, String prioridad){
        try{
            this.stmt = c.createStatement();
            stmt.executeUpdate("insert into proceso(idProceso,tamProceso,tiempoArribo,rafaga,prioridad) values("+idProceso.toString()+","+tamProceso.toString()+","+tiempoArribo.toString()+",'"+rafaga+"','"+prioridad+"') ON CONFLICT(idProceso) DO NOTHING ");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void getProcesos(List<Proceso> colaProcesos){
        try{
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM proceso");
            while(rs.next()){
                int idProceso = rs.getInt("idProceso");
                int tamProceso = rs.getInt("tamProceso");
                int tiempoArribo = rs.getInt("tiempoArribo");
                String rafaga = rs.getString("rafaga");
                String prioridad = rs.getString("prioridad");
                int[] numbers = Arrays.stream(rafaga.split("-")).mapToInt(Integer::parseInt).toArray();
                Integer[] raffaga = intToInteger(numbers);
                Proceso proceso = new Proceso(idProceso,tamProceso,tiempoArribo,raffaga,prioridad);
                colaProcesos.add(proceso);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public Integer[] intToInteger(int[] primitiveArray)
    {
	Integer[] boxedArray = Arrays.stream(primitiveArray).boxed().toArray(Integer[]::new);
        return boxedArray;
    }
    
    public void closeConnection(){
        try{
            c.close();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}

