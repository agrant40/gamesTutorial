package rtype;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Created with IntelliJ IDEA.
 * User: AdamG
 * Date: 10/14/13
 * Time: 2:53 PM
 */
public class Missile {

    private int x, y;
    private Image image;
    boolean visible;

    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 2;

    public Missile(int x, int y){

        ImageIcon ii =
                new ImageIcon(this.getClass().getResource("/Images/missile.png"));
        image = ii.getImage();
        visible = true;
        this.x = x;
        this.y = y;
    }

    public Image getImage(){
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void move() {
        x += MISSILE_SPEED;
        if (x > BOARD_WIDTH)
            visible = false;
    }
}
