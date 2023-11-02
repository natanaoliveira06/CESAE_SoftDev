package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valorA, valorB;
        String operacao, continuar;

        do {

            //Ler valorA
            System.out.print("Insira um número: ");
            valorA = input.nextDouble();

            //Ler valorB
            System.out.print("Insira outro número: ");
            valorB = input.nextDouble();

            //Ler operação
            System.out.print("Insira uma operação (+-*/): ");
            operacao = input.next();

            // Aplicar a operação aos numeros lidos
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
                    System.out.println("Operação inválida! Tente outra vez");
            }

            // Perguntar se quer realizar novas contas
            System.out.println("Deseja continuar? (s/n)");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("s"));

    }

}

