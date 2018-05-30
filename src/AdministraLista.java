
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AdministraLista 
{
    //Atributo de clase declaro una lista dinamica
    private ArrayList<Jugador>listaPersonas;
    
    //Constructor de la clase
    public AdministraLista(ArrayList<Jugador>lp)
    {
        listaPersonas=lp;
    }
    //METODOS
    
    //Tamaño de la lista
    public int tamanioLista()
    {
        return listaPersonas.size();
    }
    //Agrega persona a la lista
    public void agregaPersona(Jugador pers)
    {
        listaPersonas.add(pers);
              
    }
    //Imprime lista
    public String imprimeListaPersonas()
    {
        String resultado="";
        for(int i=0;i< listaPersonas.size();i++)
        {
           resultado+= (listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getNombre()+" - "+listaPersonas.get(i).getApellido()+" - "+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getSaldo()+"\n");
        }
        return resultado;
    }
    //Busca persona
    public int buscaPersona(int numBuscar)
    {
        int posicion=-1;
        int vueltas=0;
        boolean encontro=false;
        while((encontro==false)&&vueltas<tamanioLista())
        {
            if(numBuscar==(listaPersonas.get(vueltas).getNumJugador()))
            {
                encontro=true;
                posicion=vueltas;
            }
            vueltas++;
            
        }
        return posicion;
        
    }
    //Regresa Persona
    public Object regresaPersona(int posicion)
    {
        return listaPersonas.get(posicion);        
    } 
    //Elimina persona
    public void eliminaPersona(int posicion)
    {

            listaPersonas.remove(posicion);
           
    }
    
    
  
    
}
