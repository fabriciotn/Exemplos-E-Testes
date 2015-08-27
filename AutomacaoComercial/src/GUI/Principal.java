/*
 * GUI.java
 * Criada em 23/01/2013
 * @author Fabrício T. Nascimento
 *
 * Tela principal do sistema.
 *
 */
package GUI;

import Auxiliar.JPanelWithBackground;
import Auxiliar.Constantes;
import Auxiliar.ThreadHora;
import Controller.ExitController;
import GUI.Resources.PrincipalResources;
import javax.swing.*;
import org.jdesktop.swingx.JXHyperlink;

public class Principal extends javax.swing.JFrame {

    JPanelWithBackground background = null;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraDeStatus = new org.jdesktop.swingx.JXStatusBar();
        labelUser = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        PainelMenu = new javax.swing.JPanel();
        TaskPaneCadastro = new org.jdesktop.swingx.JXTaskPane();
        TaskPaneEmissao = new org.jdesktop.swingx.JXTaskPane();
        TaskPaneApoio = new org.jdesktop.swingx.JXTaskPane();
        TaskPaneInformacoes = new org.jdesktop.swingx.JXTaskPane();
        BarraDeMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuDoador = new javax.swing.JMenuItem();
        MenuDoacao = new javax.swing.JMenuItem();
        MenuInaptos = new javax.swing.JMenuItem();
        MenuCatalogo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuRelatorios = new javax.swing.JMenuItem();
        MenuEtiquetas = new javax.swing.JMenuItem();
        MenuExames = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuUsuarios = new javax.swing.JMenuItem();
        MenuBackup = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();
        MenuLogoff = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(128, 128, 128));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setName("Principal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        BarraDeStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarraDeStatus.setName(""); // NOI18N
        BarraDeStatus.setPreferredSize(new java.awt.Dimension(4, 20));

        LabelHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout BarraDeStatusLayout = new javax.swing.GroupLayout(BarraDeStatus);
        BarraDeStatus.setLayout(BarraDeStatusLayout);
        BarraDeStatusLayout.setHorizontalGroup(
            BarraDeStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraDeStatusLayout.createSequentialGroup()
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelHora))
        );
        BarraDeStatusLayout.setVerticalGroup(
            BarraDeStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraDeStatusLayout.createSequentialGroup()
                .addGroup(BarraDeStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUser)
                    .addComponent(LabelHora))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PainelMenu.setBackground(new java.awt.Color(153, 180, 209));
        PainelMenu.setLayout(new org.jdesktop.swingx.VerticalLayout());

        TaskPaneCadastro.setToolTipText("Cadastros");
        TaskPaneCadastro.setName(""); // NOI18N
        TaskPaneCadastro.setSpecial(true);
        TaskPaneCadastro.setTitle("Cadastros");
        PainelMenu.add(TaskPaneCadastro);

        TaskPaneEmissao.setToolTipText("Cadastro");
        TaskPaneEmissao.setName(""); // NOI18N
        TaskPaneEmissao.setTitle("Emissão");
        PainelMenu.add(TaskPaneEmissao);

        TaskPaneApoio.setToolTipText("Cadastro");
        TaskPaneApoio.setName(""); // NOI18N
        TaskPaneApoio.setTitle("Apoio");
        PainelMenu.add(TaskPaneApoio);

        TaskPaneInformacoes.setToolTipText("");
        TaskPaneInformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sobre.png"))); // NOI18N
        TaskPaneInformacoes.setTitle("Informações");
        PainelMenu.add(TaskPaneInformacoes);

        jMenu1.setText("Cadastro");

        MenuDoador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MenuDoador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/male_users.png"))); // NOI18N
        MenuDoador.setText(PrincipalResources.NomeTelaCadProdutos);
        MenuDoador.setToolTipText("asdfsd");
        MenuDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDoadorActionPerformed(evt);
            }
        });
        jMenu1.add(MenuDoador);

        MenuDoacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MenuDoacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/star_half_full.png"))); // NOI18N
        MenuDoacao.setText(PrincipalResources.NomeTelaVendas);
        MenuDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDoacaoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuDoacao);

        MenuInaptos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MenuInaptos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/male_user_warning.png"))); // NOI18N
        MenuInaptos.setText("Inaptos");
        jMenu1.add(MenuInaptos);

        MenuCatalogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        MenuCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/open_folder_full.png"))); // NOI18N
        MenuCatalogo.setText("Catálogo");
        jMenu1.add(MenuCatalogo);

        BarraDeMenu.add(jMenu1);

        jMenu3.setText("Emissão");

        MenuRelatorios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        MenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/note.png"))); // NOI18N
        MenuRelatorios.setText("Relatórios");
        jMenu3.add(MenuRelatorios);

        MenuEtiquetas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        MenuEtiquetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/barcode.png"))); // NOI18N
        MenuEtiquetas.setText("Etiquetas");
        jMenu3.add(MenuEtiquetas);

        MenuExames.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        MenuExames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove_from_favorites.png"))); // NOI18N
        MenuExames.setText("Exames");
        jMenu3.add(MenuExames);

        BarraDeMenu.add(jMenu3);

        jMenu4.setText("Apoio");

        MenuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        MenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/edit_female_user.png"))); // NOI18N
        MenuUsuarios.setText("Usuários");
        jMenu4.add(MenuUsuarios);

        MenuBackup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        MenuBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/btn_backup_bg.gif"))); // NOI18N
        MenuBackup.setText("Backup");
        jMenu4.add(MenuBackup);

        BarraDeMenu.add(jMenu4);

        jMenu2.setText("Utilitários");

        MenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenu2.add(MenuSair);

        MenuLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/logoff.png"))); // NOI18N
        MenuLogoff.setText("Logoff");
        MenuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLogoffActionPerformed(evt);
            }
        });
        jMenu2.add(MenuLogoff);

        BarraDeMenu.add(jMenu2);

        setJMenuBar(BarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraDeStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 705, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraDeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ExitController.ValidaExit();
    }//GEN-LAST:event_formWindowClosing

    /*
     * Realiza todos os controles de tela ao abrir o formulário Principal
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //Seta a imagem de fundo
        background = new JPanelWithBackground(PrincipalResources.CaminhoBackground);
        background.setSize(2560, 1600);
        getContentPane().add(background);

        //Coloca os componentes invisíveis antes de fazer o login
        visibilidadeComponentes(false);

        //SETA O TAMANHO DA TELA ANTES DE MAXIMINIZAR - APENAS PARA DAR UM EFEITO MELHOR NA VISUALIZAÇÃO
        setSize(800, 600);

        //CENTRALIZA A TELA
        this.setLocationRelativeTo(null);

        //MAXIMINIZA A TELA
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Aciona o relógio
        ThreadHora th = new ThreadHora();
        th.start();

        //Cria objeto e abre a janela de login
        Login lg = new Login(this, true);
        lg.setVisible(true);

        //Acrescenta um texto à barra de título.
        this.setTitle(this.getTitle() + PrincipalResources.Titulo);

        //Acrescenta o nome do usuário à barra Status.
        labelUser.setText(PrincipalResources.Usuario + ": " + Constantes.user + " - Módulo: " + PrincipalResources.Modulo);

        //Ajusta os botões ao menu
        addButtons();

        //Coloca os componentes visiveis novamente
        visibilidadeComponentes(true);
}//GEN-LAST:event_formWindowOpened

    /*
     * Altera a visibilidade dos componentes Utilizado antes e após fazer o
     * login Antes do login deixa tudo invisivel, e depois fica tudo visivel
     *
     * Acrescentar todos os novos componentes
     */
    public void visibilidadeComponentes(boolean visibilidade) {
        BarraDeMenu.setVisible(visibilidade);
        BarraDeStatus.setVisible(visibilidade);
        PainelMenu.setVisible(visibilidade);
    }

    /*
     * Método para criar e adicionar os Botões de menu ao JXTaskPane
     */
    public void addButtons() {

        //<editor-fold defaultstate="collapsed" desc="Cria e Adiciona Links da TaskPaneCadastro">
        JXHyperlink linkDoador = new JXHyperlink();
        linkDoador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/male_users.png"))); //tamanho 32x32
        linkDoador.setText(PrincipalResources.NomeTelaCadProdutos);
         //Chama o evento da ação do linkDoador
        linkDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDoadorActionPerformed(evt);
            }
        });

        JXHyperlink linkDoacao = new JXHyperlink();
        linkDoacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/star_half_full.png")));
        linkDoacao.setText(PrincipalResources.NomeTelaVendas);
        //Chama o evento da ação do linkDoacao
        linkDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDoacaoActionPerformed(evt);
            }
        });

        JXHyperlink linkInaptos = new JXHyperlink();
        linkInaptos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/male_user_warning.png")));
        linkInaptos.setText("Inaptos");

        JXHyperlink linkCatalogo = new JXHyperlink();
        linkCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/open_folder_full.png")));
        linkCatalogo.setText("Catálogo");

        TaskPaneCadastro.add(linkDoador);
        TaskPaneCadastro.add(linkDoacao);
        TaskPaneCadastro.add(linkInaptos);
        TaskPaneCadastro.add(linkCatalogo);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Cria e Adiciona Links da TaskPaneEmissao">
        JXHyperlink linkRelatorios = new JXHyperlink();
        linkRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/note.png")));
        linkRelatorios.setText("Relatórios");

        JXHyperlink linkEtiquetas = new JXHyperlink();
        linkEtiquetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/barcode.png")));
        linkEtiquetas.setText("Etiquetas");

        JXHyperlink linkExames = new JXHyperlink();
        linkExames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove_from_favorites.png")));
        linkExames.setText("Exames");

        TaskPaneEmissao.add(linkRelatorios);
        TaskPaneEmissao.add(linkEtiquetas);
        TaskPaneEmissao.add(linkExames);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Cria e Adiciona Links da TaskPaneApoio">
        JXHyperlink linkUsuarios = new JXHyperlink();
        linkUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/edit_female_user.png")));
        linkUsuarios.setText("Usuários");

        JXHyperlink linkBackup = new JXHyperlink();
        linkBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/btn_backup_bg.gif")));
        linkBackup.setText("Backup");

        TaskPaneApoio.add(linkUsuarios);
        TaskPaneApoio.add(linkBackup);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Cria e Adiciona Links da TaskPaneInformacoes">
        JXHyperlink linkVersao = new JXHyperlink();
        linkVersao.setText("Versão Sistema: " + Constantes.versao);

        JXHyperlink linkModulo = new JXHyperlink();
        linkModulo.setText("Módulo: " + PrincipalResources.Modulo);

        JXHyperlink linkUsuario = new JXHyperlink();
        linkUsuario.setText("Usuário: " + Constantes.user);

        JXHyperlink linkUnidade = new JXHyperlink();
        linkUnidade.setText("Unidade: " + Constantes.unidade);

        JXHyperlink linkEmpresa = new JXHyperlink();
        //linkEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ttf.png")));
        linkEmpresa.setText(Constantes.empresa);

        TaskPaneInformacoes.add(linkVersao);
        TaskPaneInformacoes.add(linkModulo);
        TaskPaneInformacoes.add(linkUsuario);
        TaskPaneInformacoes.add(linkUnidade);
        TaskPaneInformacoes.add(linkEmpresa);
        //</editor-fold>
    }

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        ExitController.ValidaExit();
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLogoffActionPerformed
        if (ExitController.Logoff()) {
            this.dispose();
            new Principal().setVisible(true);
        }
    }//GEN-LAST:event_MenuLogoffActionPerformed

    private void MenuDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDoadorActionPerformed
        FrmCadastroDoadores telaDoador = new FrmCadastroDoadores(null, true, PrincipalResources.NomeTelaCadProdutos);
        telaDoador.setVisible(true);
    }//GEN-LAST:event_MenuDoadorActionPerformed

    private void MenuDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDoacaoActionPerformed
        FrmCadastroDoacao telaDoacao = new FrmCadastroDoacao(null, true, PrincipalResources.NomeTelaVendas);
        telaDoacao.setVisible(true);
    }//GEN-LAST:event_MenuDoacaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    //Os outros LookAndFeel desconfiguram a tela. 
                    //Deixar sempre o LookAndFeel_Windows
                    
                    UIManager.setLookAndFeel(PrincipalResources.LookAndFeel_Windows);
                    //UIManager.setLookAndFeel(PrincipalResources.LookAndFeel_Nimbus);
                    //UIManager.setLookAndFeel(PrincipalResources.LookAndFeel_GTL);
                    //UIManager.setLookAndFeel(PrincipalResources.LookAndFeel_Mac);
                    //UIManager.setLookAndFeel(PrincipalResources.LookAndFeel_Metal);
                    //UIManager.setLookAndFeel(PrincipalResources.LookAndFeel_Motif);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeMenu;
    private org.jdesktop.swingx.JXStatusBar BarraDeStatus;
    public static javax.swing.JLabel LabelHora;
    private javax.swing.JMenuItem MenuBackup;
    private javax.swing.JMenuItem MenuCatalogo;
    private javax.swing.JMenuItem MenuDoacao;
    private javax.swing.JMenuItem MenuDoador;
    private javax.swing.JMenuItem MenuEtiquetas;
    private javax.swing.JMenuItem MenuExames;
    private javax.swing.JMenuItem MenuInaptos;
    private javax.swing.JMenuItem MenuLogoff;
    private javax.swing.JMenuItem MenuRelatorios;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenuItem MenuUsuarios;
    private javax.swing.JPanel PainelMenu;
    private org.jdesktop.swingx.JXTaskPane TaskPaneApoio;
    private org.jdesktop.swingx.JXTaskPane TaskPaneCadastro;
    private org.jdesktop.swingx.JXTaskPane TaskPaneEmissao;
    private org.jdesktop.swingx.JXTaskPane TaskPaneInformacoes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JLabel labelUser;
    // End of variables declaration//GEN-END:variables
}
