package Ex_03;

import Ex_02.Logger;

import java.util.Random;

public class UserSessionManager {

    private static UserSessionManager instance; // Instância única da classe
    private int sessionToken;
    private String lastAccess;

    // Construtor privado para evitar instâncias diretas
    private UserSessionManager() { //Não recebe parametro por ser random

        Random random = new Random(); // Gera um token de sessão aleatório
        gerarToken();
        obterHoraAcesso();
    }

    // Método estático para obter a instância única

    public static synchronized UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }


        public void gerarToken(){
            Random random = new Random();
            sessionToken = random.nextInt(10000);
    }

    public void obterHoraAcesso(){
        // Atualiza o horário do último acesso
        lastAccess = String.valueOf(System.currentTimeMillis());
    }

    public void atualizarUltimoAcesso(){
        // Atualiza o horário do último acesso quando a sessão é atualizada
        obterHoraAcesso();

    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }
}
