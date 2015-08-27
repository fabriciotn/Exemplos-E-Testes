/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Importa;

import DAO.ATE_HMAF_DAO;
import POJO.ATE_HMAF_POJO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author 12546446
 */
public class ImportaCSV_ATE_HMAF {

    public List<ATE_HMAF_POJO> getListaATE() {
        List<ATE_HMAF_POJO> TabelaATE = new ArrayList<>();
        ATE_HMAF_DAO ATE = new ATE_HMAF_DAO();

        Date dataInicio = new Date();
        int i = 0;

        File f = new File("C:/HMAF/CSV/ATE.CSV");
        if (!f.exists()) {
            System.exit(-1);
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader(f));
            String line;
            System.out.println("*************************");
            System.out.println("L E I T U R A");
            System.out.println("Hora inicial: " + dataInicio);

            StringTokenizer token;
            ATE_HMAF_POJO registroATE;

            while ((line = in.readLine()) != null) {
                line = line.replace("\"\"", "null");
                line = line.replace("\"", "");
                token = new StringTokenizer(line, ";");
                registroATE = new ATE_HMAF_POJO();

                while (token.hasMoreElements()) {
                    registroATE.setReq_cod(token.nextToken());
                    registroATE.setCodigo(token.nextToken());
                    registroATE.setAte_com(token.nextToken());
                    registroATE.setAte_pos(token.nextToken());
                    registroATE.setAte_ano(token.nextToken());
                    registroATE.setAte_jul(token.nextToken());
                    registroATE.setAte_seq(token.nextToken());
                    registroATE.setAte_val_(token.nextToken());
                    registroATE.setAte_ven_(token.nextToken());
                    registroATE.setAte_dat_(token.nextToken());
                    registroATE.setAte_sta(token.nextToken());
                    registroATE.setAte_sto(token.nextToken());
                    registroATE.setAte_inc_(token.nextToken());
                }
                TabelaATE.add(registroATE);
                if (i >= 500000) {
                    //thread = new AteThread(TabelaD02_HMAE);
                    //thread.start();
                    ATE.adiciona(TabelaATE);

                    TabelaATE.clear();
                    i = 0;
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ATE.adiciona(TabelaATE);
        TabelaATE.clear();

        Date dataFim = new Date();
        System.out.println("Hora final: " + dataFim);
        System.out.println("Registros lidos do arquivo: " + TabelaATE.size());
        return TabelaATE;
    }
}
