package Ex_11;

public class main {
    public static void main(String[] args) {

        Conta pessoa01 = new Conta(01, 950, "Alice Silva");

        Conta pessoa02 = new Conta(02, 1525, "Maria Barbosa");
        Conta pessoa03 = new Conta(03, 5300, "Filipe Manso");

        System.out.println("\n***** " + pessoa01.getTitularConta() + "***** ");
        System.out.println();

        pessoa01.depositar(1000);
        System.out.println();
        pessoa01.levantar(120);
        System.out.println();

        System.out.println("***** Transferencia *****");
        pessoa02.transferencia(1000, pessoa03);



    }
}
