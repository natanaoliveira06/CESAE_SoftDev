package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int numInserido, media=0, quantInseridos=0;

        System.out.print("Insira um número: ");
        numInserido = input.nextInt();


        while (numInserido != -1) {
            System.out.print("Insira um número: ");
            numInserido = input.nextInt();

            if (numInserido ==-1){
                quantInseridos = quantInseridos+1;
                media = (media + numInserido -1)/quantInseridos-1;

                System.out.println("Média: " +media);
            }







        }











        }
}
