package Conexao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaOracle {
    static final String USER = "buscarh";
    static final String PASS = "hemobusca";
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DB_URL = "jdbc:oracle:thin:@oracle01:1521:fha1";// "jdbc:oracle:thin:@10.14.124.172:1521:fhatrei";
    public static Connection connection;

    public static Connection conecta() {
        try {
            Class.forName(JDBC_DRIVER); //carrega classe de dados do BD
            System.out.println("Driver JDBC carregado com sucesso!");

            //estabelece conexão com o BD
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Conexão estabelecida - Banco " + DB_URL);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Falha ao se conectar!\n"+e.toString());
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return connection;
    }
}
