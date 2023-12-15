package Domain;

public class Veiculo extends Propriedade{

    private String marca;
    private String modelo;

    public Veiculo(String nomePropriedade, double custo, int estatutoPropriedade, String marca, String modelo) {
        super(nomePropriedade, custo, estatutoPropriedade);
        this.marca = marca;
        this.modelo = modelo;
    }
}
