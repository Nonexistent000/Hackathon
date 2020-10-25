import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame {
    private JButton back = new JButton("Back");
    public About() {
        setLayout(new GridBagLayout());
        add(back);
        back.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        back.setBounds(0, 800, 200, 200);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Menu();

            }


        });

        setSize(1000,800);
        setResizable(false);
        setLocationRelativeTo(null);//centres window
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("About");
    }
}