package Vista;

//@author chillaso

import Controlador.Control;
import Controlador.TableListener;
import Modelo.Asignatura;
import Util.cambioImposibleException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
 
public class panelAsignatura extends javax.swing.JPanel{

    private Ventana v;
    private boolean insertar;
    private TableListener tl;
    
    public panelAsignatura(Ventana v) {
	this.v=v;
        initComponents();
	insertar=true;
	dialogAsig.setLocationRelativeTo(null);
	tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	
	tl = new TableListener(tabla,4);
	tabla.getSelectionModel().addListSelectionListener(tl);
	
	tabla.setComponentPopupMenu(popup);
	popup.add(delete);	
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogAsig = new javax.swing.JDialog();
        lblAsig = new javax.swing.JLabel();
        lblFiltro = new javax.swing.JLabel();
        lblProfe = new javax.swing.JLabel();
        lblInsti = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        instituto = new javax.swing.JTextField();
        profesor = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        grupoRad = new javax.swing.ButtonGroup();
        popup = new javax.swing.JPopupMenu();
        delete = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        dialogAsig.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAsig.setTitle("Asignatura");
        dialogAsig.setLocationByPlatform(true);
        dialogAsig.setMinimumSize(new java.awt.Dimension(712, 420));
        dialogAsig.setResizable(false);

        lblAsig.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblAsig.setText("aSIGNATURA");

        lblFiltro.setFont(new java.awt.Font("The Light Font", 1, 62)); // NOI18N
        lblFiltro.setText("FILTROS");

        lblProfe.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblProfe.setText("pROFESOR");

        lblInsti.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblInsti.setText("INSTITUTO");

        nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        instituto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        profesor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(51, 255, 102));
        btnAceptar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnAceptar.setText("Confirmar");
        btnAceptar.setMaximumSize(new java.awt.Dimension(712, 400));
        btnAceptar.setMinimumSize(new java.awt.Dimension(712, 400));
        btnAceptar.setPreferredSize(new java.awt.Dimension(712, 400));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAsigLayout = new javax.swing.GroupLayout(dialogAsig.getContentPane());
        dialogAsig.getContentPane().setLayout(dialogAsigLayout);
        dialogAsigLayout.setHorizontalGroup(
            dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAsigLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInsti)
                    .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dialogAsigLayout.createSequentialGroup()
                            .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAsig)
                                .addComponent(lblProfe))
                            .addGap(18, 18, 18)
                            .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(instituto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogAsigLayout.createSequentialGroup()
                    .addContainerGap(252, Short.MAX_VALUE)
                    .addComponent(lblFiltro)
                    .addGap(246, 246, 246)))
        );
        dialogAsigLayout.setVerticalGroup(
            dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAsigLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsti, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(dialogAsigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogAsigLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(lblFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
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
        btnAdd.setText("Add Asignatura");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 153));
        btnGuardar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnGuardar.setText("GUARDAR");
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
                .addGap(238, 238, 238)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
	try{
		if(!insertar)
	    {
		tabla.setModel(Control.filtrarAsig(nombre.getText(),profesor.getText(),instituto.getText()));
	    }
	    else
	    {
		if(!nombre.getText().isEmpty() && !profesor.getText().isEmpty() && !instituto.getText().isEmpty())
		{
		    Control.insertAsignatura(nombre.getText(), profesor.getText().split(" ")[0], instituto.getText());
		    actualizarTabla();
		}
		else
		{
		    JOptionPane.showMessageDialog(null, "Error, comlete todos los campos","Error",JOptionPane.ERROR_MESSAGE);
		}		
	    }
	    dialogAsig.dispose();
	    dialogAsig.setVisible(false);
	}
	catch(cambioImposibleException ex)
	{
	    JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);	    
	}
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
	if(v.isConectado())
	{
	    insertar=false;
	    dialogAsig.setVisible(true);
	}	
	else
	{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
	try{
	    Object[] params = tl.getParams();	
	    int id = (int) params[0];
	    String nom = (String) params[1];	    
	    String prof = (String) params[2];
	    String ins = (String) params[3];
	    Control.updateAsignatura(id, nom, prof.split(" ")[0], ins);	
	    actualizarTabla();
	}
	catch(cambioImposibleException ex)
	{
	    JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Object[] params = tl.getParams();
        int id = (int) params[0];
        Asignatura a = Control.obtenerAsignatura(id);
        Control.eliminarAsignatura(a);
        actualizarTabla();
    }//GEN-LAST:event_deleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
	if(v.isConectado())
	{
	    insertar=true;
	    dialogAsig.setVisible(true);
	}	
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnAddActionPerformed

    private void actualizarTabla()
    {
	TableListener.celda=-1;
	tabla.setModel(Control.obtenerAsignaturas());
    }
    
    public JTable getTabla() {
	return tabla;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JMenuItem delete;
    private javax.swing.JDialog dialogAsig;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.ButtonGroup grupoRad;
    private javax.swing.JTextField instituto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsig;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblInsti;
    private javax.swing.JLabel lblProfe;
    private javax.swing.JTextField nombre;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTextField profesor;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
