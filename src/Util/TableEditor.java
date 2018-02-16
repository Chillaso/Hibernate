package Util;

//@author chillaso

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;


public class TableEditor extends AbstractCellEditor implements TableCellEditor{

    public TableEditor()
    {
	
    }
    
    @Override
    public Object getCellEditorValue() 
    {
	return null;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) 
    {
	String antiguo = o.toString();
	return null;
    }

    @Override
    public boolean stopCellEditing() 
    {	
	return super.stopCellEditing(); //To change body of generated methods, choose Tools | Templates.
    }    
    
}
