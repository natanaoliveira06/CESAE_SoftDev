package Domain.Pessoa;

import Domain.Objetivo;
import Domain.Profissao;
import Domain.Propriedade.Propriedade;

import java.util.ArrayList;

public class Jogador extends Pessoa {

    private Objetivo objetivoVida;
    private Profissao profissaoAtual;
    private int necessidadeSono;
    private int necessidadeRefeicao;
    private int necessidadeSocial;
    private int estatuto;
    private int educacao;
    private ArrayList<Propriedade> propriedades;
    private ArrayList<NPC> familia;

    public Jogador(String nomePersonagem, double dinheiro, Objetivo objetivoVida, Profissao profissaoAtual, int necessidadeSono, int necessidadeRefeicao, int necessidadeSocial, int estatuto, int educacao) {
        super(nomePersonagem, dinheiro);
        this.objetivoVida = objetivoVida;
        this.profissaoAtual = profissaoAtual;
        this.necessidadeSono = necessidadeSono;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.necessidadeSocial = necessidadeSocial;
        this.estatuto = estatuto;
        this.educacao = educacao;
        this.propriedades = new ArrayList<>();
        this.familia = new ArrayList<>();
    }

    public void exibirDetalhes() {
        System.out.println("\nNome do Personagem: " + this.nomePersonagem);
        System.out.println("Dinheiro: " + this.dinheiro + " Galeões");
        System.out.println("Objetivo do Jogo: " + this.objetivoVida);
        System.out.println("Profissão Atual: " + this.profissaoAtual);
        System.out.println("Necessidade de Dormir: " + this.necessidadeSono + " Sonos");
        System.out.println("Necessidade de Alimentar: " + this.necessidadeRefeicao + " Comidas Mágicas");
        System.out.println("Necessidade de Divertir: " + this.necessidadeSocial + " Poções do Riso");
        System.out.println("Estatuto: " + this.estatuto);
        System.out.println("Nível de Formação: " + this.educacao);
        System.out.println("Propriedades: ");
        for (Propriedade propriedadeAtual : propriedades) {
            propriedadeAtual.exibirDetalhes();
        }
        System.out.println("Família: ");
        for (NPC npcAtual : familia) {
            npcAtual.exibirDetalhes();
        }
    }

    public void addPropriedade(Propriedade propriedadeAdquirida) {

        for (Propriedade propriedadeAtual : propriedades) {
            this.propriedades.add(propriedadeAdquirida);
        }
    }


}


//todo TRANSFORMAR EM SINGLETON


