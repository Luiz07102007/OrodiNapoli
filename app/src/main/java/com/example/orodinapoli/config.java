package com.example.orodinapoli;

import android.app.UiModeManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class config extends AppCompatActivity {
    RadioGroup radio_group;
    RadioButton claro;
    RadioButton escuro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_config);
        UiModeManager uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);

        // Configurar RadioGroup e RadioButtons
        radio_group = findViewById(R.id.rgtema);
        claro = findViewById(R.id.rbmodoclaro);
        escuro = findViewById(R.id.rbmodoescuro);

        // Verificar o modo atual e definir o RadioButton correspondente
        int currentMode = getResources().getConfiguration().uiMode & android.content.res.Configuration.UI_MODE_NIGHT_MASK;
        if (currentMode == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
            escuro.setChecked(true);
        } else {
            claro.setChecked(true);
        }

        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbmodoclaro) {
                    uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);
                } else if (checkedId == R.id.rbmodoescuro) {
                    uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_YES);
                }
                recreate();
            }
        });
        Button home = findViewById(R.id.bttelainicial);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(config.this, Telainicial.class);
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
}


