/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Destino {
    int codDestino;
    String pais;
    String ciudad;
    String direccion;
    String nombreDes;
    String descripcion;
    String seguridad;
    Destino siguiente;
    
    public Destino(){
        siguiente=null;
        codDestino=0;
        pais=" ";
        ciudad=" ";
        direccion=" ";
        nombreDes=" ";
        descripcion=" ";
        seguridad=" ";
    }

    public int getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(int codDestino) {
        this.codDestino = codDestino;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDes() {
        return nombreDes;
    }

    public void setNombreDes(String nombreDes) {
        this.nombreDes = nombreDes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }
    
}
