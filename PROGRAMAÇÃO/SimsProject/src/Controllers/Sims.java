package Controllers;

import Domain.Objetivo;
import Domain.Profissao;

import java.util.Scanner;

public class Sims {

    public void Jogador() {

        Scanner input = new Scanner(System.in);

        String nomePersonagem;
        double dinheiro;
        Objetivo objetivoVida;
        Profissao profissaoAtual;
        int necessidadeSono;
        int necessidadeRefeicao;
        int necessidadeSocial;
        int estatuto;
        int educacao;

        System.out.println("*** Novo Personagem ***");

        System.out.print("Nome do Personagem: ");  // Nome
        nomePersonagem = input.nextLine();

        System.out.print("Dinheiro: ");
        dinheiro = input.nextDouble();


        // O atributo dinheiro começa a 0, a profissão começa a nula, as necessidades começam a 100 (limite máximo), o estatuto começa a 0, e educação começa a 0 e as propriedades também vazias.

    }


    /**
     * Método construtor a partir da consola
     */


    public void jogo() {


    }
}
