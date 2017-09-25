package com.example.wagner_pc.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BancoQuestoes bq = new BancoQuestoes();

    private TextView txtPontos;
    private TextView txtTotPontos;
    private TextView txtQuestao;

    private Button btna;
    private Button btnb;
    private Button btnc;
    private Button btnd;
    private Button btnSair;

    private String resposta;
    private int nPontos = 0;
    private int nQuestao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTotPontos = (TextView) findViewById(R.id.txtTotPontos);
        txtQuestao = (TextView) findViewById(R.id.txtQuestao);

        btna = (Button) findViewById(R.id.btna);
        btnb = (Button) findViewById(R.id.btnb);
        btnc = (Button) findViewById(R.id.btnc);
        btnd = (Button) findViewById(R.id.btnd);
        btnSair = (Button) findViewById(R.id.btnSair);

        atAlternativa();
        //Sair
         btnSair.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
         });
        //A
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btna.getText() == resposta) {
                    nPontos = nPontos + 1;
                    atuaPont(nPontos);
                    atAlternativa();

                    Toast.makeText(MainActivity.this, "Correto", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Errado", Toast.LENGTH_SHORT).show();
                    atAlternativa();
                }
                acabou();

            }
        });

        //B
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btnb.getText() == resposta) {
                    nPontos = nPontos + 1;
                    atuaPont(nPontos);
                    atAlternativa();

                    Toast.makeText(MainActivity.this, "Correto", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Errado", Toast.LENGTH_SHORT).show();
                    atAlternativa();
                }
                acabou();
            }
        });


        //C
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btnc.getText() == resposta) {
                    nPontos = nPontos + 1;
                    atuaPont(nPontos);
                    atAlternativa();

                    Toast.makeText(MainActivity.this, "Correto", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Errado", Toast.LENGTH_SHORT).show();
                    atAlternativa();
                }
                acabou();

            }
        });


        //D
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btnd.getText() == resposta) {
                    nPontos = nPontos + 1;
                    atuaPont(nPontos);
                    atAlternativa();

                    Toast.makeText(MainActivity.this, "Correto", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Errado", Toast.LENGTH_SHORT).show();
                    atAlternativa();
                }
                acabou();

            }
        });

    }
    private void atAlternativa(){
        txtQuestao.setText(bq.obtQuest(nQuestao));

        btna.setText(bq.obtRes1(nQuestao));
        btnb.setText(bq.obtRes2(nQuestao));
        btnc.setText(bq.obtRes3(nQuestao));
        btnd.setText(bq.obtRes4(nQuestao));

        resposta = bq.obtResCorr(nQuestao);
        nQuestao++;

    }
    private void atuaPont(int pontos){
        txtTotPontos.setText(""+nPontos);
    }

    private void acabou() {
        if (nQuestao == 10){
            Toast.makeText(MainActivity.this, "ACABOU AS QUESTÕES", Toast.LENGTH_SHORT).show();
            nQuestao = 0;
        }
    }
}
