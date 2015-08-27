package GUI;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabricio
 */
public class FrmPesquisaDoadores extends javax.swing.JDialog {

    String nomeTela;
    String codigoDoador;
    String nomeDoador;

    public FrmPesquisaDoadores(java.awt.Frame parent, boolean modal, String nomeTela) {
        super(parent, modal);
        initComponents();
        this.nomeTela = nomeTela;
    }

    public String getCodigoDoador() {
        return codigoDoador;
    }
    
    public String getNomeDoador(){
        return nomeDoador;
    }

    private void retornaDadosDoador(MouseEvent evtMouse, KeyEvent evtKey) {
        if((evtMouse != null && evtMouse.getClickCount() == 2) || 
                (evtKey != null && evtKey.getKeyCode() == KeyEvent.VK_ENTER)){
            codigoDoador = tblGridDoador.getStringAt(tblGridDoador.getSelectedRow(), 0);
            nomeDoador = tblGridDoador.getStringAt(tblGridDoador.getSelectedRow(), 2);
            dispose();
        }
    }

    
    private void addTabela() {
        //Array que receberá os dados dos doadores pesquisados
        String[][] dados = new String[10][7]; //CORRIGIR A QUANTIDADE DE LINHAS. Deverá ser a quantidade de registros pesquisados.
        
        //Array para os títulos das colunas.
        String[] colunas = new String[]{"Nº Doador", "Iniciais", "Nome", "Filiação", "Data Nascimento", "Data de Cadastro", "Documento"};

        /*
         * trocar pelos dados que virão do banco
         */
        for (int i = 0; i < dados.length; i++) {
            dados[i][0] = "numero" + i;
            dados[i][1] = "iniciais" + i;
            dados[i][2] = "nome" + i;
            dados[i][3] = "filição" + i;
            dados[i][4] = "dataNascimento" + i;
            dados[i][5] = "dataCadastro" + i;
            dados[i][6] = "Documento" + i;
        }
        
        //Cria um modelo de tabela e adiciona os títulos e os dados.
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        //Adiciona o modelo criado à tabela já existente.
        tblGridDoador.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        linkFechar = new org.jdesktop.swingx.JXHyperlink();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeDoador = new javax.swing.JTextField();
        txtNomeMae = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIniciais = new javax.swing.JTextField();
        txtDtNascimento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        bbtPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridDoador = new org.jdesktop.swingx.JXTable();
        jPanel4 = new javax.swing.JPanel();
        lblDicas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        setName("TelaPesquisaDoador");
        setPreferredSize(new java.awt.Dimension(858, 601));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        linkFechar.setForeground(new java.awt.Color(204, 204, 204));
        linkFechar.setText("[x] Fechar");
        linkFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitulo)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(linkFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(linkFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(labelTitulo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel3.setOpaque(false);

        jLabel1.setLabelFor(txtNomeDoador);
        jLabel1.setText("<html><small><font color=red>*</font></small>Nome doador</html>");

        jLabel2.setText("Nome da mãe");

        jLabel3.setText("Iniciais");

        jLabel4.setText("Data de nascimento");

        bbtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/search24.png"))); // NOI18N
        bbtPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNomeMae, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(txtNomeDoador)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIniciais, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bbtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIniciais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bbtPesquisar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblGridDoador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº Doador", "Iniciais", "Nome", "Filiação", "Data Nascimento", "Data de Cadastro", "Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGridDoador.setColumnControlVisible(true);
        tblGridDoador.setEditable(false);
        tblGridDoador.setOpaque(false);
        tblGridDoador.setShowGrid(true);
        tblGridDoador.getTableHeader().setReorderingAllowed(false);
        tblGridDoador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridDoadorMouseClicked(evt);
            }
        });
        tblGridDoador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblGridDoadorKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblGridDoador);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Dicas de pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel4.setOpaque(false);

        lblDicas.setForeground(new java.awt.Color(255, 255, 255));
        lblDicas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDicas.setText("<html>\n<ul>\n<li>O campo <b>Nome Doador</b> é de preenchimento obrigatório.</li>\n<li>Utilize os filtros de <b>Iniciais</b>, <b>Data de nascimento</b> e <b>Nome da mãe</b> para 'refinar' a pesquisa, consequentemente \nela será executada mais rápida.</li>\n<li>Após realizar a pesquisa dê um duplo clique no doador localizado para selecionar.</li>\n</ul>\n</html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDicas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDicas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labelTitulo.setText(nomeTela);

        //SETA O TAMANHO DA TELA ANTES DE MAXIMINIZAR - APENAS PARA DAR UM EFEITO MELHOR NA VISUALIZAÇÃO
        setSize(860, 645);

        //CENTRALIZA A TELA
        this.setLocationRelativeTo(null);
        
        addTabela();
    }//GEN-LAST:event_formWindowOpened

    private void linkFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkFecharActionPerformed
        dispose();
    }//GEN-LAST:event_linkFecharActionPerformed

    private void tblGridDoadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGridDoadorKeyPressed
        retornaDadosDoador(null, evt);
    }//GEN-LAST:event_tblGridDoadorKeyPressed

    private void tblGridDoadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridDoadorMouseClicked
        retornaDadosDoador(evt, null);
    }//GEN-LAST:event_tblGridDoadorMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbtPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblDicas;
    private org.jdesktop.swingx.JXHyperlink linkFechar;
    private org.jdesktop.swingx.JXTable tblGridDoador;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtIniciais;
    private javax.swing.JTextField txtNomeDoador;
    private javax.swing.JTextField txtNomeMae;
    // End of variables declaration//GEN-END:variables
}
