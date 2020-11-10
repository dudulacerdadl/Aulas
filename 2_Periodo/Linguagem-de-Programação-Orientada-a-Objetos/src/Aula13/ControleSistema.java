package Aula13;

public class ControleSistema {
    public boolean login(Acesso usuario, String senha){
        return usuario.isLiberado(senha);
    }
}
