/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

/**
 *
 * @author PC LABKOM
 */
public class Calculator extends javax.swing.JFrame {
    //atribut
    String angka, angkatmp;
    int pilih;
    double angka1,angka2,jumlah;
    private Object jTextField;
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        angka = "";
    }
    //method
    void angka1(){
        angka +="1";
        jTextField1.setText(angka);
    }
    void angka2(){
        angka +="2";
        jTextField1.setText(angka);
    }
    void angka3(){
        angka +="3";
        jTextField1.setText(angka);
    }
    void angka4(){
        angka +="4";
        jTextField1.setText(angka);
    }
    void angka5(){
        angka +="5";
        jTextField1.setText(angka);
    }
    void angka6(){
        angka +="6";
        jTextField1.setText(angka);
    }
    void angka7(){
        angka +="7";
        jTextField1.setText(angka);
    }
    void angka8(){
        angka +="8";
        jTextField1.setText(angka);
    }
    void angka9(){
        angka +="9";
        jTextField1.setText(angka);
    }
    void angka0(){
        angka +="0";
        jTextField1.setText(angka);
    }
    void koma(){
        angka +=".";
        jTextField1.setText(angka);
    }
    
    void hasil(){
        switch (pilih){
            case 1:
                jTextField2.setText(angkatmp + " + " + angka);
                angka2=Double.parseDouble(angka);
                jumlah=angka1+angka2;
                angka=Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 2:
                jTextField2.setText(angkatmp + " - " + angka);
                angka2=Double.parseDouble(angka);
                jumlah=angka1-angka2;
                angka=Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 3:
                jTextField2.setText(angkatmp + " * " + angka);
                angka2=Double.parseDouble(angka);
                jumlah=angka1*angka2;
                angka=Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 4:
                jTextField2.setText(angkatmp + " / " + angka);
                angka2=Double.parseDouble(angka);
                jumlah=angka1/angka2;
                angka=Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
        }
    }
    
            void tambah(){
                angka1=Double.parseDouble(angka);
                jTextField1.setText("+");
                angkatmp = angka;
                jTextField2.setText(angkatmp + " + ");
                angka="";
                pilih=1;
            }
            void kurang(){
                angka1=Double.parseDouble(angka);
                jTextField1.setText("-");
                angkatmp = angka;
                jTextField2.setText(angkatmp + " - ");
                angka="";
                pilih=2;
            }
            void kali(){
                angka1=Double.parseDouble(angka);
                jTextField1.setText("*");
                angkatmp = angka;
                jTextField2.setText(angkatmp + " * ");
                angka="";
                pilih=3;
            }
            void bagi(){
                angka1=Double.parseDouble(angka);
                jTextField1.setText("/");
                angkatmp = angka;
                jTextField2.setText(angkatmp + " / ");
                angka="";
                pilih=4;
            }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnSamaDengan = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnKoma.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKoma.setText(".");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKurang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnKali.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKali.setText("*");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnBagi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnSamaDengan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSamaDengan.setText("=");
        btnSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamaDenganActionPerformed(evt);
            }
        });

        btn18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn18.setText("+/-");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambah))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnKurang, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(btnKali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jTextField1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSamaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn0)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1)
                            .addComponent(btn2)
                            .addComponent(btn3)
                            .addComponent(btnTambah)))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn4)
                    .addComponent(btnKurang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8)
                    .addComponent(btn7)
                    .addComponent(btn9)
                    .addComponent(btnKali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnKoma)
                    .addComponent(btnC)
                    .addComponent(btnBagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSamaDengan)
                    .addComponent(btn18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
angka6();        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamaDenganActionPerformed
hasil();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSamaDenganActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
angka1();        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
angka0();        // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
angka2();        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
angka3();        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
angka4();        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
angka5();        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
angka7();        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
angka8();        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
angka9();        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
koma();        // TODO add your handling code here:
    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
tambah();        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
kurang();        // TODO add your handling code here:
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
kali();        // TODO add your handling code here:
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        bagi();        // TODO add your handling code here:
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        angka1=(int) 0.0;
        angka2=(int) 0.0;
        jumlah=(int) 0.0;
        angka="";
    }//GEN-LAST:event_btnCActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnSamaDengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
