package TrabalhoPratico_PE;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static TrabalhoPratico_PE.NatanaOliveira_Funcoes.lerFicheiroParaMatriz;

public class PaginaInicial {

    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        //  imprimirMatrizConsola(matrizTotal);

        // System.out.println(contarLinhasFicheiro("src/TrabalhoPratico_PE/GameStart_V2.csv")-1);


        Scanner input = new Scanner(System.in);

        String tipoUtilizador, ADMIN = "", CLIENTE = "";
        int passwordAdm = 123456789, passwordInserida;

        //Ciclo para entrar como utilizador
        do {
            System.out.println("\n\n***** Bem Vindo à GameStart! *****");
            System.out.print("\nInsira o tipo de Utilizador (ADMIN || CLIENTE || SAIR): ");
            tipoUtilizador = input.next();

            //aceitar letras minusculas
            tipoUtilizador = tipoUtilizador.toUpperCase();

            switch (tipoUtilizador) {
                case "ADMIN":
                    System.out.print("\nPASSWORD: ");
                    passwordInserida = input.nextInt();
                    if (passwordInserida==passwordAdm){
                        System.out.println("\n***** ADMINISTRADOR, Bem vindo! ");
                        //todo ENTRAR NO MENU ADM
                    }else{
                        System.out.println("Password Incorreta"); //todo TENTAR ALTERAR O METODO DE SENHAS
                    }
                    break;

                case "CLIENTE":
                    //todo ENTRAR NO MEU CLIENTE
                    break;

                case "SAIR":
                    System.out.println("Sair do sistema. Até a proxima!");
                    break;

                default:
                    System.out.println("Utilizador inválido... Tente outra vez!");

            }
        }while (tipoUtilizador != "SAIR");



    }
}
