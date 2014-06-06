package PanelsWithTimers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanLabelChange extends JPanel // panel definition
{

    PanDisp panDisp;
    String sName;

    public PanLabelChange(PanDisp _panDisp) {
        panDisp = _panDisp;

        final JButton btn1 = new JButton("Start Game");
        JButton btn2 = new JButton("Options/Game settings ");
        JButton btn3 = new JButton("High Scores");
        add(btn1);
        add(btn2);
        add(btn3);


        class LabelChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                Object src = event.getSource();
                JButton btn = (JButton) event.getSource();
                sName = btn.getText(); // gets the text value of the button
                panDisp.UpdateLabel(sName);
                if (src == btn1) {
                    new Frame();
                    
                }
               
            }
        }
        ActionListener labelChangeListener = new LabelChangeListener();
        btn1.addActionListener(labelChangeListener);
        btn2.addActionListener(labelChangeListener);
    }
}
/*
 public void paintComponent(Graphics g) {

 g.drawString("Label Change", 50, 50);
        
 }*/
