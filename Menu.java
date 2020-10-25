import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {

    private JButton learn = new JButton("Learn");

    private JButton about = new JButton("About");

    private JLabel header = new JLabel("Math Bank", SwingConstants.CENTER);

    public Menu() {

        JFrame menu = new JFrame();

        menu.setLayout(null);

        menu.setSize(1000,800);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);//centres window
        menu.setVisible(true);
        menu.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);

        learn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.dispose();
                new LearnGui();

            }


        });

        //Open Rules() when button pressed
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.dispose();
                new About();

            }


        });

        menu.add(header);
        header.setFont(new Font("Comic Sans MS", Font.BOLD, 75));
        header.setBounds(200, 0, 600, 200);

        menu.add(learn);
        learn.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        learn.setBounds(200, 200, 200, 200);

        menu.add(about);
        about.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        about.setBounds(600, 200, 200, 200);
    }



    public static void main(String[] args){
        new Menu();
    }
}
