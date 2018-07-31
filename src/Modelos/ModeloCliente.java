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
        
}
