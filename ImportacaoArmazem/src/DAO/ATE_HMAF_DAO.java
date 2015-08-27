/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conecta.ConectaOracle;
import POJO.ATE_HMAF_POJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 12546446
 */
public class ATE_HMAF_DAO {

    private Connection connection;

    public ATE_HMAF_DAO() {
        this.connection = ConectaOracle.conecta();
    }

    /*
     * Inclui os dados da tabela ATE
     */
    public boolean adiciona(List<ATE_HMAF_POJO> coletas) {
        String sql = "INSERT INTO ATE ("
                + "REQ_COD,"
                + "CODIGO,"
                + "ATE_COM,"
                + "ATE_POS,"
                + "ATE_ANO,"
                + "ATE_JUL,"
                + "ATE_SEQ,"
                + "ATE_VAL_,"
                + "ATE_VEN_,"
                + "ATE_DAT_,"
                + "ATE_STA,"
                + "ATE_STO,"
                + "ATE_INC_)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            Date dataInicio = new Date();
            System.out.println("\n\n*************************");
            System.out.println("G R A V A Ç Ã O");
            System.out.println("Hora inicial: " + dataInicio);

            int i = 0;

            for (ATE_HMAF_POJO coleta : coletas) {
                ps.setString(1, coleta.getReq_cod());
                ps.setString(2, coleta.getCodigo());
                ps.setString(3, coleta.getAte_com());
                ps.setString(4, coleta.getAte_pos());
                ps.setString(5, coleta.getAte_ano());
                ps.setString(6, coleta.getAte_jul());
                ps.setString(7, coleta.getAte_seq());
                ps.setString(8, coleta.getAte_val_());
                ps.setString(9, coleta.getAte_ven_());
                ps.setString(10, coleta.getAte_dat_());
                ps.setString(11, coleta.getAte_sta());
                ps.setString(12, coleta.getAte_sto());
                ps.setString(13, coleta.getAte_inc_());

                ps.addBatch();
                
                if (i < 100000) {
                    i++;
                } else {
                    ps.executeBatch();
                    ps.clearBatch();
                    i = 0;
                }
            }
            if (i > 0) {
                Date dataFimBatch = new Date();
                System.out.println("Hora final geral: " + dataFimBatch);
                System.out.println("*********A C A B O U************");
                ps.executeBatch();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        Date dataFim = new Date();
        System.out.println("Hora final: " + dataFim);        
        return true;
    }
}
