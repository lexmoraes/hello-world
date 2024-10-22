package model;

import java.util.List;

public class Aluno {
    public String nome;
    protected String matricula;
    protected List<String> cursos;

    public Aluno(String nome, String matricula, List<String> cursos) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

