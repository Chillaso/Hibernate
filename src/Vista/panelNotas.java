package Vista;

//@author chillaso

import Controlador.Control;
import Controlador.TableListener;
import Util.cambioImposibleException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

 
public class panelNotas extends javax.swing.JPanel{

    private Ventana v;
    private boolean insertar;
    private TableListener tl;
    private final int[] COMPARADOR = new int[]{-2,-1,0,1,2};
    
    public panelNotas(Ventana v) {
        this.v=v;
	initComponents();
	dialogNota.setLocationRelativeTo(null);
	tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	tl = new TableListener(tabla,3);
	tabla.getSelectionModel().addListSelectionListener(tl);
	
	tabla.setComponentPopupMenu(popup);
	popup.add(delete);	
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogNota = new javax.swing.JDialog();
        lblFiltro = new javax.swing.JLabel();
        lblAsig = new javax.swing.JLabel();
        asig = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblAsig1 = new javax.swing.JLabel();
        lblAsig2 = new javax.swing.JLabel();
        alum = new javax.swing.JTextField();
        nota = new javax.swing.JTextField();
        comparador = new javax.swing.JComboBox<>();
        popup = new javax.swing.JPopupMenu();
        delete = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        dialogNota.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogNota.setTitle("Notas");
        dialogNota.setMinimumSize(new java.awt.Dimension(671, 400));

        lblFiltro.setFont(new java.awt.Font("The Light Font", 1, 62)); // NOI18N
        lblFiltro.setText("FILTROS");

        lblAsig.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblAsig.setText("alumno");

        asig.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(51, 255, 102));
        btnAceptar.setFont(new java.awt.Font("The Light Font", 1, 18)); // NOI18N
        btnAceptar.setText("Confirmar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblAsig1.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblAsig1.setText("nota");

        lblAsig2.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblAsig2.setText("asignatura");

        alum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        nota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        comparador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "<=", "=", ">=", ">" }));

        javax.swing.GroupLayout dialogNotaLayout = new javax.swing.GroupLayout(dialogNota.getContentPane());
        dialogNota.getContentPane().setLayout(dialogNotaLayout);
        dialogNotaLayout.setHorizontalGroup(
            dialogNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogNotaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(dialogNotaLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(dialogNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAsig2)
                    .addComponent(lblAsig)
                    .addComponent(lblAsig1))
                .addGap(34, 34, 34)
                .addGroup(dialogNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFiltro)
                    .addComponent(alum, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asig, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogNotaLayout.createSequentialGroup()
                        .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        dialogNotaLayout.setVerticalGroup(
            dialogNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNotaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dialogNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsig))
                .addGap(45, 45, 45)
                .addGroup(dialogNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsig2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(dialogNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsig1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comparador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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
        jScrollPane2.setViewportView(tabla);

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
        btnAñadir.setText("Add Nota");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(276, 276, 276)
                .addComponent(btnAñadir)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(624, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
	if(v.isConectado())
	{
	    insertar=false;
	    dialogNota.setVisible(true);
	}	
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnFiltrarActionPerformed

    
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
	if(!insertar)
	{
	    int n = -1;
	    if(!nota.getText().isEmpty())
		n = Integer.parseInt(nota.getText());
	    int c = COMPARADOR[comparador.getSelectedIndex()];
	    DefaultTableModel modelo = Control.filtrarNotas(asig.getText(),alum.getText(), n, c);
	    TableRowSorter sorter = new TableRowSorter(modelo);
	    tabla.setModel(modelo);
	    tabla.setRowSorter(sorter);
	}
	else
	{
	    if(!alum.getText().isEmpty() && !asig.getText().isEmpty() && !nota.getText().isEmpty())
	    {
		try 
		{
		    Control.insertNotas(alum.getText(), asig.getText(), Integer.parseInt(nota.getText()));
		    actualizarTabla();
		} 
		catch (cambioImposibleException ex) 
		{
		    JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);	    
		}
	    }
	}
	dialogNota.dispose();
	dialogNota.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
	try {
	    Object[] params = tl.getParams();
	    String al = (String) params[0];
	    String as = (String) params[1];
	    int no = Integer.parseInt((String)params[2]);
	    Control.updateNotas(al, as, no);
	    actualizarTabla();
	} catch (cambioImposibleException ex) 
	{
	    JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);	    
	}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
	JOptionPane.showMessageDialog(null, "No se puede borrar anda aquí","Error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_deleteActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
	if(v.isConectado())
	{
	    insertar=true;
	    dialogNota.setVisible(true);
	}	
	else{
	    JOptionPane.showMessageDialog(null, "Error, conectese primero", "Error de conexión", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void actualizarTabla()
    {
	TableListener.celda=-1;
	DefaultTableModel modelo = Control.obtenerNotas();
	TableRowSorter sorter = new TableRowSorter(modelo);
	tabla.setModel(modelo);
	tabla.setRowSorter(sorter);
    }    
    
    public JTable getTabla() {
	return tabla;
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alum;
    private javax.swing.JTextField asig;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comparador;
    private javax.swing.JMenuItem delete;
    private javax.swing.JDialog dialogNota;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAsig;
    private javax.swing.JLabel lblAsig1;
    private javax.swing.JLabel lblAsig2;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JTextField nota;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
