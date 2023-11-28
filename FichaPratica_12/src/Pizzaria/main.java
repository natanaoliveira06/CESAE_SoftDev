package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidMedida;

public class main {
    public static void main(String[] args) {

        Ingredientes massa = new Ingredientes("I9922", "Massa Alta", UnidMedida.Gramas, 1.5);
        Ingredientes queijo = new Ingredientes("I3476", " Queijo de Cabra", UnidMedida.Gramas, 2.8);
        Ingredientes chouriça = new Ingredientes("I4445", "Rodela Chouriça de Mirandela", UnidMedida.Unidades, 35);
        Ingredientes molho = new Ingredientes("I0015", "Molho Tomate", UnidMedida.Litros, 325);
        Ingredientes pimentoVerde = new Ingredientes("I0900", "Fatia Pimento Verde", UnidMedida.Unidades, 4);
        Ingredientes queijo2 = new Ingredientes("I3477", " Queijo Mozzarella", UnidMedida.Gramas, 2.8);
        Ingredientes erva = new Ingredientes("I9933", "Manjericão fresco", UnidMedida.Unidades, 1);


        Pizza portugal = new Pizza("P1991", "Portugal", "Pizza tradicional com ingredientes nacionais que promete levar quem a come numa viagem pela cultura de Portugal.", 19.90, TamanhoPizza.GRANDE);
        Pizza napolitana = new Pizza("P1992", "Napolitana", "Tão deliciosa que acabou se tornando um patrimônio imaterial da Unesco!", 20, TamanhoPizza.MEDIA);


        molho.detalhesIngrediente(portugal);

    }
}
