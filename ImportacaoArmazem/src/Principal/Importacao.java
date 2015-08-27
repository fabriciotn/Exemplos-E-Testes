/*
 * To change this template, choose Tools\t | \tTemplates
 * and open the template in the editor.
 */
package Principal;

import DAO.ATE_HMAF_DAO;
import DAO.D02_HMAE_DAO;
import Importa.AteThread;
import Importa.ImportaCSV_ATE_HMAF;
import Importa.ImportaCSV_D02_HMAE;
import POJO.ATE_HMAF_POJO;
import POJO.D02_HMAE_HBH_POJO;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 12546446
 */
public class Importacao {

    public static void main(String[] args) {
        
        /*
         * Importação da tabela ATE do sistema HMAF
         */
        //ImportaCSV_ATE_HMAF ateCSV = new ImportaCSV_ATE_HMAF();
        //ATE_HMAF_DAO ate = new ATE_HMAF_DAO(); 
        
        //List<ATE_HMAF_POJO> ateList = ateCSV.getListaATE(); //Lê o arquivo CSV carregando os dados do CSV para um List do tipo ATE (POJO)
        //ate.adiciona(ateList); //Envia o List do tipo ATE para o DAO realizar a persistência no banco
        
        /*
         * Importação da tabela D02_HMAE
         */
        ImportaCSV_D02_HMAE D02_CSV = new ImportaCSV_D02_HMAE();
        D02_CSV.getListaD02_HMAE(); //Lê o arquivo CSV carregando os dados do CSV para um List do tipo D02_HMAE (POJO)
        
        /*
         * Importação da tabela D02_HMAE
         */
        //ImportaCSV_ATE_HMAF ATE_CSV = new ImportaCSV_ATE_HMAF();
        //ATE_CSV.getListaATE(); //Lê o arquivo CSV carregando os dados do CSV para um List do tipo D02_HMAE (POJO)
        
        //D02_HMAE_DAO D02_HMAE =  new D02_HMAE_DAO(); 
        //D02_HMAE.adiciona(Importa.ImportaCSV_D02_HMAE.TabelaD02_HMAE); //Envia o List do tipo D02_HMAE para o DAO realizar a persistência no banco
    }
}
