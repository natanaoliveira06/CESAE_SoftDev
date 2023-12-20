import Controllers.Sims;
import Domain.Objetivo;
import Domain.Pessoa.Jogador;
import Domain.Pessoa.Pessoa;
import Domain.Profissao;
import Domain.Shopping;
import Repository.PropriedadeRepository;
import Tools.CSVShoppingReader;
import View.PlayerView;

import java.io.FileNotFoundException;
public class MainTeste {
    public static void main(String[] args) throws FileNotFoundException {

        // Shopping shopping= new Shopping();

        // shopping.imprimirShopping(); // Teste imprimir Array na consola

        // Jogador jogador1 = new Jogador("Luna", 5555520, Objetivo.PROFESSOR_HOGWARTS, new Profissao("Estudante", 0, false, 120, 800), 5, 50, 250, 550, 800);

        // shopping.vender(jogador1); // Teste do Método Vender

        //   jogador1.exibirDetalhes();





        PlayerView.menuEntrada();




    }
}
