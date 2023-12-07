package Ex_03;

public class Main {
    public static void main(String[] args) {

        UserSessionManager usm = UserSessionManager.getInstance( );

        System.out.println("*****************************************");
        System.out.println("Token de Acesso:" +usm.getSessionToken());
        System.out.println("Último Acesso: " + usm.getLastAccess());
        usm.obterHoraAcesso();

        System.out.println("*****************************************");
        System.out.println("Token de Acesso:" + usm.getSessionToken());
        System.out.println("Último Acesso: " + usm.getLastAccess());

    }
}
