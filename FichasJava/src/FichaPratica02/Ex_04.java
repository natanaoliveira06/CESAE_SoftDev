package FichaPratica02;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double lugar;

        // Ler lugar
        System.out.print("Lugar na corrida: ");
        lugar = input.nextDouble();

        switch (lugar);

        case 1:
        System.out.println("Ganhou 10 pontos");
        break;

        case2:
        System.out.println("Ganhou 8 pontos");
        break;

        case 3:
        System.out.println("Ganhou 6 pontos");
        break;

        case 4:
        System.out.println("Ganhou 5 pontos");
        break;

        case5:
        System.out.println("Ganhou 4 pontos");
        break;

        case 6:
        System.out.println("Ganhou 3 pontos");
        break;

        case 7:
        System.out.println("Ganhou 2 pontos");
        break;


    }
}
