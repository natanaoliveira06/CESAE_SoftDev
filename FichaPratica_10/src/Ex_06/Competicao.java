package Ex_06;

import Ex_05.Pessoa;

public class Competicao {
    String nomeCompeticao;
    String paisRealizacao;
    private Atleta[] listaAtletas;  //Criar uma lista de atletas que armazena um conjunto de objetos Atleta num array


    public Competicao(String nomeCompeticao, String paisRealizacao, Atleta[] listaAtletas) {  //Método construtor
        this.nomeCompeticao = nomeCompeticao;
        this.paisRealizacao=paisRealizacao;
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

    //Crie um método para imprimir as informações de uma competição, inclusive a lista de atletas
    public void imprimirDetalhesCompeticao() {
        System.out.println("Competição: " + this.nomeCompeticao + "\t|País de Realização: " + this.paisRealizacao);
        System.out.println("Lista de atletas: " + this.listaAtletas);

    }

}
