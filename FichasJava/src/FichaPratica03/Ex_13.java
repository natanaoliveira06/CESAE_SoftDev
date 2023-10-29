package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantInseridos, numInseridos;

        System.out.print("Quantos números de seja inserir?: ");
        quantInseridos = input.nextInt();

        while (quantInseridos<=0) {
            System.out.print("Insira um número: ");
            numInseridos = input.nextInt();
            quantInseridos=quantInseridos;
        }


    }
}
