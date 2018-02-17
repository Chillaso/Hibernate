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
	dialogAlum.setLocationRelativeTo(null);
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
        instituto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();

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

        instituto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("The Light Font", 1, 62)); // NOI18N
        jLabel6.setText("FILTROS");

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
                        .addGroup(dialogAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instituto, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(instituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
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
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addGap(57, 57, 57)))
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
	dialogAlum.setVisible(true);
	
    }//GEN-LAST:event_btnFiltrarActionPerformed

    public JTable getTabla() {
	return tabla;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ape;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JDialog dialogAlum;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField instituto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
