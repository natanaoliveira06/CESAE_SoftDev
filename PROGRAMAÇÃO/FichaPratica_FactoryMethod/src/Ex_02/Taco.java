package Ex_02;

public abstract class Taco {

    private String nome;
    private double preco;

    public Taco(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void box();


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void mostrar();
}
