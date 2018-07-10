/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iHector Lujan
 */
public class Conexion {

    public void establecerConexion() {
        Connection conexion = null;
        String urlDatabase = "jdbc:postgresql://localhost/TAP?currentSchema=tienda_ropa";
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(urlDatabase, "postgres", "silver");
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
        System.out.println("¡La conexión se realizo sin problemas! =) \n");

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        
        try {
            PreparedStatement statement = conexion.prepareStatement("SELECT * FROM EMPLEADO");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getString("id_e"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Primer apellido: " + rs.getString("primer_ap"));
                System.out.println("Segundo apellido: " + rs.getString("segundo_ap"));
                System.out.println("Fecha de nacimiento: " + rs.getString("fecha_n"));
                System.out.println("Sexo: " + rs.getString("sexo"));
                System.out.println("Domicilio: " + rs.getString("domicilio"));
                System.out.println("Numero telefonico: " + rs.getString("n_telefono"));
                System.out.println("Usuario: " + rs.getString("usuario"));
                System.out.println("Contraseña: " + rs.getString("contraseña"));
                System.out.println();
            }
            statement.close();
            
        } catch (Exception e) {
                //System.out.println(e.getMessage());                        
        }
    }

    public static void main(String[] args) throws SQLException {
        Conexion cn = new Conexion();
        cn.establecerConexion();
    }
 
}
