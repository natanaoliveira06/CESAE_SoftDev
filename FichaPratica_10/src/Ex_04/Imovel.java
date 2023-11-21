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
    public double valorImovel() {

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

        double desconto;
        switch (acabamento) {

            case RESTAURO:
                desconto = 0.5 * valorImovel;
                valorImovel -= desconto;
                break;

            case USADA:
                desconto = 0.1 * valorImovel;
                valorImovel -= desconto;
                break;

            case NOVA:
                valorImovel = valorImovel;
                break;

            case NOVACOMALTOACABAMENTO:
                desconto = 2.5 * valorImovel;
                valorImovel += desconto;
                break;
        }

        System.out.println("Valor do imóvel: " + valorImovel + "EUR");
        return valorImovel;
    }

    //Método para mudar o estado de uma casa


    //Método imprimirDescricao que imprima as especificações do imóvel.
    public void imprimirDescricao() {
        System.out.println("\n***********  IMÓVEL  ***********\n");
        System.out.println("Tipologia: " + this.tipologia);
        System.out.println("Acabamento: " + this.acabamento);
        System.out.println("Morada: " + this.rua + ", " + this.numPorta + " - " + this.cidade);
        System.out.println("Área: " + this.area + " m2");
        System.out.println("Quartos: " + this.numQuartos + "\t| Casa de Banho: " + this.numBanheiros);
        System.out.println("Piscina: " + this.areaPiscina + " m2\n");

    }


    //Método compararImoveis, que receba outro imóvel como parâmetro e retorne  qual o imóvel mais caro

    public void compararImoveis(Imovel imovelComparado) {

        if (valorImovel()>imovelComparado.valorImovel()) {
            System.out.println("Imóvel mais caro: " + this.tipologia +"\t| " +  this.acabamento);
        }else{
            System.out.println("Imóvel mais caro: " + imovelComparado);  //TODO corrigir
        }

    }

}
