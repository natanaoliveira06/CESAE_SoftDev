package Ex_02;

public class main {
    public static void main(String[] args) {


        Conta pessoa01 = new Conta(01, 1000, "Alice Silva");

        Conta pessoa02 = new Conta(02, 2825, "Maria Barbosa");
        Conta pessoa03 = new Conta(03, 5300, "Filipe Manso");


        System.out.println("\nTitular da conta: "+ pessoa01.getTitularConta());
        System.out.println("Saldo Atual: "+ pessoa01.getSaldo() + "\n");

        pessoa01.pedirEmprestimo(900);

        System.out.println("\nQuero pegar emprestado + 300EUR\n");

        pessoa01.pedirEmprestimo(300);

    }



}
