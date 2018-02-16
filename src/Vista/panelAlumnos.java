package Vista;

import Controlador.Control;
import javax.swing.JOptionPane;
import javax.swing.JTable;

//@author chillaso
 
public class panelAlumnos extends javax.swing.JPanel{

    private Ventana v;
    private int selectedID;
    private boolean insertar;
    
    public panelAlumnos(Ventana v) {
        this.v=v;	
	initComponents();	
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
        ape = new javax.swing.JTextField();
        ape2 = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        instituto = new javax.swing.JTextField();
        grupo = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();

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

        ape.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

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

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Instituto");

        instituto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

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
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogAlumLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ape, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ape2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogAlumLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(instituto, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                            .addComponent(ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addComponent(ape2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(instituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
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
        jScrollPane2.setViewportView(tabla);

        btnFiltrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFiltrar.setText("Filtrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(754, Short.MAX_VALUE))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

	boolean result;
        int numedad = Integer.parseInt(edad.getText());
	
	if(insertar)
	    result = Control.insertAlumno(dni.getText(), nombre.getText(), ape.getText(), numedad,instituto.getText());	
	else
	    result = Control.updateAlumno(selectedID,dni.getText(), nombre.getText(), ape.getText(), numedad,instituto.getText());	
	
	if(result)
	    JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
	else
	    JOptionPane.showInternalInputDialog(null, "Error en la introducción de los datos");
    }//GEN-LAST:event_btnAceptarActionPerformed

    public JTable getTabla() {
	return tabla;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ape;
    private javax.swing.JTextField ape2;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JDialog dialogAlum;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField edad;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JTextField instituto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
