/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Abdullah Shublaq
 */
public class GUI extends JFrame{

    public GUI() {
        
        DefaultListModel<String> deflist = new DefaultListModel<>();
        JList<String> list = new JList<>(deflist);
        list.setPreferredSize(new Dimension(100, 100));
        deflist.addElement("Black");
        deflist.addElement("Blue");
        deflist.addElement("Cyan");
        deflist.addElement("Dark Gray");
        deflist.addElement("Gray");
        JScrollPane scrolllist = new JScrollPane(list);
        scrolllist.setPreferredSize(new Dimension(120, 100));
        add(scrolllist);
        
        JButton b1 = new JButton("Copy>>>");
        b1.setFocusPainted(false);
        add(b1);
        
        JTextArea area = new JTextArea();
        area.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(90, 90));
        add(scroll);
        
        setTitle("Multiple Selection Lists");
        setSize(500, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new GUI();
    }
}
