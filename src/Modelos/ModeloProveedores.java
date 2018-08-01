/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iHector Lujan
 */
public class ModeloProveedores {
    private String razon_social;
    private String telefono;
    private String correo;
    private String direccion;

    public ModeloProveedores(String razon_social, String telefono, String correo, String direccion) {
        this.razon_social = razon_social;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }    
    
    public static Object[][] llenarProveedor(Connection connection) {
        Object[][] tabla = new Object[20][5];

        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM proveedor");

            int i = 0;

            while (resultSet.next()) {
                tabla[i][0] = resultSet.getInt("id_p");
                tabla[i][1] = resultSet.getString("razon_social");
                tabla[i][2] = resultSet.getString("n_telefono");
                tabla[i][3] = resultSet.getString("direccion");
                tabla[i][4] = resultSet.getString("correo_e");

                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return tabla;
        }
    }
    
     public int guardarRegistroProveedor(Connection connection, ModeloProveedores p) {
        //Guarda el registro en la tabla de usuarios en la base de datos
        final String query = "INSERT INTO proveedor (razon_social, n_telefono, direccion, correo_e)"
                + " VALUES (?, ?, ?, ?)";
        try {

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, p.getRazon_social());
            statement.setString(2, p.getTelefono());
            statement.setString(3, p.getDireccion());
            statement.setString(4, p.getCorreo());            

            return statement.executeUpdate(); // retorna 1 si es correcto
        } catch (SQLException ex) {
            System.out.println("Hubo un error");
            ex.printStackTrace();
            return 0;
        }
    }
        
     public static int eliminarProveedor(Connection connection, int id) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("delete from proveedor where id_p = " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
