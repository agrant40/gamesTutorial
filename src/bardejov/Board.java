package bardejov;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Created with IntelliJ IDEA.
 * User: AdamG
 * Date: 10/14/13
 * Time: 9:26 AM
 */
public class Board extends JPanel {

    Image bardejov;

    public Board() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/Images/bardejov.jpg"));
        bardejov = ii.getImage();
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(bardejov, 10, 10, null);
    }
}
