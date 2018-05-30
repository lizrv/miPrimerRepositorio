
public class Jugador extends Persona
{
    //ATRIBUTOS
    int numJugador;
    double saldo;
    
    //CONSTRUCTORES
    public Jugador()
    {
        numJugador=0;
        saldo=0;
    }
    public Jugador(String n,String a,String g,int numJ,double sal )
    {
       super(n,a,g);
       numJugador=numJ;
       saldo=sal;
              
    }
    //SETERS
    public void setNumJugador(int numJ)
    {
        numJugador=numJ;
    }
    public void setSaldo(double sal)
    {
        saldo=sal;
    }
    //GETERS
    public int getNumJugador()
    {
        return numJugador;
    }
    public double getSaldo()
    {
        return saldo;
    }
   
    
    public void incrementarSaldo(double cantidad)
    {
        saldo=saldo+cantidad;
    
    }
    public void decrementarSaldo(double cantidad)
    {
        
        saldo=saldo-cantidad;
        
    }
    public boolean SaldoDisponible(double cantidad)
    {
        return(cantidad<=saldo);
    
    }
    
         
}
