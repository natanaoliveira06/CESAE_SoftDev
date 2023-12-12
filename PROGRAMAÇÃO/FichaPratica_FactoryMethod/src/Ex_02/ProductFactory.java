package Ex_02;

public class ProductFactory {
    public static Taco criarTaco(String tipoTaco, String nome) {
tipoTaco=tipoTaco.toLowerCase();

        switch (tipoTaco) {
            case "Frango":
                return new Frango(nome);

            case "Vaca":
                return new Vaca(nome);

            case "Vegetariano":
                return new Vegetariano(nome);

            default:
                throw new IllegalArgumentException("Tipo de Taco Inválido: "+tipoTaco);
        }

    }
}
