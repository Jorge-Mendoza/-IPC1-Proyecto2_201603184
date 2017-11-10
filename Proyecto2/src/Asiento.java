/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Asiento {
    int codTrans;
    int codReserv;
    int noAsiento;
    String Asiento;
    int costo;
    Asiento siguiente;
    
    public Asiento(){
    codTrans=0;
    codReserv=0;
    noAsiento=0;
    Asiento=" ";
    costo=0;
    siguiente=null;
    }

    public int getCodTrans() {
        return codTrans;
    }

    public void setCodTrans(int codTrans) {
        this.codTrans = codTrans;
    }

    public int getCodReserv() {
        return codReserv;
    }

    public void setCodReserv(int codReserv) {
        this.codReserv = codReserv;
    }

    public int getNoAsiento() {
        return noAsiento;
    }

    public void setNoAsiento(int noAsiento) {
        this.noAsiento = noAsiento;
    }

    public String getAsiento() {
        return Asiento;
    }

    public void setAsiento(String Asiento) {
        this.Asiento = Asiento;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
