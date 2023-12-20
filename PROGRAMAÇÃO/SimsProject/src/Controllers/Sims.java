package Controllers;

import Domain.Objetivo;
import Domain.Pessoa.Jogador;
import Domain.Pessoa.Pessoa;
import Domain.Profissao;
import Domain.Propriedade.Propriedade;
import Domain.Shopping;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sims {

    /**
     * Método para criar uma Pessoa (Personagem)
     */
    public Jogador criarPessoa() {

        Scanner input = new Scanner(System.in);

        String nomePersonagem;
        double dinheiro = 0;
        Objetivo objetivoVida = null;
        Profissao profissaoAtual = null;
        int necessidadeSono = 100, necessidadeRefeicao = 100, necessidadeSocial = 100, estatuto = 0, educacao = 0;
        Propriedade propriedadesAtuais = null;

        System.out.println("\nHora da Aventura!!! Vamos criar um novo Personagem. \nPrepare os ingredientes da sua Poção...");
        System.out.println("\n**** Novo Personagem ****");

        System.out.print("\nNome do Personagem: ");  // Nome
        nomePersonagem = input.nextLine();

        System.out.print("\n -- Objetivos de Vida -- \n"); // Objetivo de vida
        int contador = 1;

        for (Objetivo objetivoVidaAtual : Objetivo.values()) {
            System.out.println(contador++ + ": " + objetivoVidaAtual);
        }
        System.out.print("\nObjetivo de Vida: ");
        int indexObjetivoVida = input.nextInt();
        contador = 1;

        for (Objetivo objetivoVidaAtual : Objetivo.values()) {
            if (indexObjetivoVida == contador) {
                objetivoVida = objetivoVidaAtual;
            }
            contador++;
        }

        System.out.println("\nLumus!!! O(A) personagem * " + nomePersonagem + " * foi criado com sucesso!");
        System.out.println("\n--- Atenção, o Expresso de Hogwarts vai sair. Corra até a plataforma 9 3/4 e não se atrase! ---");

        Jogador jogador = new Jogador(nomePersonagem, 0, objetivoVida, null, 100, 100, 100, 0, 0);
        return jogador;
    }


    public void acaoDiaria(String acao, Jogador jogador) throws FileNotFoundException {

        Shopping shopping = new Shopping();

        String trabalhar = null, dormir = null, refeicao = null, socializar = null, comprar = null, estudar = null, verPropriedades = null, procurarNovaProfissao = null;

        if (acao.equals(trabalhar)) {

        }

        if (acao.equals(dormir)) {
            jogador.setNecessidadeSono(100);
        } else if (acao.equals(refeicao)) {
            jogador.setNecessidadeSono(100);
            jogador.setDinheiro(jogador.getDinheiro() - 5);
        } else if (acao.equals(socializar)) {
            jogador.setNecessidadeSocial(100);
        } else if (acao.equals(comprar)) {
            shopping.vender(jogador);
        } else if (acao.equals(estudar)) {
            jogador.setEducacao(jogador.getEducacao() + 2);
        }

        if (acao.equals(verPropriedades)) {
            jogador.getPropriedades();
        }

        if (acao.equals(procurarNovaProfissao)) {
            jogador.
        }


        //o Ir trabalhar: aumenta dinheiro do jogador com base no salário/dia da sua profissão.

        //o Ir às compras: invoca o método vender do shopping.
        //o Procurar nova profissão: lista as profissões disponíveis, e de acordo com dois fatores o jogador será aceite ou não num emprego:


    }

    public void cicloDiario(Jogador jogador) {

        String momento = null, acao = null, trabalhar = null, dormir = null, refeicao = null, socializar = null, comprar = null, estudar = null, visitarImoveis = null, procurarNovaProfissao = null;

        // 100 dias
        for (int dia = 1; dia <= 100; dia++) {
            System.out.println("Dia " + dia);


            // 4 momentos
            for (int momentoDia = 1; momentoDia < 4; momentoDia++) {
                switch (momentoDia) {

                    case 1:
                        System.out.println("Manha");

                        break;

                    case 2:
                        System.out.println("Meio-dia");
                        break;

                    case 3:
                        System.out.println("Tarde");
                        break;

                    case 4:
                        System.out.println("Noite");
                        break;


                }
            }

        }


    }

    //cada dia é composto por 4 momentos, e em cada momento o jogador pode escolher o que quer fazer, as opções são:
    //o Ir trabalhar: aumenta dinheiro do jogador com base no salário/dia da sua profissão.
    //o Dormir: repõe a necessidade de sono de volta a 100.
    //o Ter uma refeição: repõe a necessidade de refeição de volta a 100 e diminui 5 dinheiros.
    //o Falar com alguém/Jogar Computador/Praticar Hobby: repõe a necessidade social de volta a 100.
    //o Ir às compras: invoca o método vender do shopping.
    //o Ter formação: aumenta a educação em 2.
    //o Visitar as propriedades: lista todas as propriedades do jogador.
    //o Procurar nova profissão: lista as profissões disponíveis, e de acordo com dois fatores o jogador será aceite ou não num emprego:


    public void jogo() throws FileNotFoundException {

        Jogador jogador = criarPessoa();
        Shopping shopping = new Shopping();

        System.out.println("\n**********   Bem-vindo(a) " + jogador.getNomePersonagem() + " sua aventura começa agora   **********");

        Scanner input = new Scanner(System.in);

        int opcao;
        do {

            System.out.println("1. Iniciar aventura ");
            System.out.println("2. Trocar de Personagem");
            System.out.println("0. Sair");
            System.out.print("\nPreparado?! Vamos começar: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Iniciar ciclo

                    //manhã
                    do {

                    } while ();


                    break;

                case 2: //
                    break;

                case 3: //
                    break;

                case 0:
                    System.out.println("\n\nAh, já vais??... É uma pena!! \n\nPodíamos correr atrás de mais pomos dourados por aí ou conjurar feitiços proibidos (shhhh!!)\n");
                    System.out.println("Mas fica para uma próxima. Vou preparar nossa próxima aventura para quando voltares.");
                    System.out.println("\n\n\n********   Incendium   ********\n\n\n");
                    break;
            }

        } while (opcao != 0);
    }
}


