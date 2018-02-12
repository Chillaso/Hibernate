package Vista;

import Controlador.Control;
import Modelo.Alumno;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

//@author chillaso
 
public class panelAlumnos extends javax.swing.JPanel {

    private Ventana v;
    private int selectedID;
    private boolean insertar;
    
    public panelAlumnos(Ventana v) {
        this.v=v;	
	initComponents();
	
	grupo.add(radioN);
	grupo.add(radioD);
	grupo.setSelected(radioN.getModel(), true);
	lblTipo.setText("Nombre");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogAlum = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        ape1 = new javax.swing.JTextField();
        ape2 = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        dialogEliminar = new javax.swing.JDialog();
        btnEliminarDialog = new javax.swing.JButton();
        radioN = new javax.swing.JRadioButton();
        radioD = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        grupo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnVer = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        dialogAlum.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAlum.setMinimumSize(new java.awt.Dimension(873, 674));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("DNI");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Segundo apellido");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Primer apellido");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Edad");

        dni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ape1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ape2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        edad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAceptar.setText("Confirmar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAlumLayout = new javax.swing.GroupLayout(dialogAlum.getContentPane());
        dialogAlum.getContentPane().setLayout(dialogAlumLayout);
        dialogAlumLayout.setHorizontalGroup(
            dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAlumLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogAlumLayout.createSequentialGroup()
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(79, 79, 79)
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ape1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ape2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        dialogAlumLayout.setVerticalGroup(
            dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAlumLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(dialogAlumLayout.createSequentialGroup()
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ape1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addComponent(ape2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        dialogEliminar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogEliminar.setLocationByPlatform(true);
        dialogEliminar.setMaximumSize(new java.awt.Dimension(625, 265));
        dialogEliminar.setMinimumSize(new java.awt.Dimension(625, 265));
        dialogEliminar.setModal(true);
        dialogEliminar.setPreferredSize(new java.awt.Dimension(625, 265));

        btnEliminarDialog.setText("Aceptar");
        btnEliminarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDialogActionPerformed(evt);
            }
        });

        radioN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioN.setText("Por nombre");
        radioN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioNStateChanged(evt);
            }
        });

        radioD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioD.setText("Por DNI");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Eliminar por");

        lblTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTipo.setText("Profesor");

        txtEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout dialogEliminarLayout = new javax.swing.GroupLayout(dialogEliminar.getContentPane());
        dialogEliminar.getContentPane().setLayout(dialogEliminarLayout);
        dialogEliminarLayout.setHorizontalGroup(
            dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogEliminarLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEliminarLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEliminarLayout.createSequentialGroup()
                        .addComponent(radioN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioD)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEliminarLayout.createSequentialGroup()
                        .addComponent(btnEliminarDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEliminarLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        dialogEliminarLayout.setVerticalGroup(
            dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEliminarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioN)
                    .addComponent(radioD))
                .addGap(45, 45, 45)
                .addGroup(dialogEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnEliminarDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setPreferredSize(new java.awt.Dimension(875, 675));

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

        btnVer.setText("Ver alumnos");
        btnVer.setMinimumSize(new java.awt.Dimension(155, 45));
        btnVer.setPreferredSize(new java.awt.Dimension(155, 45));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnInsert.setText("Insertar alumnos");
        btnInsert.setMinimumSize(new java.awt.Dimension(155, 45));
        btnInsert.setPreferredSize(new java.awt.Dimension(155, 45));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar alumnos");
        btnModificar.setMinimumSize(new java.awt.Dimension(155, 45));
        btnModificar.setPreferredSize(new java.awt.Dimension(155, 45));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar alumnos");
        btnEliminar.setMinimumSize(new java.awt.Dimension(155, 45));
        btnEliminar.setPreferredSize(new java.awt.Dimension(155, 45));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

	boolean result;
        int numedad = Integer.parseInt(edad.getText());
	
	if(insertar)
	    result = Control.insertAlumno(dni.getText(), nombre.getText(), ape1.getText(), ape2.getText(), numedad);	
	else
	    result = Control.updateAlumno(selectedID,dni.getText(), nombre.getText(), ape1.getText(), ape2.getText(), numedad);	
	
	if(result)
	    JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
	else
	    JOptionPane.showInternalInputDialog(null, "Error en la introducción de los datos");
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
	tabla.setModel(Control.obtenerAlumnos());
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

	dni.setText("");
	nombre.setText("");
	ape1.setText("");
	ape2.setText("");
	edad.setText("");
	
	insertar=true;
	
	dialogAlum.setVisible(true);
	dialogAlum.setModal(true);		
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
	int id = (int) tabla.getModel().getValueAt(tabla.getSelectedRow(), 0);
	Alumno alumno = Control.obtenerAlumno(id);
	selectedID = alumno.getId_alum();
	
	dni.setText(alumno.getDni());
	nombre.setText(alumno.getNombre());
	ape1.setText(alumno.getApellido1());
	ape2.setText(alumno.getApellido2());
	edad.setText(""+alumno.getEdad());
	
	insertar=false;
	
	dialogAlum.setVisible(true);
	dialogAlum.setModal(true);	
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
	dialogEliminar.setVisible(true);
	dialogEliminar.setModal(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void radioNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioNStateChanged
	if(radioN.isSelected())
	    lblTipo.setText("Nombre");
	else
	    lblTipo.setText("DNI");
    }//GEN-LAST:event_radioNStateChanged

    private void btnEliminarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDialogActionPerformed
	if(txtEliminar.getText().length()>0)
	{
	    boolean result;
	    if(radioD.isSelected())	    
		result = Control.eliminarAlumno(Control.obtenerAlumno(txtEliminar.getText(), true));	    
	    else
		result = Control.eliminarAlumno(Control.obtenerAlumno(txtEliminar.getText(),false));
	    if(result)
		JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente");	    
	    else
		JOptionPane.showMessageDialog(null, "Fallo al borrar el Alumno");
	    dialogEliminar.setVisible(false);	    
	}
	else{
	    JOptionPane.showInternalInputDialog(null, "Error, introduzca un identificador por el que eliminar");
	}
    }//GEN-LAST:event_btnEliminarDialogActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ape1;
    private javax.swing.JTextField ape2;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarDialog;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVer;
    private javax.swing.JDialog dialogAlum;
    private javax.swing.JDialog dialogEliminar;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField edad;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton radioD;
    private javax.swing.JRadioButton radioN;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables

}
