
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class ListaReservacion {
     static String aux=" ";
     
    public String Leer(){
        File f=null;
        FileReader fr=null;
        BufferedReader br=null;
       
        
        try{
          f = new File("C:\\Users\\jorgi\\Desktop\\ArchivosCSVPrueba - copia\\09 Reservaciones.csv");
          fr=new FileReader(f);
          br=new BufferedReader(fr);
          String linea="hola";
          linea=br.readLine();
          while((linea=br.readLine())!=null){
              System.out.println(linea);
              aux= aux+"\n"+linea;
          }
           
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                fr.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
         return aux;  
    }
    public Reservacion Ver(String a){
        
        Reservacion obj=new Reservacion();
        String cadena[]=a.split(",");
        obj.codReserv=Integer.parseInt(cadena[0]);
        obj.codPaquete=Integer.parseInt(cadena[1]);
        obj.Dpi=Integer.parseInt(cadena[2]);
        obj.fReserv=cadena[3];
        obj.fSalida=cadena[4];
        obj.cantDias=Integer.parseInt(cadena[5]);
        obj.estado=cadena[6];
        obj.Saldo=Integer.parseInt(cadena[7]);
        System.out.println("Reservacion no. "+obj.codReserv);
        return obj;
    }
    static String atributos;
    public void Separar(){
        String reservaciones[]=aux.split("\n");
        
        for(int i=1;i<reservaciones.length;i++){
        System.out.println(reservaciones[i]+" y "+i);
        
        StringBuffer l=new StringBuffer();
        l=l.append(reservaciones[i]);
        atributos=l.toString();
        Enlistar(Ver(atributos));
        System.out.println(atributos +" Y esto?");
        }
    
         
    }
    public void Enlistar(Reservacion e){
        
               
        e.siguiente=primero;
        primero=e;
        System.out.println("Esta es una prueba de que enlisté la reservacion: "+primero.codReserv+" y la "+primero.siguiente.codReserv);
    }
    public void Correr(){
        Leer();
        
        Separar();
        System.out.println(atributos);
        
    }
    Reservacion primero;
    public ListaReservacion(){
        primero=new Reservacion();
    }
}

