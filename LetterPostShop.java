/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4miniproject;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LetterPostShop extends javax.swing.JFrame {

    /**
     * Creates new form FortuneTellingGUI
     */
    public LetterPostShop() {
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
        rdbNomal = new javax.swing.JRadioButton();
        rdbRegis = new javax.swing.JRadioButton();
        rdbEMS = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarOutput = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("ส่งจดหมาย");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ประเภทจดหมาย");

        rdbNomal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbNomal.setText("ธรรมดา");

        rdbRegis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbRegis.setText("ลงทะเบียน");

        rdbEMS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbEMS.setText("EMS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("น้ำหนักจดหมาย(g)");

        btnTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTotal.setText("คำนวณราคา");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        tarOutput.setColumns(20);
        tarOutput.setRows(5);
        jScrollPane1.setViewportView(tarOutput);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbNomal)
                        .addGap(18, 18, 18)
                        .addComponent(rdbRegis)
                        .addGap(18, 18, 18)
                        .addComponent(rdbEMS)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnTotal)
                        .addGap(71, 71, 71))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnClear)
                        .addGap(87, 87, 87)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNomal)
                    .addComponent(rdbRegis)
                    .addComponent(rdbEMS)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(btnTotal)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnClear))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        String Price = txtPrice.getText();
        if (Price.length() > 0) {
            if (rdbNomal.isSelected()) {
            String weightS=txtPrice.getText();
            int weight = Integer.valueOf(weightS);
            int weightre = 0;
                   weightre = Nomal(weight, weightre);
            weightS = String.valueOf(weightre);
            tarOutput.setText("Normal Letter Service Price : "+ weightS + " Bath ");
            } else if (rdbRegis.isSelected()) {
                String weightS = txtPrice.getText();
                int weight = Integer.valueOf(weightS);
                int weightre = 0;
                weightre = Nomal(weight, weightre);
                weightre+= 13;
                weightS = String.valueOf(weightre);
                tarOutput.setText("Register Letter Service Price : "+ weightS + " Bath ");
            }else if (rdbEMS.isSelected()) {
                String weightS = txtPrice.getText();
                int weight = Integer.valueOf(weightS);
                int weightre = 0;
                if (weight <= 20) {
                    weightre = 27;
                } else if (weight <= 100) {
                   weightre = 32;     
                } else if (weight <= 250) {
                    weightre = 37;
                } else if (weight <= 500) {
                    weightre = 47;
                } else if (weight <= 1000) {
                    weightre = 62;
                } else if (weight <= 2500) {
                    weightre = 77;
                }
                weightS = String.valueOf(weightre);
                tarOutput.setText("EMS Letter Service Price : "+ weightS + " Bath ");
            }
        }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(rootPane, "Exit?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tarOutput.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_btnClearActionPerformed
    
    
    public int Nomal(int weight, int weightre) {
        if (weight <= 20) {
            weightre = 3;
        } else if (weight <= 100) {
            weightre = 5;
        } else if (weight <= 250) {
            weightre = 9;
        } else if (weight <= 1000) {
            weightre = 25;
        } else if (weight <= 2500) {
            weightre = 25;
        }
        return weightre;
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
            java.util.logging.Logger.getLogger(LetterPostShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetterPostShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetterPostShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetterPostShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetterPostShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbEMS;
    private javax.swing.JRadioButton rdbNomal;
    private javax.swing.JRadioButton rdbRegis;
    private javax.swing.JTextArea tarOutput;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
