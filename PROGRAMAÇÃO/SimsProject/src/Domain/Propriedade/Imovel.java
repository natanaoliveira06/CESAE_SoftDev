package Domain.Propriedade;

public class Imovel extends Propriedade {
    private int capacidadePessoas;

    public Imovel(String nomePropriedade, double custo, int estatutoPropriedade, int capacidadePessoas) {
        super(nomePropriedade, custo, estatutoPropriedade);
        this.capacidadePessoas = capacidadePessoas;
    }
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.print("Lotação Máxima: " + this.capacidadePessoas);
        System.out.println();
    }
}
