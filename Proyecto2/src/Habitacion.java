/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Habitacion {
    int codHotel;
    int noHabitacion;
    int codReserv;
    int cantPersonas;
    int costo;
    String clase;
    Habitacion siguiente;
    
    public Habitacion(){
        codHotel=0;
        noHabitacion=0;
        codReserv=0;
        cantPersonas=0;
        costo=0;
        clase=" ";
        siguiente=null;
    }

    public int getCodHotel() {
        return codHotel;
    }

    public void setCodHotel(int codHotel) {
        this.codHotel = codHotel;
    }

    public int getNoHabitacion() {
        return noHabitacion;
    }

    public void setNoHabitacion(int noHabitacion) {
        this.noHabitacion = noHabitacion;
    }

    public int getCodReserv() {
        return codReserv;
    }

    public void setCodReserv(int codReserv) {
        this.codReserv = codReserv;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
}
