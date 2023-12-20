package View;

import Controllers.Sims;
import Domain.Pessoa.Jogador;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlayerView {

    public static void menuEntrada() throws FileNotFoundException {

        System.out.println("\n\nIniciando o jogo ... ... ");
        System.out.println("\n");
        System.out.println("                                      _ __\n" +
                "        ___                             | '  \\\n" +
                "   ___  \\ /  ___         ,'\\_           | .-. \\        /|\n" +
                "   \\ /  | |,'__ \\  ,'\\_  |   \\          | | | |      ,' |_   /|\n" +
                " _ | |  | |\\/  \\ \\ |   \\ | |\\_|    _    | |_| |   _ '-. .-',' |_   _\n" +
                "// | |  | |____| | | |\\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\\_\n" +
                "\\\\_| |_,' .-, _  | | |   | |\\ \\  //    .| |\\_/ | / \\ || |   | | / |\\  \\|   \\\n" +
                " `-. .-'| |/ / | | | |   | | \\ \\//     |  |    | | | || |   | | | |_\\ || |\\_|\n" +
                "   | |  | || \\_| | | |   /_\\  \\ /      | |`    | | | || |   | | | .---'| |\n" +
                "   | |  | |\\___,_\\ /_\\ _      //       | |     | \\_/ || |   | | | |  /\\| |\n" +
                "   /_\\  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| |\n" +
                "        /_\\           `------'        \\ |              `.\\  | |  `._,' /_\\\n" +
                "                                       \\|                    `.\\\n"
        );

        System.out.println("\n\n************************  Bem-Vindo/a ao Mundo Bruxo  ************************");
        System.out.println("\n\nO tão esperado dia chegou... Uma coruja trapalhona trouxe sua sonhada Carta de Hogwarts.");
        System.out.println(".......................");

        Sims simsController = new Sims();
        simsController.jogo();

    }

}
