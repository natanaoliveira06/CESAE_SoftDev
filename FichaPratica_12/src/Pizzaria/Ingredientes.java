package Pizzaria;

import Pizzaria.Enums.UnidMedida;

public class Ingredientes {

    private String codigoIngrediente;
    private String nome;
    private UnidMedida unidadeMedida; // Gramas, Litros, Unidades
    private double caloriasMedida; // nº de calorias por unidade de medida (por ex: 5Kcal por grama ou 15Kcal por Litro ou 35 Kcal por unidade)
    private double quantidade;


    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Ingredientes(String codigoIngrediente, String nome, UnidMedida unidadeMedida, double caloriasMedida) {
        this.codigoIngrediente = codigoIngrediente;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.caloriasMedida = caloriasMedida;
        this.quantidade=quantidade;
    }

    public String getCodigoIngrediente() {
        return codigoIngrediente;
    }

    public String getNome() {
        return nome;
    }

    public UnidMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getCaloriasMedida() {
        return caloriasMedida;
    }

    public void detalhesIngrediente(Pizza pizza) {
        System.out.print("[ " + this.codigoIngrediente + " | " + this.nome + " | " +this.unidadeMedida + " | " +this.caloriasMedida + " Kcal ]: "  /* + pizza.getQuantIngrediente()*/);
    }

}
