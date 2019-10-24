package com.example.cadastro_aluno;

import java.io.Serializable;

public class Aluno implements Serializable {

    private String RA;
    private String Nome;
    private String Cursos;

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCursos() {
        return Cursos;
    }

    public void setCursos(String cursos) {
        Cursos = cursos;
    }

    @Override
    public String toString(){
        return RA + " / " + Nome + " / " + Cursos;
    }
}
