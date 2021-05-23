package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //recuperar componentes
    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.textAlcool);
        editPrecoGasolina = findViewById(R.id.textGasolina);
        textResultado = findViewById(R.id.resultado);

    }

    public void calcularPreco(View view){
        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());
        Double resultado;


        // Faz calculo (precoAlcool / precoGasolina) se o resultado >= 0.7 melhor utilizar gasolina / senao melhor utilizar o Alcool

        resultado = precoAlcool / precoGasolina;

        if(resultado >= 0.7){
            textResultado.setText("Melhor utilizar gasolina");
        }else{
            textResultado.setText("Melhor utilizar alcool");
        }
    }
}