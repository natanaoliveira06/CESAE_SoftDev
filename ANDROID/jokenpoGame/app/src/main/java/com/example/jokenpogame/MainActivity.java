package com.example.jokenpogame;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        verificarResultado("pedra");
    }

        public void selecionarPapel(View view){
        verificarResultado("papel");
    }

    public void selecionarTesoura(View view){
        verificarResultado("tesoura");
    }

    private String gerarEscolhaAleatoria() {

        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numAleatorio = new Random().nextInt(3); // 0 , 1 e 2

        ImageView imageApp = findViewById(R.id.image_app);
        String escolhaApp = opcoes[numAleatorio];
        switch (escolhaApp){
            case "pedra":
                imageApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageApp.setImageResource(R.drawable.tesoura);
                break;
        }
        return escolhaApp;
    }

    public void verificarResultado(String escolhaUsuario){

        String escolhaApp = gerarEscolhaAleatoria();
        TextView textResultado = findViewById(R.id.text_resultado);

        if ( // App vence
            (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
            (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
            (escolhaApp == "tesoura" && escolhaUsuario == "papel")
        ){
            textResultado.setText("Você Perdeu!");
        } else if ( // Usuário vence
            (escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
            (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
            (escolhaUsuario == "tesoura" && escolhaApp == "papel")
        ) {
            textResultado.setText("Você Ganhou!");
        } else { // Empate
            textResultado.setText("Empatamos!!");
        }

    }
}