package rtype;

import javax.swing.JFrame;

/**
 * Created with IntelliJ IDEA.
 * User: AdamG
 * Date: 10/14/13
 * Time: 2:47 PM
 */
public class RType extends JFrame {

    public RType(){

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        setTitle("R - Type");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RType();
    }
}
