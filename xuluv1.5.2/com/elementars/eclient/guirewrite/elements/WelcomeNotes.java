// 
// Decompiled by Procyon v0.5.36
// 

package com.elementars.eclient.guirewrite.elements;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class WelcomeNotes extends JFrame
{
    JPanel jp;
    JLabel jl;
    JTextField jt;
    JButton jb;
    
    public WelcomeNotes() {
        this.jp = new JPanel();
        this.jl = new JLabel();
        this.jt = new JTextField(30);
        this.jb = new JButton("Set Welcome Message (use NAME to mark the name)");
        this.setTitle("Welcome Message");
        this.setVisible(true);
        this.setSize(400, 200);
        this.setDefaultCloseOperation(1);
        this.jp.add(this.jt);
        this.jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String input = WelcomeNotes.this.jt.getText();
                WelcomeNotes.this.jl.setText(input);
            }
        });
        this.jp.add(this.jb);
        this.jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String input = WelcomeNotes.this.jt.getText();
                Welcome.handleWelcome(input);
            }
        });
        this.jp.add(this.jl);
        this.add(this.jp);
    }
    
    public static void initTextBox() {
        final WelcomeNotes t = new WelcomeNotes();
    }
}
