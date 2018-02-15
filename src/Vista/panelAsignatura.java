package Vista;

//@author chillaso

import Controlador.Control;
import Modelo.Asignatura;
import javax.swing.JOptionPane;

 
public class panelAsignatura extends javax.swing.JPanel {

    private Ventana v;
    private boolean insertar;
    private int idActual;
    
    public panelAsignatura(Ventana v) {
	this.v=v;
        initComponents();
	insertar=true;
	idActual=-1;
	grupoRad.add(radioNA);
	grupoRad.add(radioNP);
	radioNA.setSelected(true);
	lblTipo.setText("Nombre");
	dialogEliminar.setLocationRelativeTo(null);
	dialogAsig.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogAsig = new javax.swing.JDialog();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblprof = new javax.swing.JLabel();
        txtProfesor = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        txtInsti = new javax.swing.JTextField();
        lblInsti = new javax.swing.JLabel();
        dialogEliminar = new javax.swing.JDialog();
        radioNA = new javax.swing.JRadioButton();
        radioNP = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnEliminarDialog = new javax.swing.JButton();
        grupoRad = new javax.swing.ButtonGroup();
        btnModificar = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnVer = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        dialogAsig.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAsig.setLocationByPlatform(true);
        dialogAsig.setMinimumSize(new java.awt.Dimension(628, 321));
        dialogAsig.setResizable(false);

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblprof.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblprof.setText("Profesor");

        txtProfesor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtInsti.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblInsti.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInsti.setText("Instituto");

        javax.swing.GroupLayout dialogAsigLayout = new javax.swing.GroupLayout(dialogAsig.getContentPane());
        dialogAsig.getContentPane().setLayout(dialogAsigLayout);
        dialogAsigLayout.setHorizontalGroup(
            dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogAsigLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(dialogAsigLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblprof)
                    .addComponent(lblInsti)
                    .addGroup(dialogAsigLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInsti, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        dialogAsigLayout.setVerticalGroup(
            dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAsigLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprof, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInsti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInsti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dialogEliminar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogEliminar.setMinimumSize(new java.awt.Dimension(591, 348));

        radioNA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioNA.setText("Nombre Asignatura");
        radioNA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioNAStateChanged(evt);
            }
        });

        radioNP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioNP.setText("Nombre profesor");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Eliminar por");

        lblTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTipo.setText("Profesor");

        txtEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnEliminarDialog.setText("Aceptar");
        btnEliminarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogEliminarLayout = new javax.swing.GroupLayout(dialogEliminar.getContentPane());
        dialogEliminar.getContentPane().setLayout(dialogEliminarLayout);
        dialogEliminarLayout.setHorizontalGroup(
            dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogEliminarLayout.createSequentialGroup()
                .addGroup(dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogEliminarLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(radioNA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNP))
                    .addGroup(dialogEliminarLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEliminarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(234, 234, 234))))
        );
        dialogEliminarLayout.setVerticalGroup(
            dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEliminarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNA)
                    .addComponent(radioNP))
                .addGap(63, 63, 63)
                .addGroup(dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnEliminarDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnModificar.setText("Modificar asignatura");
        btnModificar.setMinimumSize(new java.awt.Dimension(155, 45));
        btnModificar.setPreferredSize(new java.awt.Dimension(155, 45));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnDel.setText("Eliminar asignatura");
        btnDel.setMinimumSize(new java.awt.Dimension(155, 45));
        btnDel.setPreferredSize(new java.awt.Dimension(155, 45));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        btnVer.setText("Ver asignaturas");
        btnVer.setMinimumSize(new java.awt.Dimension(155, 45));
        btnVer.setPreferredSize(new java.awt.Dimension(155, 45));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnInsert.setText("Insertar asignaturas");
        btnInsert.setMinimumSize(new java.awt.Dimension(155, 45));
        btnInsert.setPreferredSize(new java.awt.Dimension(155, 45));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
	txtNombre.setText("");
	txtProfesor.setText("");
	
	insertar=true;
	
	dialogAsig.setVisible(true);
	dialogAsig.setModal(true);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
	tabla.setModel(Control.obtenerAsignaturas());
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
	int id = (int) tabla.getModel().getValueAt(tabla.getSelectedRow(), 0);
	Asignatura a = Control.obtenerAsignatura(id);
	idActual = a.getId_asig();
	
	txtNombre.setText(a.getNombre());
	
	insertar=false;
	
	dialogAsig.setVisible(true);
	dialogAsig.setModal(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
	dialogEliminar.setVisible(true);
	dialogEliminar.setModal(true);
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
	boolean result;
	if(insertar)
	    result = Control.insertAsignatura(txtNombre.getText(), txtProfesor.getText(),txtInsti.getText());
	else
	    result = Control.updateAsignatura(idActual,txtNombre.getText(), txtProfesor.getText(),txtInsti.getText());
	
	if(result)
	{
	    JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
	    dialogAsig.setVisible(false);
	}  
	else
	    JOptionPane.showInternalInputDialog(null, "Error en la introducción de los datos");	
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnEliminarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDialogActionPerformed
       	if(txtEliminar.getText().length()>0)
	{
	    boolean result;
	    if(radioNA.isSelected())	    
		result = Control.eliminarAsignatura(Control.obtenerAsignatura(txtEliminar.getText(), true));	    
	    else
		result = Control.eliminarAsignatura(Control.obtenerAsignatura(txtEliminar.getText(), false));
	    
	    if(result)
		JOptionPane.showMessageDialog(null, "Asignatura eliminada correctamente");	    
	    else
		JOptionPane.showMessageDialog(null, "Fallo al borrar Asignatura");
	    
	    dialogEliminar.setVisible(false);	    
	}
	else{
	    JOptionPane.showInternalInputDialog(null, "Error, introduzca un identificador por el que eliminar");
	}
    }//GEN-LAST:event_btnEliminarDialogActionPerformed

    private void radioNAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioNAStateChanged
	if(radioNA.isSelected())
	    lblTipo.setText("Nombre");
	else
	    lblTipo.setText("Profesor");
    }//GEN-LAST:event_radioNAStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEliminarDialog;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVer;
    private javax.swing.JDialog dialogAsig;
    private javax.swing.JDialog dialogEliminar;
    private javax.swing.ButtonGroup grupoRad;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInsti;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblprof;
    private javax.swing.JRadioButton radioNA;
    private javax.swing.JRadioButton radioNP;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtInsti;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables

}
