/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPraktikum.BAB8;

import ProjectPraktikum.BAB6.*;
import ProjectPraktikum.BAB5.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MyBook Hype AMD
 */
public class GUI_BangunDatar extends javax.swing.JFrame {

    /**
     * Creates new form GUI_BangunDatar
     */
    public GUI_BangunDatar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpanjang = new javax.swing.JTextField();
        txtlebar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txthasil = new javax.swing.JTextField();
        cmb_pilih = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LUAS BANGUN DATAR");

        jLabel2.setText("Panjang");

        jLabel3.setText("Lebar");

        txtpanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpanjangActionPerformed(evt);
            }
        });

        txtlebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlebarActionPerformed(evt);
            }
        });

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Hasil");

        txthasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthasilActionPerformed(evt);
            }
        });

        cmb_pilih.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "==PILIH==", "L.Persegi Panjang", "L.Lingkaran" }));
        cmb_pilih.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_pilihItemStateChanged(evt);
            }
        });
        cmb_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_pilihActionPerformed(evt);
            }
        });
        cmb_pilih.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmb_pilihKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_pilih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtlebar)
                    .addComponent(txtpanjang)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(txthasil))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(cmb_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtlebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpanjangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        try{
            if(cmb_pilih.getSelectedIndex() == 0){
                LuasPersegiPanjang kuda = new LuasPersegiPanjang();
                kuda.panjang = Integer.parseInt(txtpanjang.getText());
                kuda.lebar = Integer.parseInt(txtlebar.getText());
                txthasil.setText(Double.toString(kuda.Luas()));
            }else{
                LuasLingkaran lingkar = new LuasLingkaran();
                lingkar.r = Double.parseDouble(txtpanjang.getText());
                txthasil.setText(Double.toString(lingkar.Luas()));
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "masukan nilai angka", "WarnING", 2);
        } catch(ArithmeticException f){
            JOptionPane.showMessageDialog(null, "jangan masukkan nilai nol ", "WarnING", 2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtlebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlebarActionPerformed

    private void cmb_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_pilihActionPerformed

    private void cmb_pilihItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_pilihItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_pilihItemStateChanged

    private void cmb_pilihKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_pilihKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_pilihKeyTyped

    private void txthasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthasilActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_BangunDatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_BangunDatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_BangunDatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_BangunDatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_BangunDatar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_pilih;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txthasil;
    private javax.swing.JTextField txtlebar;
    private javax.swing.JTextField txtpanjang;
    // End of variables declaration//GEN-END:variables
}
