package TrabalhoPratico_PE;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static TrabalhoPratico_PE.NatanaOliveira_Funcoes.*;

/*
2. Procurar estacionamento. Sabendo que os lugares de vago são todos os números triangulares múltiplos de 5 num limite de 121 lugares.
3. Imprima todos os títulos de jogos (sem duplicados).
4. Dada uma Editora, imprima todas as categorias e os respetivos jogos. (Preferencialmente com formatação visual)
 */
public class MenuCliente {
    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        //todo --- Acima já está no outro arquivo

        Scanner input = new Scanner(System.in);
        int menuCliente;

        do {
            System.out.println("\n\n***** CLIENTE, Bem vindo! *****\n");
            System.out.println("1. Registar cliente ");
            System.out.println("2. Procurar estacionamento");
            System.out.println("3. Imprimir todos os títulos de jogos)");
            System.out.println("4. Imprimir todas as categorias e os respetivos jogos de uma editora");
            System.out.println("0. Sair do menu Cliente");

            System.out.print("\nSelecione a opção desejada: ");
            menuCliente = input.nextInt();

            switch (menuCliente) {

                case 1: //Registar cliente
                    System.out.println("\n***** Registar cliente *****\n");
                    registarCliente();
                    break;

                case 2: // Procurar estacionamento
                    System.out.println("\n***** Procurar estacionamento *****\n");
                    int numero=0;
                  //  lugaresVagos(numero);


                    break;

                case 3: // Imprimir todos os títulos de jogos
                    System.out.println("\n");

                    break;

                case 4: // Imprimir todas as categorias e os respetivos jogos de uma editora
                    System.out.println("\n");

                    break;

                case 0:
                    System.out.println("\nCLIENTE, obrigado e até a proxima!");
                    break;

                default:
                    System.out.println("\nOpção inválida... Tente outra vez!");
            }
        } while (menuCliente != 0);


    }
}


