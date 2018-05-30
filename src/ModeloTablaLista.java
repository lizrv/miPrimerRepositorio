
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTablaLista extends AbstractTableModel
{
    static ArrayList<Jugador> lista;
    static String [] columnasTabla={"Num. Cliente","Nombre","Apellido","Género","Saldo"};
    
    public ModeloTablaLista(ArrayList<Jugador>l) {
        lista=l;
    }

    
    
    @Override
    public int getRowCount()
    {
            //NUMERO DE RENGLONES EN MI TABLOA
       return lista.size();
    }
    @Override
     public String getColumnName(int columna) {
        return columnasTabla[columna];
    }

    @Override
    public int getColumnCount() {
         return columnasTabla.length;
    }

    @Override
    public Object getValueAt(int renglon, int columna)
    {
       switch(columna)
        {
            case 0:
               return lista.get(renglon).getNumJugador();
            case 1:
                return lista.get(renglon).getNombre();
                
            case 2:
                return lista.get(renglon).getApellido();
            case 3:
                return lista.get(renglon).getGenero();
            case 4:
                return lista.get(renglon).getSaldo();
        }
        return null;
    }
    
}
