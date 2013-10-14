package donut;

import javax.swing.JFrame;

/**
 * Created with IntelliJ IDEA.
 * User: AdamG
 * Date: 10/14/13
 * Time: 9:19 AM
 */
public class Donut extends JFrame {

    public Donut() {

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 310);
        setLocationRelativeTo(null);
        setTitle("Donut");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Donut();
    }
}
