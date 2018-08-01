/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iHector Lujan
 */
public class Conexion {
    private static Conexion instance;
    private Connection conection;

    private final String URL = "jdbc:postgresql://localhost/TAP?currentSchema=tienda_ropa";
    private final String USER = "postgres";
    private final String PASSWORD = "silver";
    
    //private final String URL = "jdbc:postgresql://localhost/TAP?currentSchema=tienda_ropa";
    //private final String USER = "postgres";
    //private final String PASSWORD = "hernandez612";
    
    // ihector96  lujansito

    private Conexion(){
    }

    public static Conexion getInstance(){
        if(instance == null)
            instance = new Conexion();
        return instance;
    }

    public void establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(ClassNotFoundException ignored){}
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            conection.close();
        }catch (Exception ignored){}
    }


    public Connection getConection() {
        return conection;
    }

    public void setConection (Connection conection) {
        this.conection = conection;
    }

}
