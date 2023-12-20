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
    public void addPropriedade(Propriedade propriedadeAdquirida) {
            this.propriedades.add(propriedadeAdquirida);
    }
    public void exibirDetalhes() {
        System.out.println("\nNome do Personagem: " + this.nomePersonagem);
        System.out.println("Dinheiro: " + this.dinheiro + " Galeões");
        System.out.println("Objetivo do Jogo: " + this.objetivoVida);
        profissaoAtual.exibirDetalhes();
        System.out.println("Necessidade de Dormir: " + this.necessidadeSono + " Sonos");
        System.out.println("Necessidade de Alimentar: " + this.necessidadeRefeicao + " Comidas Mágicas");
        System.out.println("Necessidade de Divertir: " + this.necessidadeSocial + " Poções do Riso");
        System.out.println("Estatuto: " + this.estatuto);
        System.out.println("Nível de Formação: " + this.educacao);

        System.out.print("Propriedades: ");
        for (Propriedade propriedadeAtual : propriedades) {
            propriedadeAtual.exibirDetalhes();
        }
        System.out.println("Família: ");
        for (NPC npcAtual : familia) {
            npcAtual.exibirDetalhes();
        }
    }

    public Objetivo getObjetivoVida() {
        return objetivoVida;
    }

    public Profissao getProfissaoAtual() {
        return profissaoAtual;
    }

    public int getNecessidadeSono() {
        return necessidadeSono;
    }
    public int getNecessidadeRefeicao() {
        return necessidadeRefeicao;
    }

    public int getNecessidadeSocial() {
        return necessidadeSocial;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public int getEducacao() {
        return educacao;
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }
    public void setObjetivoVida(Objetivo objetivoVida) {
        this.objetivoVida = objetivoVida;
    }

    public void setProfissaoAtual(Profissao profissaoAtual) {
        this.profissaoAtual = profissaoAtual;
    }

    public void setNecessidadeSono(int necessidadeSono) {
        this.necessidadeSono = necessidadeSono;
    }

    public void setNecessidadeRefeicao(int necessidadeRefeicao) {
        this.necessidadeRefeicao = necessidadeRefeicao;
    }

    public void setNecessidadeSocial(int necessidadeSocial) {
        this.necessidadeSocial = necessidadeSocial;
    }

    public void setEstatuto(int estatuto) {
        this.estatuto = estatuto;
    }

    public void setEducacao(int educacao) {
        this.educacao = educacao;
    }
}


//todo TRANSFORMAR EM SINGLETON


