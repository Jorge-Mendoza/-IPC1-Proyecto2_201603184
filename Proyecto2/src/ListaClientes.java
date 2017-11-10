
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
public class ListaClientes {
    static String aux=" ";
     
    public String Leer(){
        File f=null;
        FileReader fr=null;
        BufferedReader br=null;
       
        
        try{
          f = new File("C:\\Users\\jorgi\\Desktop\\ArchivosCSVPrueba - copia\\05 Clientes.csv");
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
    public Clientes Ver(String a){
        
        Clientes obj=new Clientes();
        String cadena[]=a.split(",");
        obj.Dpi=Integer.parseInt(cadena[0]);
        obj.nombres=cadena[1];
        obj.apellidos=cadena[2];
        obj.noTarjeta=Integer.parseInt(cadena[3]);
        obj.fechaNac=cadena[4];
        obj.numTel=Integer.parseInt(cadena[5]);
        obj.numMov=Integer.parseInt(cadena[6]);
        obj.direccion=cadena[7];
        obj.frecuencia=cadena[8];
        obj.monto=cadena[9];
        
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
        i++;
       // System.out.println(atributos +" Y esto?");
        }
    
         
    }
    int i=0;
    public void Enlistar(Clientes e){
        
               System.out.println(e.nombres);
        e.siguiente=primero;
        primero=e;
        //System.out.println("Esta es una prueba de que enlisté la reservacion: "+primero.codTrans+" y la "+primero.siguiente.codTrans);
    }
    public void Correr(){ 
        Leer();
        
        Separar();
       // System.out.println(atributos);
        
    }
    Clientes primero;
    public ListaClientes(){
        primero=new Clientes();
    }
    public Clientes Buscar(int i){
       Clientes aux=new Clientes();
       
       aux=primero;
       while(aux.Dpi!=i){
           System.out.println(aux.Dpi);
           aux=aux.siguiente;
           
       }
       return aux;
    }
    
}
