package Vista;

import Controlador.Control;
import Controlador.TableListener;
import Modelo.Alumno;
import Modelo.Profesor;
import Util.cambioImposibleException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


//@author chillaso
 
public class panelProfesor extends javax.swing.JPanel{

    private Ventana v;
    private boolean insertar;
    private TableListener tl;
    
    public panelProfesor(Ventana v) {
        initComponents();
	this.v=v;
	dialogProfesor.setLocationRelativeTo(null);
	
	tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	tl = new TableListener(tabla,5);
	tabla.getSelectionModel().addListSelectionListener(tl);
	
	tabla.setComponentPopupMenu(popup);
	popup.add(delete);	
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogProfesor = new javax.swing.JDialog();
        lblFiltro = new javax.swing.JLabel();
        lblAsig = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblAsig1 = new javax.swing.JLabel();
        lblAsig2 = new javax.swing.JLabel();
        lblAsig3 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        ape = new javax.swing.JTextField();
        insti = new javax.swing.JTextField();
        popup = new javax.swing.JPopupMenu();
        delete = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        dialogProfesor.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogProfesor.setTitle("Profesor");
        dialogProfesor.setMinimumSize(new java.awt.Dimension(685, 473));
        dialogProfesor.setResizable(false);

        lblFiltro.setFont(new java.awt.Font("The Light Font", 1, 62)); // NOI18N
        lblFiltro.setText("FILTROS");

        lblAsig.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblAsig.setText("nombre");

        nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(51, 255, 102));
        btnAceptar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnAceptar.setText("Confirmar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblAsig1.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblAsig1.setText("dni");

        lblAsig2.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblAsig2.setText("apellido");

        lblAsig3.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblAsig3.setText("instituto");

        dni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ape.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        insti.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout dialogProfesorLayout = new javax.swing.GroupLayout(dialogProfesor.getContentPane());
        dialogProfesor.getContentPane().setLayout(dialogProfesorLayout);
        dialogProfesorLayout.setHorizontalGroup(
            dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogProfesorLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(lblFiltro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogProfesorLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAsig2)
                    .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dialogProfesorLayout.createSequentialGroup()
                            .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(dialogProfesorLayout.createSequentialGroup()
                                    .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAsig)
                                        .addComponent(lblAsig3))
                                    .addGap(26, 26, 26))
                                .addGroup(dialogProfesorLayout.createSequentialGroup()
                                    .addComponent(lblAsig1)
                                    .addGap(92, 92, 92)))
                            .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ape, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(insti, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(79, 79, 79))
        );
        dialogProfesorLayout.setVerticalGroup(
            dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogProfesorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsig1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsig2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(dialogProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsig3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        popup.add(delete);

        eliminar.setText("Eliminar");

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(875, 675));

        tabla.setBackground(new java.awt.Color(204, 255, 204));
        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tabla);

        btnFiltrar.setBackground(new java.awt.Color(255, 255, 153));
        btnFiltrar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 153));
        btnAdd.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnAdd.setText("add Profesor");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 153));
        btnGuardar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(250, 250, 250)
                .addComponent(btnAdd)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
	if(v.isConectado())
	{
	    insertar=false;
	    dialogProfesor.setVisible(true);
	}	
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try
	{
	    if(!insertar)
	    {
		DefaultTableModel modelo = Control.filtrarProfs(dni.getText(), nombre.getText(), ape.getText(), insti.getText());
		TableRowSorter sorter = new TableRowSorter(modelo);
		tabla.setModel(modelo);
		tabla.setRowSorter(sorter);
	    }
	    else
	    {
		if(!dni.getText().isEmpty() && !nombre.getText().isEmpty() && !ape.getText().isEmpty() && !insti.getText().isEmpty())
		{
		    Control.insertProfesor(dni.getText(),nombre.getText(),ape.getText(),insti.getText());
		    actualizarTabla();
		}
		else
		{		    
		    JOptionPane.showMessageDialog(null, "Error, comlete todos los campos","Error",JOptionPane.ERROR_MESSAGE);
		}
	    }
	}
	catch(cambioImposibleException ex)
	{
	    JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);	    	    
	}
	dialogProfesor.dispose();
	dialogProfesor.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
	try 
	{
	    Object[] params = tl.getParams();
	    int id = (int) params[0];
	    String dni = (String) params[1];
	    String nombre = (String) params[2];
	    String apellido = (String) params[3];
	    String instituto = (String) params[4];
	    Control.updateProfesor(id, dni, nombre, apellido, instituto);
	    actualizarTabla();
	}
	catch (cambioImposibleException ex) 
	{
	    JOptionPane.showMessageDialog(null, ex.getMessage(),"Error de conexión", JOptionPane.ERROR_MESSAGE);
    	}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Object[] params = tl.getParams();
        int id = (int) params[0];
        Profesor a = Control.obtenerProfesor(id);
        Control.eliminarProfesor(a);
        actualizarTabla();
    }//GEN-LAST:event_deleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
	if(v.isConectado())
	{
	    insertar=true;
	    dialogProfesor.setVisible(true);
	}	
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnAddActionPerformed

    private void actualizarTabla()
    {
	TableListener.celda=-1;
	DefaultTableModel modelo = Control.obtenerProfesores();
	TableRowSorter sorter = new TableRowSorter(modelo);
	tabla.setModel(modelo);
	tabla.setRowSorter(sorter);
    }    
    
    public JTable getTabla() {
	return tabla;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ape;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JMenuItem delete;
    private javax.swing.JDialog dialogProfesor;
    private javax.swing.JTextField dni;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JTextField insti;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsig;
    private javax.swing.JLabel lblAsig1;
    private javax.swing.JLabel lblAsig2;
    private javax.swing.JLabel lblAsig3;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JTextField nombre;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
