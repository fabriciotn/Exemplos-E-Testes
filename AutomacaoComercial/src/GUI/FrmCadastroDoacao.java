package GUI;

import Auxiliar.Auxiliares;
import GUI.Resources.FrmCadastroDoadoresResources;
import GUI.Resources.PrincipalResources;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabricio
 */
public class FrmCadastroDoacao extends javax.swing.JDialog {

    String nomeTela;

    public FrmCadastroDoacao(java.awt.Frame parent, boolean modal, String nomeTela) {
        super(parent, modal);
        initComponents();
        this.nomeTela = nomeTela;
        //DataNascimento.setFormats("dd/MM/yyyy");
    }

    /**
     * Método para alternar a edição dos campos da aba Geração da Doação.
     *
     * @author Fabricio Nascimento
     * @param enabled valor booleano para identificar se precisa habilitar ou
     * desabilitar os campos
     * @return void
     */
    private void alternaEdicaoGeracaoDoacao(boolean enabled) {
        //<editor-fold defaultstate="collapsed" desc="Limpa os campos se a opção for para desabilitar os campos">
        if (!enabled) {
            txtDataCadastroGeracao.setText("");
            txtNomeDoadorGeracao.setText("");
            txtAmostraGeracao.setText("");
            txtNumDoadorGeracao.setText("");
            txtBeneficiarioGeracao.setText("");

            ComboPostoColetaGeracao.setSelectedIndex(0);
            ComboTipoDoacaoGeracao.setSelectedIndex(0);
            ComboTipoDoadorGeracao.setSelectedIndex(0);
            ComboHospitalGeracao.setSelectedIndex(0);

            rbtAtestadoNao.setSelected(!enabled);
            rbtAtestadoSim.setSelected(!enabled);

            DefaultTableModel model = (DefaultTableModel) tabelaUltimasDoacoes.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt("", i, 0);
                model.setValueAt("", i, 1);
            }
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Habilita ou desabilita os campos">
        bbtPesquisaDoadorGeracao.setEnabled(!enabled);
        txtNumDoadorGeracao.setEnabled(!enabled);


        ComboHospitalGeracao.setEnabled(enabled);
        ComboPostoColetaGeracao.setEnabled(enabled);
        ComboTipoDoacaoGeracao.setEnabled(enabled);
        ComboTipoDoadorGeracao.setEnabled(enabled);
        txtBeneficiarioGeracao.setEnabled(enabled);

        bbtCancelarGeracao.setEnabled(enabled);
        bbtSalvarGeracao.setEnabled(enabled);

        rbtAtestadoNao.setEnabled(enabled);
        rbtAtestadoSim.setEnabled(enabled);

        tabelaUltimasDoacoes.setEnabled(enabled);

        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
            if (i != 0) {
                jTabbedPane1.setEnabledAt(i, !enabled);
            }
        }
        //</editor-fold>
    }

    /**
     * Método para alternar a edição dos campos da aba Exame Físico.
     *
     * @author Fabricio Nascimento
     * @param enabled valor booleano para identificar se precisa habilitar ou
     * desabilitar os campos
     * @return void
     */
    private void alternaEdicaoExameFisico(boolean enabled) {
        //<editor-fold defaultstate="collapsed" desc="Limpa os campos se a opção for para desabilitar os campos">
        if (!enabled) {
            txtPesoExameFisico.setText("");
            txtHemoglobinaExameFisico.setText("");
            txtPulsoExameFisico.setText("");
            txtPressaoExameFisico.setText("");
            txtHematocritoExameFisico.setText("");
            txtTemperaturaExameFisico.setText("");
            txtCodCorenExameFisico.setText("");
            txtNomeCorenExameFisico.setText("");
            txtCodResultadoExameFisico.setText("");
            txtAmostraExameFisico.setText("");

            ComboStatusExameFisico.setSelectedIndex(0);

            rbtAptoNaoExameFisico.setSelected(false);
            rbtAptoSimExameFisico.setSelected(false);
        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Habilita ou desabilita os campos">
        bbtPesquisaAmostraExameFisico.setEnabled(!enabled);
        txtAmostraExameFisico.setEnabled(!enabled);
        
        txtPesoExameFisico.setEnabled(enabled);
        txtHemoglobinaExameFisico.setEnabled(enabled);
        txtPulsoExameFisico.setEnabled(enabled);
        txtPressaoExameFisico.setEnabled(enabled);
        txtHematocritoExameFisico.setEnabled(enabled);
        txtTemperaturaExameFisico.setEnabled(enabled);
        txtCodCorenExameFisico.setEnabled(enabled);
        txtCodResultadoExameFisico.setEnabled(enabled);

        ComboStatusExameFisico.setEnabled(enabled);

        bbtCancelarExameFisico.setEnabled(enabled);
        bbtSalvarExameFisico.setEnabled(enabled);
        bbtPesquisaCorenExameFisico.setEnabled(enabled);
        bbtPesquisaResultadoExameFisico.setEnabled(enabled);

        rbtAptoNaoExameFisico.setEnabled(enabled);
        rbtAptoSimExameFisico.setEnabled(enabled);

        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
            if (i != 1) {
                jTabbedPane1.setEnabledAt(i, !enabled);
            }
        }
        
        botaoPesquisaAmostra();
        //</editor-fold>
    }
    
    private void botaoPesquisaAmostra(){
        if (txtAmostraExameFisico.getText().length() > 0 && txtAmostraExameFisico.isEnabled()) {
            bbtPesquisaAmostraExameFisico.setEnabled(true);
        } else {
            bbtPesquisaAmostraExameFisico.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtGroupAtestado = new javax.swing.ButtonGroup();
        rbtGroupApto = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        linkFechar = new org.jdesktop.swingx.JXHyperlink();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        txtBeneficiarioGeracao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboTipoDoacaoGeracao = new javax.swing.JComboBox();
        ComboTipoDoadorGeracao = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        ComboHospitalGeracao = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        rbtAtestadoSim = new javax.swing.JRadioButton();
        rbtAtestadoNao = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        txtDataCadastroGeracao = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumDoadorGeracao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bbtPesquisaDoadorGeracao = new javax.swing.JButton();
        txtNomeDoadorGeracao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAmostraGeracao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboPostoColetaGeracao = new javax.swing.JComboBox();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUltimasDoacoes = new org.jdesktop.swingx.JXTable();
        jPanel17 = new javax.swing.JPanel();
        bbtSalvarGeracao = new javax.swing.JButton();
        bbtCancelarGeracao = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesoExameFisico = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtHemoglobinaExameFisico = new javax.swing.JFormattedTextField();
        txtPulsoExameFisico = new javax.swing.JFormattedTextField();
        txtPressaoExameFisico = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtHematocritoExameFisico = new javax.swing.JFormattedTextField();
        txtTemperaturaExameFisico = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        rbtAptoSimExameFisico = new javax.swing.JRadioButton();
        rbtAptoNaoExameFisico = new javax.swing.JRadioButton();
        txtCodCorenExameFisico = new javax.swing.JTextField();
        bbtPesquisaCorenExameFisico = new javax.swing.JButton();
        txtNomeCorenExameFisico = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNumDoadorExameFisico = new javax.swing.JTextField();
        txtNomeDoadorExameFisico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAmostraExameFisico = new javax.swing.JTextField();
        bbtPesquisaAmostraExameFisico = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        ComboStatusExameFisico = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtCodResultadoExameFisico = new javax.swing.JTextField();
        bbtPesquisaResultadoExameFisico = new javax.swing.JButton();
        txtNomeResultadoExameFisico = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        bbtSalvarExameFisico = new javax.swing.JButton();
        bbtCancelarExameFisico = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtNumDoadorExameFisico1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtAmostraExameFisico1 = new javax.swing.JTextField();
        bbtPesquisaAmostraExameFisico1 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        setName("TelaDoador");
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

        linkFechar.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(153, 180, 209));
        jTabbedPane1.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(153, 180, 209));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Informações da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel13.setOpaque(false);

        txtBeneficiarioGeracao.setEnabled(false);

        jLabel6.setText("Beneficiário");

        jLabel7.setText("Tipo Doação");

        ComboTipoDoacaoGeracao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AGENDADA", "AGENDADO - REPOSICAO", "AUTOLOGA", "BENEFICIO ", "CONVIDADA ", "ESPECIFICA", "REPOSICAO ", "VOLUNTARIA" }));
        ComboTipoDoacaoGeracao.setEnabled(false);

        ComboTipoDoadorGeracao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "TOTAL", "PLASMA", "PLAQUETA", "PLASMA E PLAQUETA", "CÉLULA TRONCO", "CHM POR AFERESE" }));
        ComboTipoDoadorGeracao.setEnabled(false);

        jLabel11.setText("Tipo Doador");

        ComboHospitalGeracao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AGENDADO", "BENEFICIO ", "BIO RIM ", "CAMPANHA ANFARMAG ", "CAMPANHA DOADOR DE RETORNO", "CAMPANHA DOS FUNCIONARIOS 2004", "CAMPANHA LIONS CONEGO ANGELO", "CAMPANHA=UNIMED/BEIRA RIO 2005", "CAMPANHAÿ= SUPRA SUPERMERCADO ", "CASA DE SAUDESANTA LUCIA", "CASA DE SAUDE SANTA CECILIA ", "CASA S.MAT.SAO JUDAS TADEU", "COMSEP", "CONVIDADO ", "CONVOCADOS", "ELETROTIL ", "FAEPO ", "FUND HOSPSAOSIMAO ", "GINCANA EDUC.GRACILIANO RAMOS ", "GINCANA EDUC.RAQUEL DE QUEIROZ", "GINCANA EDUC.RUTH ROCHA ", "GINCANA EDUCACAO MACHADO ASSIS", "GINCANA NACIONAL", "HEMOCENTRO DE BELO HORIZONTE", "HEMOCENTRO DE UBERABA ", "HEMOCENTRO DE UBERLANDIA", "HOSP AMELIA MARIA DE SOUZA", "HOSP GENESIO FRANCO MORAIS", "HOSP N.SRA.DAS VITORIAS CAP ", "HOSP NOSSA SRA D'ABADIA ", "HOSP SAMARITANO ", "HOSP SAO JOAQUIM", "HOSP SAO JOSE ", "HOSP. JUSCELINO KUBISTCHEK", "HOSPITAL SAO CAMILO ", "IGREJA ADVENT.SET.DIA PROJ.VID", "IMPAR EQUIPE MACHADO ASSIS", "IMPRENSA", "NUCLEO ITUIUTABA", "PAR EQUIPE MACHADO DE ASSIS ", "PRONTO SOCORRO MUN. ITUIUTABA ", "S.CASA MISERICORDIA CANAPOLIS ", "SANTA CASA DE MISERICORDIA BH.", "SAO PAULO ", "SAO VICENTE DE PAULO", "SENAI - EQUIPE BRANCA ", "SENAI - EQUIPE VERMELHA ", "TORCIDA ORGANIZADA BOA", "TURMA DE TEC.ENFERMAGEM ", "VOLUNTARIOS " }));
        ComboHospitalGeracao.setEnabled(false);

        jLabel12.setText("Hospital");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Informações da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel15.setOpaque(false);

        rbtGroupAtestado.add(rbtAtestadoSim);
        rbtAtestadoSim.setText("Sim");
        rbtAtestadoSim.setEnabled(false);
        rbtAtestadoSim.setOpaque(false);

        rbtGroupAtestado.add(rbtAtestadoNao);
        rbtAtestadoNao.setText("Não");
        rbtAtestadoNao.setEnabled(false);
        rbtAtestadoNao.setOpaque(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtAtestadoSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtAtestadoNao)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtAtestadoSim)
                    .addComponent(rbtAtestadoNao))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtBeneficiarioGeracao)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboTipoDoacaoGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboTipoDoadorGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboHospitalGeracao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 47, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboTipoDoacaoGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboTipoDoadorGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboHospitalGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBeneficiarioGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Informações da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel14.setOpaque(false);

        txtDataCadastroGeracao.setEditable(false);
        txtDataCadastroGeracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel8.setText("Data de cadastro");

        txtNumDoadorGeracao.setToolTipText("Nº Doador");
        txtNumDoadorGeracao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNumDoadorGeracao.setName("");

        jLabel2.setText("Nº Doador");

        bbtPesquisaDoadorGeracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/search.png"))); // NOI18N
        bbtPesquisaDoadorGeracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtPesquisaDoadorGeracaoActionPerformed(evt);
            }
        });

        txtNomeDoadorGeracao.setToolTipText("Nome do doador");
        txtNomeDoadorGeracao.setEnabled(false);

        jLabel4.setText("Nome Doador");

        txtAmostraGeracao.setEnabled(false);

        jLabel9.setText("Amostra");

        jLabel10.setText("Posto de Coleta");

        ComboPostoColetaGeracao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Posto 01", "Posto 02", "Posto 03", "Posto 04" }));
        ComboPostoColetaGeracao.setEnabled(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAmostraGeracao)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDataCadastroGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(txtNumDoadorGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bbtPesquisaDoadorGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ComboPostoColetaGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeDoadorGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bbtPesquisaDoadorGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumDoadorGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeDoadorGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataCadastroGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmostraGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboPostoColetaGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Informações da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel16.setOpaque(false);

        tabelaUltimasDoacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Data", "Nº Amostra"
            }
        ));
        tabelaUltimasDoacoes.setEnabled(false);
        jScrollPane1.setViewportView(tabelaUltimasDoacoes);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel17.setOpaque(false);

        bbtSalvarGeracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/accept.png"))); // NOI18N
        bbtSalvarGeracao.setText("Salvar");
        bbtSalvarGeracao.setEnabled(false);
        bbtSalvarGeracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtSalvarGeracaoActionPerformed(evt);
            }
        });

        bbtCancelarGeracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove.png"))); // NOI18N
        bbtCancelarGeracao.setText("Cancelar");
        bbtCancelarGeracao.setEnabled(false);
        bbtCancelarGeracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtCancelarGeracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bbtSalvarGeracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbtCancelarGeracao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bbtSalvarGeracao)
                    .addComponent(bbtCancelarGeracao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(308, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(341, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Geração da Doação", null, jPanel3, "");
        jPanel3.getAccessibleContext().setAccessibleName("");

        jPanel4.setBackground(new java.awt.Color(153, 180, 209));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Identificação da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel18.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Peso");

        txtPesoExameFisico.setEnabled(false);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Hemoglobina");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Pulso");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Pressão Arterial");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Temperatura");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Hematócrito");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Doador Apto?");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("CRM/COREN");

        txtHemoglobinaExameFisico.setEnabled(false);

        txtPulsoExameFisico.setEnabled(false);

        txtPressaoExameFisico.setEnabled(false);

        jLabel21.setText("Kg.");

        jLabel22.setText("g%");

        jLabel23.setText("ppm.");

        jLabel24.setText("ppm.");

        txtHematocritoExameFisico.setEnabled(false);

        txtTemperaturaExameFisico.setEnabled(false);

        jLabel25.setText("%");

        rbtGroupApto.add(rbtAptoSimExameFisico);
        rbtAptoSimExameFisico.setText("Sim");
        rbtAptoSimExameFisico.setEnabled(false);
        rbtAptoSimExameFisico.setOpaque(false);

        rbtGroupApto.add(rbtAptoNaoExameFisico);
        rbtAptoNaoExameFisico.setText("Não");
        rbtAptoNaoExameFisico.setEnabled(false);
        rbtAptoNaoExameFisico.setOpaque(false);

        txtCodCorenExameFisico.setEnabled(false);

        bbtPesquisaCorenExameFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/search.png"))); // NOI18N
        bbtPesquisaCorenExameFisico.setEnabled(false);
        bbtPesquisaCorenExameFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtPesquisaCorenExameFisicoActionPerformed(evt);
            }
        });

        txtNomeCorenExameFisico.setToolTipText("Nome do doador");
        txtNomeCorenExameFisico.setEnabled(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCorenExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txtPesoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(txtPressaoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel18Layout.createSequentialGroup()
                                            .addComponent(txtHemoglobinaExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel22))
                                        .addGroup(jPanel18Layout.createSequentialGroup()
                                            .addComponent(txtPulsoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel23))))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHematocritoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemperaturaExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25))
                            .addComponent(rbtAptoSimExameFisico)
                            .addComponent(rbtAptoNaoExameFisico)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txtCodCorenExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bbtPesquisaCorenExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHematocritoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTemperaturaExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPesoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtHemoglobinaExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtPulsoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel19)
                            .addComponent(rbtAptoSimExameFisico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtPressaoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(rbtAptoNaoExameFisico))))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtCodCorenExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bbtPesquisaCorenExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCorenExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Identificação da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel19.setOpaque(false);

        jLabel3.setText("Nº Doador");

        txtNumDoadorExameFisico.setToolTipText("Nº Doador");
        txtNumDoadorExameFisico.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNumDoadorExameFisico.setEnabled(false);
        txtNumDoadorExameFisico.setName("");

        txtNomeDoadorExameFisico.setToolTipText("Nome do doador");
        txtNomeDoadorExameFisico.setEnabled(false);

        jLabel5.setText("Nome Doador");

        jLabel13.setText("Amostra");

        txtAmostraExameFisico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmostraExameFisicoKeyReleased(evt);
            }
        });

        bbtPesquisaAmostraExameFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/search.png"))); // NOI18N
        bbtPesquisaAmostraExameFisico.setEnabled(false);
        bbtPesquisaAmostraExameFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtPesquisaAmostraExameFisicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumDoadorExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtNomeDoadorExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(txtAmostraExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bbtPesquisaAmostraExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAmostraExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbtPesquisaAmostraExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumDoadorExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeDoadorExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Identificação da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.white)); // NOI18N
        jPanel20.setOpaque(false);

        ComboStatusExameFisico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Completado", "Não completado", "Não efetuado" }));
        ComboStatusExameFisico.setEnabled(false);

        jLabel26.setText("Status");

        jLabel27.setText("Resultado");

        txtCodResultadoExameFisico.setEnabled(false);

        bbtPesquisaResultadoExameFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/search.png"))); // NOI18N
        bbtPesquisaResultadoExameFisico.setEnabled(false);
        bbtPesquisaResultadoExameFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtPesquisaResultadoExameFisicoActionPerformed(evt);
            }
        });

        txtNomeResultadoExameFisico.setToolTipText("Nome do doador");
        txtNomeResultadoExameFisico.setEnabled(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboStatusExameFisico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(txtCodResultadoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbtPesquisaResultadoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeResultadoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboStatusExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodResultadoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbtPesquisaResultadoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeResultadoExameFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel21.setOpaque(false);

        bbtSalvarExameFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/accept.png"))); // NOI18N
        bbtSalvarExameFisico.setText("Salvar");
        bbtSalvarExameFisico.setEnabled(false);
        bbtSalvarExameFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtSalvarExameFisicoActionPerformed(evt);
            }
        });
        bbtSalvarExameFisico.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                bbtSalvarExameFisicoPropertyChange(evt);
            }
        });

        bbtCancelarExameFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove.png"))); // NOI18N
        bbtCancelarExameFisico.setText("Cancelar");
        bbtCancelarExameFisico.setEnabled(false);
        bbtCancelarExameFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtCancelarExameFisicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bbtSalvarExameFisico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbtCancelarExameFisico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bbtSalvarExameFisico)
                    .addComponent(bbtCancelarExameFisico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Exame Físico", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 180, 209));

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Identificação da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel22.setOpaque(false);

        jLabel28.setText("Nº Doador");

        txtNumDoadorExameFisico1.setToolTipText("Nº Doador");
        txtNumDoadorExameFisico1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNumDoadorExameFisico1.setEnabled(false);
        txtNumDoadorExameFisico1.setName("");

        jLabel30.setText("Amostra");

        txtAmostraExameFisico1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmostraExameFisico1KeyReleased(evt);
            }
        });

        bbtPesquisaAmostraExameFisico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/search.png"))); // NOI18N
        bbtPesquisaAmostraExameFisico1.setEnabled(false);
        bbtPesquisaAmostraExameFisico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtPesquisaAmostraExameFisico1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumDoadorExameFisico1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(txtAmostraExameFisico1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bbtPesquisaAmostraExameFisico1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAmostraExameFisico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbtPesquisaAmostraExameFisico1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumDoadorExameFisico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Identificação da Doação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel23.setOpaque(false);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Imuno-Hematologia", jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 180, 209));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sorologia", jPanel6);

        jPanel7.setBackground(new java.awt.Color(153, 180, 209));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fenótipo", jPanel7);

        jPanel8.setBackground(new java.awt.Color(153, 180, 209));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hemograma", jPanel8);

        jPanel9.setBackground(new java.awt.Color(153, 180, 209));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hemoglobina S", jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 180, 209));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CDE", jPanel10);

        jPanel11.setBackground(new java.awt.Color(153, 180, 209));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Confirmação de Doação", jPanel11);

        jPanel12.setBackground(new java.awt.Color(153, 180, 209));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("D. Fraco Gel", jPanel12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labelTitulo.setText(nomeTela);

        //SETA O TAMANHO DA TELA
        setSize(860, 645);

        //CENTRALIZA A TELA
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void linkFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkFecharActionPerformed
        dispose();
    }//GEN-LAST:event_linkFecharActionPerformed

    private void bbtCancelarGeracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtCancelarGeracaoActionPerformed
        alternaEdicaoGeracaoDoacao(false);
    }//GEN-LAST:event_bbtCancelarGeracaoActionPerformed

    private void bbtPesquisaDoadorGeracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtPesquisaDoadorGeracaoActionPerformed
        FrmPesquisaDoadores PesquidaDoador = new FrmPesquisaDoadores(null, true, PrincipalResources.NomeTelaPesquisaProdutos);
        PesquidaDoador.setVisible(true);

        String NomeDoador = PesquidaDoador.getNomeDoador();
        String CodigoDoador = PesquidaDoador.getCodigoDoador();

        txtNomeDoadorGeracao.setText(NomeDoador);
        txtNumDoadorGeracao.setText(CodigoDoador);

        alternaEdicaoGeracaoDoacao(true);

        txtDataCadastroGeracao.setText(Auxiliares.Hoje());
    }//GEN-LAST:event_bbtPesquisaDoadorGeracaoActionPerformed

    private void bbtSalvarGeracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtSalvarGeracaoActionPerformed
        alternaEdicaoGeracaoDoacao(false);
    }//GEN-LAST:event_bbtSalvarGeracaoActionPerformed

    private void bbtPesquisaCorenExameFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtPesquisaCorenExameFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbtPesquisaCorenExameFisicoActionPerformed

    private void bbtPesquisaResultadoExameFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtPesquisaResultadoExameFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbtPesquisaResultadoExameFisicoActionPerformed

    private void bbtCancelarExameFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtCancelarExameFisicoActionPerformed
        alternaEdicaoExameFisico(false);
    }//GEN-LAST:event_bbtCancelarExameFisicoActionPerformed

    private void txtAmostraExameFisicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmostraExameFisicoKeyReleased
        botaoPesquisaAmostra();
    }//GEN-LAST:event_txtAmostraExameFisicoKeyReleased

    private void bbtPesquisaAmostraExameFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtPesquisaAmostraExameFisicoActionPerformed
        alternaEdicaoExameFisico(true);
    }//GEN-LAST:event_bbtPesquisaAmostraExameFisicoActionPerformed

    private void bbtSalvarExameFisicoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bbtSalvarExameFisicoPropertyChange
    }//GEN-LAST:event_bbtSalvarExameFisicoPropertyChange

    private void bbtSalvarExameFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtSalvarExameFisicoActionPerformed
        alternaEdicaoExameFisico(false);
    }//GEN-LAST:event_bbtSalvarExameFisicoActionPerformed

    private void txtAmostraExameFisico1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmostraExameFisico1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmostraExameFisico1KeyReleased

    private void bbtPesquisaAmostraExameFisico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtPesquisaAmostraExameFisico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbtPesquisaAmostraExameFisico1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboHospitalGeracao;
    private javax.swing.JComboBox ComboPostoColetaGeracao;
    private javax.swing.JComboBox ComboStatusExameFisico;
    private javax.swing.JComboBox ComboTipoDoacaoGeracao;
    private javax.swing.JComboBox ComboTipoDoadorGeracao;
    private javax.swing.JButton bbtCancelarExameFisico;
    private javax.swing.JButton bbtCancelarGeracao;
    private javax.swing.JButton bbtPesquisaAmostraExameFisico;
    private javax.swing.JButton bbtPesquisaAmostraExameFisico1;
    private javax.swing.JButton bbtPesquisaCorenExameFisico;
    private javax.swing.JButton bbtPesquisaDoadorGeracao;
    private javax.swing.JButton bbtPesquisaResultadoExameFisico;
    private javax.swing.JButton bbtSalvarExameFisico;
    private javax.swing.JButton bbtSalvarGeracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelTitulo;
    private org.jdesktop.swingx.JXHyperlink linkFechar;
    private javax.swing.JRadioButton rbtAptoNaoExameFisico;
    private javax.swing.JRadioButton rbtAptoSimExameFisico;
    private javax.swing.JRadioButton rbtAtestadoNao;
    private javax.swing.JRadioButton rbtAtestadoSim;
    private javax.swing.ButtonGroup rbtGroupApto;
    private javax.swing.ButtonGroup rbtGroupAtestado;
    private org.jdesktop.swingx.JXTable tabelaUltimasDoacoes;
    private javax.swing.JTextField txtAmostraExameFisico;
    private javax.swing.JTextField txtAmostraExameFisico1;
    private javax.swing.JTextField txtAmostraGeracao;
    private javax.swing.JTextField txtBeneficiarioGeracao;
    private javax.swing.JTextField txtCodCorenExameFisico;
    private javax.swing.JTextField txtCodResultadoExameFisico;
    private javax.swing.JFormattedTextField txtDataCadastroGeracao;
    private javax.swing.JFormattedTextField txtHematocritoExameFisico;
    private javax.swing.JFormattedTextField txtHemoglobinaExameFisico;
    private javax.swing.JTextField txtNomeCorenExameFisico;
    private javax.swing.JTextField txtNomeDoadorExameFisico;
    private javax.swing.JTextField txtNomeDoadorGeracao;
    private javax.swing.JTextField txtNomeResultadoExameFisico;
    private javax.swing.JTextField txtNumDoadorExameFisico;
    private javax.swing.JTextField txtNumDoadorExameFisico1;
    private javax.swing.JTextField txtNumDoadorGeracao;
    private javax.swing.JFormattedTextField txtPesoExameFisico;
    private javax.swing.JFormattedTextField txtPressaoExameFisico;
    private javax.swing.JFormattedTextField txtPulsoExameFisico;
    private javax.swing.JFormattedTextField txtTemperaturaExameFisico;
    // End of variables declaration//GEN-END:variables
}
