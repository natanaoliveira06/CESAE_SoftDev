package Ex_09;

public class Produto {

    // Atributos de instância
    private String nome;
    private double preco;
    private int quantStock=0;

    //Método de construção
    public Produto(String nome, double preco, int quantStock) {
        this.nome = nome;
        this.preco = preco;
        this.quantStock = quantStock;
    }

    //Método COMPRAR
    public void comprar(int quantComprada) {
        this.quantStock+=quantComprada;
        System.out.println("Quantidade em stock: " + this.quantStock);
    }

    //Método VENDER

    public void vender(int quantVendida) {
        this.quantStock-= quantVendida;
        System.out.println("Quantidade em stock: " + this.quantStock);

        if(quantStock<=0) {
            System.out.println("Transação não efetuada por falta de stock");
        }
    }




}
