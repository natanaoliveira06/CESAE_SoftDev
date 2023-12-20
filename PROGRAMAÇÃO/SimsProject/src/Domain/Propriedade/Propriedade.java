package Domain.Propriedade;

public class Propriedade {

    protected String nomePropriedade;
    protected double custo;
    protected int estatutoPropriedade;

    public Propriedade(String nomePropriedade, double custo, int estatutoPropriedade) {
        this.nomePropriedade = nomePropriedade;
        this.custo = custo;
        this.estatutoPropriedade = estatutoPropriedade;
    }
    public String getNomePropriedade() {
        return nomePropriedade;
    }
    public double getCusto() {
        return custo;
    }
    public int getEstatutoPropriedade() {
        return estatutoPropriedade;
    }
    public void exibirDetalhes(){
        System.out.print(this.nomePropriedade + "\t|  Valor: " + this.custo + "\t|  Galeões"+ "Estatuto da propriedade: "+ this.estatutoPropriedade);
    }

}
