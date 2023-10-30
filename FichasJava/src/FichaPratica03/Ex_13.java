package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantInseridos, numInseridos, numGuardado;

        System.out.print("Quantos números deseja inserir?: ");
        quantInseridos = input.nextInt();

        System.out.print("Insira um número: ");
        numInseridos = input.nextInt();
        numGuardado = numInseridos;
        quantInseridos--; //quantInseridos=quantInseridos-1;

        while (quantInseridos > 0) {
            System.out.print("Insira um número: ");
            numInseridos = input.nextInt();
            quantInseridos--; //quantInseridos=quantInseridos-1;


            if (numGuardado < numInseridos) {

            }
            numGuardado = numInseridos;
        }
        System.out.println("Crescente");

    }
}

