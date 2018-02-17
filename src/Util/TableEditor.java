package Util;

//@author chillaso

import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Instituto;
import Modelo.Nota;
import Modelo.Profesor;
import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;


public class TableEditor extends AbstractCellEditor implements TableCellEditor{
   
    private Object o;
    
    public TableEditor()
    {
	
    }
    
    //Me devuelve el objeto que he editado
    @Override
    public Object getCellEditorValue() 
    {	
	return o;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) 
    {
	this.o=o;
	if(bln)
	{
	    if(o instanceof Alumno)
	    {

	    }
	    else if(o instanceof Asignatura)
	    {

	    }
	    else if(o instanceof Profesor)
	    {

	    }
	    else if(o instanceof Nota)
	    {

	    }
	    else if(o instanceof Instituto)
	    {

	    }
	}
	return null;
    }     
}
