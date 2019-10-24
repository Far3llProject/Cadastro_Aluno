package com.example.cadastro_aluno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.Serializable;

public class Cadastro extends AppCompatActivity {

    Aluno a;

    EditText RA;
    EditText Nome;
    Spinner  Cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
//--------------------------------------------------------
        RA = findViewById(R.id.edtRA);
        Nome = findViewById(R.id.edtNome);
        //DECLARAÇÃO DO SPINNER
       Cursos = findViewById(R.id.spinCurso);
//--------------------------------------------------------
        //RECUPERANDO O ARRAY DE STRINGS DO STRINGS.XML
        String[] cursos = getResources().getStringArray(R.array.cursos);
        //AGORA NOSSO SPINER PRECISA DE UM ADAPTER
        ArrayAdapter<String> adp = new ArrayAdapter<>
              ( this, android.R.layout.simple_spinner_item,cursos);
        //INTEGRAR AS STRIGS AO MEU OBJETO DA ACTIVITY SPINNER
        Cursos.setAdapter(adp);

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
            SalvarAluno();
           }
        if (id == R.id.cadCancel){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

         public void SalvarAluno(){
         a = new Aluno();
         a.setRA(RA.getText().toString());
         a.setNome(Nome.getText().toString());
         a.setCursos(Cursos.getSelectedItem().toString());

         Toast.makeText(this,"Salvando..."+ a , Toast.LENGTH_LONG).show();
        //objeto so pode ser transportado setando na clase aluno um implements serializable
        //DEVE-SE CRIAR UMA RESPOSTA

            Intent i = new Intent();
             i.putExtra("aluno" ,a);
             setResult(1,i);
             finish();
         }
}
