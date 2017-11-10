
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
public class ListaPaquetes {
    static String aux=" ";
     
    public String Leer(){
        File f=null;
        FileReader fr=null;
        BufferedReader br=null;
       
        
        try{
          f = new File("C:\\Users\\jorgi\\Desktop\\ArchivosCSVPrueba - copia\\08 Paquetes.csv");
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
    public Paquete Ver(String a){
        
        Paquete obj=new Paquete();
        String cadena[]=a.split(",");
        obj.codPaquete=Integer.parseInt(cadena[0]);
        obj.tipo=cadena[1];
        obj.clase=cadena[2];
        obj.cantViajeros=Integer.parseInt(cadena[3]);
        obj.codTrans=Integer.parseInt(cadena[4]);
        obj.codHotel=Integer.parseInt(cadena[5]);
        obj.codCrucero=Integer.parseInt(cadena[6]);
        obj.codRentadora=Integer.parseInt(cadena[7]);
        obj.codDestino=Integer.parseInt(cadena[8]);
        obj.codLugar=Integer.parseInt(cadena[9]);
        obj.Costo=Integer.parseInt(cadena[10]);
        
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
    public void Enlistar(Paquete e){
        
               
        e.siguiente=primero;
        primero=e;
        //System.out.println("Esta es una prueba de que enlisté la reservacion: "+primero.codTrans+" y la "+primero.siguiente.codTrans);
    }
    public void Correr(){
        Leer();
        
        Separar();
       // System.out.println(atributos);
        
    }
    Paquete primero;
    public ListaPaquetes(){
        primero=new Paquete();
    }
    public void recorre(){
        Paquete pack=new Paquete();
        pack=primero;
        //System.out.println(pack.codPaquete);
        Paquetes p=new Paquetes();
        while(pack!=null){
            p.jComboBox1.addItem(String.valueOf(pack.codPaquete));
        //System.out.println(pack.codPaquete);
            pack=pack.siguiente;            
    }
//Paquete p=new Paquete();
//p=primero;
//while(p!=null){
//    System.out.println(p.codPaquete);
//    
//    
//    p=p.siguiente;
//}
    }
}
