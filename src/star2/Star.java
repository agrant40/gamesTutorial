package star2;

import javax.swing.JFrame;

/**
 * Created with IntelliJ IDEA.
 * User: AdamG
 * Date: 10/14/13
 * Time: 1:22 PM
 */
public class Star extends JFrame {

    public Star(){

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 240);
        setLocationRelativeTo(null);
        setTitle("Star2");
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Star();
    }
}
