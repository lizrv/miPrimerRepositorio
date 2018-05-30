
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Archivos {
     String nombreArchivo;
    File archivo;
    //Escribir archivos o guardar
    FileWriter fw;
    //Para leer los archivos
    FileReader fr;
    
    public Archivos(String nom)
    {
        nombreArchivo=nom;
        archivo=new File(nombreArchivo);
        
    }
    
    public void crearArchivo(String datos)
    {
        try {
          fw=new FileWriter(nombreArchivo);
          PrintWriter pw=new PrintWriter(fw);
          pw.println(datos);
          pw.close();
        } 
        catch (Exception e)
        {
            System.out.println("Error en el archivo"+e.getMessage());
        }
    }
    public String leerArchivo()
    {
        String texto="";
        try {
         fr =new FileReader(nombreArchivo);
         BufferedReader br=new BufferedReader(fr);
         String linea="";
            while((linea=br.readLine())!=null)
            {
                texto+=linea+"\n";
            }
                
        } 
        catch (Exception e) {
            System.out.println("Error en el archivo"+e.getMessage()); 
        }
        return texto;
    }
   public void AgregaTexto(String nuevo)
   {
       String c=leerArchivo();
       String resultado=c+"\n"+nuevo;
       crearArchivo(resultado);
   }
}
