package Ex_04;

public class main {
    public static void main(String[] args) {

        Imovel casa = new Imovel("Rua Alves P.", 1250, "Porto", tipoImovel.CASA, tipoAcabamento.RESTAURO, 380, 3, 2, 10);
        Imovel apartamento = new Imovel("Rua D. Nuno Alves", 525, "Matosinhos", tipoImovel.APARTAMENTO, tipoAcabamento.NOVA, 146, 2, 3, 0);
        Imovel mansao = new Imovel("Rua Arlindo P.", 1587, "Porto", tipoImovel.MANSAO, tipoAcabamento.USADA, 625, 4, 4, 20);

        //   casa_01.imprimirDescricao();
        //  casa_01.valorImovel();

        System.out.println();

        casa.compararImoveis(apartamento);

        System.out.println();

     //   apartamento_02.compararImoveis(casa_01);

        casa.compararImoveis(mansao);


    }
}
