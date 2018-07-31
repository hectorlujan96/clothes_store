/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author iHector Lujan
 */
public class ModeloProductos {
    private double precio_c;
    private double precio_v;
    private String marca;
    private String talla;
    private String cantidad;
    private String observaciones;

    public ModeloProductos(double precio_c, double precio_v, String marca, String talla, String cantidad, String observaciones) {
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }          
}
