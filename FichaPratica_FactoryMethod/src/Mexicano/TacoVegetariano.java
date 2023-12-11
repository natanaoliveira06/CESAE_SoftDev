package Mexicano;

public class TacoVegetariano extends Taco{


    public TacoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar taco Vegetariano");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco Vegetariano");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco Vegetariano");
    }
}
