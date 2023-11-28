package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {
    private String codPizza;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> composicao;

    public Pizza(String codPizza, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codPizza = codPizza;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.composicao = new ArrayList<>(5);// Inicializa o ArrayList com capacidade máxima de 5 elementos
    }

    /**
     * Método para Adicionar novos ingredientes a uma Pizza até um máximo de 5
     *
     * @param ingredienteNovo
     */

    public void addIngrediente(IngredientePizza ingredienteNovo) { //Recebe como parametro um ingrediente novo

        if (composicao.size() < 5) { //Se os ingredientes forem menos que 5
            // Adiciona o ingrediente apenas se o limite de 5 não for atingido
            this.composicao.add(ingredienteNovo); //nomeDoArray.add(o que sera adicionado)
            System.out.println("Ingrediente adicionado: " + ingredienteNovo);
        } else {  // Se tiver mais que 5 ingredientes
            System.out.println("Limite máximo de ingredientes atingido para esta pizza.");
        }
    }

    /**
     * Método para editar a quantidade de um ingrediente
     *
     * @param ingredienteAlterar
     * @param novaQuantidade
     */

    public void editarQuantidade(Ingrediente ingredienteAlterar, double novaQuantidade) {

        for (IngredientePizza ingredienteAtual : this.composicao) { //Vai buscar na classe IngredientesPizza todos os ingredeintes
            if (ingredienteAtual.getIngrediente().equals(ingredienteAlterar)) { // Compara o ingrediente atual que quer mudar com o da classe da pizza
                ingredienteAtual.setQuantidade(novaQuantidade); // Setter para alterar a aquantidade
            }
        }
    }

    //Método para Remover um ingrediente (identificando o ingrediente pelo seu id).


    public void removeIngrediente(String codigoIngredienteRemovido) {

        for (IngredientePizza ingredienteAtual : this.composicao) { //Vai buscar na classe IngredientesPizza todos os ingredeintes
            if (ingredienteAtual.getIngrediente().getCodigoIngrediente())

                this.composicao.remove(index); //nomeDoArray.remove(o que sera retirado, neste caso o index)
        }












        // Método para Determinar o número de calorias de uma Pizza.

        public void caloriasPizza () {
            double caloriaPizza = 0;  // Soma das calorias de todos os ingredientes
        }






/*
        // Método para Determinar o número de calorias de uma Pizza.

        public void caloriasPizza () {
            double caloriaPizza = 0;  // Soma das calorias de todos os ingredientes
        }


        // Método de descrição detalhada da Pizza, assim como os seus ingredientes.


        public void detalhesPizza () {
            System.out.println("\n*****  Pizza " + this.nome + " *****");
            System.out.println("Código: " + this.codPizza);
            System.out.println("Descrição: " + this.descricao);
            System.out.println("Preço: " + this.preco + "€");
            System.out.println("Tamanho: " + this.tamanho);
            int a = 1;
            System.out.println("Ingrediente " + a++ + ": ");
            for (IngredientePizza ingredienteAtual : this.ingrediente) {
                ingredienteAtual.detalhesIngrediente();                        // Passa a instância atual de Pizza como parâmetro
            }


        */
    }
}







