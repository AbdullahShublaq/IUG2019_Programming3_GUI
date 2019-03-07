/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Abdullah Shublaq
 */
public class GUI extends JFrame {

    public GUI() {
        
        JLabel label1 = new JLabel("Printer : MyPrinter");

        JTextArea area1 = new JTextArea();
        area1.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(area1);
        scroll.setPreferredSize(new Dimension(70, 70));

        JCheckBox box1 = new JCheckBox("Image");
        JCheckBox box2 = new JCheckBox("Text");
        JCheckBox box3 = new JCheckBox("Code");
        JPanel panel1 = new JPanel(new GridLayout(3, 1, 0, 0));
        panel1.add(box1);
        panel1.add(box2);
        panel1.add(box3);

        JTextArea area2 = new JTextArea();
        area2.setLineWrap(true);
        JScrollPane scrol2 = new JScrollPane(area2);
        scrol2.setPreferredSize(new Dimension(70, 70));

        JPanel panel2 = new JPanel(new GridLayout(3, 1, 0, 0));
        JRadioButton Selection = new JRadioButton("Selection", false);
        panel2.add(Selection);
        JRadioButton All = new JRadioButton("All", true);
        panel2.add(All);
        JRadioButton Applet = new JRadioButton("Applet", false);
        panel2.add(Applet);

        JTextArea area3 = new JTextArea();
        area3.setLineWrap(true);
        JScrollPane scrol3 = new JScrollPane(area3);
        scrol3.setPreferredSize(new Dimension(70, 70));

        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(scroll);
        panel3.add(panel1);
        panel3.add(scrol2);
        panel3.add(panel2);
        panel3.add(scrol3);

        JLabel label2 = new JLabel("Print Quality : ");

        JComboBox<String> box = new JComboBox<>();
        box.addItem("High");
        box.addItem("Medium");
        box.addItem("Low");
        box.setSelectedItem("High");

        JCheckBox box4 = new JCheckBox("Print to File");

        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(label2);
        panel4.add(box);
        panel4.add(box4);

        JPanel panel5 = new JPanel(new GridLayout(3, 1, 0, 0));
        panel5.add(label1);
        panel5.add(panel3);
        panel5.add(panel4);
        
        add(panel5);

        JButton b1 = new JButton("OK");
        b1.setFocusPainted(false);
        JButton b2 = new JButton("Cancel");
        b2.setFocusPainted(false);
        JButton b3 = new JButton("Setup...");
        b2.setFocusPainted(false);
        JButton b4 = new JButton("Help");
        b3.setFocusPainted(false);
        JPanel panel6 = new JPanel(new GridLayout(4, 1, 0, 10));
        panel6.add(b1);
        panel6.add(b2);
        panel6.add(b3);
        panel6.add(b4);
        add(panel6);
        
        setTitle("Printer");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
