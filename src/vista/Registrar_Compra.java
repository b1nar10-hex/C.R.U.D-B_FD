/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import bd.ConexionBD;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;


/**
 *
 * @author ASUS
 */
public class Registrar_Compra extends javax.swing.JFrame {

    /**
     * Creates new form Registrar_Compra
     */
    public Registrar_Compra() {
        initComponents();
        actualizarcombop();
        actualizarcombod();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        customPanel1 = new CustomComponents.CustomPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        txtprecion = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        txtpreciob = new javax.swing.JTextField();
        txtfechac = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        jcombop = new javax.swing.JComboBox<>();
        jCombod = new javax.swing.JComboBox<>();
        btnregistro = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtpago = new javax.swing.JTextField();
        btntipo = new javax.swing.JButton();
        btnsiguiente = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        customPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Factura");

        jLabel3.setText("Folio");

        jLabel4.setText("Precio neto");

        jLabel5.setText("Costo IVA");

        jLabel6.setText("Precio bruto");

        jLabel7.setText("Fecha de compra");

        jLabel8.setText("Hora");

        jLabel9.setText("Codigo Metodo de pago");

        jLabel10.setText("Codigo Distribuidor");

        txtfolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfolioActionPerformed(evt);
            }
        });

        jcombop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombopActionPerformed(evt);
            }
        });

        btnregistro.setText("Registrar");
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de pago");

        txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagoActionPerformed(evt);
            }
        });

        btntipo.setText("Ingresar Tipo de pago");
        btntipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntipoActionPerformed(evt);
            }
        });

        btnsiguiente.setText("Siguiente");

        javax.swing.GroupLayout customPanel1Layout = new javax.swing.GroupLayout(customPanel1);
        customPanel1.setLayout(customPanel1Layout);
        customPanel1Layout.setHorizontalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customPanel1Layout.createSequentialGroup()
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1))
                    .addGroup(customPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(customPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btntipo)))
                        .addGap(93, 93, 93)
                        .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(customPanel1Layout.createSequentialGroup()
                                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCombod, 0, 73, Short.MAX_VALUE)
                                    .addComponent(txthora)
                                    .addComponent(jcombop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customPanel1Layout.createSequentialGroup()
                                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(40, 40, 40)
                                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfechac)
                                    .addComponent(txtpreciob)
                                    .addComponent(txtiva)
                                    .addComponent(txtprecion)
                                    .addComponent(txtfolio)))))
                    .addGroup(customPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnvolver)
                        .addGap(123, 123, 123)
                        .addComponent(btnregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(btnsiguiente)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        customPanel1Layout.setVerticalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtprecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(customPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpreciob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntipo))
                .addGap(6, 6, 6)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtfechac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcombop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvolver)
                    .addComponent(btnsiguiente))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcombopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombopActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcombopActionPerformed

    private void btntipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntipoActionPerformed
        // TODO add your handling code here:
        ingresometododepago();
    }//GEN-LAST:event_btntipoActionPerformed

    private void txtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagoActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        dispose();
        new Interfaz_Principal().setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void txtfolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfolioActionPerformed

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregistroActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistro;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JButton btntipo;
    private javax.swing.JButton btnvolver;
    private CustomComponents.CustomPanel customPanel1;
    private javax.swing.JComboBox<String> jCombod;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcombop;
    private javax.swing.JTextField txtfechac;
    private javax.swing.JTextField txtfolio;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtpago;
    private javax.swing.JTextField txtpreciob;
    private javax.swing.JTextField txtprecion;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton registrar;
    
    private void ingresometododepago(){
        
         try {
            
            Connection conn = (Connection) ConexionBD.getConnection();
            
            Statement st =  (Statement) conn.createStatement();
            String sql = "insert into metodo_de_pago(descripcion) values"
                        + " ('"+txtpago.getText()+"')";
            
            st.execute(sql);
            JOptionPane.showMessageDialog(
                        null, 
                        "Tipo de pago ingresado",
                        "Ingreso",
                        JOptionPane.INFORMATION_MESSAGE
            );
            
        }
        catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                        null, 
                        "Excepcion de driver de MySQL: " 
                        + e, "Error", 
                        JOptionPane.ERROR_MESSAGE
            );
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(
                        null, 
                        "Excepcion de SQL: " 
                        + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
            );
        }
    }//fin ingresopago
    
    private void actualizarcombop(){
        try {
            
            Connection conn = (Connection) ConexionBD.getConnection();
            
            Statement st =  (Statement) conn.createStatement();
            String sql ="select * from metodo_de_pago";
           
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                jcombop.addItem(rs.getString("cod_metodo"));
            }
        }
        catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                        null, 
                        "Excepcion de driver de MySQL: " 
                        + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
            );
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(
                        null, 
                        "Excepcion de SQL: " 
                        + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void actualizarcombod(){
        try {
            
            Connection conn = (Connection) ConexionBD.getConnection();
            
            Statement st =  (Statement) conn.createStatement();
            String sql ="select * from distribuidor";
           
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                jCombod.addItem(rs.getString("id_distribuidor"));
            }
        }
        catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                        null, 
                        "Excepcion de driver de MySQL: " 
                        + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
            );
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(
                        null, 
                        "Excepcion de SQL: " 
                        + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void ingresofactura(){
        
        String folio = txtfolio.getText();
        int precioneto = Integer.parseInt(txtprecion.getText());
        int costoiva = Integer.parseInt(txtiva.getText());
        int preciobruto = Integer.parseInt(txtpreciob.getText());
        String fechacompra = txtfechac.getText();
        int hora = Integer.parseInt(txthora.getText());
        int codpago = Integer.parseInt(jcombop.getSelectedItem().toString());
        int iddistribuidor = Integer.parseInt(jCombod.getSelectedItem().toString());
        
        /*se realiza la conexion a la base de datos utilizando
          el paquete creado(bd).
        */         
        try {
            
            Connection conn = (Connection) ConexionBD.getConnection();
            
            Statement st =  (Statement) conn.createStatement();
            String sql = "insert into factura("
                        + "folio,precio_neto,costo_iva,"
                        + "precio_bruto,fecha_compra,hora,"
                        + "cod_metod,id_distribuidor)"
                        + " values"
                        + " ("
                        + "'"+folio+"','"+precioneto+"','"+costoiva+"',"
                        + "'"+preciobruto+"','"+fechacompra+"','"+hora+"',"
                        + "'"+codpago+"','"+iddistribuidor+"')";
            
            st.execute(sql);
            JOptionPane.showMessageDialog(
                        null, 
                        "Factura registrada correctamente",
                        "Ingreso",
                        JOptionPane.INFORMATION_MESSAGE
            );
            
        }
        catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                        null, 
                        "Excepcion de driver de MySQL: " 
                        + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
            );
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(
                        null, 
                        "Excepcion de SQL: " 
                        + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
