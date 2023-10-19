package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valor1, valor2, valor3, medArit, medPond, p1, p2, p3;

        // Ler valor1
        System.out.print("Insira um número: ");
        valor1= input.nextInt();

        // Ler valor2
        System.out.print("Insira um número: ");
        valor2 = input.nextInt();

        // Ler valor3
        System.out.print("Insira um número: ");
        valor3 = input.nextInt();

        // Calcular a média aritmética
        medArit = (valor1+valor2+valor3)/3;

        // Apresentar a média aritmética
        System.out.println("Média Aritmética: " + medArit);

        // Calcular a média ponderada
        medPond = ((valor1*p1) + (valor2*p2) + (valor3*p3)) / p1 + p2+ p3;

        // Apresentar a média ponderada
        System.out.println("Média Ponderada: " + medPond);
    }
}
