package com.example.cadastro_aluno;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//DECLARAÇÃO DOS OBJETOS NA ACTIVITY

ListView ListaAluno;
List<Aluno> Alunos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//---------------------------------------------------------------------------------
        //ESTÂNCIANDO OS OBJETOS
        ListaAluno = findViewById(R.id.lstAluno);
        //CRIANDO UMA LISTA COM ARRAY
        Alunos = new ArrayList<>();
        //CRIO UM ADAPTER PARA INTEGAR MEU OBJETO DA ACTIVITY COM MEU ARRAY
        ArrayAdapter<Aluno> adp = new ArrayAdapter<>(this,
                android.R.layout.simple_gallery_item, Alunos);
        //DAR UM SET NO MEU OBJETO DA ACTIVITY
        ListaAluno.setAdapter(adp);
//---------------------------------------------------------------------------------

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Aluno a = (Aluno)data.getSerializableExtra("aluno");
        Alunos.add(a);
        carregarLista();

    }
    private void carregarLista(){
     ArrayAdapter<Aluno> adp = new ArrayAdapter<>
                    (this, android.R.layout.simple_gallery_item, Alunos);
     ListaAluno.setAdapter(adp);}

//MENU ACOPLADO A MINHA ACTIVITY
//O MENU É TRATADO SEPARADO EM UMA OUTRA XML
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //PARA ACOPLAR NA MINHA ACTIVITY DEVO CRIAR UM INFLATER
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_ista_aluno, menu);
        return super.onCreateOptionsMenu(menu);
    }

//DAR FUNÇÃO AOS ITENS DO MENU
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //PARA CADA ITEM CRIAR UMA CONDIÇÃO
        //PODE SER USADO TAMBÉM UM SWITCH CASE
        int id = item.getItemId();
        if (id == R.id.nvaluno) {
         Intent i = new Intent(this, Cadastro.class);
         //startActivity(intencao);
       //PARA RECEBER OS DADOS DA OUTRA TELA DEVE-SE CRIAR UMA INTENÇÃO DE RESULTADO
        startActivityForResult(i,1);

        }
        if (id == R.id.FechaApp){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}



