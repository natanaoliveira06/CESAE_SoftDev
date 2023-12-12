package Ex_02;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        Taco taco = ProductFactory.criarTaco("tipo", "nome");
        Fatura fatura01 = new Fatura();

        int opcao = 0;

        do {
            System.out.println("\n\n******************************************");
            System.out.println("*******  Bem vindo ao MexicoLocos  *******");
            System.out.println("******************************************");
            System.out.println("\n\n1. Escolha o seu taco: ");
            System.out.println("2. Ver status da encomenda");
            System.out.println("3. Ver detalhes da encomenda");
            System.out.println("0. Sair");
            System.out.println("\nEscolha uma das opções acima:");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Escolha o tipo de Taco [Frango][Vaca][Vegetariano]: ");
                    String tipo = input.next();
                    System.out.print("Escolha o nome do Taco desejado: ");
                    String nome = input.next();

                    Taco taco01 = ProductFactory.criarTaco(tipo, nome);
                    fatura01.adicionarTaco(taco01);
                    Taco taco02 = ProductFactory.criarTaco(tipo, nome);
                    fatura01.adicionarTaco(taco02);
                    Taco taco03 = ProductFactory.criarTaco(tipo, nome);
                    fatura01.adicionarTaco(taco03);
                    break;

                case 2:
                    System.out.println("Status da encomenda: ");
                    sleep(5000);
                    taco01.prepare();
                    sleep(1000);
                    taco01.bake();
                    sleep(1000);
                    taco01.box();
                    break;

                case 3:
                    fatura01.imprimirFatura();
                    System.out.println("Valor Total: "+fatura01.calcularTotal()+" €");
                    break;
            }

        } while (opcao != 0);


    }
}
