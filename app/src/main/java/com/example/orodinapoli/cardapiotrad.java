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

public class cardapiotrad extends AppCompatActivity implements  View.OnClickListener {
    Bundle b;
    Intent i;
    ImageView p1,p2,p3,p4,p5,p6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cardapiotrad);
        b = new Bundle();
        i = new Intent(cardapiotrad.this, ordem.class);
        p1=(ImageView) findViewById(R.id.mozzacard);
        p2=(ImageView) findViewById(R.id.marghcard);
        p3=(ImageView) findViewById(R.id.napolcard);
        p4=(ImageView) findViewById(R.id.marincard);
        p5=(ImageView) findViewById(R.id.diavolacard);
        p6=(ImageView) findViewById(R.id.peppecard);
        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);

        ImageView home = findViewById(R.id.bthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapiotrad.this, Telainicial.class);
                startActivity(intent);
            }
        });
        ImageView promotv = findViewById(R.id.btcardapio);
        promotv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapiotrad.this, cardapio.class);
                startActivity(intent);
            }
        });
        ImageView btconfig = findViewById(R.id.btconfig);
        btconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cardapiotrad.this, config.class);
                startActivity(intent);
            }
        });





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.mozzacard){
            b.putInt("cod",1);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.marghcard){
            b.putInt("cod",2);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.napolcard){
            b.putInt("cod",3);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.marincard){
            b.putInt("cod",4);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.diavolacard){
            b.putInt("cod",5);
            i.putExtras(b);
            startActivity(i);
        }
        else if(v.getId()==R.id.peppecard){
            b.putInt("cod",6);
            i.putExtras(b);
            startActivity(i);
        }
    }
}