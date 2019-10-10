package com.example.cadastro_aluno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.Spinner;

public class Cadastro extends AppCompatActivity {

    EditText alunoRA;
    EditText Nome;
    Spinner Cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        alunoRA = findViewById(R.id.edtRA);
        Nome = findViewById(R.id.edtNome);
        Cursos = findViewById(R.id.spinCurso);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.cadastro, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
