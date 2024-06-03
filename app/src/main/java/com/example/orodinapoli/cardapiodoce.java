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

public class cardapiodoce extends AppCompatActivity implements View.OnClickListener {

    Bundle b;
    Intent i;
    ImageView p13, p14, p15, p16, p17, p18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cardapiodoce);
        b = new Bundle();
        i = new Intent(cardapiodoce.this, ordem.class);
        p13 = (ImageView) findViewById(R.id.brigacard);
        p14 = (ImageView) findViewById(R.id.chococard);
        p15 = (ImageView) findViewById(R.id.nutelcard);
        p16 = (ImageView) findViewById(R.id.banancard);
        p17 = (ImageView) findViewById(R.id.churrcard);
        p18 = (ImageView) findViewById(R.id.cbrancard);
        p13.setOnClickListener(this);
        p14.setOnClickListener(this);
        p15.setOnClickListener(this);
        p16.setOnClickListener(this);
        p17.setOnClickListener(this);
        p18.setOnClickListener(this);
        ImageView home = findViewById(R.id.bthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapiodoce.this, Telainicial.class);
                startActivity(intent);
            }
        });
        ImageView promotv = findViewById(R.id.btcardapio);
        promotv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapiodoce.this, cardapio.class);
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
        ImageView btconfig = findViewById(R.id.btconfig);
        btconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapiodoce.this, config.class);
                startActivity(intent);
            }
        });
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
        if (v.getId() == R.id.brigacard) {
            b.putInt("cod", 13);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.chococard) {
            b.putInt("cod", 14);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.nutelcard) {
            b.putInt("cod", 15);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.banancard) {
            b.putInt("cod", 16);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.churrcard) {
            b.putInt("cod", 17);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.chococard) {
            b.putInt("cod", 18);
            i.putExtras(b);
            startActivity(i);
        }
    }
}