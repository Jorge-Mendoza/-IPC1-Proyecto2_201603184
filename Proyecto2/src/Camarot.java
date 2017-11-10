/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Camarot{
    int codCrucero;
    int codReserv;
    int noHabitacion;
    int costo;
    Camarot siguiente;
    
    public Camarot(){
        codCrucero=0;
        codReserv=0;
        noHabitacion=0;
        costo=0;
        siguiente=null;
    }

    public int getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(int codCrucero) {
        this.codCrucero = codCrucero;
    }

    public int getCodReserv() {
        return codReserv;
    }

    public void setCodReserv(int codReserv) {
        this.codReserv = codReserv;
    }

    public int getNoHabitacion() {
        return noHabitacion;
    }

    public void setNoHabitacion(int noHabitacion) {
        this.noHabitacion = noHabitacion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