//Tenho um jogo que trata-se de uma Pessoa que deve fazer escolhas, crescer e chegar ao seu objetivo de vida. Tenho uma classe abstrata “Pessoa” com os atributos: nome (String) e dinheiro (double). Tenho a sublcasse Jogador com os atributos: objetivoVida (Objetivo), profissãoAtual (Profissao), necessidadeSono (int), necessidadeRefeicao (int), necessidadeSocial (int), estatuto (int), educação (int), propriedades (ArrayList<Propriedade>), família (ArrayList<NPC>).
//Tenho o método mostrarDetalhes que mostra na consola todos os detalhes da pessoa. Tenho a subclasse NPC que age como outras Pessoas do jogo, não controláveis, com os atributos: EstatutoMinimo (int)
//Tenho a classe Propriedade com os atributos: nome (String), custo (double), estatuto (int). Tenho as subclasses de propriedade: Imóvel, Veiculo e AcessórioModa. A classe Imóvel tem os atributos: capacidadePessoas (int). A classe Veículo tem os atributos: marca (String) e modelo (String).
// A classe AcessórioModa tem os atributos: marca (String) e formal (boolean). A classe Profissão tem os atributos:
// nome (String)
// salarioDia (double)
// formal (boolean)
// estatuto (int)
// nívelMinimoEducacao (int)
//• A classe Imóvel deverá ter os atributos:
// capacidadePessoas (int)
//• A enumeração Objetivo deverá descrever quais os Objetivos de Vida que uma Pessoa pode ter, como por
//exemplo: Milionário, Família Completa, Celebridade, Professor, etc..
//• Crie a classe Shopping que vai simular um conjunto de lojas, como tal, deve ter os atributos:
// ArrayList<Propriedade> coisasParaComprar
//• Para shopping, desenvolva o método vender que recebe a Pessoa como parâmetro e pergunta qual secção do
//shopping a pessoa quer aceder (imobiliária, stand ou fashion outlet), de acordo com a escolha imprima na consola
//10 itens disponíveis da secção adequada (mesmo que tenha mais no array, apenas 10 aleatórios devem aparecer).
//Após esta impressão, pergunta ao jogador qual quer comprar e, caso tenha dinheiro, permite a compra e adiciona
//ao array de propriedades. (Pode dividir em mais métodos, por exemplo: hallShopping, imprimirImoveis,
//imprimirStand, imprimirFashion, vender, …)
//Programação Orientada a Objetos | Software Developer
//Projeto Prático
//_______________________________________________________________________________________________________________
//Vitor Santos Página 3
//• Posteriormente, desenvolva a classe Sims, que vai servir o propósito de classe de Jogo. Nesta classe, desenvolva
//o método criarPessoa( ) que permite criar a Pessoa a partir de feedback da consola. O atributo dinheiro começa
//a 0, a profissão começa a nula, as necessidades começam a 100 (limite máximo), o estatuto começa a 0, e
//educação começa a 0 e as propriedades também vazias.
//• Seguidamente, crie o método jogo( ) onde estão todas as instâncias de todos os objetos, onde está o fluxo da
//aplicação.
//• Este terá um ciclo para cada dia da vida da pessoa, cada dia é composto por 4 momentos (manhã, meio-dia, tarde,
//noite), e em cada momento o jogador pode escolher o que quer fazer, as opções são:
//o Ir trabalhar: aumenta dinheiro do jogador com base no salário/dia da sua profissão.
//o Dormir: repõe a necessidade de sono de volta a 100.
//o Ter uma refeição: repõe a necessidade de refeição de volta a 100 e diminui 5 dinheiros.
//o Falar com alguém/Jogar Computador/Praticar Hobby: repõe a necessidade social de volta a 100.
//o Ir às compras: invoca o método vender do shopping.
//o Ter formação: aumenta a educação em 2.
//o Visitar as propriedades: lista todas as propriedades do jogador.
//o Procurar nova profissão: lista as profissões disponíveis, e de acordo com dois fatores o jogador será
//aceite ou não num emprego:
// Se contém, pelo menos, um acessório de moda formal no caso de o emprego ter o atributo
//formal a true.
// Se contém o estatuto no nível mínimo de entrada no emprego.
// Se contém a educação no nível mínimo de entrada no emprego

