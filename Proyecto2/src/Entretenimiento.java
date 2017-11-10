/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class Entretenimiento {
    int codLugar;
    String nombre;
    String descripcion;
    String pais;
    String ciudad;
    String direccion;
    int edadMin;
    String horarioAct;
    String horarioFun;
    String recomendaciones;
    int codDestino;
    Entretenimiento siguiente;
    
    public Entretenimiento(){
        siguiente=null;
        codLugar=0;
        nombre=" ";
        descripcion=" ";
        pais=" ";
        ciudad=" ";
        direccion=" ";
        edadMin=0;
        horarioAct=" ";
        horarioFun=" ";
        recomendaciones=" ";
        codDestino=0;
    }

    public int getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(int codLugar) {
        this.codLugar = codLugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getHorarioAct() {
        return horarioAct;
    }

    public void setHorarioAct(String horarioAct) {
        this.horarioAct = horarioAct;
    }

    public String getHorarioFun() {
        return horarioFun;
    }

    public void setHorarioFun(String horarioFun) {
        this.horarioFun = horarioFun;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public int getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(int codDestino) {
        this.codDestino = codDestino;
    }
    
}
