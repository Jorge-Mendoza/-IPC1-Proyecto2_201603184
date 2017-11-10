/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Reservacion {
    int codReserv;
    int codPaquete;
    int Dpi;
    String fReserv;
    String fSalida;
    int cantDias;
    String estado;
    int Saldo;
    Reservacion siguiente;
    
    public Reservacion(){
        siguiente=null;
        codReserv=0;
        codPaquete=0;
        Dpi=0;
        fReserv=" ";
        fSalida=" ";
        cantDias=0;
        estado=" ";
        Saldo=0;
         
    }

    public int getCodReserv() {
        return codReserv;
    }

    public void setCodReserv(int codReserv) {
        this.codReserv = codReserv;
    }

    public int getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(int codPaquete) {
        this.codPaquete = codPaquete;
    }

    public int getDpi() {
        return Dpi;
    }

    public void setDpi(int Dpi) {
        this.Dpi = Dpi;
    }

    public String getfReserv() {
        return fReserv;
    }

    public void setfReserv(String fReserv) {
        this.fReserv = fReserv;
    }

    public String getfSalida() {
        return fSalida;
    }

    public void setfSalida(String fSalida) {
        this.fSalida = fSalida;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    
}
