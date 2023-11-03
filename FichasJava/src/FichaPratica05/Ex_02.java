package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {


        /*
        Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (1 posição para
cada mês) e calcular o seu total anual
         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[12];  //Como se declara vetores
        int soma = 0;


        //Ler vetor
        int mes;
        for (mes = 0; mes < 12; mes++) { //O mês é o "número da gaveta" (número da coluna)
            System.out.print("Insira um valor de comissão (Mês " + (mes + 1) + "): ");
            vetor[mes] = input.nextInt();
            soma += vetor[mes];
        }

        //Calcular o total
        System.out.println("Soma: " + soma);




    }
}
