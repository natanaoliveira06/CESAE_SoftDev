package Domain;

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
        System.out.print("Profissão: " + this.nome + "\t| Salário Dia: "+this.salarioDia + "\t| Formal: " + this.formal  + "\t| Estatuto: " + this.estatuto + "\t| Nivel Minimo Educacao: " + this.nivelMinimoEducacao );
    }
}
