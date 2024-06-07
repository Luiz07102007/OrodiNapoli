package com.example.orodinapoli;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class Loginentrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginentrar);

        ImageView backButton = findViewById(R.id.btvoltar);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextInputEditText inputEmail = findViewById(R.id.tietemail);
        Button button = findViewById(R.id.btcadastrar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = inputEmail.getText().toString();

                if (email.isEmpty()) {
                    showCustomToast("Por favor, insira um email.");
                } else {
                    showAlertDialog(email);
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void showCustomToast(String message) {
        Toast.makeText(Loginentrar.this, message, Toast.LENGTH_SHORT).show();

    }

    private void showAlertDialog(String email) {
        AlertDialog.Builder alerta = new AlertDialog.Builder(Loginentrar.this);
        alerta.setTitle("Bem vindo, um código foi enviado para o email:");
        alerta.setMessage(email);
        alerta.setIcon(R.drawable.baseline_arrow_right_alt_24);
        alerta.setCancelable(false);
        alerta.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Loginentrar.this, Loginentrar2.class);
                startActivity(intent);
            }
        });

        AlertDialog alertDialog = alerta.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#a9a9a9")));
        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                Button positiveButton = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setTextColor(Color.parseColor("#AA2C19")); //
            }
        });

        alertDialog.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (alertDialog.isShowing()) {
                    alertDialog.dismiss();
                    Intent intent = new Intent(Loginentrar.this, Loginentrar2.class);
                    startActivity(intent);
                }
            }
        }, 99999);
    }
}