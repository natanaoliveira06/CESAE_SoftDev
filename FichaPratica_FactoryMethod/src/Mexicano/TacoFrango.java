package Mexicano;

public class TacoFrango extends Taco {


    public TacoFrango(String nome) {
        super(nome);
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
