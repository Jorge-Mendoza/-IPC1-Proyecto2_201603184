
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class ListaCruceros {
    static String aux=" ";
     
    public String Leer(){
        File f=null;
        FileReader fr=null;
        BufferedReader br=null;
       
        
        try{
          f = new File("C:\\Users\\jorgi\\Desktop\\ArchivosCSVPrueba - copia\\03 Cruceros.csv");
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
    public Crucero Ver(String a){
        
        Crucero obj=new Crucero();
        String cadena[]=a.split(",");
        obj.codCrucero=Integer.parseInt(cadena[0]);
        obj.fSalida=cadena[1];
        obj.fLlegada=cadena[2];
        obj.Capacidad=Integer.parseInt(cadena[3]);
        obj.CantDias=Integer.parseInt(cadena[4]);
        obj.descripcion=cadena[5];
        obj.codDestino=Integer.parseInt(cadena[6]);
        
        //System.out.println("Reservacion no. "+obj.codTrans);
        return obj;
    }
    static String atributos;
    public void Separar(){
        String reservaciones[]=aux.split("\n");
        
        for(int i=1;i<reservaciones.length;i++){
        //System.out.println(reservaciones[i]+" y "+i);
        
        StringBuffer l=new StringBuffer();
        l=l.append(reservaciones[i]);
        atributos=l.toString();
        Enlistar(Ver(atributos));
       // System.out.println(atributos +" Y esto?");
        }
    
         
    }
    public void Enlistar(Crucero e){
        
               
        e.siguiente=primero;
        primero=e;
        //System.out.println("Esta es una prueba de que enlisté la reservacion: "+primero.codTrans+" y la "+primero.siguiente.codTrans);
    }
    public void Correr(){
        Leer();
        
        Separar();
       // System.out.println(atributos);
        
    }
    Crucero primero;
    public ListaCruceros(){
        primero=new Crucero();
    }
}
