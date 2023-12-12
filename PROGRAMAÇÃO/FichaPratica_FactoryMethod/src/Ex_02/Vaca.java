package Ex_02;

public class Vaca extends Taco{


    public Vaca(String nome) {
        super(nome, 6.5);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar taco de Carne de Vaca");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de Carne de Vaca");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco de Carne de Vaca");
    }
}
