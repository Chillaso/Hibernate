package Vista;

import Controlador.TableListener;
import Controlador.Control;
import Modelo.Alumno;
import Modelo.Instituto;
import Util.cambioImposibleException;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

//@author chillaso
 
public class panelAlumnos extends javax.swing.JPanel{

    private Ventana v;
    private boolean insertar;
    private TableListener tl;
    
    public panelAlumnos(Ventana v) {
        this.v=v;	
	initComponents();	
	dialogAlum.setLocationRelativeTo(null);
	
	//EDICION TABLA		
	tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	tl = new TableListener(tabla,6);
	tabla.getSelectionModel().addListSelectionListener(tl);
	
	tabla.setComponentPopupMenu(popup);
	popup.add(delete);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogAlum = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        ape = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        instituto = new javax.swing.JComboBox<>();
        eliminar = new javax.swing.JMenuItem();
        popup = new javax.swing.JPopupMenu();
        delete = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        dialogAlum.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAlum.setTitle("Alumnos");
        dialogAlum.setMinimumSize(new java.awt.Dimension(873, 674));

        jLabel1.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        jLabel1.setText("DNI");

        jLabel3.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        jLabel4.setText("Primer apellido");

        jLabel5.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        jLabel5.setText("Edad");

        dni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ape.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        edad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(51, 255, 102));
        btnAceptar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnAceptar.setText("Confirmar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        jLabel7.setText("Instituto");

        jLabel6.setFont(new java.awt.Font("The Light Font", 1, 62)); // NOI18N
        jLabel6.setText("FILTROS");

        instituto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        instituto.setMaximumRowCount(5);

        javax.swing.GroupLayout dialogAlumLayout = new javax.swing.GroupLayout(dialogAlum.getContentPane());
        dialogAlum.getContentPane().setLayout(dialogAlumLayout);
        dialogAlumLayout.setHorizontalGroup(
            dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAlumLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogAlumLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogAlumLayout.createSequentialGroup()
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(100, 100, 100)
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ape, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dialogAlumLayout.createSequentialGroup()
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(165, 165, 165)
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edad, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(instituto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(107, 107, 107))
        );
        dialogAlumLayout.setVerticalGroup(
            dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAlumLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        eliminar.setText("Eliminar");

        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        popup.add(delete);

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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        btnAdd.setBackground(new java.awt.Color(255, 255, 153));
        btnAdd.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnAdd.setText("add Alumno");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnFiltrar.setBackground(new java.awt.Color(255, 255, 153));
        btnFiltrar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 153));
        btnGuardar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnGuardar.setText("guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(624, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addGap(57, 57, 57)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
	try{
	    if(!insertar)
	    {	
		int e=-1;
		if(!edad.getText().isEmpty())
		    e = Integer.parseInt(edad.getText());

		tabla.setModel(Control.filtrarAlumnos(dni.getText(),nombre.getText(),ape.getText(),e,instituto.getSelectedItem().toString()));	   
	    }
	    else
	    {	    
		if(!dni.getText().isEmpty() && !nombre.getText().isEmpty() && !ape.getText().isEmpty() 
			&& !instituto.getSelectedItem().toString().isEmpty() && !edad.getText().isEmpty())
		{
		    int e = Integer.parseInt(edad.getText());
		    Instituto i = Control.obtenerInstituto(instituto.getSelectedItem().toString());
		    Control.insertAlumno(dni.getText(), nombre.getText(), ape.getText(), e, i.getNombre());
		    actualizarTabla();		
		}
		else
		{
		    JOptionPane.showMessageDialog(null, "Error, comlete todos los campos","Error",JOptionPane.ERROR_MESSAGE);
		}	    
	    }
	    dialogAlum.dispose();
	    dialogAlum.setVisible(false);
	}
	catch(cambioImposibleException ex)
	{
	    JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
	if(v.isConectado())
	{
	    instituto.setModel(Control.rellenarCombo());
	    insertar=true;
	    dialogAlum.setVisible(true);
	}
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
	if(v.isConectado())
	{
	    instituto.setModel(Control.rellenarCombo());
	    insertar=false;
	    dialogAlum.setVisible(true);
	}	
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
	try{
	    Object[] params = tl.getParams();
	    int id = (int) params[0];
	    String d = (String) params[1];
	    String n = (String) params[2];
	    String a = (String) params[3];
	    int e = (int) params[4];
	    String i =(String) params[5];
	    Control.updateAlumno(id, d, n, a, e, i);	
	    actualizarTabla();
	}
	catch(cambioImposibleException ex)
	{
	    JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);	    
	}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
	if(evt.getButton()==MouseEvent.BUTTON3)
	{	    
	    tabla.getComponentPopupMenu().show(null, evt.getX(), evt.getY());
	}
    }//GEN-LAST:event_tablaMousePressed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
	Object[] params = tl.getParams();
	int id = (int) params[0];
	Alumno a = Control.obtenerAlumno(id);
	Control.eliminarAlumno(a);	
	actualizarTabla();
    }//GEN-LAST:event_deleteActionPerformed
    
    private void actualizarTabla()
    {
	TableListener.celda=-1;
	tabla.setModel(Control.obtenerAlumnos());
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
    private javax.swing.JDialog dialogAlum;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField edad;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JComboBox<String> instituto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
