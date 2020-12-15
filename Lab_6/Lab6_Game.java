package Lab6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.util.Random;

public class Game extends JFrame{
    JTextField jta = new JTextField(10);
    JButton button = new JButton("GoodLuck");
    Random random = new Random();
    int k = 0, l = random.nextInt(21);


    Game()
    {
        super("SillyGame");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("Number"));
        add(jta);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println(l);
                if(k < 3){
                try {
                    k++;
                    int x = Integer.parseInt(jta.getText().trim());
                    if(x == l) {
                        JOptionPane.showMessageDialog(null,  "Right, you win -_-", "Win", JOptionPane.INFORMATION_MESSAGE);
                        k = 0;
                        l = random.nextInt(21);
                    }
                    else if(x > l){
                        JOptionPane.showMessageDialog(null, "Number less -_-", "No", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(x < l){
                        JOptionPane.showMessageDialog(null, "Number more -_-", "No", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" ,
                            JOptionPane.ERROR_MESSAGE); }}
                if(k == 3){
                    k = 0;
                    l = random.nextInt(21);
                    JOptionPane.showMessageDialog(null, "Game Over", "No chance", JOptionPane.ERROR_MESSAGE);
                }
            } });
        setVisible(true);
    }
    public static void main(String[]args) {
        new Game();
    }
}
