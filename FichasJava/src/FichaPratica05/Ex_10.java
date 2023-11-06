package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        /* Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo utilizador.
        Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz
         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[][] matriz = new int[3][5];  //Declarar matriz
        String ordem = "";

        for (int linhas = 0; linhas < 3; linhas++) {     //É preciso um ciclo para linhas
            for (int colunas = 0; colunas < 5; colunas++) {  //É preciso um iclo para colunas

                System.out.print("Insira um número na matriz : [" + linhas + "][" + colunas + "] ");
                matriz[linhas][colunas] = input.nextInt();

                ordem += matriz[linhas][colunas] + "\t";      //Apresenta os numeros em sequencia na linha com um TAB

                if (colunas == 4) {       //Quando passa para a segunda linha é colocado \n para dar enter
                    ordem += "\n";
                }
            }
        }

        // Impressão da matriz **************** NÃO É PRECISO, Só pra ficar mais claro
        System.out.println(ordem);

        // Pedir outro valor ao usuario
        int valor, quantMatriz=0;
        System.out.print("Insira um número: ");
        valor = input.nextInt();

        for (int linhas = 0; linhas < 3; linhas++) {     //Copio porqu volto a matriz para avaliar os valores. Toda vez que tiver que voltar a matriz utilizo novamente
            for (int colunas = 0; colunas < 5; colunas++) {


                //Comparar o valor com os numeros da tabela

                if (valor==matriz[linhas][colunas]) {
                    quantMatriz++;
                }
            }
        }

        System.out.println("O numero inserido " + valor + " aparece: " + quantMatriz + " vezes"); //Só apresento quando termina de analisar a matriz e saio dela


    }
}
