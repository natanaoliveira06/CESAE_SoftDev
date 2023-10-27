package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2 ;
        System.out.print("Insira um número: ");
        num1= input.nextInt();
        System.out.print("Insira um número: ");
        num2= input.nextInt();

        if (num1==num2){
            System.out.println("Os números são iguais");
            }else{

            while (num1 <= num2) {
            System.out.println(num1);
            num1= num1+1;
        }

        while (num1 >= num2) {
            System.out.println(num1);
            num1= num1-1;
        }

        }

    }
}
