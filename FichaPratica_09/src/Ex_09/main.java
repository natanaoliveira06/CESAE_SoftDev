package Ex_09;

public class main {
    public static void main(String[] args) {

        Produto tShirtAzul = new Produto("T-shirt Azul", 59.90,0);

        tShirtAzul.comprar(5);
        tShirtAzul.vender(2);
        tShirtAzul.comprar(10);
        tShirtAzul.vender(35);
    }
}
