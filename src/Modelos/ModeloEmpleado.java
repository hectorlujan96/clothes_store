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
public class ModeloEmpleado {

    String nombre;
    String primerApellido;
    String segundoApellido;
    //int id;
    String telefono;
    String fechaNacimiento;
    String domicilio;
    String sexo;

    public ModeloEmpleado() {
    }

    public ModeloEmpleado(String nombre, String primerApellido, String segundoApellido, String telefono, String fechaNacimiento, String domicilio, String sexo) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        //this.id = id;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    //public int getId() {
      //  return id;
    //}

    //public void setId(int id) {
      //  this.id = id;
    //}

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public int guardarRegistroUsuario(Connection connection, ModeloEmpleado e) {
        //Guarda el registro en la tabla de usuarios en la base de datos
        final String query = "INSERT INTO empleado (nombre, primer_ap, segundo_ap ,n_telefono ,fecha_n,domicilio,sexo)"
                + " VALUES (?, ?, ? , ?, ?, ? , ?)";
        try {

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, e.getNombre());
            statement.setString(2, e.getPrimerApellido());
            statement.setString(3, e.getSegundoApellido());
            statement.setString(4, e.getTelefono());
            statement.setString(5, e.getFechaNacimiento());
            statement.setString(6, e.getDomicilio());
            statement.setString(7, e.getSexo());

            return statement.executeUpdate(); // retorna 1 si es correcto
        } catch (SQLException ex) {
            System.out.println("Hubo un error");
            ex.printStackTrace();
            return 0;
        }
    }

    public static Object[][] llenarEmpleados(Connection connection) {
        Object[][] tabla = new Object[20][8];

        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM empleado");

            int i = 0;

            while (resultSet.next()) {
                tabla[i][0] = resultSet.getInt("id_e");
                tabla[i][1] = resultSet.getString("nombre");
                tabla[i][2] = resultSet.getString("primer_ap");
                tabla[i][3] = resultSet.getString("segundo_ap");
                tabla[i][4] = resultSet.getString("n_telefono");
                tabla[i][5] = resultSet.getString("fecha_n");
                tabla[i][6] = resultSet.getString("domicilio");
                tabla[i][7] = resultSet.getString("sexo");

                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return tabla;
        }
    }

    public static int eliminarUsuario(Connection connection, int id) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("delete from empleado where id_e = " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
