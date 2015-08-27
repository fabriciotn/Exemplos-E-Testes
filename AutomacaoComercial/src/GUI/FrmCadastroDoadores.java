package GUI;

import Auxiliar.Auxiliares;
import GUI.Resources.FrmCadastroDoadoresResources;
import GUI.Resources.PrincipalResources;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio
 */
public class FrmCadastroDoadores extends javax.swing.JDialog {

    String nomeTela;

    public FrmCadastroDoadores(java.awt.Frame parent, boolean modal, String nomeTela) {
        super(parent, modal);
        initComponents();
        this.nomeTela = nomeTela;
        DataNascimento.setFormats("dd/MM/yyyy");
    }
    

    /**Método para alternar a edição dos campos. 
     * Obs.: Os valores dos campos NumDoador, bbtAddDoador e bbtPesquisaDoador são invertido dos outros
     * @author Fabricio Nascimento
     * @param enabled valor booleano para identificar se precisa habilitar ou desabilitar os campos
     * @return void
     */
    private void alternaEdicao(boolean enabled) {
        //<editor-fold defaultstate="collapsed" desc="Limpa os campos se a opção for para desabilitar os campos">
        if (!enabled) {
            DataNascimento.setDate(null);
            Altura.setText("");
            CelularResidencial.setText("");
            CepCom.setText("");
            CepRes.setText("");
            ComboCor.setSelectedIndex(0);
            ComboEscolaridade.setSelectedIndex(0);
            ComboNacionalidade.setSelectedIndex(0);
            ComboProfissao.setSelectedIndex(0);
            ComboUFCom.setSelectedIndex(0);
            ComboUFRes.setSelectedIndex(0);
            ComplementoCom.setText("");
            ComplementoRes.setText("");
            Cpf.setText("");
            //DataNascimento.s
            FoneResidencial.setText("");
            MunicipioCom.setText("");
            MunicipioRes.setText("");
            ComboNaturalidade.setSelectedIndex(0);
            NomeMae.setText("");
            NomePai.setText("");
            NumeroCom.setText("");
            NumeroRes.setText("");
            OutroDocumento.setText("");
            RG.setText("");
            RamalCom.setText("");
            RuaCom.setText("");
            RuaRes.setText("");
            Telefone1Com.setText("");
            Telefone2Com.setText("");
            comboEstadoCivil.setSelectedIndex(0);
            comboTimeDoCoracao.setSelectedIndex(0);
            conjuge.setText("");
            iniciais.setText("");
            nomeDoador.setText("");
            DataCadastro.setText("");
            rbtFeminino.setSelected(!enabled);
            rbtMasculino.setSelected(!enabled);
        }else{
            NumDoador.setText("");
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Habilita ou desabilita os campos">
        bbtAddDoador.setEnabled(!enabled);
        bbtPesquisaDoador.setEnabled(!enabled);
        NumDoador.setEnabled(!enabled);

        Altura.setEnabled(enabled);
        CelularResidencial.setEnabled(enabled);
        CepCom.setEnabled(enabled);
        CepRes.setEnabled(enabled);
        ComplementoCom.setEnabled(enabled);
        ComplementoRes.setEnabled(enabled);
        Cpf.setEnabled(enabled);
        DataNascimento.setEnabled(enabled);
        FoneResidencial.setEnabled(enabled);
        MunicipioCom.setEnabled(enabled);
        MunicipioRes.setEnabled(enabled);
        NomeMae.setEnabled(enabled);
        NomePai.setEnabled(enabled);
        NumeroCom.setEnabled(enabled);
        NumeroRes.setEnabled(enabled);
        OutroDocumento.setEnabled(enabled);
        RG.setEnabled(enabled);
        RamalCom.setEnabled(enabled);
        RuaCom.setEnabled(enabled);
        RuaRes.setEnabled(enabled);
        Telefone1Com.setEnabled(enabled);
        Telefone2Com.setEnabled(enabled);
        iniciais.setEnabled(enabled);
        nomeDoador.setEnabled(enabled);
        
        bbtBuscarEnderecoCom.setEnabled(enabled);
        bbtBuscarEnderecoRes.setEnabled(enabled);
        bbtCancelar.setEnabled(enabled);
        bbtSalvar.setEnabled(enabled);

        ComboCor.setEnabled(enabled);
        ComboEscolaridade.setEnabled(enabled);
        ComboNacionalidade.setEnabled(enabled);
        ComboProfissao.setEnabled(enabled);
        ComboUFCom.setEnabled(enabled);
        ComboUFRes.setEnabled(enabled);
        ComboNaturalidade.setEnabled(enabled);
        comboEstadoCivil.setEnabled(enabled);
        comboTimeDoCoracao.setEnabled(enabled);
        
        rbtFeminino.setEnabled(enabled);
        rbtMasculino.setEnabled(enabled);
        //</editor-fold>
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        linkFechar = new org.jdesktop.swingx.JXHyperlink();
        jPanel3 = new javax.swing.JPanel();
        nomeDoador = new javax.swing.JTextField();
        comboEstadoCivil = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        conjuge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        iniciais = new javax.swing.JTextField();
        comboTimeDoCoracao = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        DataNascimento = new org.jdesktop.swingx.JXDatePicker();
        jLabel37 = new javax.swing.JLabel();
        NumDoador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bbtPesquisaDoador = new javax.swing.JButton();
        DataCadastro = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        NomeMae = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NomePai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        RG = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Cpf = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        OutroDocumento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ComboNacionalidade = new javax.swing.JComboBox();
        ComboEscolaridade = new javax.swing.JComboBox();
        ComboProfissao = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        ComboCor = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        Altura = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFeminino = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        ComboNaturalidade = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        CepRes = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        bbtBuscarEnderecoRes = new javax.swing.JButton();
        RuaRes = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        NumeroRes = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ComplementoRes = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        MunicipioRes = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ComboUFRes = new javax.swing.JComboBox();
        FoneResidencial = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        CelularResidencial = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        CepCom = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        bbtBuscarEnderecoCom = new javax.swing.JButton();
        RuaCom = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        NumeroCom = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        ComplementoCom = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        MunicipioCom = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ComboUFCom = new javax.swing.JComboBox();
        Telefone1Com = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        Telefone2Com = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        RamalCom = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        bbtAddDoador = new javax.swing.JButton();
        bbtCancelar = new javax.swing.JButton();
        bbtSalvar = new javax.swing.JButton();

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

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setOpaque(false);

        nomeDoador.setToolTipText("Nome do doador");
        nomeDoador.setEnabled(false);

        comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não Informado", "Solteiro", "Casado", "Outro" }));
        comboEstadoCivil.setEnabled(false);
        comboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoCivilActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado Civil");

        conjuge.setToolTipText("Cônjuge");
        conjuge.setEnabled(false);

        jLabel3.setText("Nome Doador");

        jLabel4.setText("Cônjuge");

        jLabel6.setText("Iniciais");

        iniciais.setToolTipText("Iniciais");
        iniciais.setEnabled(false);

        comboTimeDoCoracao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NAO INFORMADO", "AMERICA FUTEBOL CLUBE", "AMERICA FUTEBOL CLUBE DE TEOFILO OTONI", "ARAXA ESPORTE CLUBE", "ASSOCIACAO ATLETICA CALDENSE    ", "BOA ESPORTE CLUBE", "CLUBE ATLETICO MINEIRO", "CRUZEIRO ESPORTE CLUBE", "GUARANI ESPORTE CLUBE", "NACIONAL ESPORTE CLUBE LTDA", "TOMBENSE FUTEBOL CLUBE", "TUPI FOOT BALL CLUB", "VILLA NOVA ATLETICO CLUBE", "OUTROS" }));
        comboTimeDoCoracao.setEnabled(false);

        jLabel7.setText("Time do Coração");

        DataNascimento.setEnabled(false);

        jLabel37.setText("Data de Nascimento");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conjuge, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(nomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iniciais)))))
                        .addGap(165, 165, 165))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(comboTimeDoCoracao, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conjuge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTimeDoCoracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NumDoador.setToolTipText("Nº Doador");
        NumDoador.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NumDoador.setName("");

        jLabel1.setText("Nº Doador");

        bbtPesquisaDoador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/search.png"))); // NOI18N
        bbtPesquisaDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtPesquisaDoadorActionPerformed(evt);
            }
        });

        DataCadastro.setEditable(false);
        DataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel5.setText("Data de cadastro");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Filiação"));
        jPanel4.setOpaque(false);

        NomeMae.setEnabled(false);

        jLabel8.setText("Mãe");

        NomePai.setEnabled(false);

        jLabel9.setText("Pai");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(NomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel5.setOpaque(false);

        jLabel10.setText("RG");

        RG.setEnabled(false);

        jLabel11.setText("CPF");

        try {
            Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Cpf.setEnabled(false);

        jLabel12.setText("Outro");

        OutroDocumento.setEnabled(false);

        jLabel13.setText("Nacionalidade");

        jLabel14.setText("Naturalidade");

        jLabel15.setText("Escolaridade");

        ComboNacionalidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "BRASILEIRA", "PORTUGUESA", "ARGENTINA ", "BELGA ", "URUGUAIA", "HOLANDESA ", "AMERICANA ", "EQUATORIANA ", "AFRICANA", "ESPANHOLA ", "CHILENA ", "ALEMA ", "ARGELINA", "AUSTRALIANA ", "AUSTRIACA ", "BOLIVIANA ", "CANADENSE ", "COLOMBIANA", "CUBANA", "DINAMARQUESA", "EGIPCIA ", "SALVADORENHA", "FILIPINA", "FINLANDESA", "FRANCESA", "GREGA ", "GUATEMALTECA", "GUIANENSE ", "HUNGARA ", "INDIANA ", "INDONESIANA ", "IRANIANA", "IRAQUEANA ", "IRLANDESA ", "ISLANDESA ", "ISRAELENSE", "ITALIANA", "IUGOSLAVA ", "JAMAICANA ", "JAPONESA", "JORDANIANA", "LIBANESA", "LIBICA", "LUXEMBURGUESA ", "MEXICANA", "NICARAGUENSE", "NIGERIANA ", "NORUEGUESA", "ZELANDESA ", "PANAMENHA ", "PAQUISTANESA", "PARAGUAIA ", "PERUANA ", "POLONESA", "PORTO-RIQUENHA", "ROMENA", "SIRIA ", "SUECA ", "SUICA ", "TAILANDESA", "TUNISIANA ", "TURCA ", "SOVIETICA ", "VENEZUELANA ", "TCHECO-ESLOVACA ", "INGLESA ", "MARROQUINA", "NEOZELANDESA" }));
        ComboNacionalidade.setEnabled(false);

        ComboEscolaridade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Alfabetização de adultos", "Nunca fui à escola", "Estudei mas não completei o Ensino Fundamental", "Ensino Fundamental (1º a 8º)", "Ensino Médio (1º a 3º)", "Curso Técnico", "Curso Superior", "Mestrado", "Doutorado", "Não quis responder" }));
        ComboEscolaridade.setEnabled(false);

        ComboProfissao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NAO INFORMADO", "ACOUGUEIRO", "ADESTRADOR", "ADMINISTRADOR DE FAZENDA", "ADMINISTRADOR(A)", "ADVOGADO(A)", "AEROVIARIO", "AGENTE ADMINISTRATIVO", "AGENTE COMUNITARIO DE SAUDE", "AGENTE DE SAUDE", "AGENTE DE SEGURANCA", "AGENTE FINANCEIRO", "AGENTE IMOBILIARIO", "AGENTE POLICIA FEDERAL", "AGRICULTOR", "AGRIMENSOR", "AGROTECNICO ", "AJUDANTE DE COZINHA ", "AJUDANTE DE MONTAGEM", "ALFAIATE", "ALMOXARIFE", "ANALISTA DE CREDITO ", "ANALISTA DE SISTEMAS", "APONTADOR ", "APOSENTADO(A) ", "ARMADOR ", "ARMAZENISTA ", "ARQUITETO(A)", "ARQUIVISTA", "ARTESAO(A)", "ARTIFICE", "ASCENSORISTA", "ASSESSOR PARLAMENTAR", "ASSISTENTE ADMINISTRATIVO ", "ASSISTENTE COMERCIAL", "ASSISTENTE SOCIAL ", "ASSISTENTE TECNICO", "ATENDENTE DE ENFERMAGEM ", "ATOR/ARTISTA", "AUDITOR(A)", "AUTONOMO", "AUX AUDITORIA ", "AUXILIAR ADMINISTRATIVO ", "AUXILIAR DE CARTORIO", "AUXILIAR DE COMPRAS ", "AUXILIAR DE CONTABILIDADE ", "AUXILIAR DE ENFERMAGEM", "AUXILIAR DE ESCRITORIO", "AUXILIAR DE FISIOTERAPIA", "AUXILIAR DE FUNDICAO", "AUXILIAR DE LABORATORIO ", "AUXILIAR DE MANUTENCAO", "AUXILIAR DE MECANICO", "AUXILIAR DE PINTOR", "AUXILIAR DE PRODUCAO", "AUXILIAR DE PROTESE ", "AUXILIAR DE REDE", "AUXILIAR DE SANITARISTA ", "AUXILIAR DE SAUDE ", "AUXILIAR DE SECRETARIA", "AUXILIAR DE TESOURARIA", "AUXILIAR DE TRANSPORTE", "AUXILIAR DENTARIO ", "AUXILIAR GERAL", "AUXILIAR TECNICO DE PRODUTO ", "AVIADOR ", "BABA", "BABA - DIARISTA ", "BALANCEIRO", "BALCONISTA", "BANCARIO(A) ", "BIBLIOTECARIO(A)", "BILHETEIRO(A) ", "BIOLOGO(A)", "BIOQUIMICO(A) ", "BISCATEIRO", "BLASTER (EXPLOSIVOS)", "BOBINADOR ", "BOMBEIRO", "BORDADEIRA", "BORRACHEIRO ", "BROCHURISTA ", "CABELEREIRO(A)", "CABISTA ", "CABO DA P. MILITAR", "CABO DE FOGO", "CAIXA ", "CALDEIREIRO ", "CAMAREIRA ", "CAMELO", "CAMINHONEIRO", "CANTOR(A) ", "CAPATAZ ", "CAPOTEIRO ", "CARCEREIRO(A) ", "CARPINTEIRO ", "CARREGADOR", "CARRETEIRO", "CARTEIRO", "CASEIRO ", "CERAMISTA ", "CHAPISTA", "CHAVEIRO", "CHEFE DE SETOR", "CINEGRAFISTA", "COBRADOR", "COMERCIANTE ", "COMERCIARIO(A)", "COMPRADOR ", "COMUNICOLOGO(A) ", "CONFERENTE", "CONTADOR(A) ", "CONTINUO", "COORDENADOR DE SEGURANCA", "COPEIRO(A)", "CORRETOR(A) ", "CORTADOR", "COSTUREIRO(A) ", "COZINHEIRO(A) ", "DATILOGRAFO(A)", "DECORADOR(A)", "DEDETIZADOR ", "DENTISTA", "DESENFORNADOR ", "DESENHISTA", "DESENHISTA TECNICO", "DESOSSADOR", "DESPACHANTE ", "DESTILADOR (A)", "DETETIVE", "DIARISTA", "DIGITADOR(A)", "DIRETORA ESCOLAR", "DO LAR", "DOMESTICA ", "ECETISTA(FUNC. DOS CORREIOS)", "ECONOMIARIO(A)", "ECONOMISTA", "EDITOR(A) ", "ELETRICISTA ", "ELETRICISTA DE AUTOS", "ELETRICITARIO(A)", "ELETROTECNICO ", "EMBALADOR ", "EMPREITEIRO ", "EMPRESARIO(A) ", "ENCANADOR ", "ENCARREGADO ", "ENCARREGADO DE MANUTENCAO ", "ENFERMEIRO(A) ", "ENGENHEIRA AGRIMENSORA", "ENGENHEIRO(A) ", "ENTREGADOR", "ESCREVENTE JUDICIAL ", "ESCRITOR(A) ", "ESCRITURARIO(A) ", "ESCRIVAO(A) ", "ESPORTISTA", "ESTAGIARIO(A) ", "ESTETICISTA ", "ESTILISTA ", "ESTOFADOR ", "ESTOQUISTA", "ESTUDANTE ", "EXPEDIDOR ", "FABIA LIMA DE MACEDO AIDAR", "FAQUEIRO", "FARMACEUTICO(A) ", "FATURISTA ", "FAXINEIRO(A)", "FAZENDEIRO", "FERRAMENTEIRO ", "FERREIRO", "FERROVIARIO ", "FISCAL", "FISICO(A) ", "FISIOTERAPEUTA", "FLORISTA", "FONAUDIOLOGO(A) ", "FOTOGRAFO(A)", "FRENTISTA ", "FUNCIONARIO PUBLICO ", "FUNDIDOR", "FUNILEIRO ", "GARAGISTA ", "GARCOM/GARCONETE", "GARI", "GARIMPEIRO", "GEOGRAFO", "GEOLOGO(A)", "GERENTE ", "GESSEIRO", "GOVERNANTA", "GRAFICO ", "GUARDA DE SEGURANCA ", "GUARDA FLORESTAL", "HORTICULTOR ", "ILUMINADOR", "IMPRESSOR ", "INDUSTRIAL", "INDUSTRIARIO", "INSPETOR DE QUALIDADE ", "INST.DE LINHA DE TRANSMISSAO", "INSTALADOR DE ACESSORIOS", "INSTRUMENTISTA", "INSTRUTOR(A)", "INTERPRETE", "INVESTIGADOR", "JARDINEIRO", "JATISTA ", "JOALHEIRO ", "JOGADOR DE FUTEBOL", "JORNALEIRO", "JORNALISTA", "JUIZ(A) ", "KARATECA", "LABORATORISTA ", "LAMINADOR ", "LAMINADOR ", "LANTERNEIRO ", "LAPIDARIO ", "LAVADOR DE CARROS ", "LAVRADOR(A) ", "LEITEIRO", "LEITURISTA", "LETRISTA", "LIXADOR ", "LOMBADOR", "LUBRIFICADOR", "MACARIQUEIRO", "MAGAREFE", "MANDRILHADOR", "MANGOTEIRO", "MANICURE", "MANOBRISTA", "MAQUINISTA", "MARCINEIRO", "MASSAGISTA", "MATELETEIRO(A)", "MECANICO", "MECANICO INDUSTRIAL ", "MEDICO(A) ", "MENSAGEIRO", "MESTRE DE OBRAS ", "METALURGICO ", "METROVIARIO ", "MILITAR ", "MINEIRO ", "MODELADOR ", "MODELISTA ", "MOLDADOR", "MOLEIRO ", "MONITOR(A)", "MONTADOR", "MOTO-TAXISTA", "MOTOCICLISTA", "MOTORISTA ", "MUSICO", "MUSICOTERAPEUTA ", "NIVELADOR ", "NUTRICIONISTA ", "OFFICE BOY / OFFICE GIRL", "OFICIAL DE JUSTICA", "OFICIAL DE LA‡AMENTO", "OFICIAL JUDICIARIO", "OPERADOR DE COMPUTADOR", "OPERADOR DE LUZ ", "OPERADOR DE MAQUINA ", "OPERADOR DE MARKETING ", "OPERADOR DE PRODUCAO", "OPERADOR DE RADIO ", "OPERADOR DE SUBESTACAO", "OPERADOR DE TELEX ", "OURIVES ", "OUTROS", "PADEIRO ", "PASSADEIRA", "PASTOR", "PECUARISTA", "PEDAGOGO(A) ", "PEDREIRO", "PERITO CRIMINAL ", "PESCADOR", "PESQUISADOR ", "PINTOR", "PIZZAIOLO ", "PLANADOR", "POLICIA CIVIL ", "POLICIA MILITAR ", "POLIDOR ", "PORTEIRO", "PRENSISTA ", "PROCURADOR JURIDICO ", "PRODUTOR GRAFICO", "PRODUTOR RURAL", "PROFESSOR(A)", "PROGRAMADOR(A)", "PROJETISTA", "PROMOTOR DE JUSTICA ", "PROMOTOR DE VENDAS", "PROTETICO ", "PSICOLOGO(A)", "PUBLICITARIO(A) ", "QUIMICO (A) ", "RADIALISTA", "RASPADOR", "RECEPCIONISTA ", "REDATOR(A)", "RELACOES PUBLICAS ", "RELIGIOSO(A)", "REPORTER", "REPOSITOR ", "REPRESENTANTE COMERCIAL ", "RETIFICADOR ", "REVISOR ", "SALGADEIRO(A) ", "SANITARISTA ", "SAPATEIRO ", "SARGENTO - PM ", "SCOTH GIRL", "SECRETARIO(A) ", "SECURITARIO ", "SEGURANCA ", "SEMINARISTA ", "SERIGRAFO ", "SERRALHEIRO ", "SERVENTE DE PEDREIRO", "SERVENTE ESCOLAR", "SERVICO BRACAL", "SERVICOS GERAIS ", "SOCIOLOGO(A)", "SOLDADO DA PM ", "SOLDADOR", "SUPERVISOR DE PRODUCAO", "SUPERVISOR DE VENDAS", "SUPERVISORA ESCOLAR ", "TABELIAO/TABELIA", "TAQUIGRAFO(A) ", "TAXISTA ", "TECELAO/TECELA", "TECNICO AGRICOLA", "TECNICO DE ELETRONICA ", "TECNICO DE ENFERMAGEM ", "TECNICO DE LABORATORIO", "TECNICO DE LABORATORIO -RAIO X", "TECNICO EM AGROPECUARIA ", "TECNICO EM COMUNICACAO", "TECNICO EM CONTABILIDADE", "TECNICO EM EDIFICACOES", "TECNICO EM ESTRADAS ", "TECNICO EM MECANICA ", "TECNICO EM MICROFILMAGEM", "TECNICO EM PUBLICIDADE", "TECNICO EM QUIMICA", "TECNICO EM REAB. FISICA ", "TECNICO EM SEGURANCA DE TRAB. ", "TECNICO EM TELEFONIA", "TECNICO FLORESTAL ", "TECNICO INDUSTRIAL", "TECNICO INFORMATICA ", "TECNICO MANUTENCAO", "TECNICO ODONTOLOGICO", "TECNICO(A) EM OFTALMOLOGIA", "TELE ATENDIMENTO", "TELEFONISTA ", "TERAPEUTA OCUPACIONAL ", "TESOUREIRO(A) ", "TIPOGRAFO ", "TOPOGRAFO ", "TORNEIRO MECANICO ", "TRABALHADOR RURAL ", "TRATORISTA", "TROCADOR DE ONIBUS", "VAQUEIRO", "VENDEDOR AMBULANTE - CAMELO ", "VENDEDOR(A) ", "VETERINARIO(A)", "VIDRACEIRO", "VIGILANTE ", "ZELADOR(A)" }));
        ComboProfissao.setEnabled(false);

        jLabel16.setText("Profissão");

        ComboCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Negra", "Parda", "Branca", "Amarela", "Indígena", "Não quis responder" }));
        ComboCor.setEnabled(false);

        jLabel17.setText("Cor");

        Altura.setEnabled(false);

        jLabel18.setText("Altura");

        GroupSexo.add(rbtMasculino);
        rbtMasculino.setText("Masculino");
        rbtMasculino.setEnabled(false);
        rbtMasculino.setOpaque(false);

        GroupSexo.add(rbtFeminino);
        rbtFeminino.setText("Feminino");
        rbtFeminino.setEnabled(false);
        rbtFeminino.setOpaque(false);

        jLabel19.setText("Sexo");

        ComboNaturalidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "ABAETE", "ABRE CAMPO", "ACAIACA ", "ACUCENA ", "AGUA BOA", "AGUA COMPRIDA ", "AGUANIL ", "AGUAS FORMOSAS", "AGUAS VERMELHAS ", "AIMORES ", "AIURUOCA", "ALAGOA", "ALBERTINA ", "ALEM PARAIBA", "ALFENAS ", "ALMENARA", "ALPERCATA ", "ALPINOPOLIS ", "ALTEROSA", "ALTO RIO DOCE ", "ALVARENGA ", "ALVINOPOLIS ", "ALVORADA DE MINAS ", "AMPARO DO SERRA ", "ANDRADAS", "CACHOEIRA DO PAJEU", "ANDRELANDIA ", "ANTONIO CARLOS", "ANTONIO DIAS", "ANTONIO PRADO DE MINAS", "ARACAI", "ARACITABA ", "ARACUAI ", "ARAGUARI", "ARANTINA", "ARAPONGA", "ARAPUA", "ARAUJOS ", "ARAXA ", "ARCEBURGO ", "ARCOS ", "AREADO", "ARGIRITA", "ARINOS", "ASTOLFO DUTRA ", "ATALEIA ", "AUGUSTO DE LIMA ", "BAEPENDI", "BALDIM", "BAMBUI", "BANDEIRA", "BANDEIRA DO SUL ", "BARAO DE COCAIS ", "BARAO DE MONTE ALTO ", "BARBACENA ", "BARRA LONGA ", "BARROSO ", "BELA VISTA DE MINAS ", "BELMIRO BRAGA ", "BELO HORIZONTE", "BELO ORIENTE", "BELO VALE ", "BERILO", "BERTOPOLIS", "BETIM ", "BIAS FORTES ", "BICAS ", "BIQUINHAS ", "BOA ESPERANCA ", "BOCAINA DE MINAS", "BOCAIUVA", "BOM DESPACHO", "BOM JARDIM DE MINAS ", "BOM JESUS DA PENHA", "BOM JESUS DO AMPARO ", "BOM JESUS DO GALHO", "BOM REPOUSO ", "BOM SUCESSO ", "BONFIM", "BONFINOPOLIS DE MINAS ", "BORDA DA MATA ", "BOTELHOS", "BOTUMIRIM ", "BRASILIA DE MINAS ", "BRAS PIRES", "BRAUNAS ", "BRAZOPOLIS", "BRUMADINHO", "BUENO BRANDAO ", "BUENOPOLIS", "BURITIS ", "BURITIZEIRO ", "CABO VERDE", "CACHOEIRA DA PRATA", "CACHOEIRA DE MINAS", "CACHOEIRA DOURADA ", "CAETANOPOLIS", "CAETE ", "CAIANA", "CAJURI", "CALDAS", "CAMACHO ", "CAMANDUCAIA ", "CAMBUI", "CAMBUQUIRA", "CAMPANARIO", "CAMPANHA", "CAMPESTRE ", "CAMPINA VERDE ", "CAMPO BELO", "CAMPO DO MEIO ", "CAMPO FLORIDO ", "CAMPOS ALTOS", "CAMPOS GERAIS ", "CANAA ", "CANAPOLIS ", "CANA VERDE", "CANDEIAS", "CAPARAO ", "CAPELA NOVA ", "CAPELINHA ", "CAPETINGA ", "CAPIM BRANCO", "CAPINOPOLIS ", "CAPITAO ENEAS ", "CAPITOLIO ", "CAPUTIRA", "CARAI ", "CARANAIBA ", "CARANDAI", "CARANGOLA ", "CARATINGA ", "CARBONITA ", "CAREACU ", "CARLOS CHAGAS ", "CARMESIA", "CARMO DA CACHOEIRA", "CARMO DA MATA ", "CARMO DE MINAS", "CARMO DO CAJURU ", "CARMO DO PARANAIBA", "CARMO DO RIO CLARO", "CARMOPOLIS DE MINAS ", "CARRANCAS ", "CARVALHOPOLIS ", "CARVALHOS ", "CASA GRANDE ", "CASCALHO RICO ", "CASSIA", "CONCEICAO DA BARRA DE MINAS ", "CATAGUASES", "CATAS ALTAS DA NORUEGA", "CAXAMBU ", "CEDRO DO ABAETE ", "CENTRAL DE MINAS", "CENTRALINA", "CHACARA ", "CHALE ", "CHAPADA DO NORTE", "CHIADOR ", "CIPOTANEA ", "CLARAVAL", "CLARO DOS POCOES", "CLAUDIO ", "COIMBRA ", "COLUNA", "COMENDADOR GOMES", "COMERCINHO", "CONCEICAO DA APARECIDA", "CONCEICAO DA PEDRA", "CONCEICAO DAS ALAGOAS ", "CONCEICAO DE IPANEMA", "CONCEICAO DO MATO DENTRO", "CONCEICAO DO PARA ", "CONCEICAO DO RIO VERDE", "CONCEICAO DOS OUROS ", "CONGONHAL ", "CONGONHAS ", "CONGONHAS DO NORTE", "CONQUISTA ", "CONSELHEIRO LAFAIETE", "CONSELHEIRO PENA", "CONSOLACAO", "CONTAGEM", "COQUEIRAL ", "CORACAO DE JESUS", "CORDISBURGO ", "CORDISLANDIA", "CORINTO ", "COROACI ", "COROMANDEL", "CORONEL FABRICIANO", "CORONEL MURTA ", "CORONEL PACHECO ", "CORONEL XAVIER CHAVES ", "CORREGO DANTA ", "CORREGO DO BOM JESUS", "CORREGO NOVO", "COUTO DE MAGALHAES DE MINAS ", "CRISTAIS", "CRISTALIA ", "CRISTIANO OTONI ", "CRISTINA", "CRUCILANDIA ", "CRUZEIRO DA FORTALEZA ", "CRUZILIA", "CURVELO ", "DATAS ", "DELFIM MOREIRA", "DELFINOPOLIS", "DESCOBERTO", "DESTERRO DE ENTRE RIOS", "DESTERRO DO MELO", "DIAMANTINA", "DIOGO DE VASCONCELOS", "DIONISIO", "DIVINESIA ", "DIVINO", "DIVINO DAS LARANJEIRAS", "DIVINOLANDIA DE MINAS ", "DIVINOPOLIS ", "DIVISA NOVA ", "DOM CAVATI", "DOM JOAQUIM ", "DOM SILVERIO", "DOM VICOSO", "DONA EUZEBIA", "DORES DE CAMPOS ", "DORES DE GUANHAES ", "DORES DO INDAIA ", "DORES DO TURVO", "DORESOPOLIS ", "DOURADOQUARA", "ELOI MENDES ", "ENGENHEIRO CALDAS ", "ENGENHEIRO NAVARRO", "ENTRE RIOS DE MINAS ", "ERVALIA ", "ESMERALDAS", "ESPERA FELIZ", "ESPINOSA", "ESPIRITO SANTO DO DOURADO ", "ESTIVA", "ESTRELA DALVA ", "ESTRELA DO INDAIA ", "ESTRELA DO SUL", "EUGENOPOLIS ", "EWBANK DA CAMARA", "EXTREMA ", "FAMA", "FARIA LEMOS ", "FELICIO DOS SANTOS", "SAO GONCALO DO RIO PRETO", "FELISBURGO", "FELIXLANDIA ", "FERNANDES TOURINHO", "FERROS", "FLORESTAL ", "FORMIGA ", "FORMOSO ", "FORTALEZA DE MINAS", "FORTUNA DE MINAS", "FRANCISCO BADARO", "FRANCISCO DUMONT", "FRANCISCO SA", "FREI GASPAR ", "FREI INOCENCIO", "FRONTEIRA ", "FRONTEIRA DOS VALES ", "FRUTAL", "FUNILANDIA", "GALILEIA", "GONCALVES ", "GONZAGA ", "GOUVEA", "GOVERNADOR VALADARES", "GRAO MOGOL", "GRUPIARA", "GUANHAES", "GUAPE ", "GUARACIABA", "GUARANESIA", "GUARANI ", "GUARARA ", "GUARDA-MOR", "GUAXUPE ", "GUIDOVAL", "GUIMARANIA", "GUIRICEMA ", "GURINHATA ", "HELIODORA ", "IAPU", "IBERTIOGA ", "IBIA", "IBIAI ", "IBIRACI ", "IBIRITE ", "IBITIURA DE MINAS ", "IBITURUNA ", "IGARAPE ", "IGARATINGA", "IGUATAMA", "IJACI ", "ILICINEA", "INCONFIDENTES ", "INDIANOPOLIS", "INGAI ", "INHAPIM ", "INHAUMA ", "INIMUTABA ", "IPANEMA ", "IPATINGA", "IPIACU", "IPUIUNA ", "IRAI DE MINAS ", "ITABIRA ", "ITABIRINHA DE MANTENA ", "ITABIRITO ", "ITACAMBIRA", "ITACARAMBI", "ITAGUARA", "ITAIPE", "ITAJUBA ", "ITAMARANDIBA", "ITAMARATI DE MINAS", "ITAMBACURI", "ITAMBE DO MATO DENTRO ", "ITAMOGI ", "ITAMONTE", "ITANHANDU ", "ITANHOMI", "ITAOBIM ", "ITAPAGIPE ", "ITAPECERICA ", "ITAPEVA ", "ITATIAIUCU", "ITAU DE MINAS ", "ITAUNA", "ITAVERAVA ", "ITINGA", "ITUETA", "ITUIUTABA ", "ITUMIRIM", "ITURAMA ", "ITUTINGA", "JABOTICATUBAS ", "JACINTO ", "JACUI ", "JACUTINGA ", "JAGUARACU ", "JANAUBA ", "JANUARIA", "JAPARAIBA ", "JECEABA ", "JEQUERI ", "JEQUITAI", "JEQUITIBA ", "JEQUITINHONHA ", "JESUANIA", "JOAIMA", "JOANESIA", "JOAO MONLEVADE", "JOAO PINHEIRO ", "JOAQUIM FELICIO ", "JORDANIA", "NOVA UNIAO", "JUIZ DE FORA", "JURAMENTO ", "JURUAIA ", "LADAINHA", "LAGAMAR ", "LAGOA DA PRATA", "LAGOA DOS PATOS ", "LAGOA DOURADA ", "LAGOA FORMOSA ", "LAGOA SANTA ", "LAJINHA ", "LAMBARI ", "LAMIM ", "LARANJAL", "LASSANCE", "LAVRAS", "LEANDRO FERREIRA", "LEOPOLDINA", "LIBERDADE ", "LIMA DUARTE ", "LUMINARIAS", "LUZ ", "MACHACALIS", "MACHADO ", "MADRE DE DEUS DE MINAS", "MALACACHETA ", "MANGA ", "MANHUACU", "MANHUMIRIM", "MANTENA ", "MARAVILHAS", "MAR DE ESPANHA", "MARIA DA FE ", "MARIANA ", "MARILAC ", "MARIPA DE MINAS ", "MARLIERIA ", "MARMELOPOLIS", "MARTINHO CAMPOS ", "MATERLANDIA ", "MATEUS LEME ", "MATIAS BARBOSA", "MATIPO", "MATO VERDE", "MATOZINHOS", "MATUTINA", "MEDEIROS", "MEDINA", "MENDES PIMENTEL ", "MERCES", "MESQUITA", "MINAS NOVAS ", "MINDURI ", "MIRABELA", "MIRADOURO ", "MIRAI ", "MOEDA ", "MOEMA ", "MONJOLOS", "MONSENHOR PAULO ", "MONTALVANIA ", "MONTE ALEGRE DE MINAS ", "MONTE AZUL", "MONTE BELO", "MONTE CARMELO ", "MONTE SANTO DE MINAS", "MONTES CLAROS ", "MONTE SIAO", "MORADA NOVA DE MINAS", "MORRO DA GARCA", "MORRO DO PILAR", "MUNHOZ", "MURIAE", "MUTUM ", "MUZAMBINHO", "NACIP RAYDAN", "NANUQUE ", "NATERCIA", "NAZARENO", "NEPOMUCENO", "NOVA ERA", "NOVA LIMA ", "NOVA MODICA ", "NOVA PONTE", "NOVA RESENDE", "NOVA SERRANA", "NOVO CRUZEIRO ", "OLARIA", "OLIMPIO NORONHA ", "OLIVEIRA", "OLIVEIRA FORTES ", "ONCA DE PITANGUI", "OURO BRANCO ", "OURO FINO ", "OURO PRETO", "OURO VERDE DE MINAS ", "PADRE PARAISO ", "PAINEIRAS ", "PAINS ", "PAIVA ", "PALMA ", "PAPAGAIOS ", "PARACATU", "PARA DE MINAS ", "PARAGUACU ", "PARAISOPOLIS", "PARAOPEBA ", "PASSABEM", "PASSA QUATRO", "PASSA TEMPO ", "PASSA VINTE ", "PASSOS", "PATOS DE MINAS", "PATROCINIO", "PATROCINIO DO MURIAE", "PAULA CANDIDO ", "PAULISTAS ", "PAVAO ", "PECANHA ", "PEDRA AZUL", "PEDRA DO ANTA ", "PEDRA DO INDAIA ", "PEDRA DOURADA ", "PEDRALVA", "PEDRINOPOLIS", "PEDRO LEOPOLDO", "PEDRO TEIXEIRA", "PEQUERI ", "PEQUI ", "PERDIGAO", "PERDIZES", "PERDOES ", "PESCADOR", "PIAU", "PIEDADE DE PONTE NOVA ", "PIEDADE DO RIO GRANDE ", "PIEDADE DOS GERAIS", "PIMENTA ", "PIRACEMA", "PIRAJUBA", "PIRANGA ", "PIRANGUCU ", "PIRANGUINHO ", "PIRAPETINGA ", "PIRAPORA", "PIRAUBA ", "PITANGUI", "PIUM-I", "PLANURA ", "POCO FUNDO", "POCOS DE CALDAS ", "POCRANE ", "POMPEU", "PONTE NOVA", "PORTEIRINHA ", "PORTO FIRME ", "POTE", "POUSO ALEGRE", "POUSO ALTO", "PRADOS", "PRATA ", "PRATAPOLIS", "PRATINHA", "PRESIDENTE BERNARDES", "PRESIDENTE JUSCELINO", "PRESIDENTE KUBITSCHEK ", "PRESIDENTE OLEGARIO ", "PRESIDENTE SOARES ", "PRUDENTE DE MORAIS", "QUARTEL GERAL ", "QUELUZITA ", "RAPOSOS ", "RAUL SOARES ", "RECREIO ", "RESENDE COSTA ", "RESPLENDOR", "RESSAQUINHA ", "RIACHO DOS MACHADOS ", "RIBEIRAO DAS NEVES", "RIBEIRAO VERMELHO ", "RIO ACIMA ", "RIO CASCA ", "RIO DOCE", "RIO DO PRADO", "RIO ESPERA", "RIO MANSO ", "RIO NOVO", "RIO PARANAIBA ", "RIO PARDO DE MINAS", "RIO PIRACICABA", "RIO POMBA ", "RIO PRETO ", "RIO VERMELHO", "RITAPOLIS ", "ROCHEDO DE MINAS", "RODEIRO ", "ROMARIA ", "RUBELITA", "RUBIM ", "SABARA", "SABINOPOLIS ", "SACRAMENTO", "SALINAS ", "SALTO DA DIVISA ", "SANTA BARBARA ", "SANTA BARBARA DO TUGURIO", "SANTA CRUZ DO ESCALVADO ", "SANTA EFIGENIA DE MINAS ", "SANTA FE DE MINAS ", "SANTA JULIANA ", "SANTA LUZIA ", "SANTA MARGARIDA ", "SANTA MARIA DE ITABIRA", "SANTA MARIA DO SALTO", "SANTA MARIA DO SUACUI ", "SANTANA DA VARGEM ", "SANTANA DE CATAGUASES ", "SANTANA DE PIRAPAMA ", "SANTANA DO DESERTO", "SANTANA DO GARAMBEU ", "SANTANA DO JACARE ", "SANTANA DO MANHUACU ", "SANTANA DO RIACHO ", "SANTANA DOS MONTES", "SANTA RITA DE CALDAS", "SANTA RITA DE JACUTINGA ", "SANTA RITA DO IBITIPOCA ", "SANTA RITA DO ITUETO", "SANTA RITA DO SAPUCAI ", "SANTA ROSA DA SERRA ", "SANTA VITORIA ", "SANTO ANTONIO DO AMPARO ", "SANTO ANTONIO DO AVENTUREIRO", "SANTO ANTONIO DO GRAMA", "SANTO ANTONIO DO ITAMBE ", "SANTO ANTONIO DO JACINTO", "SANTO ANTONIO DO MONTE", "SANTO ANTONIO DO RIO ABAIXO ", "SANTO HIPOLITO", "SANTOS DUMONT ", "SAO BENTO ABADE ", "SAO BRAS DO SUACUI", "SAO DOMINGOS DO PRATA ", "SAO FRANCISCO ", "SAO FRANCISCO DE PAULA", "SAO FRANCISCO DE SALES", "SAO FRANCISCO DO GLORIA ", "SAO GERALDO ", "SAO GERALDO DA PIEDADE", "SAO GONCALO DO ABAETE ", "SAO GONCALO DO PARA ", "SAO GONCALO DO RIO ABAIXO ", "SAO GONCALO DO SAPUCAI", "SAO GOTARDO ", "SAO JOAO BATISTA DO GLORIA", "SAO JOAO DA MATA", "SAO JOAO DA PONTE ", "SAO JOAO DEL REI", "SAO JOAO DO ORIENTE ", "SAO JOAO DO PARAISO ", "SAO JOAO EVANGELISTA", "SAO JOAO NEPOMUCENO ", "SAO JOSE DA SAFIRA", "SAO JOSE DA VARGINHA", "SAO JOSE DO ALEGRE", "SAO JOSE DO DIVINO", "SAO JOSE DO GOIABAL ", "SAO JOSE DO JACURI", "SAO JOSE DO MANTIMENTO", "SAO LOURENCO", "SAO MIGUEL DO ANTA", "SAO PEDRO DA UNIAO", "SAO PEDRO DOS FERROS", "SAO PEDRO DO SUACUI ", "SAO ROMAO ", "SAO ROQUE DE MINAS", "SAO SEBASTIAO DA BELA VISTA ", "SAO SEBASTIAO DO MARANHAO ", "SAO SEBASTIAO DO OESTE", "SAO SEBASTIAO DO PARAISO", "SAO SEBASTIAO DO RIO PRETO", "SAO SEBASTIAO DO RIO VERDE", "SAO TIAGO ", "SAO TOMAS DE AQUINO ", "SAO TOME DAS LETRAS ", "SAO VICENTE DE MINAS", "SAPUCAI-MIRIM ", "SARDOA", "SENADOR CORTES", "SENADOR FIRMINO ", "SENADOR JOSE BENTO", "SENADOR MODESTINO GONCALVES ", "SENHORA DE OLIVEIRA ", "SENHORA DO PORTO", "SENHORA DOS REMEDIOS", "SERICITA", "SERITINGA ", "SERRA AZUL DE MINAS ", "SERRA DA SAUDADE", "SERRA DOS AIMORES ", "SERRA DO SALITRE", "SERRANIA", "SERRANOS", "SERRO ", "SETE LAGOAS ", "SILVEIRANIA ", "SILVIANOPOLIS ", "SIMAO PEREIRA ", "SIMONESIA ", "SOBRALIA", "SOLEDADE DE MINAS ", "TABULEIRO ", "TAIOBEIRAS", "TAPIRA", "TAPIRAI ", "TAQUARACU DE MINAS", "TARUMIRIM ", "TEIXEIRAS ", "TEOFILO OTONI ", "TIMOTEO ", "TIRADENTES", "TIROS ", "TOCANTINS ", "TOLEDO", "TOMBOS", "TRES CORACOES ", "TRES MARIAS ", "TRES PONTAS ", "TUMIRITINGA ", "TUPACIGUARA ", "TURMALINA ", "TURVOLANDIA ", "UBA ", "UBAI", "UBERABA ", "UBERLANDIA", "UMBURATIBA", "UNAI", "URUCANIA", "VARGEM BONITA ", "VARGINHA", "VARZEA DA PALMA ", "VARZELANDIA ", "VAZANTE ", "VERISSIMO ", "VESPASIANO", "VICOSA", "VIEIRAS ", "MATHIAS LOBATO", "VIRGEM DA LAPA", "VIRGINIA", "VIRGINOPOLIS", "VIRGOLANDIA ", "VISCONDE DO RIO BRANCO", "VOLTA GRANDE", "WENCESLAU BRAZ", "*** NAO INFORMADO ", "GOIAS ", "ACRE", "ALAGOAS ", "AMAPA ", "AMAZONAS", "BAHIA ", "CEARA ", "DISTRITO FEDERAL", "ESPIRITO SANTO", "MARANHAO", "MATO GROSSO ", "MATO GROSSO DO SUL", "PARA", "PARAIBA ", "PARANA", "PERNAMBUCO", "PIAUI ", "RIO GRANDE DO SUL ", "RIO GRANDE DO NORTE ", "RIO DE JANEIRO", "RONDONIA", "RORAIMA ", "SANTA CATARINA", "SAO PAULO ", "FELISBERTO CALDEIRA ", "FLORALIA", "MACAIA", "PIEDADE DO PARAOBEPA", "IPOEMA", "SENADOR MOURAO", "VILA MATIAS ", "SARZEDO ", "ACURUI", "BREJAUBA", "JUSTINOPOLIS", "MIGUEL BURNIER", "RIO DO PRADO", "DURANDE ", "SAPUCAIA DE GUANHAES", "EUXENITA", "MORRO DO FERRO", "GLUCINIO", "JOSE DE MELO", "SERGIPE ", "SENHORA DO CARMO", "MOCAMBEIRO", "POAIA ", "UBAPORANGA", "SAO JOSE DA LAPA", "PARANAIGUARA", "SAO SIMAO ", "CANGUARETAMA", "CACU", "RIO VERDE ", "GOIANIA ", "BOTUCATU", "QUIRINOPOLIS", "DESEMBOQUE/MG ", "ITUMBIARA ", "SAO JOAQUIM DA BARRA", "FLORANIA", "JARDIM DO SERIDO - RN ", "LAGOA NOVA/RN ", "CACHOEIRA ALTA", "GOUVELANDIA ", "FLOR DE MINAS ", "BIRIGUI ", "CHAVESLANDIA", "MACAIBA ", "CARAUBAS", "ESTRELA DO OESTE", "TAMBAU/SP ", "JUAZEIRO/RN ", "MUTONOPOLIS ", "PARANAIBA ", "SANTANA DO MATOS", "BRASILIA", "PICUI/PB", "JATAI GO", "ROLANDIA/SP ", "GUADALUPE ", "ARARAQUARA", "SANTO ANDRE ", "ACARI/RN", "SAO VICENTE/RN", "FERNANDOPOLIS ", "ITARUMA/GO", "SANTO AMARO/SP", "CORUMBAIBA-GO ", "ITAJA/GO", "SAO LUIZ/MA ", "LIMEIRA D,OESTE ", "BELO CAMPO", "JUSSARA ", "TEOTONIO VILELA -ALAGOAS", "SANTA HELENA DE GOIµS ", "CAMPINAS-SP ", "BREJO ALEGRE SP ", "COROADOS SP ", "SERRA DE SAO BENTO - RN ", "MORZALANDIA GO", "PARELHAS RN ", "MIRAPORANGA MG", "ARUANA - GO ", "PILAR - AL", "GURA SP ", "URUPE - SP", "ITUVERAVA - SP", "CURRAIS NOVOS -RN ", "CARNEIRINHO-MG", "CAMPO GRANDE - AL ", "BAGE-RS ", "INDIAPORA-SP", "INACIOLANDIA-GO ", "ILHEUS - BA ", "FRANCA", "ESTANCIA -SE", "PORTO A DO NORTE - MT ", "ITAJUIPE BA ", "SERRA NEGRA DO NORTE -RN", "SAO MIGUEL DOS CAMPOS-AL", "ARAPORA ", "ARARUNA - PB", "CARMOPOLIS", "BURITI ALEGRE-GO", "JABOTICABAL SP", "BOA VISTA (RORAIMA", "TAGUATINGA", "FRANCA", "BARUERI SP", "PONTES E LACERDA - MT ", "LAGOA SALGADA RN", "CAICO - RN", "AGUA PRETA - AL ", "TANGARA-RN", "SAO JOSE DE MIPIBU-RN ", "GARCA SP", "ANADIAS ", "MATRIZ DO CAMARAGIBE", "MACEIO", "IBIRAPITANGA - BA ", "SOLANEA - PB", "POCONE-MT ", "JARDINESIA", "SANTA FE DO SULSP ", "LONDRINA =PR", "RIBEIRAO PRETO", "CHAPECO -STA CATARINA ", "SAO SEBASTIAO DO PONTAL ", "EMBU - S.PAULO", "OLIMPIA SAO PAULO ", "SAO BERNARDO DO CAMPO ", "PIRACAIA", "PORTO VELHO ", "ARIQUEMES ", "PERDILANDIA ", "PORTO ALEGRE", "PALMAS", "ABADIA DOS DOURADOS ", "SERRA AZUL SAO PAULO", "TAQUARITINGA SAO PAULO", "MACAÔ RIO DE JANEIRO", "ARAGUAIANA MT ", "ALTINOPOLIS-SP", "CASCAVEL-PR ", "ALEXANDRITA ", "BRAGANCA PAULISTA ", "SAO JOSE DOS CAMPOS ", "ICEM", "CACHOEIRA DOURADA GOIAS ", "VAL PARAISO ", "CALDAS NOVAS", "UNIAO DE MINAS", "MAUA", "LENÇOIS -BA ", "TREMEMBE-SP ", "RIO DAS OSTRAS -RIO DE JANEIRO", "OSASCO -SP" }));
        ComboNaturalidade.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                    .addComponent(OutroDocumento)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ComboCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addComponent(ComboNacionalidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboNaturalidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboEscolaridade, 0, 349, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rbtMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtFeminino))
                            .addComponent(jLabel19)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ComboProfissao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(ComboNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtMasculino)
                    .addComponent(rbtFeminino))
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(240, 240, 240));

        jPanel6.setBackground(new java.awt.Color(153, 180, 209));

        try {
            CepRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CepRes.setEnabled(false);

        jLabel20.setText("CEP");

        bbtBuscarEnderecoRes.setText("Buscar");
        bbtBuscarEnderecoRes.setEnabled(false);

        RuaRes.setEnabled(false);

        jLabel21.setText("Rua");

        NumeroRes.setEnabled(false);

        jLabel22.setText("Nº");

        ComplementoRes.setEnabled(false);

        jLabel23.setText("Complemento");

        MunicipioRes.setEnabled(false);

        jLabel24.setText("Município");

        jLabel25.setText("UF");

        ComboUFRes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AM", "MG", "ES", "SP", "RJ" }));
        ComboUFRes.setEnabled(false);

        try {
            FoneResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FoneResidencial.setEnabled(false);

        jLabel26.setText("Fone");

        try {
            CelularResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CelularResidencial.setEnabled(false);

        jLabel27.setText("Celular");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(CepRes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbtBuscarEnderecoRes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(FoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(CelularResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(RuaRes, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(NumeroRes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(ComplementoRes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(MunicipioRes, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboUFRes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CelularResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CepRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbtBuscarEnderecoRes))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RuaRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComplementoRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumeroRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MunicipioRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboUFRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço Residencial", jPanel6);

        jPanel7.setBackground(new java.awt.Color(153, 180, 209));

        try {
            CepCom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CepCom.setEnabled(false);

        jLabel28.setText("CEP");

        bbtBuscarEnderecoCom.setText("Buscar");
        bbtBuscarEnderecoCom.setEnabled(false);

        RuaCom.setEnabled(false);

        jLabel29.setText("Rua");

        NumeroCom.setEnabled(false);

        jLabel30.setText("Nº");

        ComplementoCom.setEnabled(false);

        jLabel31.setText("Complemento");

        MunicipioCom.setEnabled(false);

        jLabel32.setText("Município");

        jLabel33.setText("UF");

        ComboUFCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AM", "MG", "ES", "SP", "RJ" }));
        ComboUFCom.setEnabled(false);

        try {
            Telefone1Com.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Telefone1Com.setEnabled(false);

        jLabel34.setText("Telefone 1");

        try {
            Telefone2Com.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Telefone2Com.setEnabled(false);

        jLabel35.setText("Telefone 2");

        RamalCom.setEnabled(false);

        jLabel36.setText("Ramal");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(CepCom, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbtBuscarEnderecoCom)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(Telefone1Com, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(Telefone2Com, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(RamalCom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(RuaCom, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(NumeroCom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(ComplementoCom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(MunicipioCom, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboUFCom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Telefone2Com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Telefone1Com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CepCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbtBuscarEnderecoCom)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RamalCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RuaCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComplementoCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumeroCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MunicipioCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboUFCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço Comercial", jPanel7);

        bbtAddDoador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/add.png"))); // NOI18N
        bbtAddDoador.setToolTipText("Incluir");
        bbtAddDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtAddDoadorActionPerformed(evt);
            }
        });

        bbtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove.png"))); // NOI18N
        bbtCancelar.setText("Cancelar");
        bbtCancelar.setEnabled(false);
        bbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtCancelarActionPerformed(evt);
            }
        });

        bbtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/accept.png"))); // NOI18N
        bbtSalvar.setText("Salvar");
        bbtSalvar.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NumDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbtPesquisaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bbtAddDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataCadastro))
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bbtSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bbtCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bbtPesquisaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bbtAddDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bbtCancelar)
                            .addComponent(bbtSalvar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void bbtAddDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtAddDoadorActionPerformed
        alternaEdicao(true);
        
        DataCadastro.setText(Auxiliares.Hoje());
    }//GEN-LAST:event_bbtAddDoadorActionPerformed

    private void bbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtCancelarActionPerformed
        alternaEdicao(false);
    }//GEN-LAST:event_bbtCancelarActionPerformed

    private void comboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoCivilActionPerformed
        if(comboEstadoCivil.getSelectedItem() == "Casado"){
            conjuge.setEnabled(true);
        }else{
            conjuge.setText("");
            conjuge.setEnabled(false);
        }
    }//GEN-LAST:event_comboEstadoCivilActionPerformed

    private void bbtPesquisaDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtPesquisaDoadorActionPerformed
        FrmPesquisaDoadores TelaPesquisa = new FrmPesquisaDoadores(null, true, PrincipalResources.NomeTelaPesquisaProdutos);
        TelaPesquisa.setVisible(true);
        
        
        
        JOptionPane.showMessageDialog(this, TelaPesquisa.getNomeDoador());
    }//GEN-LAST:event_bbtPesquisaDoadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura;
    private javax.swing.JFormattedTextField CelularResidencial;
    private javax.swing.JFormattedTextField CepCom;
    private javax.swing.JFormattedTextField CepRes;
    private javax.swing.JComboBox ComboCor;
    private javax.swing.JComboBox ComboEscolaridade;
    private javax.swing.JComboBox ComboNacionalidade;
    private javax.swing.JComboBox ComboNaturalidade;
    private javax.swing.JComboBox ComboProfissao;
    private javax.swing.JComboBox ComboUFCom;
    private javax.swing.JComboBox ComboUFRes;
    private javax.swing.JTextField ComplementoCom;
    private javax.swing.JTextField ComplementoRes;
    private javax.swing.JFormattedTextField Cpf;
    private javax.swing.JFormattedTextField DataCadastro;
    private org.jdesktop.swingx.JXDatePicker DataNascimento;
    private javax.swing.JFormattedTextField FoneResidencial;
    private javax.swing.ButtonGroup GroupSexo;
    private javax.swing.JTextField MunicipioCom;
    private javax.swing.JTextField MunicipioRes;
    private javax.swing.JTextField NomeMae;
    private javax.swing.JTextField NomePai;
    private javax.swing.JTextField NumDoador;
    private javax.swing.JTextField NumeroCom;
    private javax.swing.JTextField NumeroRes;
    private javax.swing.JTextField OutroDocumento;
    private javax.swing.JTextField RG;
    private javax.swing.JTextField RamalCom;
    private javax.swing.JTextField RuaCom;
    private javax.swing.JTextField RuaRes;
    private javax.swing.JFormattedTextField Telefone1Com;
    private javax.swing.JFormattedTextField Telefone2Com;
    private javax.swing.JButton bbtAddDoador;
    private javax.swing.JButton bbtBuscarEnderecoCom;
    private javax.swing.JButton bbtBuscarEnderecoRes;
    private javax.swing.JButton bbtCancelar;
    private javax.swing.JButton bbtPesquisaDoador;
    private javax.swing.JButton bbtSalvar;
    private javax.swing.JComboBox comboEstadoCivil;
    private javax.swing.JComboBox comboTimeDoCoracao;
    private javax.swing.JTextField conjuge;
    private javax.swing.JTextField iniciais;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelTitulo;
    private org.jdesktop.swingx.JXHyperlink linkFechar;
    private javax.swing.JTextField nomeDoador;
    private javax.swing.JRadioButton rbtFeminino;
    private javax.swing.JRadioButton rbtMasculino;
    // End of variables declaration//GEN-END:variables
}
