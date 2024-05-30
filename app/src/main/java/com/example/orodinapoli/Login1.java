package com.example.orodinapoli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login1);

                Button button = findViewById(R.id.bt_entrar);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Login1.this, Loginentrar.class);
                        startActivity(intent);
                        Button button = findViewById(R.id.bt_cadastrar);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Login1.this, Logincadastra.class);
                                startActivity(intent);


                        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                            return insets;
                        });
                    }
                });
            }
        });
    }
}