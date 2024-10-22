package app;

import model.Aluno;
import model.Livro;
import model.PrimitiveType;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = ("Hello and welcome!");
        int[] array = {1, 2, 3, 4, 5};
        PrimitiveType primitiveType = new PrimitiveType();
        primitiveType.setC(10);
        System.out.println("type byte | Value = " + primitiveType.getC());

        Aluno aluno = new Aluno("garapa", "Ozzy", "34423400032");

        aluno.matricular("POO");
        System.out.println("Matrícula: " + aluno.getMatricula());

        aluno.matricular("Frameworks backend");
        aluno.matricular("Frameworks frontend");

        aluno.listar();

        Livro livro = new Livro("POO PARA BURROS", "ITHA", 2024, "EDUCAÇÃO", 200, true);

        livro.mostrar_infos();

        livro.emprestar();

        livro.mostrar_infos();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite o ano do aluno: ");
    }
}