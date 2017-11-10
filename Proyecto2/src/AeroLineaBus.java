/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class AeroLineaBus {
    
    int codTrans;
    String salida;
    String llegada;
    int capacidad;
    int codDestino;
    AeroLineaBus siguiente;
    
    public AeroLineaBus(){
        codTrans=0;
        salida=" ";
        llegada=" ";
        capacidad=0;
        codDestino=0;
        siguiente=null;
    }

    public int getCodTrans() {
        return codTrans;
    }

    public void setCodTrans(int codTrans) {
        this.codTrans = codTrans;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(int codDestino) {
        this.codDestino = codDestino;
    }
    
    
}
