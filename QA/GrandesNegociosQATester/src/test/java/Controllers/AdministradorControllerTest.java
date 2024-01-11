package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorControllerTest {

    AdministradorController admControl;
    AdministradorController admControl02;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        admControl = new AdministradorController("src/test/resources/minimercadoTest.csv");
        admControl02 = new AdministradorController("src/test/resources/minimercadoTest.csv");
    }

    @Test
    void produtoMaisVendidoTest() {
        assertEquals("Alimentacao", admControl.produtoMaisVendido().getTipoProduto());
        assertEquals("Cerveja Super Bock", admControl.produtoMaisVendido().getProduto());
        assertEquals(445, admControl.produtoMaisVendido().getQuantidadeVendida());
    }

    @Test
    void produtoQueMaisVendeuTest() {
        assertEquals("Alimentacao", admControl.produtoQueMaisVendeu().getTipoProduto());
        assertEquals("Cerveja Super Bock", admControl.produtoQueMaisVendeu().getProduto());
        assertEquals(445, admControl.produtoQueMaisVendeu().getQuantidadeVendida());
    }

    @Test
    void vendaMaisValorTest() {
        assertEquals("Produtos para Casa", admControl.vendaMaisValor().getTipoProduto());
        assertEquals("Sacos do Lixo", admControl.vendaMaisValor().getProduto());
        assertEquals(100, admControl.vendaMaisValor().getQuantidadeVendida());
        assertEquals(4.50, admControl.vendaMaisValor().getPrecoUnitario());
    }

    @Test
    void adicionarUtilizadorTest() throws IOException {

        String filePath = "src/test/resources/login_grandesNegociosTest.csv";

        admControl.adicionarUtilizador("ADMIN", "natana", "softdev", filePath);

        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        String tipoUtilizador = "";
        String username = "";
        String password = "";

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] linhaSeparada = linha.split(";");

            tipoUtilizador = linhaSeparada[0];
            username = linhaSeparada[1];
            password = linhaSeparada[2];
        }
        assertEquals("ADMIN", tipoUtilizador);
        assertEquals("natana", username);
        assertEquals("softdev", password);


        admControl02.adicionarUtilizador("FUNC", "joao", "softdev2024", filePath);

        file = new File(filePath);
        scanner = new Scanner(file);

        tipoUtilizador = "";
        username = "";
        password = "";

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] linhaSeparada = linha.split(";");

            tipoUtilizador = linhaSeparada[0];
            username = linhaSeparada[1];
            password = linhaSeparada[2];
        }

        assertEquals("FUNC", tipoUtilizador);
        assertEquals("joao", username);
        assertEquals("softdev2024", password);
    }

    /**
     * Método para adicionar um utilizador Invalido - TODO ESTE TESTE DÁ FALHA
     * @throws IOException
     */
      @Test
      public void adicionarUtilizadorInvalidoTest() throws IOException {
       String filePath = "src/test/resources/login_grandesNegociosTest.csv";

     assertThrows(IllegalArgumentException.class, () -> {
         admControl.adicionarUtilizador("SEGURANCA", "zacarias", "12345", filePath);
     });

     assertThrows(IllegalArgumentException.class, () -> {
         admControl.adicionarUtilizador("ADMINISTRADOR", "jeremias", "12345", filePath);
      });
      }


    @Test
    void valorVendasTest() {
        assertEquals(3038.3500000000004, admControl.valorVendas());
    }

    @Test
    void mediaVendasTest() {
        assertEquals(178.72647058823532, admControl.mediaVendas());
    }

   // @AfterEach
  //  void tearDown() throws FileNotFoundException {

        // Limpar o ficheiro
       // File fileTest = new File("src/test/resources/minimercadoTest.csv");

       // File fileOriginal = new File("src/test/resources/minimercadoTesterOriginal.csv");

       // PrintWriter pw = new PrintWriter(fileTest);
       // Scanner sc = new Scanner(fileOriginal);

      //  int count = 0;
      //  while (sc.hasNextLine()) {
         //   String linha = sc.nextLine();
         //   if (count < 134) {
           //     pw.println(linha);
          //  } else {
           //     pw.print(linha);
         //   }
          //  count++;
       // }
      //  pw.close();
  //  }
}