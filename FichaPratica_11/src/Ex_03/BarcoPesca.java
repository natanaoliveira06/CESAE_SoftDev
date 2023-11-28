package Ex_03;

import Ex_02.Pessoa;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga; //Kg
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscosPescados;

    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.peixesPescados = new ArrayList<>();
        this.mariscosPescados = new ArrayList<>();
    }

    public double getCargaAtual() {  //Calcular a carga atual antes de adicionar mais peixes
        double cargaAtual = 0;

        for (Peixe peixeAtual : this.peixesPescados) { //um peixe atual para cada posição do meu array
            cargaAtual += peixeAtual.getPeso();  //a carga atual aumenta o peso do peixe
        }

        for (Marisco mariscoAtual : this.mariscosPescados) {
            cargaAtual += mariscoAtual.getPeso();
        }
        return cargaAtual;
    }


    // Método pescarPeixe e adicione o animal. Deve verificar a carga do barco
    public void addPeixe(Peixe peixePescado) {

        if (peixePescado.getPeso() + this.getCargaAtual() > this.capacidadeCarga){ //se o peixe pescado agora + a carga atual

        }


        this.peixesPescados.add(peixePescado);

            System.out.println("A carga de peixes excede a capacidade do barco.");
        }

    // Método pescarMarisco
    public void addMarisco(Marisco mariscoPescado) {
        this.mariscosPescados.add(mariscoPescado);
        if (calcularCargaBarco() > this.capacidadeCarga) {
            System.out.println("A carga de mariscos excede a capacidade do barco.");
        }
    }

    // Método largarPeixe
    public void largarPeixe(int index) {
        this.peixesPescados.remove(index); //nomeDoArray.remove(o que sera retirado, neste caso o index)
    }

    // Método largarMarisco
    public void largarMarisco(int index) {
        this.mariscosPescados.remove(index); //nomeDoArray.remove(o que sera retirado, neste caso o index)
    }

    // Método calcularTotal que calcule o total em € dos animais pescados.


    // Método salarioTripulação, sabendo que o capitão (não conta como tripulante) retira 40% do valor total para gastos/manutenção
    // e salário próprio, sendo que o resultado da função será o restante valor a dividir por cada tripulante


}

