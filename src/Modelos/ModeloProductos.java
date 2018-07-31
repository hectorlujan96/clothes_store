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
public class ModeloProductos {
    private double precio_c;
    private double precio_v;
    private String marca;
    private String talla;
    private int cantidad;
    private String observaciones;

    public ModeloProductos(double precio_c, double precio_v, String marca, String talla, int cantidad, String observaciones) {
        this.precio_c = precio_c;
        this.precio_v = precio_v;
        this.marca = marca;
        this.talla = talla;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
    }

    public double getPrecio_c() {
        return precio_c;
    }

    public void setPrecio_c(double precio_c) {
        this.precio_c = precio_c;
    }

    public double getPrecio_v() {
        return precio_v;
    }

    public void setPrecio_v(double precio_v) {
        this.precio_v = precio_v;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }          
    
    public int guardarRegistroProducto(Connection connection, ModeloProductos p) {
        //Guarda el registro en la tabla de usuarios en la base de datos
        final String query = "INSERT INTO prenda (marca, talla, precio_c , precio_v, existencia, observaciones)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, p.getMarca());
            statement.setString(2, p.getTalla());
            statement.setDouble(3, p.getPrecio_c());
            statement.setDouble(4, p.getPrecio_v());
            statement.setInt(5, p.getCantidad());
            statement.setString(6, p.getObservaciones());

            return statement.executeUpdate(); // retorna 1 si es correcto
        } catch (SQLException ex) {
            System.out.println("Hubo un error");
            ex.printStackTrace();
            return 0;
        }
    }
    
    
    public static Object[][] llenarProductos(Connection connection) {
        Object[][] tabla = new Object[20][8];

        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM prenda");

            int i = 0;

            while (resultSet.next()) {
                tabla[i][0] = resultSet.getInt("id");
                tabla[i][1] = resultSet.getString("marca");
                tabla[i][2] = resultSet.getString("talla");
                tabla[i][3] = resultSet.getString("precio_c");
                tabla[i][4] = resultSet.getString("precio_v");
                tabla[i][5] = resultSet.getInt("existencia");
                tabla[i][6] = resultSet.getString("observaciones");
                
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return tabla;
        }
    }
    
     public static int eliminarProducto(Connection connection, int id) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("delete from prenda where id = " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
