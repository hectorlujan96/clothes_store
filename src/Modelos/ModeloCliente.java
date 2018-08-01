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
public class ModeloCliente {
    private String nombre;
    private String primer_ap;
    private String segundo_ap;
    private String RFC;
    private String telefono;
    private String fecha_n;
    private String domicilio;
    private String sexo;

    public ModeloCliente(String nombre, String primer_ap, String segundo_ap, String RFC, String telefono, String fecha_n, String domicilio, String sexo) {
        this.nombre = nombre;
        this.primer_ap = primer_ap;
        this.segundo_ap = segundo_ap;
        this.RFC = RFC;
        this.telefono = telefono;
        this.fecha_n = fecha_n;
        this.domicilio = domicilio;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_ap() {
        return primer_ap;
    }

    public void setPrimer_ap(String primer_ap) {
        this.primer_ap = primer_ap;
    }

    public String getSegundo_ap() {
        return segundo_ap;
    }

    public void setSegundo_ap(String segundo_ap) {
        this.segundo_ap = segundo_ap;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(String fecha_n) {
        this.fecha_n = fecha_n;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public static Object[][] llenarClientes(Connection connection) {
        Object[][] tabla = new Object[20][9];

        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM cliente");

            int i = 0;

            while (resultSet.next()) {
                tabla[i][0] = resultSet.getInt("id_c");
                tabla[i][1] = resultSet.getString("nombre");
                tabla[i][2] = resultSet.getString("primer_ap");
                tabla[i][3] = resultSet.getString("segundo_ap");
                tabla[i][4] = resultSet.getString("fecha_n");
                tabla[i][5] = resultSet.getString("sexo");
                tabla[i][6] = resultSet.getString("domicilio");
                tabla[i][7] = resultSet.getString("n_telefono");
                tabla[i][8] = resultSet.getString("rfc");

                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return tabla;
        }
    }
    
     public int guardarRegistroCliente(Connection connection, ModeloCliente c) {
        //Guarda el registro en la tabla de usuarios en la base de datos
        final String query = "INSERT INTO cliente (nombre, primer_ap, segundo_ap ,fecha_n, sexo, domicilio, n_telefono, rfc)"
                + " VALUES (?, ?, ? , ?, ?, ? , ?,?)";
        try {

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, c.getNombre());
            statement.setString(2, c.getPrimer_ap());
            statement.setString(3, c.getSegundo_ap());
            statement.setString(4, c.getFecha_n());
            statement.setString(5, c.getSexo());
            statement.setString(6, c.getDomicilio());
            statement.setString(7, c.getTelefono());
            statement.setString(8,c.getRFC());           
            

            return statement.executeUpdate(); // retorna 1 si es correcto
        } catch (SQLException ex) {
            System.out.println("Hubo un error");
            ex.printStackTrace();
            return 0;
        }
    }
        
     public static int eliminarCliente(Connection connection, int id) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("delete from cliente where id_c = " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
