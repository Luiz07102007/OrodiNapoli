package com.example.orodinapoli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class cardapioespe extends AppCompatActivity implements View.OnClickListener {
    Bundle b;
    Intent i;
    ImageView p7,p2,p3,p4,p5,p6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cardapioespe);
        ImageView home = findViewById(R.id.bthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapioespe.this, Telainicial.class);
                startActivity(intent);
            }
        });
        ImageView promotv = findViewById(R.id.btcardapio);
        promotv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapioespe.this, cardapio.class);
                startActivity(intent);
            }
        });
        ImageView btconfig = findViewById(R.id.btconfig);
        btconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapioespe.this, config.class);
                startActivity(intent);
            }
        });
        ImageView backButton = findViewById(R.id.btvoltar);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Voltar à atividade anterior
                onBackPressed();
            }
        });
        b = new Bundle();
        i = new Intent(cardapioespe.this, ordem.class);
        p7=(ImageView) findViewById(R.id.parmacard);
        p2=(ImageView) findViewById(R.id.champcard);
        p3=(ImageView) findViewById(R.id.carbocard);
        p4=(ImageView) findViewById(R.id.camarcard);
        p5=(ImageView) findViewById(R.id.zuccicard);
        p6=(ImageView) findViewById(R.id.caprecard);
        p7.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.parmacard){
            b.putInt("cod",7);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.champcard){
            b.putInt("cod",8);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.carbocard){
            b.putInt("cod",9);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.camarcard){
            b.putInt("cod",10);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.zuccicard){
            b.putInt("cod",11);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.caprecard){
            b.putInt("cod",12);
            i.putExtras(b);
            startActivity(i);
    }}}
