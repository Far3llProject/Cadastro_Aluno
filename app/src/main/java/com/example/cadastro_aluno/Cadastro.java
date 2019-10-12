package com.example.cadastro_aluno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    EditText alunoRA;
    EditText Nome;
    Spinner Cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
//--------------------------------------------------------
        alunoRA = findViewById(R.id.edtRA);
        Nome = findViewById(R.id.edtNome);
        //DECLARAÇÃO DO SPINNER
        Spinner combo = (Spinner)findViewById(R.id.spinCurso);
//--------------------------------------------------------
        //RECUPERANDO O ARRAY DE STRINGS DO STRINGS.XML
        String[] cursos = getResources().getStringArray(R.array.cursos);
        //AGORA NOSSO SPINER PRECISA DE UM ADAPTER
        ArrayAdapter<String> adp = new ArrayAdapter<>
              ( this, android.R.layout.simple_spinner_item,cursos);
        //INTEGRAR AS STRIGS AO MEU OBJETO DA ACTIVITY SPINNER
        combo.setAdapter(adp);

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cadastro, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.cadSalvar){
            Toast.makeText(this,"Salvando...", Toast.LENGTH_LONG).show();
            finish();
            }
        if (id == R.id.cadCancel){
            finish(); }
        return super.onOptionsItemSelected(item);
    }
}
