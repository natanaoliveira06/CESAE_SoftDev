package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valorSecreto, aposta, nTentativas;


        System.out.print("JOGADOR 1:\nInsira um número (entre 0 e 100): ");
        valorSecreto = input.nextInt();

        System.out.print("JOGADOR 2:\nTente acertar o número secreto.\nPrimeira tentativa: ");
        aposta = input.nextInt();
        nTentativas = 1;


        while (aposta != valorSecreto) {
            System.out.print("Insira outra tentativa: ");
            aposta = input.nextInt();
            nTentativas++;
        }

        System.out.println("PARABÉNS!!! Você acertou em " + nTentativas + " tentativas.");

          }
    }
