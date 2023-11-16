package TrabalhoPratico_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NatanaOliveira_Funcoes {

    /**
     * Método que retorna o número de linhas totais de um ficheiro
     *
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
     *
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

    /**
     * Método que armazena numa matriz o conteudo de um ficheiro
     *
     * @param caminhoFicheiro
     * @return Matriz String[][] preenchida com o conteudo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */

    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        // Contar numero de linhas do ficheiro que recebeu como parametro (-1 que é excluindo o cabecalho)
        int numeroLinhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;

        // Contar número de colunas do ficheiro
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, ";"); //É preciso definir o delimitador

        // Declarar uma matriz com o tamanho adequado
        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = fileScanner.nextLine(); //Guardar a linha do cabeçalho
        int linhaMatriz = 0;

        while (fileScanner.hasNextLine()) {
            linhaAtual = fileScanner.nextLine(); //Avançar a linha do cabeçalho e pegar a proxima
            String[] itensDaLinha = linhaAtual.split(";");

            for (int i = 0; i < itensDaLinha.length; i++) {  //A linha vai passar a frente
                matrizTotal[linhaMatriz][i] = itensDaLinha[i];
            }
            linhaMatriz++;  //Soma uma linha na matriz
        }

        return matrizTotal;
    }

    /**
     * Método para imprimir uma matriz na consola
     *
     * @param matriz a imprimir
     */
    public static void imprimirMatrizConsola(String[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }

    /**
     * Método para calcular valor das vendas
     *
     * @param matrizTotal
     * @return total de vendas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static double valorTotalVendas(String[][] matrizTotal) throws FileNotFoundException {

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        double valor, totalVendas = 0;

        for (int linha = 0; linha < matrizTotal.length; linha++) {
            valor = Double.parseDouble(matrizTotal[linha][8]); //O valor é igual a primeira linha matriz na coluna Vetor [8]
            totalVendas += valor; //O valor passar a somar as próximas linhas
        }
        return totalVendas;
    }

    /**
     * Método que calcula o lucro de vendas 20%)
     *
     * @param valorTotalVendas
     * @return o lucro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static double lucroTotal(double valorTotalVendas) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        double lucro;

        lucro = valorTotalVendas(matrizTotal) * 0.2; //Puxar a função do calculo de vendas que já está feita

        return lucro;
    }

    /**
     * Método para pesquisarCliente
     * @param matrizTotal
     * @param idCliente
     * @throws FileNotFoundException -Caso o ficheiro não seja encontrado
     */
    public static void pesquisarCliente(String[][] matrizTotal, String idCliente) throws FileNotFoundException {

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        int contador = 0; //contador é 0 para os registros de cliente repetidos não somarem

        // verificar se na linha encontra uma palavra igual na coluna 2 (vetor[1])
        for (int linha = 0; linha < matrizTotal.length; linha++) {

            if (matrizTotal[linha][1].equals(idCliente) && contador==0) { //Comparar os itens do vetor[1] com o idCliente e o contador 0 para eliminar repetidos
                System.out.println("Nome do Cliente: " + matrizTotal[linha][2] + "\t|\t" + "Contacto: " + matrizTotal[linha][3] + "\t|\t" + "E-mail: " + matrizTotal[linha][4]);
                contador++;
            }
        }
    }





    //////////////////////////////

}

