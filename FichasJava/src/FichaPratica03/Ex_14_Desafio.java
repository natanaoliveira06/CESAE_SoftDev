package FichaPratica03;

import java.util.Scanner;

public class Ex_14_Desafio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fatorial, fatDec;

        System.out.print("Escolha um número para calcular o fatorial?:  ");
        fatorial = input.nextInt();

        fatDec = fatorial - 1;

        while (fatDec > 0) {

            fatorial = fatorial * fatDec;

                    }


        System.out.println("Fatorial = " + fatorial);


    }

}
