/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelsWithTimers;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Hari
 */
public class Dude {

    int x, dx, y,dy;
    Image still;

    public Dude() {
        ImageIcon i = new ImageIcon("images.jpg");
        still = i.getImage();
        x = 10;
        y = 172;
    }

    public void move() {
        x = x + dx;
        
    }
    public void move2(){
        y = y + dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }

    public Image getImage() {
        return still;

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT);
        dx = -1;

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }
        if (key == KeyEvent.VK_UP){
            dy = 1;
        }
        if (key == KeyEvent.VK_DOWN){
            dy = -1;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT);
        dx = 0;

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        if (key == KeyEvent.VK_UP){
            dy = 0;
        }
        if (key == KeyEvent.VK_DOWN){
            dy = 0;
        }

    }
}
