package Vista;

//@author chillaso

import Controlador.Control;
import Modelo.Asignatura;
import javax.swing.JOptionPane;
import javax.swing.JTable;
 
public class panelAsignatura extends javax.swing.JPanel{

    private Ventana v;
    private boolean insertar;
    private int idActual;
    
    public panelAsignatura(Ventana v) {
	this.v=v;
        initComponents();
	insertar=true;
	idActual=-1;
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
        grupoRad = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(tabla);

        btnFiltrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFiltrar.setText("Filtrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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

    public JTable getTabla() {
	return tabla;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JDialog dialogAsig;
    private javax.swing.ButtonGroup grupoRad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInsti;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblprof;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtInsti;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables

}
