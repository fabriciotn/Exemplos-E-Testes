/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conecta.ConectaOracle;
import POJO.D02_HMAE_HBH_POJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 12546446
 */
public class D02_HMAE_DAO {

    private Connection connection;

    public D02_HMAE_DAO() {
        this.connection = ConectaOracle.conecta();
    }

    /*
     * Inclui os dados da tabela ATE
     */
    public boolean adiciona(List<D02_HMAE_HBH_POJO> doacoes) {
        String sql = "INSERT INTO D02_HMAE_FABRICIO1 ("
                + "AMOSTRA,"
                + "NUMDOADOR,"
                + "TURNO,"
                + "DOATIPO,"
                + "TIPODOACAO,"
                + "HOSPITAL,"
                + "BENEFICIA,"
                + "ATESTADO,"
                + "PESO,"
                + "ALTURA,"
                + "HB,"
                + "PULSO,"
                + "PA,"
                + "TEMPERA,"
                + "APTO,"
                + "CRMRESP,"
                + "STADOACAO,"
                + "RESDOACAO,"
                + "DTA_LIB,"
                + "TURNOLIB,"
                + "OPGERA,"
                + "OPEXAM,"
                + "HORAREC,"
                + "HORACOL,"
                //+ "EXASEGAMO,"
                + "HEMATO,"
                + "VOTO,"
                + "OPEVOTO,"
                + "DT_IMP_EXA,"
                + "AMO_ISBT"
                + ")"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);

            Date dataInicio = new Date();
            System.out.println("\n\n*************************");
            System.out.println("G R A V A Ç Ã O");
            System.out.println("Hora inicial: " + dataInicio);

            int i = 0;

            for (D02_HMAE_HBH_POJO doacao : doacoes) {
                ps.setString(1, doacao.getAmostra());
                ps.setString(2, doacao.getNumdoador());
                ps.setString(3, doacao.getTurno());
                ps.setString(4, doacao.getDoatipo());
                ps.setString(5, doacao.getTipodoacao());
                ps.setString(6, doacao.getHospital());
                ps.setString(7, doacao.getBeneficia());
                ps.setString(8, doacao.getAtestado());
                ps.setString(9, doacao.getPeso());
                ps.setString(10, doacao.getAltura());
                ps.setString(11, doacao.getHb());
                ps.setString(12, doacao.getPulso());
                ps.setString(13, doacao.getPa());
                ps.setString(14, doacao.getTempera());
                ps.setString(15, doacao.getApto());
                ps.setString(16, doacao.getCrmresp());
                ps.setString(17, doacao.getStadoacao());
                ps.setString(18, doacao.getResdoacao());
                ps.setString(19, doacao.getDta_lib());
                ps.setString(20, doacao.getTurnolib());
                ps.setString(21, doacao.getOpgera());
                ps.setString(22, doacao.getOpexam());
                ps.setString(23, doacao.getHorarec());
                ps.setString(24, doacao.getHoracol());
                //ps.setInt(25, doacao.getExasegamo());
                ps.setString(25, doacao.getHemato());
                ps.setString(26, doacao.getVoto());
                ps.setString(27, doacao.getOpevoto());
                ps.setString(28, doacao.getDt_imp_exa());
                ps.setString(29, doacao.getAmo_isbt());

                ps.addBatch();

                if (i < 100000) {
                    i++;
                } else {
                    System.out.println(connection.nativeSQL(sql));
                    System.out.println(doacao.getAmostra());
                    System.out.println(doacao.getNumdoador());
                    System.out.println(doacao.getTurno());
                    System.out.println(doacao.getDoatipo());
                    System.out.println(doacao.getTipodoacao());
                    System.out.println(doacao.getHospital());
                    System.out.println(doacao.getBeneficia());
                    System.out.println(doacao.getAtestado());
                    System.out.println(doacao.getPeso());
                    System.out.println(doacao.getAltura());
                    System.out.println(doacao.getHb());
                    System.out.println(doacao.getPulso());
                    System.out.println(doacao.getPa());
                    System.out.println(doacao.getTempera());
                    System.out.println(doacao.getApto());
                    System.out.println(doacao.getCrmresp());
                    System.out.println(doacao.getStadoacao());
                    System.out.println(doacao.getResdoacao());
                    System.out.println(doacao.getDta_lib());
                    System.out.println(doacao.getTurnolib());
                    System.out.println(doacao.getOpgera());
                    System.out.println(doacao.getOpexam());
                    System.out.println(doacao.getHorarec());
                    System.out.println(doacao.getHoracol());
                    //System.out.println(doacao.getExasegamo());
                    System.out.println(doacao.getHemato());
                    System.out.println(doacao.getVoto());
                    System.out.println(doacao.getOpevoto());
                    System.out.println(doacao.getDt_imp_exa());
                    System.out.println(doacao.getAmo_isbt());

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
            System.err.println("ERRO DE SQL: " + e.getMessage());
            e.printStackTrace();
            return false;
        }

        Date dataFim = new Date();
        System.out.println("Hora final: " + dataFim);
        return true;
    }
}
