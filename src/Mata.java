/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author asus
 */
public class Mata extends javax.swing.JFrame {

    /**
     * Creates new form Mata
     */
    public Mata() {
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

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jobat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jcegah = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpenyebab = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboPenyakit = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ba.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));
        jPanel2.setLayout(null);

        jLabel4.setText("Perawatan ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 240, 110, 20);

        jLabel5.setText("Penyebab");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 30, 60, 20);

        jLabel6.setText("Gejala");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 130, 110, 20);

        jobat.setColumns(20);
        jobat.setRows(5);
        jScrollPane3.setViewportView(jobat);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(130, 240, 530, 130);

        jcegah.setColumns(20);
        jcegah.setRows(5);
        jScrollPane2.setViewportView(jcegah);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(130, 130, 530, 100);

        jpenyebab.setColumns(20);
        jpenyebab.setRows(5);
        jScrollPane1.setViewportView(jpenyebab);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(130, 20, 530, 100);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 170, 670, 380);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healtyme/c22.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(520, 50, 100, 80);

        jLabel2.setFont(new java.awt.Font("Soft Marshmallow", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MATA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 20, 100, 50);

        jComboPenyakit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "Katarak", "Juling", "Bintitan", "Neuritis Optik", "Degenerasi Makula" }));
        jComboPenyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPenyakitActionPerformed(evt);
            }
        });
        jPanel1.add(jComboPenyakit);
        jComboPenyakit.setBounds(310, 100, 150, 30);

        jLabel3.setFont(new java.awt.Font("Soft Marshmallow", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Jenis Penyakit:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 90, 130, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 0, 40, 33);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ba.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(640, 30, 40, 39);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(700, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboPenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPenyakitActionPerformed
        if (jComboPenyakit.getSelectedItem().equals("Katarak")){
            jpenyebab.setText("• Penambahan usia\n" +
                                "• Penyakit diabetes yang tidak dikendalikan\n" +
                                "• Kebiasaan mengkonsumsi alkohol (Baca : Bahaya alkohol)\n" +
                                "• Paparan langsung dari sinar matahari\n" +
                                "• Ada riwayat katarak dalam keluarga\n" +
                                "• Penyakit Darah tinggi\n" +
                                "• Obesitas\n" +
                                "• Pernah mengalami gangguan mata\n" +
                                "• Kebiasaan merokok.");
            jcegah.setText("• Penglihatan menjadi kabur\n" +
                            "• Sulit untuk melihat pada malam hari\n" +
                            "• Mata menjadi sangat sensitif terhadap cahaya\n" +
                            "• Ada lingkaran putih dalam sumber cahaya seperti lampu\n" +
                            "• Lensa kacamata sering tidak menjadi jelas atau harus lebih sering berganti.\n" +
                            "• Penglihatan mata menjadi ganda");
            jobat.setText("• Memakai kacamata dengan kondisi sesuai dengan katarak\n" +
                            "• Menggunakan kaca pembesar untuk melihat lebih jelas\n" +
                            "• Menggunakan kacamata saat dibawah sinar matahari.\n" +
                            "• Tidak mengemudikan kendaraan saat malam hari.");
        } else
            if (jComboPenyakit.getSelectedItem().equals("Juling")){
            jpenyebab.setText("• Otak tidak bisa mengatur keseimbangan mata saat melihat pada sebuah objek.\n" +
                              "• Kelainan mata yang menyebabkan satu mata mengalami rabun jauh atau rabun dekat\ndengan beberapa ukuran dan selisih yang sangat jauh.\n" +
                              "• Saraf yang bekerja untuk mengatur otot mata tidak bisa berfungsi dengan baik atau\njustru tidak normal.");
            jcegah.setText("• Anak-anak akan sering memiringkan salah satu bagian mata atau menutup satu mata\nuntuk bisa melihat objek dengan benar.\n" +
                           "• Mata menjadi tidak fokus saat melihat dan sering terlihat oleh orang lain");
            jobat.setText("• Memakai kacamata khusus untuk melatih visi mata agar bisa sejajar.\n" +
                          "• Perawatan mata strabismus jika disebabkan dari syaraf pada otak harus dikendalikan\ndengan perawatan pada bagian otak.\n" +
                          "• Melakukan latihan mata agar penglihatan menjadi lebih sejajar.");
        } else
            if(jComboPenyakit.getSelectedItem().equals("Bintitan")){
            jpenyebab.setText("• Mata kelilipan, ketika terkena debu atau benda asing kita biasanya menggucek mata.\n" +
                              "• Infeksi Kuman Stafilokokus\n" +
                              "• Peradangan atau infeksi dari muara kelenjar pada lapisan kelopak mata");
            jcegah.setText("• Muncul bintitan di kelopak mata bagian atas dan atau bagian bawah\n" +
                           "• Perih di mata\n" +
                           "• Rasa nyeri\n" +
                           "• Mata cenderung berwarna merah dan kebiruan.");
            jobat.setText("• Kompres mata dengan air agak hangat\n" +
                          "• Salep atau obat tetes sesuai rekomendasi dokter\n" +
                          "• Obat obatan bersifat antibiotik");
        } else
            if(jComboPenyakit.getSelectedItem().equals("Neuritis Optik")){
            jpenyebab.setText("• Sistem kekebalan tubuh yang terus menurun\n" +
                              "• Penyakit yang menyebabkan kerusakan sistem kekebalan tubuh seperti multiple\nsclerosis\n" +
                              "• Infeksi dari beberapa jenis bakteri seperti bakteri penyebab penyakit sifilis, campak,\ngondok dan herpes.\n" +
                              "• Pemakaian obat-obatan jangka panjang seperti obat untuk penyakit TBC.");
            jcegah.setText("• Rasa sakit atau nyeri pada bagian belakang mata\n" +
                            "• Gangguan penglihatan yang terjadi dalam sementara waktu atau jangka yang lebih\npanjang.\n" +
                            "• Tidak bisa mengenali warna dengan baik.\n" +
                            "• Melihat bayangan lampu berkedip");
            jobat.setText("Perawatan untuk neuritis optik bisa dilakukan dengan obat-obatan\nnamun biasanya penglihatan akan kembali dalam waktu kurang lebih 12 bulan. Sementara\npencegahan hanya bisa dilakukan dengan melakukan pemeriksaan rutin untuk\nmengetahui masalah kesehatan otak dan kemungkinan penyakit lain yang memicu neuritis\noptik.");
        } else
            if(jComboPenyakit.getSelectedItem().equals("Degenerasi Makula")){
            jpenyebab.setText("• Pertambahan usia yang biasanya terjadi pada orang tua dengan usia lebih dari 65 tahun.\n" +
                            "• Adanya riwayat keluarga yang mengalami degenerasi makula\n" +
                            "• Kebiasaan merokok\n" +
                            "• Obesitas\n" +
                            "• Riwayat penyakit jantung dan kolesterol tinggi\n" +
                            "• Terlalu banyak konsumsi sayur dan buah seperti diet hanya dengan konsumsi sayur dan\nbuah.");
            jcegah.setText("• Penglihatan mata menjadi kabur atau tidak fokus\n" +
                            "• Adanya garis gelombang dalam penglihatan\n" +
                            "•  Tidak bisa mengenal warna dengan baik\n" +
                            "• Membutuhkan cahaya yang sangat terang untuk membaca\n" +
                            "• Sulit untuk mengenali wajah\n" +
                            "• Tidak bisa melihat warna cerah\n" +
                            "• Mengalami halusinasi dalam melihat warna dan gelombang cahaya");
            jobat.setText("• Konsumsi berbagai jenis buah dan sayur yang banyak mengandung antioksidan dan\nvitamin seperti wortel, brokoli, kacang, kangkung dan bayam.\n" +
                            "• Konsumsi jenis makanan yang banyak mengandung lemak sehat seperti minyak zaitun,\nikan salmon, ikan tuna dan semua jenis ikan yang\nbanyak mengandung omega 3.\n" +
                            "• Konsumsi berbagai jenis biji-bijian seperti gandum.\n" +
                            "• Menjaga berat badan untuk menghindari obesitas dan mencoba untuk berhenti merokok.");
            }
    }//GEN-LAST:event_jComboPenyakitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Home satu = new Home();
        satu.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Home satu = new Home();
        satu.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Mata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboPenyakit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jcegah;
    private javax.swing.JTextArea jobat;
    private javax.swing.JTextArea jpenyebab;
    // End of variables declaration//GEN-END:variables
}
