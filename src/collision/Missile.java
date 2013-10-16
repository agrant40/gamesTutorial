package collision;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

/**
 * Created with IntelliJ IDEA.
 * User: AdamG
 * Date: 10/16/13
 * Time: 10:26 AM
 */
public class Missile {
    public String missilePath = "/Images/missile.png";

    private int x,y;
    private Image image;
    boolean visible;
    private int width, height;

    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 2;

    public Missile(int x, int y){
        ImageIcon ii = new ImageIcon(this.getClass().getResource(missilePath));
        image = ii.getImage();
        visible = true;
        width = image.getWidth(null);
        height = image.getHeight(null);
        this.x = x;
        this.y = y;
    }

    public Image getImage(){
        return image;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean isVisible(){
        return visible;
    }

    public void setVisible(Boolean visible){
        this.visible = visible;
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,width,height);
    }

    public void move(){
        x += MISSILE_SPEED;
        if(x > BOARD_WIDTH)
            visible = false;
    }
}
