package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario;

        // Ler salário
        System.out.print("Salário anual: ");
        salario = input.nextDouble();


        if (salario <= 15000) {
            System.out.println("Montante de imposto: " + (salario * 0.2));
        }

        if (salario > 15000 && salario <= 20000) {
            System.out.println("Montante de imposto: " + (salario * 0.3));
        }

        if (salario > 20000 && salario <= 25000) {
            System.out.println("Montante de imposto: " + (salario * 0.35));
        }

        if (salario > 25000) {
            System.out.println("Montante de imposto: " + (salario * 0.40));
        }

    }
}
