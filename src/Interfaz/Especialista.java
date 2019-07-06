/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import centrorehabilitacionfisica.Medico;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Especialista extends javax.swing.JFrame implements Printable{

    /**
     * Creates new form Especialista
     */

   public Especialista() {
   
   }
    
    public Especialista(Cita cita) {
        
            initComponents();
             Medico medico = new Medico();
            this.setTitle("ESPECIALISTA ASIGNADO/A");
            aux=medico.hora();
            jblNombre.setText("Wilson Castro");
            jblEspecialidad.setText("MMedicina General");
            jblHorario.setText(String.valueOf(aux)+" - "+String.valueOf(aux+1));
        try{
            System.out.println("DATOS: "+jblEspecialidad.getText().toString()+"***"+jblHorario.getText().toString());
            medico.escribir("Prueba",jblEspecialidad.getText().toString(),jblHorario.getText().toString());
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(Especialista.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    // Ingreso ingreso = new Ingreso();
   
    int cont=0;
    private String nombre;
    private String espe;
    private int aux;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspe(String espe) {
        this.espe = espe;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspe() {
        return espe;
    }

    public int getAux() {
        return aux;
    }
    
    

    Cita cita = new Cita();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbEspecialidad = new javax.swing.JLabel();
        jlbHoraAtencion = new javax.swing.JLabel();
        jblHorario = new javax.swing.JLabel();
        jblEspecialidad = new javax.swing.JLabel();
        jblNombre = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnRegresar = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel2.setText("ESPECIALISTA");

        jlbNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbNombre.setText("Nombre y apellido:");

        jlbEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbEspecialidad.setText("Especialidad:");

        jlbHoraAtencion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbHoraAtencion.setText("Horario de atenciòn: ");

        jblHorario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnConfirmar.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbEspecialidad)
                    .addComponent(jlbHoraAtencion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbNombre)
                .addGap(18, 18, 18)
                .addComponent(jblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbEspecialidad)
                    .addComponent(jblEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jblHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbHoraAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        mnRegresar.setText("Regresar");
        mnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegresarActionPerformed(evt);
            }
        });
        jMenu1.add(mnRegresar);

        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegresarActionPerformed
        Cita cita = new Cita();
        cita.setVisible(true);
        Especialista.this.dispose();
    }//GEN-LAST:event_mnRegresarActionPerformed

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        Ingreso ingreso = new Ingreso();
        ingreso.setVisible(true);
        Especialista.this.dispose();
    }//GEN-LAST:event_mnSalirActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
         PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPrintable(this);
            if(printerJob.printDialog()){
                try{
                    printerJob.print();
                }catch(PrinterException ex){
                    JOptionPane.showMessageDialog(null,"Error "+ex);
                }
            }

        Paciente paciente = new Paciente();
        paciente.setVisible(true);
        //Especialista.this.dispose();
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Especialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Especialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Especialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Especialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Especialista().setVisible(true);
            }
        });
    }
    
    
    public int print(Graphics graphics,PageFormat pageFormat,int pageIndex) throws PrinterException{
        if(pageIndex==0){
            Graphics2D g2d = (Graphics2D)graphics;
            g2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
            this.printAll(graphics);
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblEspecialidad;
    private javax.swing.JLabel jblHorario;
    private javax.swing.JLabel jblNombre;
    private javax.swing.JLabel jlbEspecialidad;
    private javax.swing.JLabel jlbHoraAtencion;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JMenuItem mnRegresar;
    private javax.swing.JMenuItem mnSalir;
    // End of variables declaration//GEN-END:variables
}
