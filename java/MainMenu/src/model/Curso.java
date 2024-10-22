package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String titulo;
    private int cargaHoraria;
    public static List<String> cursos;

    public Curso(String titulo, int cargaHora) {
        this.id = 1;
        this.titulo = titulo;
        this.cargaHoraria = cargaHora;
        this.cursos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }
}


