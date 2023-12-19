package Domain;

import Domain.Pessoa.Jogador;
import Domain.Pessoa.NPC;
import Domain.Pessoa.Pessoa;
import Domain.Propriedade.AcessoriosModa;
import Domain.Propriedade.Imovel;
import Domain.Propriedade.Propriedade;
import Domain.Propriedade.Veiculo;
import Repository.PropriedadeRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Shopping {
    private ArrayList<Propriedade> coisasParaComprar;

    public Shopping() throws FileNotFoundException {
        PropriedadeRepository repository = new PropriedadeRepository("Ficheiros/CoisasShopping23.csv");
        this.coisasParaComprar = repository.getArrayPropriedades();
    }

    public ArrayList<Propriedade> getCoisasParaComprar() {
        return coisasParaComprar;
    }

    public void Vender(Jogador personagem) {
        Scanner input = new Scanner(System.in);
        String seccao;
        int itemEscolhido;

        System.out.println("\n\n-------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("****************************       Bem vindo ao `DIAGON ALLEY`       ****************************");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\nApós passar pelo ´Gringotts Wizarding Bank´ e checar seu saldo, podes escolher em qual loja desejar usar seus galeões!\nVeja nossas lojas disponíveis no momento:\n");
        System.out.println("1. Hogsmeade houses & chalets (Acessórios de Moda)");
        System.out.println("2. 2nd Hand Brooms & Cars (Veículos)");
        System.out.println("3. Madam Malkin's Robes for All Occasions (Imóveis)");
        //   System.out.println("\nOu pode escolher outras funções. Prepare sua Varinha mágica...");
        //  System.out.println("\n4. Checar a lista de todos os Acessórios Mágicos de Moda disponíveis");
        //  System.out.println("5. Checar a lista de todos os Veículos Mágicos disponíveis");
        //  System.out.println("6. Checar a lista de todos os Imóveis Bruxos disponíveis");
        //   System.out.println("6. Mostrar todos os itens do shopping");
        //   System.out.println("7. Vender itens no brechó Weasley");
        // System.out.println("8. Verificar as futuras lojas abertas");
        System.out.println("0. Aparatar (Sair) do DIAGON ALLEY");


        System.out.print("\nQual secção mágica do shopping deseja aceder?: ");
        seccao = input.next(); // Input da secção a aceder

        Random random = new Random(); // Gera um objeto aleatório
        int itensParaImprimir = 10;  // Número de itens que quero imprimir

        switch (seccao) {

            case "1": //Acessórios de Moda

                ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>(); //Criar um novo array com o index que funciona como MONTRA

                while (arrayIndexAleatorio.size() < itensParaImprimir) { //Vai parar o ciclo enquanto o tamanho do array for menor que 10
                    int indexAleatorio = random.nextInt(0, this.coisasParaComprar.size()); //O indexAleatorio vai ser um numero random (que começa no 0 e vai até o tamanho do array de itens disponiveis)

                    if (arrayIndexAleatorio.size() == 0) {  // O array novo "Montra" está vazio
                        arrayIndexAleatorio.add(indexAleatorio); // É preciso passar um aleatório para o array ficar preeencido
                    }

                    if (!arrayIndexAleatorio.contains(indexAleatorio) && coisasParaComprar.get(indexAleatorio) instanceof AcessoriosModa) { //Se o indexAleatorio ainda não for repetido dos que já estão no arrayIndexAleatorio...
                        arrayIndexAleatorio.add(indexAleatorio); //...ele adiciona esse indexAleatorio novo no arrayIndexAleatorio
                    }
                }

                System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                for (int i = 0; i < arrayIndexAleatorio.size(); i++) { //Ciclo para entrar no array
                    System.out.print("Acessório Moda " + i + ": ");
                    this.coisasParaComprar.get(arrayIndexAleatorio.get(i)).exibirDetalhes(); //O Array de itens para compra vai buscar no arrayIndexAleatorio o index que foi escolhido (i)
                }
                System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                System.out.print("\nUAUUUU... Agora que já vistes as últimas tendências Fashion do Mundo Bruxo, escolha qual destes Acessórios Mágicos quer comprar: ");
                itemEscolhido = input.nextInt();  // Input do que deseja comprar

            if (coisasParaComprar.get(arrayIndexAleatorio.get(itemEscolhido)).getCusto() <= personagem.getDinheiro()) { // Se o custo do item que quer comprar for menor ou = o dinheiro que o personagem tem
                personagem.addPropriedade(coisasParaComprar.get(arrayIndexAleatorio.get(itemEscolhido))); // O item escolhido é encontrado pelo index no arrayIndexAleatorio
                coisasParaComprar.remove(arrayIndexAleatorio.get(itemEscolhido)); // O item é removido do array disponivel para compras
                System.out.println("\nAccio!! Acabaste de adquirir um(a) autêntico(a): * " + coisasParaComprar.get(arrayIndexAleatorio.get(itemEscolhido)).getNomePropriedade()+ " *");
            } else {
                System.out.println("Ahnnn... Não tem galeões suficientes para comprar este item.");
            }
            break;


            case "2": //Veículos

                ArrayList<Integer> arrayIndexAleatorio2 = new ArrayList<>();

                while (arrayIndexAleatorio2.size() < itensParaImprimir) {
                    int indexAleatorio = random.nextInt(0, this.coisasParaComprar.size());
                    if (arrayIndexAleatorio2.size() == 0) {
                        arrayIndexAleatorio2.add(indexAleatorio);
                    }
                    if (!arrayIndexAleatorio2.contains(indexAleatorio) && coisasParaComprar.get(indexAleatorio) instanceof Veiculo) {
                        arrayIndexAleatorio2.add(indexAleatorio);
                    }
                }

                System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (int i = 0; i < arrayIndexAleatorio2.size(); i++) {
                    System.out.print("Veículo " + i + ": ");
                    this.coisasParaComprar.get(arrayIndexAleatorio2.get(i)).exibirDetalhes();
                }
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                System.out.print("\nYEAHHHH... Agora escolha qual destes Turbos Mágicos quer comprar: ");
                itemEscolhido = input.nextInt();

                if (coisasParaComprar.get(arrayIndexAleatorio2.get(itemEscolhido)).getCusto() <= personagem.getDinheiro()) {
                    personagem.addPropriedade(coisasParaComprar.get(arrayIndexAleatorio2.get(itemEscolhido)));
                    coisasParaComprar.remove(arrayIndexAleatorio2.get(itemEscolhido));
                    System.out.println("\nAccio!! Acabaste de adquirir um(a) super: * " + coisasParaComprar.get(arrayIndexAleatorio2.get(itemEscolhido)).getNomePropriedade()+ " *");
                } else {
                    System.out.println("Ahnnn... Não tem galeões suficientes para comprar este item.");
                }
                break;


            case "3": //Imóveis
                ArrayList<Integer> arrayIndexAleatorio3 = new ArrayList<>();

                while (arrayIndexAleatorio3.size() < itensParaImprimir) {
                    int indexAleatorio3 = random.nextInt(0, this.coisasParaComprar.size());
                    if (arrayIndexAleatorio3.size() == 0) {
                        arrayIndexAleatorio3.add(indexAleatorio3);
                    }
                    if (!arrayIndexAleatorio3.contains(indexAleatorio3) && coisasParaComprar.get(indexAleatorio3) instanceof Imovel) {
                        arrayIndexAleatorio3.add(indexAleatorio3);
                    }
                }

                System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (int i = 0; i < arrayIndexAleatorio3.size(); i++) {
                    System.out.print("Imóvel " + i + ": ");
                    this.coisasParaComprar.get(arrayIndexAleatorio3.get(i)).exibirDetalhes();
                }
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                System.out.print("\nAlohomora!!! Tudo pronto para escolher seu próximo abrigo: ");
                itemEscolhido = input.nextInt();  // Input do que deseja comprar

                if (coisasParaComprar.get(arrayIndexAleatorio3.get(itemEscolhido)).getCusto() <= personagem.getDinheiro()) {
                    personagem.addPropriedade(coisasParaComprar.get(arrayIndexAleatorio3.get(itemEscolhido)));
                    coisasParaComprar.remove(arrayIndexAleatorio3.get(itemEscolhido));
                    System.out.println("\nAccio!! Acabaste de adquirir a estupefata: * " + coisasParaComprar.get(arrayIndexAleatorio3.get(itemEscolhido)).getNomePropriedade()+ " *");
                } else {
                    System.out.println("Ahnnn... Não tem galeões suficientes para comprar este item.");
                }
                break;
        }

    }


    public void imprimirShopping() {
        for (Propriedade propriedadeAtual : this.coisasParaComprar) {
            propriedadeAtual.exibirDetalhes();
        }
    }


}
