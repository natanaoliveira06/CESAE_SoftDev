package Mexicano;

public class TacoVaca extends Taco{

    public TacoVaca(String nome) {
        super(nome);
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
