package com.ifsp.giovanna.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ifsp.giovanna.cadastro.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private Formulario formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());


        activityMainBinding.salvarBt.setOnClickListener(view -> {
            formulario = new Formulario(
                    activityMainBinding.nomeEt.getText().toString(),
                    activityMainBinding.telefoneEt.getText().toString(),
                    activityMainBinding.emailEt.getText().toString(),
                    activityMainBinding.checkBox.isChecked()? "Sim" : "Não",
                    activityMainBinding.masculinoRb.isChecked()? getString(R.string.masculino) : getString(R.string.feminino),
                    activityMainBinding.cidadeEt.getText().toString(),
                    activityMainBinding.estadoSp.getSelectedItem().toString()
            );
            Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show();
        });


        activityMainBinding.limparBt.setOnClickListener(view -> {
            activityMainBinding.nomeEt.setText("");
            activityMainBinding.telefoneEt.setText("");
            activityMainBinding.emailEt.setText("");
            activityMainBinding.checkBox.setChecked(false);
            activityMainBinding.masculinoRb.setChecked(true);
            activityMainBinding.cidadeEt.setText("");
            activityMainBinding.estadoSp.setSelection(0);

            formulario = null;
        });
    }
}