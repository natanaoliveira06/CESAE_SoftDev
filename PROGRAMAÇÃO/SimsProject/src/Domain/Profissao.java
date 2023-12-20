package Domain;

import Domain.Propriedade.Propriedade;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Profissao {
    private String nome;
    private double salarioDia;
    private boolean formal;
    private int estatuto;
    private int nivelMinimoEducacao;
    public Profissao(String nome, double salarioDia, boolean formal, int estatuto, int nivelMinimoEducacao) {
        this.nome = nome;
        this.salarioDia = salarioDia;
        this.formal = formal;
        this.estatuto = estatuto;
        this.nivelMinimoEducacao = nivelMinimoEducacao;
    }
    public void exibirDetalhes() {
        System.out.print(this.nome + "\t| Salário Dia: "+this.salarioDia + "\t| Formal: " + this.formal  + "\t| Estatuto: " + this.estatuto + "\t| Nivel Minimo Educacao: " + this.nivelMinimoEducacao );
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public boolean isFormal() {
        return formal;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public int getNivelMinimoEducacao() {
        return nivelMinimoEducacao;
    }




    //  Profissao enfrentador = new Profissao ("Enfrentador de Bichos Papões");

    //  Profissao estilista = new Profissao ("Estilista do professor Gilderoy Lockhart");

   // Profissao monitorBola = new Profissao ("Monitor de Bola de Cristal");
   // Profissao agenteDontencao = new Profissao ("Agente de Contenção de Acidentes");
   // Profissao guarda = new Profissao ("Guarda Inquisitorial");

  //  Profissao coordenador = new Profissao ("Coordenador da Logística de Barcos de Hogwarts");

  //  Profissao fabricanteVassoura = new Profissao ("Fabricante de vassouras");
  //   Profissao fabricanteVarinha = new Profissao ("Fabricante de varinhas");
  //   Profissao curandeiro = new Profissao ("Curandeiro");
  //  Profissao quebrador = new Profissao ("Quebrador de Maldições");
  //   Profissao magizoologista = new Profissao ("Magizoologista");
    //  Profissao jogador = new Profissao ("Jogador de quadribol");

    //  Profissao dragonologista = new Profissao ("Dragonologista");

    //  Profissao oficial = new Profissao ("Oficial do Ministério");
    //   Profissao auror = new Profissao ("Auror");

    //   Profissao inspetor = new Profissao ("Inspetor de Chaves de Portais no Departamento de Transportes Mágicos");
    //  Profissao diretorDep = new Profissao ("Diretor do Departamento para Regulamentação e Controle das Criaturas Mágicas.");

    //   Profissao professorTrouxas = new Profissao ("Professor de Estudo dos Trouxas");
    //  Profissao professorHerbologia = new Profissao ("Professor de Herbologia");
    //  Profissao professorTransfiguração = new Profissao ("Professor de Transfiguração");
    //  Profissao professorDefesa = new Profissao ("Professor de Defesa Contra as Artes das Trevas");

    //  Profissao diretorHogwarts = new Profissao ("Diretor de Hogwarts");
    //    Profissao ministroMagia = new Profissao ("Ministro da Magia");


    //     Poções, Feitiços, Historia da Magia, Duelos e Vôo, Adivinhação, Trato das Criaturas Mágicas, Astronomia, Estudo dos Trouxas, Runas Antigas e Aritmância.
}
