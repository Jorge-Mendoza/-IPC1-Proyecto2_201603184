/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Crucero {
    int codCrucero;
    String fSalida;
    String fLlegada;
    int Capacidad;
    int CantDias;
    String descripcion;
    int codDestino;
    Crucero siguiente;
    
    public Crucero(){
        siguiente=null;
        codCrucero=0;
        fSalida=" ";
        fLlegada=" ";
        Capacidad=0;
        CantDias=0;
        descripcion=" ";
        codDestino=0;
    }

    public int getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(int codCrucero) {
        this.codCrucero = codCrucero;
    }

    public String getfSalida() {
        return fSalida;
    }

    public void setfSalida(String fSalida) {
        this.fSalida = fSalida;
    }

    public String getfLlegada() {
        return fLlegada;
    }

    public void setfLlegada(String fLlegada) {
        this.fLlegada = fLlegada;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getCantDias() {
        return CantDias;
    }

    public void setCantDias(int CantDias) {
        this.CantDias = CantDias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(int codDestino) {
        this.codDestino = codDestino;
    }
    
}
