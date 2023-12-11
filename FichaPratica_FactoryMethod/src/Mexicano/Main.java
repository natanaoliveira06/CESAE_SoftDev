package Mexicano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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
            opcao= input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Escolha o tipo de Taco [TacoVaca][TacoFrango][TacoVegetariano]: ");
                    System.out.print("Tipo de Taco: ");
                    String tipo = input.next();
                    String nome = input.next();

                    Taco taco01 = ProductFactory.criarTaco(tipo, nome);

                    taco01.prepare();

                    taco01.bake();

                    taco01.box();
                    break;
            }

        } while (opcao != 0);


    }
}
