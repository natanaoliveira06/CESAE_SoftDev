package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws FileNotFoundException {
/*  Escreva um programa que leia o conteúdo de um ficheiro de texto e grave apenas as linhas que contêm
uma palavra específica num outro ficheiro. */


        //Fazer scanner do arquivo
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_08.txt"));

        //Ler o arquivo
        String linha, palavraAtual, palavraEspecifica = "uma";

        // Criar o novo ficheiro
        File novoFicheiro = new File("Ficheiros/exercicio_08_01.txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        while (fileScanner.hasNextLine()) { //o scanner está na primeira linha, se o arquivo tiver outra linha pra frente (baixo) entra no ciclo
            linha = fileScanner.nextLine();
            palavraAtual = fileScanner.next();

            if (palavraAtual == palavraEspecifica) {
                escritaNoFicheiro.println(linha);//imprime a linha no novo arquivo
            }
        }
        escritaNoFicheiro.close();
    }
}