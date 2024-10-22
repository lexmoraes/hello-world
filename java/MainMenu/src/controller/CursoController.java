package controller;

import model.Curso;

import java.util.Scanner;

public class CursoController {
    static Scanner scan = new Scanner(System  .in);
    static String titulo;
    static int cargaHora;

    public CursoController() {
        this.cargaHora = cargaHora;
        this.titulo = titulo;
    }

    public static void cadastrarCurso() {
        System.out.println("Digite o nome do curso: ");
        String titulo = scan.nextLine();
        System.out.println("Digite a carga horária do curso: ");
        int cargaHora = scan.nextInt();
        model.Curso c = new model.Curso(titulo, cargaHora);
        Curso.cursos.add(c.getTitulo());
    }

    public static void listarCursos() {
        int i;
        for (i = 0; i < Curso.cursos.size(); i++) {
            System.out.println(Curso.cursos.get(i));
        }
    }


}

