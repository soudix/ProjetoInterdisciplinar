/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cliente
 */
public class ConsultaVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaVeiculos
     */
    public ConsultaVeiculos() {
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

        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        jLabel3.setText("Consulta por marca ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel6.setText("Preço minimo");

        jLabel7.setText("Preço maximo");

        jTable1.setModel(new DefaultTableModel());
        jScrollPane2.setViewportView(jTable1);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Placa");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Marca");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Modelo");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Consulta por preço");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jRadioButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3))
                        .addGap(52, 52, 52)
                        .addComponent(jRadioButton4)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        Connection con2 = null;
        Connection con3 = null;

        Statement statement = null;
        Statement statement2 = null;
        Statement statement3 = null;

        ResultSet results = null;
        ResultSet results2 = null;
        ResultSet results3 = null;
        java.text.DecimalFormat fmt = new java.text.DecimalFormat("0.00");

        //float soma = 0.0f;
        //int q = 0;
        String str = "";
        try {
            //Preparemos a tabela e seus os cabeçalhos da tabela:
            //jTable1.removeAll(); não funciona para limpar a tabela
            ((DefaultTableModel) jTable1.getModel()).setRowCount(0); //esta é a forma de limpar a tabela
            ((DefaultTableModel) jTable1.getModel()).setColumnCount(7);
            //codigo`,`titulo`,`interprete`,`genero`,`preco`
            Object cabecalhos[] = {"Placa", "Marca", "Modelo", "Ano", "Preco", "Sigla", "Estado", "Loja"};
            ((DefaultTableModel) jTable1.getModel()).setColumnIdentifiers(cabecalhos);
            //Carregamos o driver do MySQL, abrimos a conexão com o BD e preparamos o objeto Statement:
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projetodaniel" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";
            con = DriverManager.getConnection(url, "root", "");
            statement = con.createStatement();
            String filtro = "";
            String placa = jTextField1.getText();
            String marca = jTextField2.getText();
            String modelo = jTextField4.getText();
            String min = jTextField5.getText();
            String max = jTextField6.getText();

            if (jRadioButton1.isSelected()) {
                filtro = "WHERE PLACA='" + placa + "'";
            }
            if (jRadioButton2.isSelected()) {
                filtro = "WHERE MARCA='" + marca + "'";
            }
            if (jRadioButton3.isSelected()) {
                filtro = "WHERE MODELO='" + modelo + "'";
            }
            
            if (jRadioButton4.isSelected()) {
                //filtro = "WHERE PRECO="+min+"";
                filtro = "WHERE PRECO BETWEEN'"+min+ "'AND'"+max+"'";
                
            }
             
            String query = "SELECT * FROM VEICULOS " + filtro + "ORDER BY PRECO;";
            results = statement.executeQuery(query);

            Object dados[] = new Object[8];
            while (results.next()) {
                /*`codigo` int(5) NOT NULL,
  `titulo` varchar(255) default NULL,
  `interprete` varchar(150) default NULL,
  `genero` varchar(30) default NULL,
  `preco` float default NULL,
  PRIMARY KEY  (`codigo`)*/
                String placa1 = results.getString("Placa");
                String marca1 = results.getString("Marca");
                String modelo1 = results.getString("Modelo");
                String ano1 = results.getString("Ano");
                float preco1 = results.getFloat("Preco");
                String sigla1 = results.getString("Sigla");
                String estado1 = results.getString("Estado");
                String loja1 = results.getString("Loja");

                //String titulacao = results.getString("Categoria");
                dados[0] = placa1;
                dados[1] = marca1;
                dados[2] = modelo1;
                dados[3] = ano1;
                dados[4] = preco1;
                dados[5] = sigla1;
                dados[6] = estado1;
                dados[7] = loja1;

                ((DefaultTableModel) jTable1.getModel()).addRow(dados);
                System.out.println(dados);

                /////////////////////
            }

        } catch (SQLException e1) {
            str = "Erro no processamento do BD. " + e1.getMessage();
            JOptionPane.showMessageDialog(this, "Erro abrindo o BD. Verifique login/senha, importação do BD etc.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e2) {
            str = "Erro no processamento do BD. " + e2.getMessage();
            JOptionPane.showMessageDialog(this, "Erro abrindo o BD. Verifique login/senha, importação do BD etc.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            try {
                if (results != null) {
                    results.close();
                    results = null;
                }
                if (statement != null) {
                    statement.close();
                    statement = null;
                }
                if (con != null) {
                    con.close();
                    con = null;
                }
            } catch (Exception e3) {
            }
        }

//////////////////////////////////////////////////////////////////////////
        //float soma = 0.0f;
        //int q = 0;
        /*
        try {
            //Preparemos a tabela e seus os cabeçalhos da tabela:
            //jTable1.removeAll(); não funciona para limpar a tabela
            ((DefaultTableModel) jTable1.getModel()).setRowCount(0); //esta é a forma de limpar a tabela
            ((DefaultTableModel) jTable1.getModel()).setColumnCount(7);
            //codigo`,`titulo`,`interprete`,`genero`,`preco`
            Object cabecalhos[] = {"Placa", "Marca", "Modelo", "Ano", "Preco", "Sigla", "Estado", "Loja"};
            ((DefaultTableModel) jTable1.getModel()).setColumnIdentifiers(cabecalhos);
            //Carregamos o driver do MySQL, abrimos a conexão com o BD e preparamos o objeto Statement:
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projetodaniel" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";
            con = DriverManager.getConnection(url, "root", "");
            statement = con.createStatement();
            
            String marca = jTextField2.getText();

            String query2 = "SELECT * FROM VEICULOS WHERE MARCA='" + marca + "' ORDER BY PRECO;";

            results2 = statement.executeQuery(query2);

            Object dados1[] = new Object[8];
            while (results2.next()) {
                /*`codigo` int(5) NOT NULL,
  `titulo` varchar(255) default NULL,
  `interprete` varchar(150) default NULL,
  `genero` varchar(30) default NULL,
  `preco` float default NULL,
  PRIMARY KEY  (`codigo`)*//*
                String placa2 = results2.getString("Placa");
                String marca2 = results2.getString("Marca");
                String modelo2 = results2.getString("Modelo");
                String ano2 = results2.getString("Ano");
                float preco2 = results2.getFloat("Preco");
                String sigla2 = results2.getString("Sigla");
                String estado2 = results2.getString("Estado");
                String loja2 = results2.getString("Loja");

                //String titulacao = results.getString("Categoria");
                dados1[0] = placa2;
                dados1[1] = marca2;
                dados1[2] = modelo2;
                dados1[3] = ano2;
                dados1[4] = preco2;
                dados1[5] = sigla2;
                dados1[6] = estado2;
                dados1[7] = loja2;

                ((DefaultTableModel) jTable1.getModel()).addRow(dados1);
                System.out.println(dados1);
            }

        } catch (SQLException e1) {
            str = "Erro no processamento do BD. " + e1.getMessage();
            JOptionPane.showMessageDialog(this, "Erro abrindo o BD. Verifique login/senha, importação do BD etc.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e2) {
            str = "Erro no processamento do BD. " + e2.getMessage();
            JOptionPane.showMessageDialog(this, "Erro abrindo o BD. Verifique login/senha, importação do BD etc.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            try {
                if (results2 != null) {
                    results2.close();
                    results2 = null;
                }
                if (statement2 != null) {
                    statement2.close();
                    statement2 = null;
                }
                if (con2 != null) {
                    con2.close();
                    con2 = null;
                }
            } catch (Exception e3) {
            }
        }
/*
        /////////////////////////////////////////////////////////////////////////
        try {
            //Preparemos a tabela e seus os cabeçalhos da tabela:
            //jTable1.removeAll(); não funciona para limpar a tabela
            ((DefaultTableModel) jTable1.getModel()).setRowCount(0); //esta é a forma de limpar a tabela
            ((DefaultTableModel) jTable1.getModel()).setColumnCount(7);
            //codigo`,`titulo`,`interprete`,`genero`,`preco`
            Object cabecalhos[] = {"Placa", "Marca", "Modelo", "Ano", "Preco", "Sigla", "Estado", "Loja"};
            ((DefaultTableModel) jTable1.getModel()).setColumnIdentifiers(cabecalhos);
            //Carregamos o driver do MySQL, abrimos a conexão com o BD e preparamos o objeto Statement:
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projetodaniel" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";
            con = DriverManager.getConnection(url, "root", "");
            statement = con.createStatement();
            String placa = jTextField1.getText();
            String marca = jTextField4.getText();

            String query3 = "SELECT * FROM VEICULOS WHERE MARCA='" + marca + "' ORDER BY PRECO;";

            results3 = statement.executeQuery(query3);

            Object dados2[] = new Object[8];
            while (results3.next()) {
                /*`codigo` int(5) NOT NULL,
  `titulo` varchar(255) default NULL,
  `interprete` varchar(150) default NULL,
  `genero` varchar(30) default NULL,
  `preco` float default NULL,
  PRIMARY KEY  (`codigo`)*//*
                String placa3 = results3.getString("Placa");
                String marca3 = results3.getString("Marca");
                String modelo3 = results3.getString("Modelo");
                String ano3 = results3.getString("Ano");
                float preco3 = results3.getFloat("Preco");
                String sigla3 = results3.getString("Sigla");
                String estado3 = results3.getString("Estado");
                String loja3 = results3.getString("Loja");

                //String titulacao = results.getString("Categoria");
                dados2[0] = placa3;
                dados2[1] = marca3;
                dados2[2] = modelo3;
                dados2[3] = ano3;
                dados2[4] = preco3;
                dados2[5] = sigla3;
                dados2[6] = estado3;
                dados2[7] = loja3;

                ((DefaultTableModel) jTable1.getModel()).addRow(dados2);
                System.out.println(dados2);
            }

        } catch (SQLException e1) {
            str = "Erro no processamento do BD. " + e1.getMessage();
            JOptionPane.showMessageDialog(this, "Erro abrindo o BD. Verifique login/senha, importação do BD etc.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e2) {
            str = "Erro no processamento do BD. " + e2.getMessage();
            JOptionPane.showMessageDialog(this, "Erro abrindo o BD. Verifique login/senha, importação do BD etc.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            try {
                if (results3 != null) {
                    results3.close();
                    results3 = null;
                }
                if (statement3 != null) {
                    statement3.close();
                    statement3 = null;
                }
                if (con3 != null) {
                    con3.close();
                    con3 = null;
                }
            } catch (Exception e3) {
            }
        }
         */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
