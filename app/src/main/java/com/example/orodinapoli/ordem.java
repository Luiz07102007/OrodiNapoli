package com.example.orodinapoli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.content.DialogInterface;
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
                img.setImageResource(R.drawable.margordem);
                texto1.setText(R.string.o2);
                break;
            case 3:
                img.setImageResource(R.drawable.napoordem);
                texto1.setText(R.string.o3);
                break;
            case 4:
                img.setImageResource(R.drawable.mariordem);
                texto1.setText(R.string.o4);
                break;
            case 5:
                img.setImageResource(R.drawable.diavoordem);
                texto1.setText(R.string.o5);
                break;
            case 6:
                img.setImageResource(R.drawable.peppeordem);
                texto1.setText(R.string.o6);
                break;
            case 7:
                img.setImageResource(R.drawable.parmaordem);
                texto1.setText(R.string.o7);
                break;
            case 8:
                img.setImageResource(R.drawable.champordem);
                texto1.setText(R.string.o8);
                break;
            case 9:
                img.setImageResource(R.drawable.carboordem);
                texto1.setText(R.string.o9);
                break;
            case 10:
                img.setImageResource(R.drawable.camaordem);
                texto1.setText(R.string.o10);
                break;
            case 11:
                img.setImageResource(R.drawable.zucciordem);
                texto1.setText(R.string.o11);
                break;
            case 12:
                img.setImageResource(R.drawable.capreordem);
                texto1.setText(R.string.o12);
                break;
            case 13:
                img.setImageResource(R.drawable.brigaordem);
                texto1.setText(R.string.o13);
                cb1.setText("Nutella");
                cb2.setText("Kinder ovo");
                cb3.setText("Granulado");
                cb4.setText("M&M");
                break;
            case 14:
                img.setImageResource(R.drawable.chocomoordem);
                texto1.setText(R.string.o14);
                cb1.setText("Nutella");
                cb2.setText("Kinder ovo");
                cb3.setText("Granulado");
                cb4.setText("M&M");
                break;
            case 15:
                img.setImageResource(R.drawable.nutelaordem);
                texto1.setText(R.string.o15);
                cb1.setText("Nutella");
                cb2.setText("Kinder ovo");
                cb3.setText("Granulado");
                cb4.setText("M&M");
                break;
            case 16:
                img.setImageResource(R.drawable.bananaordem);
                texto1.setText(R.string.o16);
                cb1.setText("Nutella");
                cb2.setText("Kinder ovo");
                cb3.setText("Granulado");
                cb4.setText("M&M");
            case 17:
                img.setImageResource(R.drawable.churrosordem);
                texto1.setText(R.string.o17);
                cb1.setText("Nutella");
                cb2.setText("Kinder ovo");
                cb3.setText("Granulado");
                cb4.setText("M&M");
                break;
            case 18:
                img.setImageResource(R.drawable.chocobrancordem);
                texto1.setText(R.string.o18);
                cb1.setText("Nutella");
                cb2.setText("Bombons");
                cb3.setText("Leite Condensado");
                cb4.setText("Creme de Leite");
                break;
            case 19:
                img.setImageResource(R.drawable.sucosordem);
                texto1.setText(R.string.o19);
                cb1.setText("Gelo");
                cb2.setText("Limão");
                cb3.setText("Gelo de coco");
                cb4.setText("Hortelã");
                break;
            case 20:
                img.setImageResource(R.drawable.refriordem);
                texto1.setText(R.string.o20);
                cb1.setText("Gelo");
                cb2.setText("Limão");
                cb3.setText("Gelo de coco");
                cb4.setText("Hortelã");
                break;
            case 21:
                img.setImageResource(R.drawable.aguaordem);
                texto1.setText(R.string.o21);
                cb1.setText("Gelo");
                cb2.setText("Limão");
                cb3.setText("Gelo de coco");
                cb4.setText("Hortelã");
                break;
            case 22:
                img.setImageResource(R.drawable.vinhoordem);
                texto1.setText(R.string.o22);
                cb1.setText("Gelo");
                cb2.setText("Limão");
                cb3.setText("Gelo de coco");
                cb4.setText("Hortelã");
                break;
            case 23:
                img.setImageResource(R.drawable.espumordem);
                texto1.setText(R.string.o23);
                cb1.setText("Gelo");
                cb2.setText("Limão");
                cb3.setText("Gelo de coco");
                cb4.setText("Hortelã");
                break;
        }

        ImageView backButton = findViewById(R.id.btvoltar);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Voltar à atividade anterior
                onBackPressed();
            }
        });








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
            String txt = "Seu pedido será entregue com os seguintes adicionais:\n\n";
            txt += cb1.isChecked() ? cb1.getText().toString() + "\n" : "";
            txt += cb2.isChecked() ? cb2.getText().toString() + "\n" : "";
            txt += cb3.isChecked() ? cb3.getText().toString() + "\n" : "";
            txt += cb4.isChecked() ? cb4.getText().toString() + "\n" : "";

            if (!cb1.isChecked() && !cb2.isChecked() && !cb3.isChecked() && !cb4.isChecked()) {
                txt = "Nenhum adicional foi selecionado.";
            }

            AlertDialog.Builder dlgBuilder = new AlertDialog.Builder(view.getContext()); // Passando o estilo customizado
            dlgBuilder.setTitle("Pedido");
            dlgBuilder.setMessage(txt);
            dlgBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            });

            dlgBuilder.setIcon(R.drawable.iconentrega);
            dlgBuilder.setCancelable(false);

            dlgBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog alertDialog = dlgBuilder.create();

            // Personalização do layout e das cores do AlertDialog
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#a9a9a9")));
            alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public void onShow(DialogInterface dialog) {
                    Button positiveButton = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                    positiveButton.setTextColor(Color.parseColor("#FF0000"));
                }
            });

            alertDialog.show();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
}