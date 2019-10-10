package com.example.cadastro_aluno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

ListView ListaAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaAluno = findViewById(R.id.lstAluno);

        List<Object> objetos = new ArrayList<>();

        ArrayAdapter<Object> adp = new ArrayAdapter<>
                (this, android.R.layout.simple_gallery_item, objetos);

        ListaAluno.setAdapter(adp);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_ista_aluno, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nvaluno) {
            return true;
       }

        return super.onOptionsItemSelected(item);
    }
}



