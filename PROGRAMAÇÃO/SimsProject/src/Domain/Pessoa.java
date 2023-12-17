package Domain;

public abstract class Pessoa {
    protected String nomePersonagem;
    protected double dinheiro;

    public Pessoa(String nomePersonagem, double dinheiro) {
        this.nomePersonagem = nomePersonagem;
        this.dinheiro = dinheiro;
    }
}
