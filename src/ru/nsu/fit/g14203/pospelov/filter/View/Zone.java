package ru.nsu.fit.g14203.pospelov.filter.View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by posiv on 15.03.17.
 */
public class Zone extends JPanel {
    public Zone(int xSize, int ySize){
        setPreferredSize(new Dimension(xSize, ySize));
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.WHITE);
        setOpaque(true);
        JLabel exitLabel = new JLabel("Zone A");
        exitLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        add(exitLabel);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawLine(0, 0, getBounds().width-1, getBounds().height-1);
        //g.drawLine(0, getBounds().height-1, getBounds().width-1, 0);
    }
}
