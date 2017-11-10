/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class EntidadFinanciera {
   int codEntidad;
   int Dpi;
   String tipo;
   int codTarjeta;
   int monto;
   int maximo;
   EntidadFinanciera siguiente;
   
   public EntidadFinanciera(){
       codEntidad=0;
       Dpi=0;
       tipo=" ";
       codTarjeta=0;
       monto=0;
       maximo=0;
       siguiente=null;
   }

    public int getCodEntidad() {
        return codEntidad;
    }

    public void setCodEntidad(int codEntidad) {
        this.codEntidad = codEntidad;
    }

    public int getDpi() {
        return Dpi;
    }

    public void setDpi(int Dpi) {
        this.Dpi = Dpi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodTarjeta() {
        return codTarjeta;
    }

    public void setCodTarjeta(int codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
    
}
