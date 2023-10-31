package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorA, valorB;
        String operacao, continuar = null;

        do {
            System.out.print("Insira um valor: ");
            valorA = input.nextDouble();
            System.out.print("Insira outro valor: ");
            valorB = input.nextDouble();

            System.out.print("Escolha uma operação aritmética (+-*/): ");
            operacao = input.next();


            switch (operacao) {
                case "+":
                    System.out.println("Soma: " + (valorA + valorB));
                    break;

                case "-":
                    System.out.println("Subtração: " + (valorA - valorB));
                    break;

                case "*":
                    System.out.println("Multiplicação: " + (valorA * valorB));
                    break;

                case "/":
                    System.out.println("Divisão: " + (valorA / valorB));
                    break;

                default:
                    System.out.println("Operação inválida!");
            }

            System.out.println("Deseja continuar? (s/n)");
            continuar = input.next();

        }
        while (continuar.equalsIgnoreCase("s"));

    }
}
