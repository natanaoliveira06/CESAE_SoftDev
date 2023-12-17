package Repository;

import Domain.Pessoa;
import Domain.Propriedade;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    private ArrayList<Propriedade> coisasParaComprar;

    public Shopping() {
        this.coisasParaComprar = new ArrayList<>();
    }


    public void Vender(Pessoa personagem) {
        Scanner input = new Scanner(System.in);
        String seccao;


        System.out.println("\n---------------------------------------------------");
        System.out.println("*********  Bem vindo ao - DIAGON ALLEY -  *********");
        System.out.println("---------------------------------------------------");
        System.out.println("\n:Após passar pelo ´Gringotts Wizarding Bank´ e checar seu saldo, podes escolher em qual loja desejar usar seus galeões!");
        System.out.println("1. Hogsmeade houses & chalets");
        System.out.println("2. 2nd Hand Brooms & Cars");
        System.out.println("3. Madam Malkin's Robes for All Occasions");
        System.out.println("\nQual secção do magical shopping deseja aceder?: ");
        seccao = input.next();


    }


    // método vender (recebe Pessoa como parâmetro) e pergunta qual secção do shopping quer aceder, de acordo com a escolha imprima
    // na consola 10 itens disponíveis da secção adequada (mesmo que tenha mais no array, apenas 10 aleatórios devem aparecer). Após
    // esta impressão, pergunta ao jogador qual quer comprar e, caso tenha dinheiro, permite a compra e adiciona ao array de propriedades.
    // (Pode dividir em mais métodos, por exemplo: hallShopping, imprimirImoveis, imprimirStand, imprimirFashion, vender, …


}
