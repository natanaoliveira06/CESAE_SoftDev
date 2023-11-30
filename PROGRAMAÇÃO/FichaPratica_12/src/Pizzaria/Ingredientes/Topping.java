package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.UnidMedida;

public class Topping extends Ingrediente {

    OrigemIngrediente origem;

    public Topping(String codigoIngrediente, String nome, UnidMedida unidadeMedida, double caloriasMedida) {
        super(codigoIngrediente, nome, unidadeMedida, caloriasMedida);
    }

}
