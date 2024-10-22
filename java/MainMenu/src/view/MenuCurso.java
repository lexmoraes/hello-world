package view;

import controller.CursoController;

import java.util.Scanner;

public class MenuCurso {
    public int choose;
    static Scanner scan = new Scanner(System.in);

    public MenuCurso(int choose) {
        this.choose = choose;
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }
    public static void exibirMenu() {
        System.out.println("\nMenu Curso\n");
        System.out.println("1. Cadastrar Curso");
        System.out.println("2. Editar Curso");
        System.out.println("3. Listar Cursos");
        System.out.println("4. Voltar para o menu principal");

        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                CursoController.cadastrarCurso();
                break;
            case 3:
                CursoController.listarCursos();
                break;
        }
    }

}