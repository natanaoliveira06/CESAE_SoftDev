package Pizzaria.Ingredientes;

import Pizzaria.Enums.TipoComplemento;
import Pizzaria.Enums.UnidMedida;

public class Complemento extends Topping {
    TipoComplemento tipo;

    public Complemento(String codigoIngrediente, String nome, UnidMedida unidadeMedida, double caloriasMedida) {
        super(codigoIngrediente, nome, unidadeMedida, caloriasMedida);
    }
}
