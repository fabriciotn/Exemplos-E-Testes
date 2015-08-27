package Controller;

import Conexao.ConectaOracle;
import GUI.Resources.PrincipalResources;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExitController {

    public static void ValidaExit() {
        Object[] options = {PrincipalResources.Sim, PrincipalResources.Nao};
        if (JOptionPane.showOptionDialog(null, PrincipalResources.DesejaSairDoSistema, PrincipalResources.Atencao,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]) == 0) {
            try {
                ConectaOracle.connection.close(); //Fecha a conexão
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                System.exit(0);
            }
            System.exit(0);
        }
        
    }
    
    public static boolean Logoff() {
        Object[] options = {PrincipalResources.Sim, PrincipalResources.Nao};
        if (JOptionPane.showOptionDialog(null, PrincipalResources.DesejaFazerLogoff, PrincipalResources.Atencao,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]) == 0) {
            try {
                ConectaOracle.connection.close(); //Fecha a conexão
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                return true;
            }
            return true;
        }
        return false;
    }
}
