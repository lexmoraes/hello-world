package app;

import view.PrimeiraJanela;
import view.SegundaJanela;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SegundaJanela frame = new SegundaJanela();
        frame.setTitle("Segunda Janela");
        frame.setVisible(true);
    }
}