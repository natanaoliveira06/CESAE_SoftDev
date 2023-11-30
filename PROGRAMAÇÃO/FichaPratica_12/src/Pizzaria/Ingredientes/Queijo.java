package Pizzaria.Ingredientes;

import Pizzaria.Enums.TipoQueijo;
import Pizzaria.Enums.UnidMedida;

public class Queijo extends Topping {
    TipoQueijo tipo;

    public Queijo(String codigoIngrediente, String nome, UnidMedida unidadeMedida, double caloriasMedida) {
        super(codigoIngrediente, nome, unidadeMedida, caloriasMedida);
    }
}
