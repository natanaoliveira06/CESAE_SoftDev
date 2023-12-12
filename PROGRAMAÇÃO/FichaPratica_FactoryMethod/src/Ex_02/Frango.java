package Ex_02;

public class Frango extends Taco {


    public Frango(String nome) {
        super(nome, 5.99);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar taco de carne de Frango");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de carne de Frango");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco de carne de Frango");
    }
}
