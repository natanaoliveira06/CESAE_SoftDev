package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int mTotais, sTotais, sTotaisdoAlbum, segundos, minutos, horas;

        // Ler variáveis
        System.out.print("Minutos música 1: ");
        mTotais = input.nextInt();

        System.out.print("Segundos música 1: ");
        sTotais = input.nextInt();

        System.out.print("Minutos música 2: ");
        mTotais = input.nextInt() + mTotais;

        System.out.print("Segundos música 2: ");
        sTotais = input.nextInt() + sTotais;

        System.out.print("Minutos música 3: ");
        mTotais = input.nextInt() + mTotais;

        System.out.print("Segundos música 3: ");
        sTotais = input.nextInt() + sTotais;

        // Apresentar valores
       /* System.out.println("Total minutos: " + mTotais);
        System.out.println("Total segundos: " + sTotais);*/

        //Calcular os segundos totais do album
        sTotaisdoAlbum = sTotais + (mTotais * 60);
       /* System.out.println("Segundos totais do album: " + sTotaisdoAlbum); */

        // Calcular horas do album
        horas = sTotaisdoAlbum/ 3600;

        //Calcular minutos
        minutos= (sTotaisdoAlbum/60)-(horas*60);

        // Calcular segundos
        segundos = sTotaisdoAlbum - (horas*3600) - (minutos*60);

        System.out.println(horas+"h " + minutos + "min " + segundos+ "seg ");

    }
}
