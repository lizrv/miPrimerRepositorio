
public class Persona 
{
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String genero;
    
    //CONSTRUCTORES
    public Persona()
    {
        nombre="";
        apellido="";
        genero="";
   
    }
    
    public Persona(String n,String a,String g)
    {
        nombre=n;
        apellido=a;
        genero=g;
    }
    
    //SETERS
    public void setNombre(String n)
    {
        nombre=n;
    }
    public void setApellido(String a)
    {
        apellido=a;
    }
    public void setGenero(String g)
    {
        genero=g;
    }
    
    //GETERS
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    public String getGenero()
    {
        return genero;
    }
      
}
