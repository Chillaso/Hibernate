package Controlador;

//@author chillaso

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


//Clase Listener de la tabla
public class TableListener implements ListSelectionListener {

    private final JTable tabla;
    public static Object[] params;
    public static int celda;

    public TableListener(JTable tabla, int colums) {
	this.tabla = tabla;
	params= new Object[colums];
    }      

    //Método que se ejecuta cada vez que seleccionamos una fila
    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
	//Obtenemos el source del evento
	ListSelectionModel lsm = (ListSelectionModel) e.getSource(); 
	//Obtenemos la fila seleccionada	
	try{
	    celda = lsm.getMinSelectionIndex();
	    //Obtenemos el id, que siempre va a ser la primera columna de la tabla, lo parseamos y lo asignamos como idactual	
	    for(int i = 0; i<params.length;i++)
	    {	    
		params[i] = tabla.getValueAt(celda, i);	 
	    }	
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
	    for(int i = 0; i<params.length;i++)
	    {	    
		params[i] = tabla.getValueAt(0, i);	 
	    }		    
	}
    }    
}
