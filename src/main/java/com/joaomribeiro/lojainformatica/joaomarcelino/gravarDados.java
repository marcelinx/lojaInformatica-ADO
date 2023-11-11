package com.joaomribeiro.lojainformatica.joaomarcelino;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class gravarDados extends javax.swing.JFrame {

    public gravarDados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JLabel();
        txtSubtitle = new javax.swing.JLabel();
        txtInputHD = new javax.swing.JLabel();
        inputValueHD = new javax.swing.JTextField();
        txtInstruction = new javax.swing.JLabel();
        txtInputCPU = new javax.swing.JLabel();
        inputValueCPU = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiveDataTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitle.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        txtTitle.setText("Loja Informatica");

        txtSubtitle.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtSubtitle.setText("Gravar Dados");

        txtInputHD.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtInputHD.setText("HD");

        txtInstruction.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        txtInstruction.setText("Insira os Dados para serem gravados:");

        txtInputCPU.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtInputCPU.setText("PROCESSADOR");

        receiveDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Marca", "HD", "Processador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(receiveDataTable);

        btnAdd.setForeground(new java.awt.Color(0, 102, 0));
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(txtSubtitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle)
                            .addComponent(txtInstruction)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInputCPU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputValueCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInputHD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputValueHD, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubtitle)
                .addGap(48, 48, 48)
                .addComponent(txtInstruction)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInputHD)
                    .addComponent(inputValueHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInputCPU)
                    .addComponent(inputValueCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String hd = inputValueHD.getText();
        String processador = inputValueCPU.getText();

        if (hd.isEmpty() || processador.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
    }//GEN-LAST:event_btnAddActionPerformed
        // Conecte-se ao banco de dados e insira os dados
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/lojainformatica", "root", "P@$$w0rd");

            String query = "INSERT INTO computador (marca, hd, processador) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, Computador.getMarca());
                preparedStatement.setString(2, hd);
                preparedStatement.setString(3, processador);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Dados gravados com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                    carregarDadosNaTabela();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao gravar dados.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    // Método para limpar os campos após a gravação
    private void limparCampos() {
        inputValueHD.setText("");
        inputValueCPU.setText("");
    }

    private void carregarDadosNaTabela() {
                DefaultTableModel model = (DefaultTableModel) receiveDataTable.getModel();
        model.setRowCount(0); // Limpa a tabela antes de recarregar os dados

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/lojainformatica", "root", "P@$$w0rd");

            String query = "SELECT marca, hd, processador FROM computador";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    String marca = resultSet.getString("marca");
                    String hd = resultSet.getString("hd");
                    String processador = resultSet.getString("processador");

                    model.addRow(new Object[]{marca, hd, processador});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados do banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
        
       
        
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gravarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gravarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gravarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gravarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gravarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField inputValueCPU;
    private javax.swing.JTextField inputValueHD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable receiveDataTable;
    private javax.swing.JLabel txtInputCPU;
    private javax.swing.JLabel txtInputHD;
    private javax.swing.JLabel txtInstruction;
    private javax.swing.JLabel txtSubtitle;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
