package Controller;

import Auxiliar.Constantes;
import Conexao.ADAuthenticator;


public class LoginController {

    private String user;
    private String pass;
    
    public LoginController(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    
    public boolean valida() {
        //para trabalhar em casa sem validar login
        if(this.user.equals("local")){
            Constantes.user = "MASTER";
            Constantes.unidade = "HBH";
            return true;
        }
        
        ADAuthenticator authenticator = new ADAuthenticator();

        if (authenticator.authenticate(this.user, this.pass)) {
            Constantes.user = this.user;
            return true;
        }
        
        return false;
    }
}
