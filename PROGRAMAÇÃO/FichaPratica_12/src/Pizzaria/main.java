package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidMedida;

public class main {
    public static void main(String[] args) {

        // INSTANCIAR INGREDIENTES
        Ingrediente baseAlta = new Ingrediente("I9922", "Massa Alta", UnidMedida.Gramas, 1.5);
        Ingrediente baseFina = new Ingrediente("I0011", "Base fina italiana", UnidMedida.Gramas, 1.5);
        Ingrediente queijoCabra = new Ingrediente("I3476", " Queijo de Cabra", UnidMedida.Gramas, 2.8);
        Ingrediente queijoMozzarella = new Ingrediente("I0022", " Queijo Mozzarella", UnidMedida.Gramas, 2.8);
        Ingrediente chourica = new Ingrediente("I4445", "Rodela Chouriça de Mirandela", UnidMedida.Unidades, 35);
        Ingrediente molhoTomate = new Ingrediente("I0015", "Molho Tomate", UnidMedida.Litros, 325);
        Ingrediente pimentoVerde = new Ingrediente("I0900", "Fatia Pimento Verde", UnidMedida.Unidades, 4);
        Ingrediente erva = new Ingrediente("I9933", "Manjericão fresco", UnidMedida.Unidades, 1);

        // CRIAR PIZZA PORTUGAL
        Pizza portugal = new Pizza("P1991", "Portugal", "Pizza tradicional com ingredientes nacionais que promete levar quem a come numa viagem pela cultura de Portugal.", 19.90, TamanhoPizza.GRANDE);
        // adicionar os ingredientes a pizza
        portugal.addIngrediente(new IngredientePizza(baseAlta, 200));
        portugal.addIngrediente(new IngredientePizza(queijoCabra, 75));
        portugal.addIngrediente(new IngredientePizza(chourica, 10));
        portugal.addIngrediente(new IngredientePizza(molhoTomate, 0.09));
        portugal.addIngrediente(new IngredientePizza(pimentoVerde, 6));


        // CRIAR PIZZA NAPOLITANA
        Pizza napolitana = new Pizza("P1992", "Napolitana", "Tão deliciosa que acabou se tornando um patrimônio imaterial da Unesco!", 20, TamanhoPizza.MEDIA);

        System.out.println();
        System.out.println("Calorias Pizza Portugal: " + portugal.calcularCalorias() + " Kcal");

    }
}
