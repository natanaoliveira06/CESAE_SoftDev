package Domain.Propriedade;

public class AcessoriosModa extends Propriedade{

    private String marca;
    private boolean formal;

    public AcessoriosModa(String nomePropriedade, double custo, int estatutoPropriedade, String marca, boolean formal) {
        super(nomePropriedade, custo, estatutoPropriedade);
        this.marca = marca;
        this.formal = formal;
    }
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.print("Marca: " + this.marca + "\t|  Formal: " + this.formal);
        System.out.println();
    }

}
