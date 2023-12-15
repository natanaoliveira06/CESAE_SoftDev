package Domain;

public class NPC extends Pessoa{

    private int estatutoMinimo;

    public NPC(String nomePersonagem, double dinheiro, int estatutoMinimo) {
        super(nomePersonagem, dinheiro);
        this.estatutoMinimo = estatutoMinimo;
    }

    public void exibirDetalhesNPC() {
        System.out.print("Nome do Personagem: " + this.nomePersonagem);
        System.out.print("Dinheiro: " + this.dinheiro);
        System.out.println("Estatuto Mímimo: " + this.estatutoMinimo);
    }

}
