package Vista;

//@author chillaso

import Controlador.Control;
import Modelo.Alumno;
import Modelo.Asignatura;
import javax.swing.JOptionPane;

 
public class panelNotas extends javax.swing.JPanel {

    private Ventana v;
    
    public panelNotas(Ventana v) {
        this.v=v;
	initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogInsert = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        id_alum = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreAsig = new javax.swing.JTextField();
        nota = new javax.swing.JTextField();
        btnAlum = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAsig = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Id alumno");

        id_alum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCancelar.setText("Cancelar");

        btnAceptar.setText("Aceptar");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre asignatura");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nota");

        nombreAsig.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        nota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout dialogInsertLayout = new javax.swing.GroupLayout(dialogInsert.getContentPane());
        dialogInsert.getContentPane().setLayout(dialogInsertLayout);
        dialogInsertLayout.setHorizontalGroup(
            dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInsertLayout.createSequentialGroup()
                .addGroup(dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogInsertLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(nombreAsig))
                    .addGroup(dialogInsertLayout.createSequentialGroup()
                        .addGroup(dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogInsertLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dialogInsertLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(141, 141, 141)
                                        .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogInsertLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(100, 100, 100)
                                        .addComponent(id_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(dialogInsertLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dialogInsertLayout.setVerticalGroup(
            dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInsertLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogInsertLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogInsertLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dialogInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        btnAlum.setText("Ver por alumno");
        btnAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumActionPerformed(evt);
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

        btnAsig.setText("Ver por asignatura");
        btnAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsigActionPerformed(evt);
            }
        });

        btnInsert.setText("Insertar nota");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(144, 144, 144)
                .addComponent(btnAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsigActionPerformed
	//Obtener asignatura
	String nombre = JOptionPane.showInputDialog(null, "Introduce nombre de la asignatura","Buscar asignatura");
	Asignatura a = Control.obtenerAsignatura(nombre, false);
	tabla.setModel(Control.notasAsig(a));	 
    }//GEN-LAST:event_btnAsigActionPerformed

    private void btnAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumActionPerformed
	String nombre = JOptionPane.showInputDialog(null,"Introduce nombre del alumno","Buscar alumno");
	Alumno a = Control.obtenerAlumno(nombre, false);
	tabla.setModel(Control.notasAlum(a));
    }//GEN-LAST:event_btnAlumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAlum;
    private javax.swing.JButton btnAsig;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInsert;
    private javax.swing.JDialog dialogInsert;
    private javax.swing.JTextField id_alum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreAsig;
    private javax.swing.JTextField nota;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
