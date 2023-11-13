package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    /*
    Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
calcule a soma desses números.
     */

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_05_31.txt"));

        String linha;
        int soma;

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();
            String[]itensDaLinha=linha.split(" ");

            for (int i=0; i<itensDaLinha.length; i++){
                System.out.println(itensDaLinha[i]);

              /*  if (itensDaLinha[1]){
                    soma= Integer.parseInt(itensDaLinha[1])
                }
*/
            }
        }




    }
}
