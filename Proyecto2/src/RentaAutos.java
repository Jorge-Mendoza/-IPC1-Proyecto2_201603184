/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class RentaAutos {
    int codEmpresa;
    int Dpi;
    int cantPasajeros;
    String terreno;
    int dias;
    int monto;
    String fEntrega;
    String fDevolucion;
    String descripcion;
    RentaAutos siguiente;
    
    public RentaAutos(){
        siguiente=null;
        codEmpresa=0;
        Dpi=0;
        cantPasajeros=0;
        terreno=" ";
        dias=0;
        monto=0;
        fEntrega=" ";
        fDevolucion=" ";
        descripcion=" ";
    }

    public int getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(int codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public int getDpi() {
        return Dpi;
    }

    public void setDpi(int Dpi) {
        this.Dpi = Dpi;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getfEntrega() {
        return fEntrega;
    }

    public void setfEntrega(String fEntrega) {
        this.fEntrega = fEntrega;
    }

    public String getfDevolucion() {
        return fDevolucion;
    }

    public void setfDevolucion(String fDevolucion) {
        this.fDevolucion = fDevolucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
