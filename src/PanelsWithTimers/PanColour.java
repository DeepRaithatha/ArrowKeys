package PanelsWithTimers;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class PanColour extends JPanel // panel definition
{

    PanDisp panDisp;

    public PanColour(PanDisp _panDisp) {
        try {
            image = ImageIO.read(new File("titlepage.png"));

            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    @ Override 
    public void paintComponent(Graphics g) {
        // draw the image in the upper-left corner     
        g.drawImage(image, 0, 0, getWidth(),getHeight(),null);
 
        // "null" is the Image Observer if there is one. Don't worry about it.

    }
    private Image image; // declare the Image variable herezzzzzz
}
//        panDisp = _panDisp;      
//        setLayout(new GridLayout(3, 1));
//        // notice now that I created a new BtnColour class that takes the name and 
//        // the color variable. Look at the BtnColour class which extends JButton
//        BtnColour btnRed = new BtnColour("Red", Color.red);
//        BtnColour btnBlue = new BtnColour("Blue", Color.blue);
//        BtnColour btnYellow = new BtnColour("Yellow", Color.yellow);
//        add(btnRed);
//        add(btnBlue);
//        add(btnYellow);
//        class ColourChangeListener implements ActionListener {
//            public void actionPerformed(ActionEvent event) {
//                // I get the source of the click, and then I can find out what color has been assigned 
//                //to that button.
//                BtnColour btn = (BtnColour)event.getSource();
//                Color c = btn.getColour();
//                panDisp.UpdateBackground(c);
//            }
//        }
//        ActionListener colourChangeListener = new ColourChangeListener();
//        // all 3 buttons call the same listener
//        btnRed.addActionListener(colourChangeListener);
//        btnBlue.addActionListener(colourChangeListener);
//        btnYellow.addActionListener(colourChangeListener);
//        
//        
//    }/*
//     public void paintComponent(Graphics g) {
//
//     g.drawString("Colour", 50, 50);
//        
//     }*/
