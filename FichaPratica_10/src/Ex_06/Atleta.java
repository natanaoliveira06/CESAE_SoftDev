package Ex_06;

import Ex_05.Pessoa;

public class Atleta {

    private String nome;
    private String modalidade;

    private double altura;

    private double peso;

    private String paisOrigem;

    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    //todo Cada atleta pode participar numa ou mais competições

    private Atleta[] listaAtletas;  //Criar uma lista de atletas que armazena um conjunto de objetos Atleta num array


    public Atleta() {  //Método construtor
        this.listaAtletas = new Atleta[8];  //Delimita o tamanho do array para 8
    }

    //Crie métodos para adicionar atletas

    public void addAtleta(Atleta novoAtleta) { // leva como parametro uma pessoa nova a ser adicionada
        for (int i = 0; i < this.listaAtletas.length; i++) { //ciclo pro array que tem o tamanho da agenda
            if (this.listaAtletas[i] == null) { // se o array agenda em determinada posição estiver vazio
                this.listaAtletas[i] = novoAtleta; // essa posição recebe uma pessoa nova
                return; // break para não preencher as proximas posições que também vão estar vazias (nulas)
            }
        }
    }

    public void listarAtletas() {

        for (int i = 0; i < this.listaAtletas.length; i++) { // entrar no array
            if (this.listaAtletas[i] != null) { // se a posição do array for diferente de nula para não exibir todos os nulos pra frente que ainda estão vagos
                this.listaAtletas[i].exibirDetalhes(); // exibe os detalhes apenas dos preenchidos
            }
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + "\t|  Modalidade: " + this.modalidade + "\t|  País de Origem: " + this.paisOrigem);
    }
}


