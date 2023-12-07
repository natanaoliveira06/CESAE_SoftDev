package Ex_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    private String nomeFicheiro;
    private static Logger instance;    // Instância única da classe

    // Construtor privado para evitar instâncias diretas
    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    // Método estático para obter a instância única
    public static synchronized Logger getInstance(String nomeFicheiro){
        if (instance == null){
            instance = new Logger(nomeFicheiro);
        }
        return instance;
    }

    // Método para gravar uma linha no arquivo de log
    public void log(String message) throws IOException {
        File ficheiroLog = new File (this.nomeFicheiro);


        PrintWriter filewriter = new PrintWriter(new FileWriter(nomeFicheiro, true));
        filewriter.println(message);
        filewriter.close();
    }



}
