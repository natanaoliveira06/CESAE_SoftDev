package FichaPratica06;

import java.util.Scanner;

public class Ex_05 {

/*
a) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.

 */

    public static int maiorValorArray(int[] vetor) {

        int maior;
        vetor = new int[10];

        maior = vetor[0];

        for (int indice = 1; indice < vetor.length; indice++) {
            if (vetor[indice] > maior) {
                maior = vetor[indice];
            }
        }

        return maior;
    }
}

