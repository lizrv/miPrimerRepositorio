
public class LanzarDados
{
    //ESTA CLASE SOLO LANZA LOS DADOS
    //ATRIBUTOS
    private int dado;
    
    //METODOS GET
    public int getDado()
    {
        return dado;
    }
    
    //Lanzar Dados
    public int lanzamiento()
    {
        dado=(int)(Math.random()*10);
        
        while((dado==0)||(dado>6))
                {
                   dado=(int)(Math.random()*10);   
                }
        return dado;
    }
    
}
