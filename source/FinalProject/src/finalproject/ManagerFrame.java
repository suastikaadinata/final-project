/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gunka
 */
public class ManagerFrame extends javax.swing.JFrame {

    ArrayList<String> listData = new ArrayList<String>();
    Keuangan keuangan = new Keuangan();
//    MenuFrame menuFrame = new MenuFrame();
    String index;
    Timer timer;
    int jumlahData;
    String pilih;
    String namaIndex;
    String pendapatan;

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
        labelClickedKeuangan.setVisible(false);
        labelCheck.setVisible(false);
    }

    public void TableData() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel", "faza", "aaaaa");
            Statement stmt = conn.createStatement();
            String[] kolom = {pilih, "PENGHASILAN"};

            keuangan.cek_keuangan(pilih, index);
            ResultSet rsBanyakData = stmt.executeQuery("SELECT COUNT (*) faza.DATAKEUANGAN");
            int jml = 0;
            if (rsBanyakData.next()) {
                jml = rsBanyakData.getInt("TGL");
            }

            System.out.println("jumlah = " + jml);
            ResultSet rs = stmt.executeQuery("select " + pilih + " from faza.DATAKEUANGAN");
            for (int i = 0; i < jml; i++) {
                if (rs.next()) {
                    listData.add(rs.getString(pilih));
                }
            }

            for (int i = 0; i < listData.size(); i++) {
                if (namaIndex.equals(listData.get(i))) {
                    jumlahData++;
                }
            }
            Object[][] objData = new Object[jumlahData][2];
            DefaultTableModel tableModel = new DefaultTableModel(objData, kolom);
            tableKeuangan2.setModel(tableModel);
            pendapatan = String.valueOf(keuangan.getTotalPendapatan());
            String[] tabelTampil = {namaIndex, pendapatan};
            for (int i = 0; i < jumlahData; i++) {
                tableModel.addRow(tabelTampil);
            }

        } catch (SQLException x) {
            System.out.println(x.getMessage());
            x.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableKeuangan = new javax.swing.JScrollPane();
        tableKeuangan2 = new javax.swing.JTable();
        labelOut = new javax.swing.JLabel();
        labelCheck = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        comboBoxBulan = new javax.swing.JComboBox();
        comboBoxTanggal = new javax.swing.JComboBox();
        comboBoxPilihan = new javax.swing.JComboBox();
        labelMasukkanPilihan = new javax.swing.JLabel();
        labelClickedKeuangan = new javax.swing.JLabel();
        labelKeuangan = new javax.swing.JLabel();
        labelBackgroundManager = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableKeuangan2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKeuangan.setViewportView(tableKeuangan2);

        getContentPane().add(tableKeuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        labelOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Out.png"))); // NOI18N
        labelOut.setToolTipText("");
        labelOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOutMouseClicked(evt);
            }
        });
        getContentPane().add(labelOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 100, 80));

        labelCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/check icon mini2.png"))); // NOI18N
        labelCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCheckMouseClicked(evt);
            }
        });
        getContentPane().add(labelCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

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

        labelClickedKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Clicked Keuangan.png"))); // NOI18N
        getContentPane().add(labelClickedKeuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 270, 90));

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
        labelCheck.setVisible(true);
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
                namaIndex = "1";
                break;
            case 1:
                index = "02";
                namaIndex = "2";
                break;
            case 2:
                index = "03";
                namaIndex = "3";
                break;
            case 3:
                index = "04";
                namaIndex = "4";
                break;
            case 4:
                index = "05";
                namaIndex = "5";
                break;
            case 5:
                index = "06";
                namaIndex = "6";
                break;
            case 6:
                index = "07";
                namaIndex = "7";
                break;
            case 7:
                index = "08";
                namaIndex = "8";
                break;
            case 8:
                index = "09";
                namaIndex = "9";
                break;
            case 9:
                index = "10";
                namaIndex = "10";
                break;
            case 10:
                index = "11";
                namaIndex = "11";
                break;
            case 11:
                index = "12";
                namaIndex = "12";
                break;
            case 12:
                index = "13";
                namaIndex = "13";
                break;
            case 13:
                index = "14";
                namaIndex = "14";
                break;
            case 14:
                index = "15";
                namaIndex = "15";
                break;
            case 15:
                index = "16";
                namaIndex = "16";
                break;
            case 16:
                index = "17";
                namaIndex = "17";
                break;
            case 17:
                index = "18";
                namaIndex = "18";
                break;
            case 18:
                index = "19";
                namaIndex = "19";
                break;
            case 19:
                index = "20";
                namaIndex = "20";
                break;
            case 20:
                index = "21";
                namaIndex = "21";
                break;
            case 21:
                index = "22";
                namaIndex = "22";
                break;
            case 22:
                index = "23";
                namaIndex = "23";
                break;
            case 23:
                index = "24";
                namaIndex = "24";
                break;
            case 24:
                index = "25";
                namaIndex = "25";
                break;
            case 25:
                index = "26";
                namaIndex = "26";
                break;
            case 26:
                index = "27";
                namaIndex = "27";
                break;
            case 27:
                index = "28";
                namaIndex = "28";
                break;
            case 28:
                index = "29";
                namaIndex = "29";
                break;
            case 29:
                index = "30";
                namaIndex = "30";
                break;
            default:
                index = "31";
                namaIndex = "31";
                break;
        }
        pilih = "tanggal";
        labelCheck.setVisible(true);
    }//GEN-LAST:event_comboBoxTanggalActionPerformed

    private void comboBoxBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBulanActionPerformed
        switch (comboBoxBulan.getSelectedIndex()) {
            case 0:
                index = "01";
                namaIndex = "januari";
                break;
            case 1:
                index = "02";
                namaIndex = "februari";
                break;
            case 2:
                index = "03";
                namaIndex = "maret";
                break;
            case 3:
                index = "04";
                namaIndex = "april";
                break;
            case 4:
                index = "05";
                namaIndex = "mei";
                break;
            case 5:
                index = "06";
                namaIndex = "juni";
                break;
            case 6:
                index = "07";
                namaIndex = "juli";
                break;
            case 7:
                index = "08";
                namaIndex = "agustus";
                break;
            case 8:
                index = "09";
                namaIndex = "september";
                break;
            case 9:
                index = "10";
                namaIndex = "oktober";
                break;
            case 10:
                index = "11";
                namaIndex = "november";
                break;
            default:
                index = "12";
                namaIndex = "desember";
                break;
        }
        pilih = "bulan";
        labelCheck.setVisible(true);
    }//GEN-LAST:event_comboBoxBulanActionPerformed

    public void LoadTimer() {
        timer = new Timer();
        timer.schedule(new WaktuMundur(), 0, 1000);
    }

    class WaktuMundur extends TimerTask {

        int detik = 1;

        @Override
        public void run() {
            if (detik > 0) {
                labelKeuangan.setVisible(false);
                labelClickedKeuangan.setVisible(true);
                detik--;
            } else {
                labelKeuangan.setVisible(true);
                labelClickedKeuangan.setVisible(false);
            }
        }
    }
    private void labelKeuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKeuanganMouseClicked
        LoadTimer();
        comboBoxPilihan.setVisible(true);
        labelMasukkanPilihan.setVisible(true);
    }//GEN-LAST:event_labelKeuanganMouseClicked

    private void labelOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOutMouseClicked
        dispose();
//        menuFrame.setVisible(true);
    }//GEN-LAST:event_labelOutMouseClicked

    private void labelCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCheckMouseClicked
        tableKeuangan.setVisible(true);
        TableData();
    }//GEN-LAST:event_labelCheckMouseClicked

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
    private javax.swing.JLabel labelCheck;
    private javax.swing.JLabel labelClickedKeuangan;
    private javax.swing.JLabel labelKeuangan;
    private javax.swing.JLabel labelMasukkanPilihan;
    private javax.swing.JLabel labelOut;
    private javax.swing.JScrollPane tableKeuangan;
    private javax.swing.JTable tableKeuangan2;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
