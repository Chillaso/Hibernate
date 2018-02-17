package Vista;

//@author chillaso

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


//Clase Listener de la tabla
public class TableListener implements ListSelectionListener {

    private final JTable tabla;
    private final Ventana v;

    public TableListener(Ventana v, JTable tabla) {
	this.tabla = tabla;
	this.v=v;
    }      

    //Método que se ejecuta cada vez que seleccionamos una fila
    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
	//if (e.getValueIsAdjusting()) return; 
	//Obtenemos el source del evento
	ListSelectionModel lsm = (ListSelectionModel) e.getSource(); 
	//Obtenemos la fila seleccionada
	int celda = lsm.getMinSelectionIndex();
	//Obtenemos el id, que siempre va a ser la primera columna de la tabla, lo parseamos y lo asignamos como idactual
	v.idActual = Integer.parseInt(tabla.getValueAt(celda,0).toString());		
	System.out.println(celda);
    }
}
