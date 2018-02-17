package Vista;

import Controlador.Control;
import Util.HibernateUtil;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class Ventana extends javax.swing.JFrame {

    private Control c;
    private boolean conectado;
    private panelAlumnos pa;
    private panelAsignatura paa;
    private panelNotas pn;
    private panelProfesor pp;
    private panelInstituto pi;
    
    public Ventana() 
    {
        initComponents();
	setLocationRelativeTo(null);
	
	pa = new panelAlumnos(this);
	paa = new panelAsignatura(this);
	pn = new panelNotas(this);
	pp = new panelProfesor(this);
	pi = new panelInstituto(this);
	tabPane.add(pa,"Alumnos");
	tabPane.add(paa,"Asignatura");
	tabPane.add(pn,"Notas");	
	tabPane.add(pp,"Profesor");
	tabPane.add(pi,"Instituto");
	conectado=false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carga = new javax.swing.JDialog();
        lblcargar = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar();
        btnCancelar = new javax.swing.JButton();
        tabPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBD = new javax.swing.JMenu();
        conectar = new javax.swing.JMenuItem();
        desconectar = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        FAQ = new javax.swing.JMenu();
        verFAQ = new javax.swing.JMenuItem();

        carga.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        carga.setTitle("Cargando...");
        carga.setBackground(new java.awt.Color(204, 255, 204));
        carga.setMinimumSize(new java.awt.Dimension(646, 292));

        lblcargar.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        lblcargar.setText("Cargando datos de la Base de Datos. Espere...");

        progreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("The Light Font", 1, 24)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cargaLayout = new javax.swing.GroupLayout(carga.getContentPane());
        carga.getContentPane().setLayout(cargaLayout);
        cargaLayout.setHorizontalGroup(
            cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cargaLayout.createSequentialGroup()
                .addGroup(cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cargaLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblcargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(cargaLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnCancelar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        cargaLayout.setVerticalGroup(
            cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cargaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblcargar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACCESO A DATOS");
        setMinimumSize(new java.awt.Dimension(873, 674));

        tabPane.setFont(new java.awt.Font("DejaVu Sans Light", 1, 14)); // NOI18N
        tabPane.setPreferredSize(new java.awt.Dimension(875, 675));

        jMenuBar1.setFont(new java.awt.Font("DejaVu Sans Light", 1, 14)); // NOI18N

        menuBD.setText("Conexión");
        menuBD.setFont(new java.awt.Font("DejaVu Sans Light", 1, 14)); // NOI18N

        conectar.setFont(new java.awt.Font("DejaVu Sans Light", 1, 12)); // NOI18N
        conectar.setText("Conectar BD");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });
        menuBD.add(conectar);

        desconectar.setFont(new java.awt.Font("DejaVu Sans Light", 1, 12)); // NOI18N
        desconectar.setText("Desconectar BD");
        desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconectarActionPerformed(evt);
            }
        });
        menuBD.add(desconectar);

        salir.setFont(new java.awt.Font("DejaVu Sans Light", 1, 12)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuBD.add(salir);

        jMenuBar1.add(menuBD);

        FAQ.setText("FAQ");
        FAQ.setFont(new java.awt.Font("DejaVu Sans Light", 1, 14)); // NOI18N

        verFAQ.setFont(new java.awt.Font("DejaVu Sans Light", 1, 12)); // NOI18N
        verFAQ.setText("Ver FAQ");
        FAQ.add(verFAQ);

        jMenuBar1.add(FAQ);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
	//Creamos una ventana de carga
	carga.setLocationRelativeTo(null);
	carga.setVisible(true);
	//Carga de la BD
	c = new Control(this);
	c.start();
    }//GEN-LAST:event_conectarActionPerformed

    private void desconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconectarActionPerformed
	if(conectado)
	{
	    HibernateUtil.getSessionFactory().close();
	    JOptionPane.showMessageDialog(null, "Base de datos desconectada");
	}
	else
	{
	    JOptionPane.showMessageDialog(null, "Base de datos no conectada. No se puede desconectar");
	}
	
    }//GEN-LAST:event_desconectarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
	HibernateUtil.getSessionFactory().close();
	System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
	try
	{
	    c.interrupt();
	    HibernateUtil.getSessionFactory().close();
	}
	catch(HibernateException e)
	{
	    System.out.println(e.getMessage());
	    System.exit(-1);
	}
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void actualizar()
    {
	if(!conectado)
	{
	    if(Control.carga<100 && carga.isVisible())
	    System.out.println(Control.carga);
	    if(Control.carga>=100)
	    {
		carga.dispose();
		carga.setVisible(false);
		JOptionPane.showMessageDialog(null, "Carga completada");
		conectado=true;
		pa.getTabla().setModel(Control.tablas.get(0));
		paa.getTabla().setModel(Control.tablas.get(1));	
		pn.getTabla().setModel(Control.tablas.get(2));
		pp.getTabla().setModel(Control.tablas.get(3));
		pi.getTabla().setModel(Control.tablas.get(4));
		
	    }
	    else
	    progreso.setValue(Control.carga);	
	}	
    }
    
    @Override
    public void paint(Graphics g)
    {
	super.paint(g);
	actualizar();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FAQ;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JDialog carga;
    private javax.swing.JMenuItem conectar;
    private javax.swing.JMenuItem desconectar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblcargar;
    private javax.swing.JMenu menuBD;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JMenuItem verFAQ;
    // End of variables declaration//GEN-END:variables

}
