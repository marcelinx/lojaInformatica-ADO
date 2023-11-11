package com.joaomribeiro.lojainformatica.joaomarcelino;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class editarDados extends javax.swing.JFrame {
    
    private int selectedRow = -1;


    public editarDados() {
        initComponents();
        carregarDadosNaTabela();
        receiveDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receiveDataTableMouseClicked(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInstruction = new javax.swing.JLabel();
        txtInputCPU = new javax.swing.JLabel();
        inputValueCPU = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiveDataTable = new javax.swing.JTable();
        txtInputHD = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        inputValueHD = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtInstruction.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        txtInstruction.setText("Visualize Dados");

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

        txtInputHD.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtInputHD.setText("HD");

        btnEdit.setForeground(new java.awt.Color(0, 102, 0));
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(601, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(110, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
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
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = receiveDataTable.getSelectedRow();
            if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um computador na tabela para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este computador?", "Confirmação", JOptionPane.YES_NO_OPTION);
if (confirmacao == JOptionPane.YES_OPTION) {
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/lojainformatica", "root", "P@$$w0rd");

        String processador = (String) receiveDataTable.getValueAt(selectedRow, 2); // Processador está na coluna 2
        String query = "DELETE FROM computador WHERE processador=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, processador);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Computador excluído com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
                carregarDadosNaTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir computador.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void receiveDataTableMouseClicked(java.awt.event.MouseEvent evt) {
        selectedRow = receiveDataTable.getSelectedRow();
        if (selectedRow != -1) {
            inputValueHD.setText((String) receiveDataTable.getValueAt(selectedRow, 1)); // HD está na coluna 1
            inputValueCPU.setText((String) receiveDataTable.getValueAt(selectedRow, 2)); // Processador está na coluna 2
        }
    }

    private void carregarDadosNaTabela() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/lojainformatica", "root", "P@$$w0rd");

            String query = "SELECT * FROM computador";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();

                DefaultTableModel model = (DefaultTableModel) receiveDataTable.getModel();
                model.setRowCount(0);

                while (resultSet.next()) {
                    String marca = resultSet.getString("marca");
                    String hd = resultSet.getString("hd");
                    String processador = resultSet.getString("processador");

                    model.addRow(new Object[]{marca, hd, processador});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void limparCampos() {
        inputValueHD.setText("");
        inputValueCPU.setText("");
        selectedRow = -1;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTextField inputValueCPU;
    private javax.swing.JTextField inputValueHD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable receiveDataTable;
    private javax.swing.JLabel txtInputCPU;
    private javax.swing.JLabel txtInputHD;
    private javax.swing.JLabel txtInstruction;
    // End of variables declaration//GEN-END:variables
}
