/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinícius
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        fabricante = new javax.swing.JComboBox();
        perecivel = new javax.swing.JRadioButton();
        naoperecivel = new javax.swing.JRadioButton();
        qtdEstoque = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));
        jPanel1.setLayout(null);

        jLabel1.setText("Código");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 33, 14);

        jLabel2.setText("Descrição");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 60, 14);

        jLabel3.setText("Fabricante");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 80, 14);

        jLabel4.setText("Tipos");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 25, 14);

        jLabel5.setText("Quant. Estoq");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 170, 70, 14);

        jLabel6.setText("Preço");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 200, 70, 20);
        jPanel1.add(codigo);
        codigo.setBounds(80, 30, 90, 30);
        jPanel1.add(descricao);
        descricao.setBounds(80, 70, 230, 30);

        fabricante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Garoto", "Nestle", "Cacau Show", "Brasil Cacau" }));
        jPanel1.add(fabricante);
        fabricante.setBounds(80, 110, 110, 20);

        buttonGroup1.add(perecivel);
        perecivel.setText("Perecível");
        jPanel1.add(perecivel);
        perecivel.setBounds(70, 140, 90, 23);

        buttonGroup1.add(naoperecivel);
        naoperecivel.setText("Não Perecível");
        jPanel1.add(naoperecivel);
        naoperecivel.setBounds(180, 140, 140, 23);
        jPanel1.add(qtdEstoque);
        qtdEstoque.setBounds(100, 170, 70, 30);
        jPanel1.add(preco);
        preco.setBounds(100, 200, 70, 30);

        jButton1.setText("Visualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 230, 90, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 360, 270);

        setSize(new java.awt.Dimension(414, 351));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String t = "";
if(perecivel.isSelected()){
    t="Perecível";
}else{
    t="Não Perecível";
}
float v = Float.parseFloat(qtdEstoque.getText()) *Float.parseFloat(preco.getText());
        JOptionPane.showMessageDialog(null, "Código: "+codigo.getText()+
                                    "\nDescrição: " +descricao.getText()+
                                    "\nFabricante: "+fabricante.getSelectedItem()+
                                    "\nTipo: "+t+
                                    "\nQuantidade em estoque: "+qtdEstoque.getText()+
                                    "\nPreço: "+preco.getText()+
                                    "\nValor total no estoque: "+v);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descricao;
    private javax.swing.JComboBox fabricante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton naoperecivel;
    private javax.swing.JRadioButton perecivel;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField qtdEstoque;
    // End of variables declaration//GEN-END:variables
}
