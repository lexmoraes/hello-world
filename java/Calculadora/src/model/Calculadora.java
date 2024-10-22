package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame {

    private void button13(ActionEvent e) {
        // TODO add your code here
    }

    private void button12(ActionEvent e) {
        // TODO add your code here
    }

    private void three(ActionEvent e) {
        // TODO add your code here
    }

    private void plus(ActionEvent e) {
        // TODO add your code here
    }

    private void four(ActionEvent e) {
        // TODO add your code here
    }

    private void five(ActionEvent e) {
        // TODO add your code here
    }

    private void six(ActionEvent e) {
        // TODO add your code here
    }

    private void minus(ActionEvent e) {
        // TODO add your code here
    }

    private void seven(ActionEvent e) {
        // TODO add your code here
    }

    private void eight(ActionEvent e) {
        // TODO add your code here
    }

    private void nine(ActionEvent e) {
        // TODO add your code here
    }

    private void product(ActionEvent e) {
        // TODO add your code here
    }

    private void clear(ActionEvent e) {
        // TODO add your code here
    }

    private void zero(ActionEvent e) {
        // TODO add your code here
    }

    private void equal(ActionEvent e) {
        // TODO add your code here
    }

    private void division(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        clear = new JButton();
        zero = new JButton();
        seven = new JButton();
        eight = new JButton();
        nine = new JButton();
        five = new JButton();
        six = new JButton();
        three = new JButton();
        two = new JButton();
        one = new JButton();
        four = new JButton();
        equal = new JButton();
        plus = new JButton();
        minus = new JButton();
        product = new JButton();
        division = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- clear ----
        clear.setText("C");
        clear.setFont(new Font("Inter", Font.PLAIN, 15));
        clear.addActionListener(e -> clear(e));
        contentPane.add(clear);
        clear.setBounds(20, 370, 75, 64);

        //---- zero ----
        zero.setText("0");
        zero.setFont(new Font("Inter", Font.PLAIN, 15));
        zero.addActionListener(e -> zero(e));
        contentPane.add(zero);
        zero.setBounds(120, 370, 75, 64);

        //---- seven ----
        seven.setText("7");
        seven.setFont(new Font("Inter", Font.PLAIN, 15));
        seven.addActionListener(e -> seven(e));
        contentPane.add(seven);
        seven.setBounds(20, 295, 75, 64);

        //---- eight ----
        eight.setText("8");
        eight.setFont(new Font("Inter", Font.PLAIN, 15));
        eight.addActionListener(e -> eight(e));
        contentPane.add(eight);
        eight.setBounds(120, 295, 75, 64);

        //---- nine ----
        nine.setText("9");
        nine.setFont(new Font("Inter", Font.PLAIN, 15));
        nine.addActionListener(e -> nine(e));
        contentPane.add(nine);
        nine.setBounds(220, 295, 75, 64);

        //---- five ----
        five.setText("5");
        five.setFont(new Font("Inter", Font.PLAIN, 15));
        five.addActionListener(e -> five(e));
        contentPane.add(five);
        five.setBounds(120, 220, 75, 64);

        //---- six ----
        six.setText("6");
        six.setFont(new Font("Inter", Font.PLAIN, 15));
        six.addActionListener(e -> six(e));
        contentPane.add(six);
        six.setBounds(220, 220, 75, 64);

        //---- three ----
        three.setText("3");
        three.setFont(new Font("Inter", Font.PLAIN, 15));
        three.addActionListener(e -> three(e));
        contentPane.add(three);
        three.setBounds(220, 145, 75, 64);

        //---- two ----
        two.setText("2");
        two.setFont(new Font("Inter", Font.PLAIN, 15));
        two.addActionListener(e -> button12(e));
        contentPane.add(two);
        two.setBounds(120, 145, 75, 64);

        //---- one ----
        one.setText("1");
        one.setFont(new Font("Inter", Font.PLAIN, 16));
        one.addActionListener(e -> button13(e));
        contentPane.add(one);
        one.setBounds(20, 145, 75, 64);

        //---- four ----
        four.setText("4");
        four.setFont(new Font("Inter", Font.PLAIN, 15));
        four.addActionListener(e -> four(e));
        contentPane.add(four);
        four.setBounds(20, 220, 75, 64);

        //---- equal ----
        equal.setText("=");
        equal.setFont(new Font("Inter", Font.PLAIN, 15));
        equal.addActionListener(e -> equal(e));
        contentPane.add(equal);
        equal.setBounds(220, 370, 75, 64);

        //---- plus ----
        plus.setText("+");
        plus.setFont(new Font("Inter", Font.PLAIN, 15));
        plus.addActionListener(e -> plus(e));
        contentPane.add(plus);
        plus.setBounds(325, 370, 60, 64);

        //---- minus ----
        minus.setText("-");
        minus.setFont(new Font("Inter", Font.PLAIN, 15));
        minus.addActionListener(e -> minus(e));
        contentPane.add(minus);
        minus.setBounds(325, 220, 60, 64);

        //---- product ----
        product.setText("*");
        product.setFont(new Font("Inter", Font.PLAIN, 15));
        product.addActionListener(e -> product(e));
        contentPane.add(product);
        product.setBounds(325, 295, 60, 64);

        //---- division ----
        division.setText("/");
        division.setFont(new Font("Inter", Font.PLAIN, 15));
        division.addActionListener(e -> division(e));
        contentPane.add(division);
        division.setBounds(330, 145, 60, 64);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(21, 20, 360, 110);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton clear;
    private JButton zero;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton five;
    private JButton six;
    private JButton three;
    private JButton two;
    private JButton one;
    private JButton four;
    private JButton equal;
    private JButton plus;
    private JButton minus;
    private JButton product;
    private JButton division;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
