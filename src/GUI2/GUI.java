/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Abdullah Shublaq
 */
public class GUI extends JFrame {

    public GUI() {
        JTextField area = new JTextField(16);
        add(area);
        JButton buttons[] = new JButton[16];
        JButton b1 = new JButton("7");
        buttons[0] = b1;
        JButton b2 = new JButton("8");
        buttons[1] = b2;
        JButton b3 = new JButton("9");
        buttons[2] = b3;
        JButton b4 = new JButton("/");
        buttons[3] = b4;
        JButton b5 = new JButton("4");
        buttons[4] = b5;
        JButton b6 = new JButton("5");
        buttons[5] = b6;
        JButton b7 = new JButton("6");
        buttons[6] = b7;
        JButton b8 = new JButton("*");
        buttons[7] = b8;
        JButton b9 = new JButton("1");
        buttons[8] = b9;
        JButton b10 = new JButton("2");
        buttons[9] = b10;
        JButton b11 = new JButton("3");
        buttons[10] = b11;
        JButton b12 = new JButton("-");
        buttons[11] = b12;
        JButton b13 = new JButton("0");
        buttons[12] = b13;
        JButton b14 = new JButton(".");
        buttons[13] = b14;
        JButton b15 = new JButton("=");
        buttons[14] = b15;
        JButton b16 = new JButton("+");
        buttons[15] = b16;
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        for (JButton button : buttons) {
            button.setFocusPainted(false);
            panel.add(button);
        }
        add(panel);

        setTitle("Calculator");
        Dimension d = new Dimension(250, 210);
        setSize(d);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
