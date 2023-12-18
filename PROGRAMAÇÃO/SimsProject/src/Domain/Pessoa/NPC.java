package Domain.Pessoa;

public class NPC extends Pessoa {

    private int estatutoMinimo;

    public NPC(String nomePersonagem, double dinheiro, int estatutoMinimo) {
        super(nomePersonagem, dinheiro);
        this.estatutoMinimo = estatutoMinimo;
    }
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.print("\t| Estatuto Mímimo: " + this.estatutoMinimo);
    }
}

