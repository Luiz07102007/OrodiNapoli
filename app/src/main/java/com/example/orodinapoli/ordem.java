package com.example.orodinapoli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ordem extends AppCompatActivity implements
        View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private CheckBox cb1, cb2, cb3, cb4;
    private Button btf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ordem);
        cb1 = (CheckBox) findViewById(R.id.cbq);
        cb2 = (CheckBox) findViewById(R.id.cbc);
        cb3 = (CheckBox) findViewById(R.id.cba);
        cb4 = (CheckBox) findViewById(R.id.cbca);
        btf =(Button) findViewById(R.id.btfinal);
        cb1.setOnClickListener(this);
        cb2.setOnClickListener(this);
        cb3.setOnClickListener(this);
        cb4.setOnClickListener(this);
        btf.setOnClickListener(this);
        Bundle b = getIntent().getExtras();
        int cod = b.getInt("cod");
        final ImageView img = (ImageView)
                findViewById(R.id.fotopizzatv);
        final TextView texto1 = (TextView)
                findViewById(R.id.pizzatv);
        switch (cod){
            case 1:
                img.setImageResource(R.drawable.mozzaordem);
                texto1.setText(R.string.o1);
            break;
            case 2:
                img.setImageResource(R.drawable.cardmargherita);
                texto1.setText(R.string.o2);
                break;
            case 3:
                img.setImageResource(R.drawable.cardnapolitana);
                texto1.setText(R.string.o3);
                break;
            case 4:
                img.setImageResource(R.drawable.cardmarnara);
                texto1.setText(R.string.o4);
                break;
            case 5:
                img.setImageResource(R.drawable.carddiavola);
                texto1.setText(R.string.o5);
                break;
            case 6:
                img.setImageResource(R.drawable.cardpepperoni);
                texto1.setText(R.string.o6);
                break;

        }










        ImageView home = findViewById(R.id.bthome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ordem.this, Telainicial.class);
                startActivity(intent);
            }
        });
        ImageView promotv = findViewById(R.id.btcardapio);
        promotv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ordem.this, cardapio.class);
                startActivity(intent);
            }
        });
        ImageView btconfig = findViewById(R.id.btconfig);
        btconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ordem.this, config.class);
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
    public void onClick(View view) {
        if (view.getId() == R.id.btfinal) {
            String txt = "Sua pizza será entregue com os seguintes adicionais:\n\n";
            txt += cb1.isChecked() ? "Queijo\n" : "";
            txt += cb2.isChecked() ? "Cebola\n" : "";
            txt += cb3.isChecked() ? "Azeitona\n" : "";
            txt += cb4.isChecked() ? "Catupiry\n" : "";
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage(txt);
            dlg.setPositiveButton("OK", null);
            dlg.show();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
}