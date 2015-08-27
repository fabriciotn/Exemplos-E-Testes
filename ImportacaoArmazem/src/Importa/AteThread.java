/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Importa;

import DAO.D02_HMAE_DAO;
import POJO.D02_HMAE_HBH_POJO;
import java.util.List;

/**
 *
 * @author 12546446
 */
public class AteThread extends Thread {

    List<D02_HMAE_HBH_POJO> pojo;
    D02_HMAE_DAO D02_HMAE =  new D02_HMAE_DAO(); 
    
    public AteThread(List<D02_HMAE_HBH_POJO> pojo) {
        this.pojo = pojo;
    }
    
    @Override
    public void run() {
        D02_HMAE.adiciona(pojo); //Envia o List do tipo D02_HMAE para o DAO realizar a persistência no banco
    }

}
