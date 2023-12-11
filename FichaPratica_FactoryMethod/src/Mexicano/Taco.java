package Mexicano;

public abstract class Taco {

    private String nome;

    public Taco(String nome) {
        this.nome = nome;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void box();


}
