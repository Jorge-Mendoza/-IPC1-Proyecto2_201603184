/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Clientes {
    int Dpi;
    String nombres;
    String apellidos;
    int noTarjeta;
    String fechaNac;
    int numTel;
    int numMov;
    String direccion;
    String frecuencia;
    String monto;
    Clientes siguiente;
    
    public Clientes(){
        Dpi=0;
        nombres=" ";
        apellidos=" ";
        noTarjeta=0;
        fechaNac=" ";
        numTel=0;
        numMov=0;
        direccion=" ";
        frecuencia="Anual";
        monto=" ";
        siguiente=null;    
    }

    public int getDpi() {
        return Dpi;
    }

    public void setDpi(int Dpi) {
        this.Dpi = Dpi;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNoTarjeta() {
        return noTarjeta;
    }

    public void setNoTarjeta(int noTarjeta) {
        this.noTarjeta = noTarjeta;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public int getNumMov() {
        return numMov;
    }

    public void setNumMov(int numMov) {
        this.numMov = numMov;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    
    
}
