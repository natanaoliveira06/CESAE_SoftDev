package Ex_03;

import Ex_02.Conta;

public class main {
    public static void main(String[] args) {

        Animal macaco = new Animal("Draco", "Macaco-esquilo", " América do Sul", 1.1, new String[]{"fruta", "baga", "folha", "inseto"});
        Animal baleia = new Animal("Willy", "Orca", "Canadá", 6000, new String[]{"peixe", "lula", "tartaruga", "passaro"});


        macaco.comer("fruta", 25);
        System.out.println();
        baleia.comer("passaro", 500);
        System.out.println();
        baleia.comer("francesinha", 350);


    }
}
