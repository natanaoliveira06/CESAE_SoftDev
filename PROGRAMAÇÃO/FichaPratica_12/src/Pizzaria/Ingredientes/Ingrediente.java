package Pizzaria.Ingredientes;

import Pizzaria.Enums.UnidMedida;

public class Ingrediente {

    private String codigoIngrediente;
    private String nome;
    private UnidMedida unidadeMedida; // Gramas, Litros, Unidades
    private double caloriasMedida; // nº de calorias por unidade de medida (por ex: 5Kcal por grama ou 15Kcal por Litro ou 35 Kcal por unidade)

        public Ingrediente(String codigoIngrediente, String nome, UnidMedida unidadeMedida, double caloriasMedida) {
        this.codigoIngrediente = codigoIngrediente;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.caloriasMedida = caloriasMedida;
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

    public void detalhesIngrediente() {
        System.out.print("[" + this.codigoIngrediente + " | " + this.nome + " | " + this.unidadeMedida + " | " + this.caloriasMedida + " Kcal]" );
    }


}
