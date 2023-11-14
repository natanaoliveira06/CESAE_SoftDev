package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
. Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género, duração) para uma matriz.
a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas.
b. Pesquisar por músicas de um determinado género.
c. Pesquisar músicas de um determinado artista.
d. Pesquisar música com maior duração.
e. Pesquisar músicas com duração acima de um valor especificado.
f. Número de músicas no ficheiro
 */
public class Ex_11 {
    public static void main(String[] args) throws FileNotFoundException {

        //Fazer scanner do arquivo
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_11.csv"));

        String linhaAtual = fileScanner.nextLine(); //Grava a linha do cabeçalho

        String nomeMusica, artista, genero;
        double somatorioLinhas = 0, duracaoMusica;
        int i = 0;
        String[][] matriz = new String[46][4];

        while (fileScanner.hasNextLine()) {  //Começar a ler o ficheiro
            linhaAtual = fileScanner.nextLine(); // Ler a primeira linha
            somatorioLinhas++;  //Somar as linhas
        }
        //Tamanho da Matriz 46x4

        Scanner fileScanner2 = new Scanner(new File("Ficheiros/exercicio_11.csv"));

        while (fileScanner2.hasNextLine()) {
            linhaAtual = fileScanner2.nextLine();
            String[] itensDaLinha = linhaAtual.split(","); //Transformar em vetores

            // Gerar a matriz

            for (int c = 0; c < 4 && c < itensDaLinha.length-1; c++) {
                matriz[i][c] = itensDaLinha[c];

            }

            i++;



            // Imprimir a matriz na consola

            String ordem = " ";
            for (int  p = 0; i<matriz.length; i++) {
                for (int c = 0; c <matriz[0].length; c++) {

                    ordem += matriz[p][c] + "\t";


                }
                ordem += "\n";
            }

            System.out.println(ordem);



            /*
            for (int i = 0; i < 46; i++) {
                matriz[i][0] = itensDaLinha[0];
                matriz[i][1] = itensDaLinha[1];
                matriz[i][2] = itensDaLinha[2];
                matriz[i][3] = itensDaLinha[3];
            }

*/


        }
    }
}


