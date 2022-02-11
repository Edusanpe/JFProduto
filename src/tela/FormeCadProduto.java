/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import controle.CategoriaControle;
import controle.ProdutoControle;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Produto;

/**
 *
 * @author sala303b
 */
public class FormeCadProduto extends javax.swing.JFrame {

    /**
     * Creates new form FormeCadProduto
     */
    public FormeCadProduto() {
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

        jLabel3 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblDesCat = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        txtDesCat = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblId.setText("ID:");

        lblCategoria.setText("Categoria do Produto:");

        lblProduto.setText("Produto:");

        lblDesCat.setText("Descrição do Produto:");

        lblPreco.setText("Preço:");

        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lixeira.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProduto)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategoria)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesCat, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDesCat)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPreco)
                                .addGap(3, 3, 3)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(btnCadastro)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnBuscar))
                    .addComponent(btnLimpar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto))
                .addGap(13, 13, 13)
                .addComponent(lblDesCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDesCat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastro)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public boolean verificarCampos(
            String conteudo, String erromsg) {

        boolean estaVazio = conteudo.isEmpty();
        boolean soEspaco = conteudo.equals(" ");
        if (estaVazio || soEspaco) {
            JOptionPane.showMessageDialog(this,
                    erromsg,
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // TODO add your handling code here:
        boolean passou //criar a variavel passou como boolean para verificar os campos
                = this.verificarCampos(
                        txtProduto.getText(), //verificar o campo PRODUTO
                        "Campo Produto é Obrigatório");
        if (!passou) { //caso tenha um PRODUTO digitado retorna para o programa.
            return;
        }

        passou = this.verificarCampos(
                txtDesCat.getText(), //verificar o campo DESCRIÇÃO DO PRODUTO
                "Campo Descriçaõ do produto é Obrigatório");
        if (!passou) { //caso tenha DESCRIÇÃO DO PRODUTO retorna para o programa.
            return;
        }
        passou = this.verificarCampos(
                txtPreco.getText(), //verificar o PRECO.
                "Campo preco é Obrigatório");
        if (!passou) { //caso tenha o PRECO retorna para o programa
            return;
        }

        Produto p = new Produto();

        p.setProduto(txtProduto.getText());
        p.setDesProduto(txtDesCat.getText());
        p.setPreco(Double.parseDouble(txtPreco.getText()));
        Categoria cat = (Categoria) cbxCategoria.
                getSelectedItem();
        p.setIdCategoria(cat.getIdC());
        p.setNomeCategoria(cat.getNomeC());

        String textobotao = this.btnCadastro.getText();
        if (textobotao.equalsIgnoreCase("cadastrar")) {
            boolean cadastrou = ProdutoControle.Cadastrar(p);

            if (cadastrou) {
                JOptionPane.showMessageDialog(this,
                        "Cadastro Efetuado com sucesso!",
                        "OK", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Cadastro não Efetuado!",
                        "Erro", JOptionPane.ERROR);
            }
        } else {

            p.setId(Long.parseLong(txtId.getText()));
            boolean alterou = ProdutoControle.Atualizar(p);
            if (alterou) {
                JOptionPane.showMessageDialog(this,
                        "Atualização Efetuado com sucesso!",
                        "OK", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Atualização não Efetuada!",
                        "Erro", JOptionPane.ERROR);
            }
        }


    }//GEN-LAST:event_btnCadastroActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        List<Categoria> lista = CategoriaControle.getListarCategoria();
        cbxCategoria.setModel(
                new DefaultComboBoxModel(lista.toArray())
        );
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        long id = Long.parseLong(txtId.getText());
        Produto p = ProdutoControle.BuscarPorId(id);
        if (p.getId() > 0) {
            Categoria cat = CategoriaControle.
                    BuscarPorId(p.getIdCategoria());
            btnCadastro.setText("Atualizar");
            txtProduto.setText(p.getProduto());
            txtDesCat.setText(p.getDesProduto());
            txtPreco.setText(String.valueOf(p.getPreco()));

            int total = cbxCategoria.getItemCount();
            for (int i = 0; i < total; i++) {
                Categoria itemCombo = (Categoria) cbxCategoria.getItemAt(i);
                if (cat.getIdC() == itemCombo.getIdC()) {
                    cbxCategoria.setSelectedIndex(i);
                }
            }
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtProduto.setText("");
        txtPreco.setText("");
        txtDesCat.setText("");
        btnCadastro.setText("Cadastar");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FormeCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormeCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormeCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormeCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormeCadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<Object> cbxCategoria;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDesCat;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JTextField txtDesCat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
