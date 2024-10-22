package view;

import java.util.Scanner;

public class MenuGeral {
    public int choose;
    static Scanner scan = new Scanner(System.in);

    public MenuGeral() {
        this.choose = choose;
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public static Scanner getScan() {
        return scan;
    }

    public static void setScan(Scanner scan) {
        MenuGeral.scan = scan;
    }

    public static void exibirMainMenu() {
        System.out.println("\nMenu Geral\n");
        System.out.println("1 - Menu de cursos");
        System.out.println("2 - Menu de alunos");
        System.out.println("3 - Sair do programa");

      //  do {

            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    view.MenuCurso.exibirMenu();
                    break;
                case 2:
                    view.MenuAluno.exibirMenuAluno();
                    break;
                case 3:
                    break;


            }

      //  } while (!opcao  3)
    }
}