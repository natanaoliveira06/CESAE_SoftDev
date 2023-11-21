package Ex_04;

public class Imovel {

    //Definir atributos
    String rua;
    int numPorta;
    String cidade;
    tipoImovel tipologia;
    tipoAcabamento acabamento;
    double area;
    int numQuartos;
    int numBanheiros;
    double areaPiscina;

    //Método construtor
    public Imovel(String rua, int numPorta, String cidade, tipoImovel tipologia, tipoAcabamento acabamento, double area, int numQuartos, int numBanheiros, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipologia = tipologia;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.areaPiscina = areaPiscina;
    }

    //Método para calcular o valor do imóvel
    public void valorImovel() {

        double valorImovel = (this.numQuartos * 75000) + (this.numBanheiros * 10500) + (this.areaPiscina * 1000);


        switch (tipologia) {

            case APARTAMENTO:
                valorImovel += area * 1000;
                break;

            case CASA:
                valorImovel += area * 3000;
                break;

            case MANSAO:
                valorImovel += area * 5000;
                break;
        }


        double precoAcabamento = 0;
        double disconto;

        switch (acabamento) {

            case RESTAURO:
                disconto = 0.5 * valorFinal;
                valorFinal -= disconto;
                break;

            case USADA:
                disconto = 0.1 * valorFinal;
                valorFinal -= disconto;
                break;

            case NOVA:
                //não recebe desconto
                break;

            case NOVACOMALTOACABAMENTO:
                disconto = 2.5 * valorFinal;
                valorFinal += disconto;
                break;
        }

        System.out.println(valorFinal);

    }


}
