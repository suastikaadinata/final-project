/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author gunka
 */
public class ManagerFrame extends javax.swing.JFrame {
    String index;
    /**
     * Creates new form ManagerFrame
     */
    public ManagerFrame() {
        initComponents();
        comboBoxTanggal.setVisible(false);
        comboBoxBulan.setVisible(false);
        txtTahun.setVisible(false);
        comboBoxPilihan.setVisible(false);
        labelMasukkanPilihan.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTahun = new javax.swing.JTextField();
        comboBoxBulan = new javax.swing.JComboBox();
        comboBoxTanggal = new javax.swing.JComboBox();
        comboBoxPilihan = new javax.swing.JComboBox();
        labelMasukkanPilihan = new javax.swing.JLabel();
        labelKeuangan = new javax.swing.JLabel();
        labelBackgroundManager = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTahun.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txtTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunActionPerformed(evt);
            }
        });
        getContentPane().add(txtTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 100, 50));

        comboBoxBulan.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        comboBoxBulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        comboBoxBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBulanActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 120, 50));

        comboBoxTanggal.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        comboBoxTanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboBoxTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTanggalActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 60, 50));

        comboBoxPilihan.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        comboBoxPilihan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tanggal", "Bulan", "Tahun" }));
        comboBoxPilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPilihanActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxPilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 160, 50));

        labelMasukkanPilihan.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        labelMasukkanPilihan.setText("MASUKKAN PILIHAN");
        getContentPane().add(labelMasukkanPilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 160, 30));

        labelKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Tombol.png"))); // NOI18N
        labelKeuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKeuanganMouseClicked(evt);
            }
        });
        getContentPane().add(labelKeuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 350, 90));

        labelBackgroundManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Background Manager.jpg"))); // NOI18N
        getContentPane().add(labelBackgroundManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunActionPerformed
        index = txtTahun.getText();       
    }//GEN-LAST:event_txtTahunActionPerformed

    private void comboBoxPilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPilihanActionPerformed
         if (comboBoxPilihan.getSelectedIndex() == 0) {
            comboBoxTanggal.setVisible(true);
            comboBoxBulan.setVisible(false);
            txtTahun.setVisible(false);
        } else if (comboBoxPilihan.getSelectedIndex() == 1) {
            comboBoxTanggal.setVisible(false);
            comboBoxBulan.setVisible(true);
            txtTahun.setVisible(false);
        } else {
            comboBoxTanggal.setVisible(false);
            comboBoxBulan.setVisible(false);
            txtTahun.setVisible(true);
        }
    }//GEN-LAST:event_comboBoxPilihanActionPerformed

    private void comboBoxTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTanggalActionPerformed
        switch (comboBoxTanggal.getSelectedIndex()) {
            case 0:
                index = "01";
                break;
            case 1:
                index = "02";
                break;
            case 2:
                index = "03";
                break;
            case 3:
                index = "04";
                break;
            case 4:
                index = "05";
                break;
            case 5:
                index = "06";
                break;
            case 6:
                index = "07";
                break;
            case 7:
                index = "08";
                break;
            case 8:
                index = "09";
                break;
            case 9:
                index = "10";
                break;
            case 10:
                index = "11";
                break;
            case 11:
                index = "12";
                break;
            case 12:
                index = "13";
                break;
            case 13:
                index = "14";
                break;
            case 14:
                index = "15";
                break;
            case 15:
                index = "16";
                break;
            case 16:
                index = "17";
                break;
            case 17:
                index = "18";
                break;
            case 18:
                index = "19";
                break;
            case 19:
                index = "20";
                break;
            case 20:
                index = "21";
                break;
            case 21:
                index = "22";
                break;
            case 22:
                index = "23";
                break;
            case 23:
                index = "24";
                break;
            case 24:
                index = "25";
                break;
            case 25:
                index = "26";
                break;
            case 26:
                index = "27";
                break;
            case 27:
                index = "28";
                break;
            case 28:
                index = "29";
                break;
            case 29:
                index = "30";
                break;
            default:
                index = "31";
                break;
        }
    }//GEN-LAST:event_comboBoxTanggalActionPerformed

    private void comboBoxBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBulanActionPerformed
       switch (comboBoxBulan.getSelectedIndex()) {
            case 0:
                index = "01";
                break;
            case 1:
                index = "02";
                break;
            case 2:
                index = "03";
                break;
            case 3:
                index = "04";
                break;
            case 4:
                index = "05";
                break;
            case 5:
                index = "06";
                break;
            case 6:
                index = "07";
                break;
            case 7:
                index = "08";
                break;
            case 8:
                index = "09";
                break;
            case 9:
                index = "10";
                break;
            case 10:
                index = "11";
                break;
            default:
                index = "12";
                break;
        }
    }//GEN-LAST:event_comboBoxBulanActionPerformed

    private void labelKeuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKeuanganMouseClicked
        comboBoxPilihan.setVisible(true);
        labelMasukkanPilihan.setVisible(true);
    }//GEN-LAST:event_labelKeuanganMouseClicked

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
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBoxBulan;
    private javax.swing.JComboBox comboBoxPilihan;
    private javax.swing.JComboBox comboBoxTanggal;
    private javax.swing.JLabel labelBackgroundManager;
    private javax.swing.JLabel labelKeuangan;
    private javax.swing.JLabel labelMasukkanPilihan;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}