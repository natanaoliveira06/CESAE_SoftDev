package Pizzaria.Ingredientes;

import Pizzaria.Enums.TipoCarne;
import Pizzaria.Enums.UnidMedida;

public class Carne extends Topping {
    TipoCarne tipo;

    public Carne(String codigoIngrediente, String nome, UnidMedida unidadeMedida, double caloriasMedida) {
        super(codigoIngrediente, nome, unidadeMedida, caloriasMedida);
    }
}
