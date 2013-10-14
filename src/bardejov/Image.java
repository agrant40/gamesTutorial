package bardejov;

import javax.swing.JFrame;

/**
 * Created with IntelliJ IDEA.
 * User: AdamG
 * Date: 10/14/13
 * Time: 9:31 AM
 */
public class Image extends JFrame {

    public Image() {

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 240);
        setLocationRelativeTo(null);
        setTitle("Bardejov");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Image();
    }
}
