package view;

import java.util.Scanner;

public class MenuAluno {
    public int choose;
    static Scanner scan = new Scanner(System.in);
    public MenuAluno() {
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
        MenuAluno.scan = scan;
    }

    public static void exibirMenuAluno() {
        System.out.println("\nMenu Aluno\n");
        System.out.println("1 - Cadastrar aluno.");
        System.out.println("2 - Editar alunos.");
        System.out.println("3 - Matricular em cursos.");
        System.out.println("4 - Cancelar matrícula.");
        System.out.println("5 - Listar cursos matriculados.");
        System.out.println("6 - Voltar ao menu principal.");

        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:

        }
    }
}
