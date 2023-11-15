package TrabalhoPratico_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NatanaOliveira {

    /**
     * Método que retorna o número de linhas totais de um ficheiro
     * @param caminhoFicheiro
     * @return Número total de Linhas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        int contagemLinhas = 0;

        while (fileScanner.hasNextLine()) {
            fileScanner.nextLine(); //Anda a linha pra frente
            contagemLinhas++; //Adiciona a linha a contagem das linhas
        }

        return contagemLinhas; //retorna a contagem das linhas total (com o cabeçalho)
    }

    /**
     * Método que retorna o número de colunas totais de um ficheiro
     * @param caminhoFicheiro
     * @param delimitador
     * @return Número total de colunas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        int contagemColunas = 0;

        String linha = fileScanner.nextLine(); //Grava a linha na primeira linha do ficheiro
        String[] itensDaLinha = linha.split(delimitador); //Transformar a linha em array de acordo com delimitador

        contagemColunas = itensDaLinha.length; //O números de colunas é igual o tamanho do array

        return contagemColunas;
    }








}
