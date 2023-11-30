package Pizzaria.Ingredientes;

import Pizzaria.Enums.TipoFrutoMar;
import Pizzaria.Enums.UnidMedida;

public class FrutoMar extends Topping {
    TipoFrutoMar tipo;

    public FrutoMar(String codigoIngrediente, String nome, UnidMedida unidadeMedida, double caloriasMedida) {
        super(codigoIngrediente, nome, unidadeMedida, caloriasMedida);
    }
}
