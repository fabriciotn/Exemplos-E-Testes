/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Importa;

import DAO.D02_HMAE_DAO;
import POJO.D02_HMAE_HBH_POJO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 12546446
 */
public class ImportaCSV_D02_HMAE {

    //public static List<D02_HMAE_HBH_POJO> TabelaD02_HMAE = new ArrayList<>();
    public void getListaD02_HMAE() {
        List<D02_HMAE_HBH_POJO> TabelaD02_HMAE = new ArrayList<>();
        D02_HMAE_DAO D02_HMAE = new D02_HMAE_DAO();

        Date dataInicio = new Date();
        AteThread thread;
        int i = 0;

        File f = new File("C:/HMAF/CSV/D02_HMAE.CSV");
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
            D02_HMAE_HBH_POJO registroD02_HMAE_HBH;


            while ((line = in.readLine()) != null) {
                line = line.replace("\"\"", "null");
                line = line.replace("\" \"", "null");
                line = line.replace("\"", "");
                token = new StringTokenizer(line, ";");
                registroD02_HMAE_HBH = new D02_HMAE_HBH_POJO();

                while (token.hasMoreElements()) {
                    registroD02_HMAE_HBH.setAmostra(token.nextToken());
                    registroD02_HMAE_HBH.setNumdoador(token.nextToken());
                    registroD02_HMAE_HBH.setTurno(token.nextToken());
                    registroD02_HMAE_HBH.setDoatipo(token.nextToken());
                    registroD02_HMAE_HBH.setTipodoacao(token.nextToken());
                    registroD02_HMAE_HBH.setHospital(token.nextToken());
                    registroD02_HMAE_HBH.setBeneficia(token.nextToken());
                    registroD02_HMAE_HBH.setAtestado(token.nextToken());
                    registroD02_HMAE_HBH.setPeso(token.nextToken());
                    registroD02_HMAE_HBH.setAltura(token.nextToken());
                    registroD02_HMAE_HBH.setHb(token.nextToken());
                    registroD02_HMAE_HBH.setPulso(token.nextToken());
                    registroD02_HMAE_HBH.setPa(token.nextToken());
                    registroD02_HMAE_HBH.setTempera(token.nextToken());
                    registroD02_HMAE_HBH.setApto(token.nextToken());
                    registroD02_HMAE_HBH.setCrmresp(token.nextToken());
                    registroD02_HMAE_HBH.setStadoacao(token.nextToken());
                    registroD02_HMAE_HBH.setResdoacao(token.nextToken());
                    registroD02_HMAE_HBH.setDta_lib(token.nextToken());
                    registroD02_HMAE_HBH.setTurnolib(token.nextToken());
                    registroD02_HMAE_HBH.setOpgera(token.nextToken());
                    registroD02_HMAE_HBH.setOpexam(token.nextToken());
                    registroD02_HMAE_HBH.setHorarec(token.nextToken());
                    registroD02_HMAE_HBH.setHoracol(token.nextToken());
                    registroD02_HMAE_HBH.setExasegamo(Integer.parseInt(token.nextToken()));
                    registroD02_HMAE_HBH.setHemato(token.nextToken());
                    registroD02_HMAE_HBH.setVoto(token.nextToken());
                    registroD02_HMAE_HBH.setOpevoto(token.nextToken());
                    registroD02_HMAE_HBH.setDt_imp_exa(token.nextToken());
                    registroD02_HMAE_HBH.setAmo_isbt(token.nextToken());
                }

                TabelaD02_HMAE.add(registroD02_HMAE_HBH);

                if (i >= 500000) {
                    //thread = new AteThread(TabelaD02_HMAE);
                    //thread.start();
                    D02_HMAE.adiciona(TabelaD02_HMAE);
                    TabelaD02_HMAE.clear();
                    
                    i = 0;
                }
                i++;


                //AteThread thread = new AteThread(registroD02_HMAE_HBH);
                //thread.start();
                //System.out.println(i++);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        D02_HMAE.adiciona(TabelaD02_HMAE);
        TabelaD02_HMAE.clear();
        
        Date dataFim = new Date();
        System.out.println("Hora final: " + dataFim);
        System.out.println("Registros lidos do arquivo: " + i);
        //return TabelaD02_HMAE;
    }
}
