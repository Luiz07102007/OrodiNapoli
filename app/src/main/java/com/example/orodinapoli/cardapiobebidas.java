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

public class cardapiobebidas extends AppCompatActivity implements View.OnClickListener {
    Bundle b;
    Intent i;
    ImageView p19, p20, p21, p22, p23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cardapiobebidas);
        b = new Bundle();
        i = new Intent(cardapiobebidas.this, ordem.class);
        p19 = (ImageView) findViewById(R.id.sucoscard);
        p20 = (ImageView) findViewById(R.id.refricard);
        p21 = (ImageView) findViewById(R.id.aguagcard);
        p22 = (ImageView) findViewById(R.id.vinhocard);
        p23 = (ImageView) findViewById(R.id.espumcard);
        p19.setOnClickListener(this);
        p20.setOnClickListener(this);
        p21.setOnClickListener(this);
        p22.setOnClickListener(this);
        p23.setOnClickListener(this);
        ImageView backButton = findViewById(R.id.btvoltar);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Voltar à atividade anterior
                onBackPressed();
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
        if (v.getId() == R.id.sucoscard) {
            b.putInt("cod", 19);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.refricard) {
            b.putInt("cod", 20);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.aguagcard) {
            b.putInt("cod", 21);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.vinhocard) {
            b.putInt("cod", 22);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.espumcard) {
            b.putInt("cod", 23);
            i.putExtras(b);
            startActivity(i);
        }
    }
}