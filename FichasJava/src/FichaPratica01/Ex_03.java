package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double lado1, lado2, area, perimetro;

        // Ler lado1
        System.out.print("Insira a dimensão de um dos lados do retângulo: ");
        lado1= input.nextInt();

        // Ler lado2
        System.out.print("Insira a dimensão do outro lado do retângulo: ");
        lado2= input.nextInt();

        // Ler perimetro
        perimetro = 2*(lado1+lado2);

        // Apresentar perimetro
        System.out.println("Perímetro: " + perimetro);

        // Ler area
        area = lado1*lado2;

        // Apresentar area
        System.out.println("Área: " + area);

    }
}
