package FichaPratica03;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int numInserido, numMenos;

        System.out.print("Insira um número: ");
        numInserido = input.nextInt();
        numMenos=numInserido-5;


        while (numMenos<= numInserido+5) {
            System.out.println(numMenos);
            numMenos = numMenos + 1;
        }


    }
}
