package Domain.Propriedade;

public class Veiculo extends Propriedade{

    private String marca;
    private String modelo;
    public Veiculo(String nomePropriedade, double custo, int estatutoPropriedade, String marca, String modelo) {
        super(nomePropriedade, custo, estatutoPropriedade);
        this.marca = marca;
        this.modelo = modelo;
    }
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.print("Marca: " + this.marca + "\t|  Modelo: " + this.modelo);
        System.out.println();
    }
}