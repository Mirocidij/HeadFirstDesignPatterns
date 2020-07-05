package main.java.com.mirocidij.headfirst.patterns.chapter2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObservableExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObservableExample example = new SwingObservableExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        button.addActionListener(e -> {
            System.out.println("Another listener");
        });

        frame.add(button);
        frame.setSize(500, 500);
        frame.show();
    }

    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
