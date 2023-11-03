package FichaPratica05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento
         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[10];
        int num=0;

        //Ler vetor
        for (int indice = 0; indice < 10; indice++) { //O indice é o "número da gaveta" (número da coluna)
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();

            vetor[indice]=num;

            if (vetor[indice]<num){
                System.out.println("Maior: " + num);
            }


        }

    }
}
