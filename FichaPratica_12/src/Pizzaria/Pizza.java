package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {
    private String codPizza;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<Ingredientes> ingrediente;

    public Pizza(String codPizza, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codPizza = codPizza;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingrediente = new ArrayList<>(5);// Inicializa o ArrayList com capacidade máxima de 5 elementos
    }

    // Método para Adicionar novos ingredientes a uma Pizza até um máximo de 5.

    public void addIngrediente(Ingredientes ingredienteNovo) { //Recebe como parametro um ingrediente novo

        if (ingrediente.size() < 5) { //Se os ingredientes forem menos que 5
            // Adiciona o ingrediente apenas se o limite de 5 não for atingido
            this.ingrediente.add(ingredienteNovo); //nomeDoArray.add(o que sera adicionado)
            System.out.println("Ingrediente adicionado: " /*+ ingrediente.getNome() */);
        } else {  // Se tiver mais que 5 ingredientes
            System.out.println("Limite máximo de ingredientes atingido para esta pizza.");
        }
    }


    // Método para Editar a quantidade de um ingrediente que pertença à coleção de uma pizza.




    // Método para Remover um ingrediente (identificando o ingrediente pelo seu id).
    public void removeIngrediente(int index) {
        this.ingrediente.remove(index); //nomeDoArray.remove(o que sera retirado, neste caso o index)
    }

    // Método para Determinar o número de calorias de uma Pizza.

    public void caloriasPizza() {
        double caloriaPizza = 0;  // Soma das calorias de todos os ingredientes



        // Método de descrição detalhada da Pizza, assim como os seus ingredientes.
/*
        public void detalhesPizza() {
            System.out.println("\n*****  Pizza " + this.nome + " *****");
            System.out.println("Código: " + this.codPizza);
            System.out.println("Descrição: " + this.descricao);
            System.out.println("Preço: " + this.preco);
            System.out.println("Código: " + this.codPizza);
            System.out.println("Tamanho: " + this.tamanho);
            // System.out.println(" Ingrediente 1: " + );

            for (Ingredientes ingredienteAtual : this.ingrediente) {
                ingredienteAtual.detalhesIngrediente(this); // Passa a instância atual de Pizza como parâmetro
            }
        }

*/
    }
}
