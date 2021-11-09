package com.gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {

    private JButton a1Button;
    private JPanel myPanel;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton multiply;
    private JButton divide;
    private JButton equals;
    private JButton subtract;
    private JButton addition;
    private JButton ACButton;
    private JButton offButton;
    private JTextField textField1;
    public String input = "0";
    public double total = 0;
    public int operation = 0;

    public test() {

        textField1.setText("0");

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "1";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "2";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "3";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "4";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "5";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "6";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "7";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "8";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "9";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = input + "0";
                textField1.setText(String.format("%s", input.substring(1)));
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc();
                input = "0";
                operation = 0;
                textField1.setText(String.format("%.6f", total));
            }
        });

        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc();
                operation = 0;
                input = "0";
            }
        });

        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc();
                operation = 1;
                input = "0";
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc();
                operation = 2;
                input = "0";
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc();
                operation = 3;
                input = "0";
            }
        });

        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = "0";
                total = 0;
                textField1.setText("0");
            }
        });

        offButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



    }

    public void calc() {
        switch(operation) {
            case 0:
                total += Integer.parseInt(input);
                break;
            case 1:
                total -= Integer.parseInt(input);
                break;
            case 2:
                total *= Integer.parseInt(input);
                break;
            case 3:
                total /= Double.parseDouble(input);
                break;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setContentPane(new test().myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}