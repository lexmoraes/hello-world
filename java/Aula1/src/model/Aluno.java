package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;
    private List<String> cursos;

    public Aluno(String matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.cursos = new ArrayList<>();
    }

    public void matricular(String c) {
        if (!cursos.contains(c)) {
            this.cursos.add(c);
            System.out.println("O aluno " + this.nome + " está matriculado no curso " + c);
        } else {
            System.out.println("O aluno" + this.nome + "já foi matriculado no " + c + ".");
        }
    }

    public void listar() {
        int i = 1;
        for (String curso : cursos) {
            System.out.println("Curso " + i + ": " + curso);
            i++;
        }
    }

    public void cancelarPorNome(String n) {
        if (cursos.contains(n)) {
            this.cursos.remove(n);
            System.out.println("O aluno " + this.nome + " está desmatriculado do curso " + n);
        } else {
            System.out.println("O aluno" + this.nome + "não está matriculado no " + n + ".");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}