/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelsWithTimers;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Hari
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Board extends JPanel implements ActionListener {
        Dude p;
        public Image img;
        Timer time;
 
        public Board() {
                p = new Dude();
                addKeyListener(new AL());
                setFocusable(true);
                ImageIcon i = new ImageIcon("1172262_orig.jpg");
                img = i.getImage();
                time = new Timer(5, this);
                time.start();
        }
 
        public void actionPerformed(ActionEvent e) {
                p.move();
//                p.move2();
                repaint();
        }
 
        public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
 
                g2d.drawImage(img, 0, 0, null);
                g2d.drawImage(p.getImage(), p.getX(), p.getY(), null);
        }
 
        private class AL extends KeyAdapter {
                public void keyReleased(KeyEvent e) {
                        p.keyReleased(e);
                }
 
                public void keyPressed(KeyEvent e) {
                        p.keyPressed(e);
                }
        }
}