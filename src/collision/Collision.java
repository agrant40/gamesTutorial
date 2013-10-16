package collision;

import javax.swing.JFrame;

/**
 * Created with IntelliJ IDEA.
 * User: AdamG
 * Date: 10/16/13
 * Time: 10:22 AM
 */
public class Collision extends JFrame {
    public Collision(){
        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Collision");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Collision();
    }
}
