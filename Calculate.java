/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

/**
 *
 * @author lenovo
 */
public class Calculate extends jvax.swing.JFrame {
    
    
    String function ;
    int power ;
    String operation ;
   
    

    /**
     * Creates new form Calculate
     */
    public Calculate() {
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

        edt_text = new javax.swing.JTextField();
        btm_cos = new javax.swing.JButton();
        btm_tan = new javax.swing.JButton();
        btm_sin = new javax.swing.JButton();
        btm_csc = new javax.swing.JButton();
        btm_sec = new javax.swing.JButton();
        btm_cot = new javax.swing.JButton();
        btm_power = new javax.swing.JButton();
        btm_eql = new javax.swing.JButton();
        btm_9 = new javax.swing.JButton();
        btm_8 = new javax.swing.JButton();
        btm_7 = new javax.swing.JButton();
        btm_5 = new javax.swing.JButton();
        btm_4 = new javax.swing.JButton();
        btm_3 = new javax.swing.JButton();

        
        edt_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operation(evt);
            }
        });

        btm_cos.setText("cos");
        btm_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                function(evt);
            }
        });

        btm_tan.setText("tan");
        btm_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                function(evt);
            }
        });

        btm_sin.setText("sin");
        btm_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                function(evt);
            }
        });

        btm_csc.setText("csc");
        btm_csc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                function(evt);
            }
        });

        btm_sec.setText("sec");
        btm_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                function(evt);
            }
        });

        btm_cot.setText("cot");
        btm_cot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                function(evt);
            }
        });

        btm_power.setText("^");
        btm_power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operation(evt);
            }
        });

        btm_eql.setText("=");
        btm_eql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal(evt);
            }
        });

        btm_9.setText("9");
        btm_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_8.setText("8");
        btm_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_7.setText("7");
        btm_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_5.setText("5");
        btm_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_4.setText("4");
        btm_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_3.setText("3");
        btm_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_6.setText("6");
        btm_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_2.setText("2");
        btm_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_1.setText("1");
        btm_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_0.setText("0");
        btm_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number(evt);
            }
        });

        btm_min.setText("Back");
        btm_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operation(evt);
            }
        });

        btm_min1.setText("C");
        btm_min1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operation(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(edt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btm_0, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btm_eql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btm_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btm_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btm_csc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btm_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btm_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btm_cot, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btm_4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btm_5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btm_1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btm_2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btm_7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btm_8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btm_6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btm_3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btm_min, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btm_power, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btm_9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btm_min1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(6, 6, 6)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(edt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm_csc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_cot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm_7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_min1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm_6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_min, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm_1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_power, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm_eql, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm_0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number
        int number = 0;
        switch(evt.getActionCommand()){
            case "0" -> {
                edt_text.setText(edt_text.getText()+"0");
                number = 0 ;
            }
            case "1" -> {
                edt_text.setText(edt_text.getText() +"1");
                number = 1;
            }
            case "2" -> {
                edt_text.setText(edt_text.getText()+"2");
                number = 2 ;
            }
             case "3" -> {
                 edt_text.setText(edt_text.getText()+"3");
                 number = 3 ;
            }
             case "4" -> {
                 edt_text.setText(edt_text.getText()+"4");
                 number = 4 ;
            }
              case "5" -> {
                  edt_text.setText(edt_text.getText()+"5");
                  number = 5 ;
            }   
                
              case "6" -> {
                  edt_text.setText(edt_text.getText()+"6");
                  number = 6 ;
            }   
                
              case "7" -> {
                  edt_text.setText(edt_text.getText()+"7");
                  number = 7 ;
            }
              case "8" -> {
                  edt_text.setText(edt_text.getText()+"8");
                  number = 8 ;
            }
                case "9" -> {
                    edt_text.setText(edt_text.getText()+"9");
                    number = 9 ;
            }   
               }
        power = number;
    }//GEN-LAST:event_number

    private void function(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_function
       switch (evt.getActionCommand()){
           case "sin" -> edt_text.setText("sin"+edt_text.getText() );
           case "cos" -> edt_text.setText("cos"+edt_text.getText());
            case "tan" -> edt_text.setText("tan"+edt_text.getText());
              
             case "csc" -> edt_text.setText("csc"+edt_text.getText());
             case "sec" -> edt_text.setText("sec"+edt_text.getText());
              case "cot" -> edt_text.setText("cot"+edt_text.getText());
       }
    }//GEN-LAST:event_function

    private void operation(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operation
        switch(evt.getActionCommand()){  
        case "^" -> edt_text.setText(edt_text.getText()+"^");
        case "Back" -> {
            if (edt_text.getText().length()>0){
                String number = edt_text.getText().substring(0,edt_text.getText().length()-1);
                edt_text.setText(number);
         
            }
            }
        case "C" -> edt_text.setText("");
        }                    
    }//GEN-LAST:event_operation

    private void equal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal
       
        
        StringBuilder formula = new StringBuilder();
        String input = edt_text.getText();
        int powerIndex = input.indexOf("^");
            if (powerIndex != -1) {
        function = input.substring(0, powerIndex);
        power = Integer.parseInt(input.substring(powerIndex + 1));
    } else {
        function = input;
        power = 1; 
    }
        while (power > 1) {
            switch (function) {
                case ("sin") -> formula.append("sin^").append(power - 1).append("(x)").append("* -cos/").append(power).append(" ").append("+").append(power - 1).append("/").append(power).append(" ");

                case ("cos") -> formula.append("cos^").append(power - 1).append("(x)").append("* sin/").append(power).append("").append("+").append(power- 1).append("/").append(power).append(" ");

                case ("tan") -> formula.append("tan^").append(power - 1).append("(x)").append("* -ln|cos(x)|/").append(power).append("").append("+").append(power- 1).append("/").append(power).append(" ");

                case ("sec") -> formula.append("sec^").append(power - 1).append("(x)").append("* tan/").append(power).append("").append("+").append(power - 1).append("/").append(power).append(" ");

                case ("csc") -> formula.append("-csc^").append(power- 1).append("(x)").append("* cot/").append(power).append("").append("+").append(power - 1).append("/").append(power).append(" ");

                case ("cot") -> formula.append("-cot^").append(power - 1).append("(x)").append("* ln|sin(x)|/").append(power).append("").append("+").append(power - 1).append("/").append(power).append(" ");
                default -> formula.append("Invalid function ");
            }
            power -= 2;
        }
            if (power == 1) {
                switch (function) {
                    case "sin" -> formula.append(" -cos(x)");
                    case "cos" -> formula.append(" sin(x)");
                    case "tan" -> formula.append(" -ln|cos(x)|");
                    case "csc" -> formula.append(" -ln|csc(x) + cot(x)|");
                    case "sec" -> formula.append(" ln|sec(x) + tan(x)|");
                    case "cot" -> formula.append(" ln|sin(x)|");
                }
            }
            formula.append(" x + c");
        edt_text.setText(String.valueOf(formula));

    }//GEN-LAST:event_equal

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
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculate().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_0;
    private javax.swing.JButton btm_1;
    private javax.swing.JButton btm_2;
    private javax.swing.JButton btm_3;
    private javax.swing.JButton btm_4;
    private javax.swing.JButton btm_5;
    private javax.swing.JButton btm_6;
    private javax.swing.JButton btm_7;
    private javax.swing.JButton btm_8;
    private javax.swing.JButton btm_9;
    private javax.swing.JButton btm_cos;
    private javax.swing.JButton btm_cot;
    private javax.swing.JButton btm_csc;
    private javax.swing.JButton btm_eql;
    private javax.swing.JButton btm_min;
    private javax.swing.JButton btm_min1;
    private javax.swing.JButton btm_power;
    private javax.swing.JButton btm_sec;
    private javax.swing.JButton btm_sin;
    private javax.swing.JButton btm_tan;
    private javax.swing.JTextField edt_text;
    // End of variables declaration//GEN-END:variables
}
