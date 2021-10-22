
public class Principal extends javax.swing.JFrame {

    String num1, num2, op;

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroJTF = new javax.swing.JTextField();
        borrarBTN = new javax.swing.JButton();
        ceroBTN = new javax.swing.JButton();
        comaBTN = new javax.swing.JButton();
        igualBTN = new javax.swing.JButton();
        sumarBTN = new javax.swing.JButton();
        unoBTN = new javax.swing.JButton();
        dosBTN = new javax.swing.JButton();
        tresBTN = new javax.swing.JButton();
        restarBTN = new javax.swing.JButton();
        cuatroBTN = new javax.swing.JButton();
        cincoBTN = new javax.swing.JButton();
        seisBTN = new javax.swing.JButton();
        multiplicarBTN = new javax.swing.JButton();
        sieteBTN = new javax.swing.JButton();
        ochoBTN = new javax.swing.JButton();
        nueveBTN = new javax.swing.JButton();
        divisionBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numeroJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroJTFActionPerformed(evt);
            }
        });

        borrarBTN.setText("C");
        borrarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBTNActionPerformed(evt);
            }
        });

        ceroBTN.setText("0");
        ceroBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroBTNActionPerformed(evt);
            }
        });

        comaBTN.setText(",");
        comaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaBTNActionPerformed(evt);
            }
        });

        igualBTN.setText("=");
        igualBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualBTNActionPerformed(evt);
            }
        });

        sumarBTN.setText("+");
        sumarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarBTNActionPerformed(evt);
            }
        });

        unoBTN.setText("1");
        unoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoBTNActionPerformed(evt);
            }
        });

        dosBTN.setText("2");
        dosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosBTNActionPerformed(evt);
            }
        });

        tresBTN.setText("3");
        tresBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresBTNActionPerformed(evt);
            }
        });

        restarBTN.setText("-");
        restarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarBTNActionPerformed(evt);
            }
        });

        cuatroBTN.setText("4");
        cuatroBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroBTNActionPerformed(evt);
            }
        });

        cincoBTN.setText("5");
        cincoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoBTNActionPerformed(evt);
            }
        });

        seisBTN.setText("6");
        seisBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisBTNActionPerformed(evt);
            }
        });

        multiplicarBTN.setText("X");
        multiplicarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarBTNActionPerformed(evt);
            }
        });

        sieteBTN.setText("7");
        sieteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteBTNActionPerformed(evt);
            }
        });

        ochoBTN.setText("8");
        ochoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoBTNActionPerformed(evt);
            }
        });

        nueveBTN.setText("9");
        nueveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveBTNActionPerformed(evt);
            }
        });

        divisionBTN.setText("/");
        divisionBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ceroBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cuatroBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cincoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(seisBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dosBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tresBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(comaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(igualBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sumarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sieteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(ochoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(nueveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(borrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divisionBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplicarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(numeroJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisionBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sieteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ochoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nueveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiplicarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuatroBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cincoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seisBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(restarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dosBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tresBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceroBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igualBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sumarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText("");

    }//GEN-LAST:event_borrarBTNActionPerformed

    private void sieteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteBTNActionPerformed
        // TODO add your handling code here:

        numeroJTF.setText(numeroJTF.getText() + ("7"));
    }//GEN-LAST:event_sieteBTNActionPerformed

    private void ochoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("8"));
    }//GEN-LAST:event_ochoBTNActionPerformed

    private void nueveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("9"));
    }//GEN-LAST:event_nueveBTNActionPerformed

    private void cuatroBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("4"));
    }//GEN-LAST:event_cuatroBTNActionPerformed

    private void cincoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("5"));
    }//GEN-LAST:event_cincoBTNActionPerformed

    private void seisBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("7"));
    }//GEN-LAST:event_seisBTNActionPerformed

    private void unoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("1"));
    }//GEN-LAST:event_unoBTNActionPerformed

    private void dosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("2"));
    }//GEN-LAST:event_dosBTNActionPerformed

    private void tresBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("3"));
    }//GEN-LAST:event_tresBTNActionPerformed

    private void ceroBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + ("0"));
    }//GEN-LAST:event_ceroBTNActionPerformed

    private void comaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaBTNActionPerformed
        // TODO add your handling code here:
        numeroJTF.setText(numeroJTF.getText() + (","));
    }//GEN-LAST:event_comaBTNActionPerformed

    private void igualBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualBTNActionPerformed
        // TODO add your handling code here:
        String resultado;
        num2 = numeroJTF.getText();
        if (!num2.equals("")) {
            resultado = operacion(num1, num2, op);
            numeroJTF.setText(resultado);
        }
    }//GEN-LAST:event_igualBTNActionPerformed

    private void sumarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarBTNActionPerformed
        // TODO add your handling code here:
        if (!numeroJTF.getText().equals("")) {
            num1 = numeroJTF.getText();
            op = "+";
            numeroJTF.setText("");
        }
    }//GEN-LAST:event_sumarBTNActionPerformed

    private void restarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarBTNActionPerformed
        // TODO add your handling code here:
        if (!numeroJTF.getText().equals("")) {
            num1 = numeroJTF.getText();
            op = "-";
            numeroJTF.setText("");
        }
    }//GEN-LAST:event_restarBTNActionPerformed

    private void multiplicarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarBTNActionPerformed
        // TODO add your handling code here:
        if (!numeroJTF.getText().equals("")) {
            num1 = numeroJTF.getText();
            op = "*";
            numeroJTF.setText("");
        }
    }//GEN-LAST:event_multiplicarBTNActionPerformed

    private void divisionBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionBTNActionPerformed
        // TODO add your handling code here:
        if (!numeroJTF.getText().equals("")) {
            num1 = numeroJTF.getText();
            op = "/";
            numeroJTF.setText("");
        }


    }//GEN-LAST:event_divisionBTNActionPerformed

    private void numeroJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroJTFActionPerformed

    public static String operacion(String num1, String num2, String op) {
        Double resultado = 0.0;
        String respuesta;
        if(op.equals("+")){
        resultado = Double.parseDouble(num1)+Double.parseDouble(num2);
        }
        if(op.equals("-")){
        resultado = Double.parseDouble(num1)-Double.parseDouble(num2);
        }
        if(op.equals("*")){
        resultado = Double.parseDouble(num1)*Double.parseDouble(num2);
        }
        if(op.equals("/")){
        resultado = Double.parseDouble(num1)/Double.parseDouble(num2);
        }
        respuesta= resultado.toString();
        return respuesta;
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBTN;
    private javax.swing.JButton ceroBTN;
    private javax.swing.JButton cincoBTN;
    private javax.swing.JButton comaBTN;
    private javax.swing.JButton cuatroBTN;
    private javax.swing.JButton divisionBTN;
    private javax.swing.JButton dosBTN;
    private javax.swing.JButton igualBTN;
    private javax.swing.JButton multiplicarBTN;
    private javax.swing.JButton nueveBTN;
    private javax.swing.JTextField numeroJTF;
    private javax.swing.JButton ochoBTN;
    private javax.swing.JButton restarBTN;
    private javax.swing.JButton seisBTN;
    private javax.swing.JButton sieteBTN;
    private javax.swing.JButton sumarBTN;
    private javax.swing.JButton tresBTN;
    private javax.swing.JButton unoBTN;
    // End of variables declaration//GEN-END:variables
}
