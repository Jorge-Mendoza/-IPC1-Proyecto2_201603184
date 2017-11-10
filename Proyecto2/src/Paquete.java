/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Paquete {
    int codPaquete;
    String tipo;
    String clase;
    int cantViajeros;
    int codTrans;
    int codHotel;
    int codCrucero;
    int codRentadora;
    int codDestino;
    int codLugar;
    int Costo;
    Paquete siguiente;
    
    public Paquete(){
        codPaquete=0;
        tipo=" ";
        clase=" ";
        cantViajeros=0;
        codTrans=0;
        codHotel=0;
        codCrucero=0;
        codRentadora=0;
        codDestino=0;
        codLugar=0;
        Costo=0;
        siguiente=null;
    }

    public int getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(int codPaquete) {
        this.codPaquete = codPaquete;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getCantViajeros() {
        return cantViajeros;
    }

    public void setCantViajeros(int cantViajeros) {
        this.cantViajeros = cantViajeros;
    }

    public int getCodTrans() {
        return codTrans;
    }

    public void setCodTrans(int codTrans) {
        this.codTrans = codTrans;
    }

    public int getCodHotel() {
        return codHotel;
    }

    public void setCodHotel(int codHotel) {
        this.codHotel = codHotel;
    }

    public int getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(int codCrucero) {
        this.codCrucero = codCrucero;
    }

    public int getCodRentadora() {
        return codRentadora;
    }

    public void setCodRentadora(int codRentadora) {
        this.codRentadora = codRentadora;
    }

    public int getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(int codDestino) {
        this.codDestino = codDestino;
    }

    public int getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(int codLugar) {
        this.codLugar = codLugar;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    
}
