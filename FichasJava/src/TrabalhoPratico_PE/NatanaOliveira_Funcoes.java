package TrabalhoPratico_PE;

import javax.sound.midi.Soundbank;
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
     * Método para pesquisar Cliente
     *
     * @param matrizTotal
     * @param idCliente
     * @throws FileNotFoundException - Caso o ficheiro não seja encontrado
     */
    public static void pesquisarCliente(String[][] matrizTotal, String idCliente) throws FileNotFoundException {

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        int contador = 1; //contador é 1 para os registros de cliente repetidos não aparecerem

        // verificar se na linha encontra uma palavra igual na coluna 2 (vetor[1])
        for (int linha = 0; linha < matrizTotal.length; linha++) {

            //Comparar os itens do vetor[1] com o idCliente
            if (matrizTotal[linha][1].equals(idCliente) && contador == 1) { //o contador tem que ser igual a 1, caso seja diferente ele não entra no ciclo e não imprime
                System.out.println("\nNome do Cliente: " + matrizTotal[linha][2] + "\t|\t" + "Contacto: " + matrizTotal[linha][3] + "\t|\t" + "E-mail: " + matrizTotal[linha][4]);
                contador++;
            }
        }
    }

    /**
     * Método para encontrar o jogo mais caro
     *
     * @param matrizTotal
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String jogoMaisCaro(String[][] matrizTotal) throws FileNotFoundException {

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        double valorJogo = 0, jogoMaisCaro = 0;
        String nomeJogo = "", nomeJogoMaisCaro = "";

        for (int linha = 0; linha < matrizTotal.length; linha++) { //Entra na matriz
            valorJogo = Double.parseDouble(matrizTotal[linha][8]); //O valor dos jogos está no vetor [8]
            nomeJogo = matrizTotal[linha][7];

            //Se o valor do jogo for maior que o jogo mais caro
            if (valorJogo > jogoMaisCaro) {
                jogoMaisCaro = valorJogo;// Atualiza o valor mais caro
                nomeJogoMaisCaro = nomeJogo; // Ligar o nome do jogo mais caro ao valor maior
            }
        }
        System.out.println("\nJogo mais caro: " + nomeJogoMaisCaro + "\t|\t" + "Valor: " + jogoMaisCaro);
        return nomeJogoMaisCaro;
    }

    /**
     * Método para imprimir os compradores do jogo mais caro
     *
     * @param nomeJogoMaisCaro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void compradorJogoMaisCaro(String nomeJogoMaisCaro) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        String linhaJogoMaisCaro = ""; //comparar com a linha

        for (int i = 0; i < matrizTotal.length; i++) {
            if (matrizTotal[i][7].equals(nomeJogoMaisCaro)) { //comparar os itens das linhas (na coluna nome do jogo ([vetor7])) com o nome do jogo mais caro
                linhaJogoMaisCaro += matrizTotal[i][2] + "\t|\t"; //Associar a linha com a coluna nome do cliente (vetro[2]) e somar caso tenham repetidos
            }
        }
        System.out.println("\nCompradores: " + (linhaJogoMaisCaro));
    }

    /**
     * Método para registar Clientes
     */
    public static void registarCliente() {

        String nome, contacto, email;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        nome = input.nextLine();

        System.out.print("Insira seu contacto: ");
        contacto = input.next();

        System.out.print("Insira seu email: ");
        email = input.next();

        System.out.println("\n**** CLIENTE INSERIDO COM SUCESSO!! ***\n" + nome + "  |  " + contacto + "  |  " + email);
    }

    /*

    public static int lugaresVagos(int numero) {


/*
        int somatorio = 0;

        for (int a = 1; a < numero; a++) {
            somatorio += a;
            if (somatorio == numero) {
                return true;
            }
                }
        while (numero <= 121 && numero % 5 == 0) {
            if () {

            }
            numero++;
        }
        return numero;
    }
*/

    /*
     /**
     * Método que avalia se um número é triangular
     * @param num
     * @return True - se for triangular || False - se não for triangular
     */
    /*
    public static boolean triangular(int num) {

        int somatorio = 0, contador =1;

        for (int a = 1; a < num; a++) {
            somatorio += a;
            if (somatorio == num) {
                return true;
            }
        }
        return false;
    }



        //////////////////////////////
}
*/


}

