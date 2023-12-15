package Domain;

public class Propriedade {

    protected String nomePropriedade;
    protected double custo;
    protected int estatutoPropriedade;

    public Propriedade(String nomePropriedade, double custo, int estatutoPropriedade) {
        this.nomePropriedade = nomePropriedade;
        this.custo = custo;
        this.estatutoPropriedade = estatutoPropriedade;
    }
    public void exibirDetalhesPropriedades(){
        System.out.print(" Propriedade: " + this.nomePropriedade);
        System.out.print("Valor: " + this.custo);
        System.out.print("Estatuto da propriedade: "+ this.estatutoPropriedade);
    }

}
