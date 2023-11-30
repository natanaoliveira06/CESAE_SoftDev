package Pizzaria.Ingredientes;

import Pizzaria.Enums.BasePizza;
import Pizzaria.Enums.UnidMedida;

public class Base extends Ingrediente {
    BasePizza tipoBase;
    private String descricao;

    public Base(String codigoIngrediente, String nome, UnidMedida unidadeMedida, double caloriasMedida) {
        super(codigoIngrediente, nome, unidadeMedida, caloriasMedida);
    }

    public void unidMedidaObrigatoria(){

        if (getUnidadeMedida().equals(UnidMedida.Gramas)){

        }
    }


    public BasePizza getTipoBase() {
        return tipoBase;
    }
}
