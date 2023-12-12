package Ex_02;

public class Vegetariano extends Taco{


    public Vegetariano(String nome) {
        super(nome, 4.5);
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
