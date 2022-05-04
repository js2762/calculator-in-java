package practice;

import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener {

    double a, b;
    static int op = 0;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;

    TextArea t1 = new TextArea(5, 10);

    calculator() {
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("+");
        b12 = new Button("-");
        b13 = new Button("*");
        b14 = new Button("/");
        b15 = new Button("=");
        b16 = new Button("C");

        add(t1, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        add(p, BorderLayout.CENTER);

        setSize(500, 500);
        setVisible(true);
        t1.setBackground(Color.cyan);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            t1.setText(t1.getText().concat("1"));
        }

        if (e.getSource() == b2) {
            t1.setText(t1.getText().concat("2"));
        }

        if (e.getSource() == b3) {
            t1.setText(t1.getText().concat("3"));
        }

        if (e.getSource() == b4) {
            t1.setText(t1.getText().concat("4"));
        }

        if (e.getSource() == b5) {
            t1.setText(t1.getText().concat("5"));
        }

        if (e.getSource() == b6) {
            t1.setText(t1.getText().concat("6"));
        }

        if (e.getSource() == b7) {
            t1.setText(t1.getText().concat("7"));
        }

        if (e.getSource() == b8) {
            t1.setText(t1.getText().concat("8"));
        }

        if (e.getSource() == b9) {
            t1.setText(t1.getText().concat("9"));
        }

        if (e.getSource() == b10) {
            t1.setText(t1.getText().concat("0"));
        }

        if (e.getSource() == b11) {
            a = Double.parseDouble(t1.getText());
            op = 1;
            t1.setText(" ");
        }

        if (e.getSource() == b12) {
            a = Double.parseDouble(t1.getText());
            op = 2;
            t1.setText(" ");
        }

        if (e.getSource() == b13) {
            a = Double.parseDouble(t1.getText());
            op = 3;
            t1.setText(" ");
        }

        if (e.getSource() == b14) {
            a = Double.parseDouble(t1.getText());
            op = 4;
            t1.setText(" ");
        }

        if (e.getSource() == b16) {
            t1.setText(" ");
        }

        if (e.getSource() == b15) {
            b = Double.parseDouble(t1.getText());
            switch (op) {
                case 1:
                    double tot = a + b;
                    t1.setText(Double.toString(tot));
                    break;
                case 2:
                    double sub = a - b;
                    t1.setText(Double.toString(sub));
                    break;
                case 3:
                    double mul = a * b;
                    t1.setText(Double.toString(mul));
                    break;
                case 4:
                    double div = a / b;
                    t1.setText(Double.toString(div));
                    break;
            }
        }
    }
    public static void main(String[] args) {
        calculator c = new calculator();
    }
}