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

    Profissao estudante = new Profissao("Aluno de Hogwarts", 0, false, 15, 5);

    Profissao limpador = new Profissao ("Limpador de Caldeirões");
    Profissao garcom = new Profissao ("Garçom no Três Vassouras");
    Profissao estagiario = new Profissao ("Estágio de verão no Ministério da Magia");

    Profissao guarda = new Profissao ("Guarda Inquisitorial");
    Profissao estilista = new Profissao ("Estilista do professor Gilderoy Lockhart");

    Profissao monitorBola = new Profissao ("Monitor de Bola de Cristal");
    Profissao agenteDontencao = new Profissao ("Agente de Contenção de Acidentes");
    Profissao enfrentador = new Profissao ("Enfrentador de Bichos Papões");
    Profissao adestrador = new Profissao ("Adestrador de Hipogrifos");
    Profissao staffTorneio = new Profissao ("Staff no Torneio Tribuxo");
    Profissao staffCorujal = new Profissao ("Staff de Manutenção do Corujal");
    Profissao animador = new Profissao ("Animador de fantasmas");
    Profissao alimentador = new Profissao ("Alimentador de Trestrálios");
    Profissao vendedor = new Profissao ("Vendedor ambulante nos jogos de Quadribol");
    Profissao coordenador = new Profissao ("Coordenador da Logística de Barcos de Hogwarts");
    Profissao motorista = new Profissao ("Motorista do Knight Bus");
    Profissao oficial = new Profissao ("Oficial do Ministério");
    Profissao fabricanteVassoura = new Profissao ("Fabricante de vassouras");
    Profissao fabricanteVarinha = new Profissao ("Fabricante de varinhas");
    Profissao curandeiro = new Profissao ("Curandeiro");
    Profissao quebrador = new Profissao ("Quebrador de Maldições");
    Profissao magizoologista = new Profissao ("Magizoologista");
    Profissao jogador = new Profissao ("Jogador de quadribol");
    Profissao auror = new Profissao ("Auror");
    Profissao dragonologista = new Profissao ("Dragonologista");
    Profissao diretorDep = new Profissao ("Diretor do Departamento para Regulamentação e Controle das Criaturas Mágicas.");
    Profissao inspetor = new Profissao ("Inspetor de Chaves de Portais no Departamento de Transportes Mágicos");
    Profissao ministroMagia = new Profissao ("Ministro da Magia");
    Profissao diretorHogwarts = new Profissao ("Diretor de Hogwarts");
    Profissao professorTrouxas = new Profissao ("Professor de Estudo dos Trouxas");
    Profissao professorHerbologia = new Profissao ("Professor de Herbologia");
    Profissao professorTransfiguração = new Profissao ("Professor de Transfiguração");
    Profissao professorDefesa = new Profissao ("Defesa Contra as Artes das Trevas");
    Profissao monitorChefe = new Profissao ("Monitor-chefe Casa Hogwarts");



    //     Poções, Feitiços, Historia da Magia, Duelos e Vôo, Adivinhação, Trato das Criaturas Mágicas, Astronomia, Estudo dos Trouxas, Runas Antigas e Aritmância.
}
