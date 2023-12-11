package Mexicano;

import java.util.Locale;

public class ProductFactory {
    public static Taco criarTaco(String tipoTaco, String nome) {

        switch (tipoTaco) {
            case "TacoFrango":
                return new TacoFrango(nome);

            case "TacoVaca":
                return new TacoVaca(nome);

            case "TacoVegetariano":
                return new TacoVegetariano(nome);

            default:
                throw new IllegalArgumentException("Tipo de Taco Inválido: "+tipoTaco);
        }

    }
}
