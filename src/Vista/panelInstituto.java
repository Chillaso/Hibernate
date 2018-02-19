package Vista;

import Controlador.Control;
import Controlador.TableListener;
import Modelo.Alumno;
import Modelo.Instituto;
import Util.cambioImposibleException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;


//@author chillaso
 
public class panelInstituto extends javax.swing.JPanel {

    private Ventana v;
    private boolean insertar;
    private TableListener tl;
    
    public panelInstituto(Ventana v) {
        initComponents();
	this.v=v;
	dialogInsti.setLocationRelativeTo(null);
	tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	tl = new TableListener(tabla,3);
	tabla.getSelectionModel().addListSelectionListener(tl); //Cambiar el 6
	
	tabla.setComponentPopupMenu(popup);
	popup.add(delete);	
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogInsti = new javax.swing.JDialog();
        lblFiltro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblLocalidad = new javax.swing.JLabel();
        localidad = new javax.swing.JTextField();
        popup = new javax.swing.JPopupMenu();
        delete = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        dialogInsti.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogInsti.setTitle("Instituto");
        dialogInsti.setMinimumSize(new java.awt.Dimension(668, 362));

        lblFiltro.setFont(new java.awt.Font("The Light Font", 1, 62)); // NOI18N
        lblFiltro.setText("FILTROS");

        lblNombre.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblNombre.setText("nombre");

        nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(51, 255, 102));
        btnAceptar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnAceptar.setText("Confirmar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblLocalidad.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblLocalidad.setText("localidad");

        localidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout dialogInstiLayout = new javax.swing.GroupLayout(dialogInsti.getContentPane());
        dialogInsti.getContentPane().setLayout(dialogInstiLayout);
        dialogInstiLayout.setHorizontalGroup(
            dialogInstiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInstiLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(dialogInstiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogInstiLayout.createSequentialGroup()
                        .addGroup(dialogInstiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocalidad)
                            .addComponent(lblNombre))
                        .addGap(25, 25, 25)
                        .addGroup(dialogInstiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiltro)
                            .addComponent(localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        dialogInstiLayout.setVerticalGroup(
            dialogInstiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInstiLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(dialogInstiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(dialogInstiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
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

        btnAñadir.setBackground(new java.awt.Color(255, 255, 153));
        btnAñadir.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnAñadir.setText("Add Instituto");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAñadir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
	if(v.isConectado())
	{
	    insertar=true;
	    dialogInsti.setVisible(true);
	}	
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
	if(v.isConectado())
	{
	    insertar=false;
	    dialogInsti.setVisible(true);
	}	
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
	if(!insertar)
	{
	    tabla.setModel(Control.filtrarInstitutos(nombre.getText(), localidad.getText()));
	}
	else
	{
	    if(!nombre.getText().isEmpty() && !localidad.getText().isEmpty())
	    {
		Control.insertInstituto(nombre.getText(), localidad.getText());
		actualizarTabla();
	    }
	}
	dialogInsti.dispose();
	dialogInsti.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
	Object[] params = tl.getParams();
	int id = (int) params[0];
	String nombre = (String) params[1];
	String localidad =  (String) params[2];
	Control.updateInstituto(id, nombre, localidad);	
	actualizarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
	try 
	{
	    Object[] params = tl.getParams();
	    String id = (String) params[1];
	    Instituto a = Control.obtenerInstituto(id);
	    Control.eliminarInstituto(a);
	    actualizarTabla();
	} 
	catch (cambioImposibleException ex) 
	{
	    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_deleteActionPerformed

    private void actualizarTabla()
    {
	TableListener.celda=-1;
	tabla.setModel(Control.obtenerInstitutos());
    }    
    
    public JTable getTabla() {
	return tabla;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JMenuItem delete;
    private javax.swing.JDialog dialogInsti;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField localidad;
    private javax.swing.JTextField nombre;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
