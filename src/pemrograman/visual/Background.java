/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman.visual;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Aditya Maulana
 */
public class Background extends JPanel {
    private Image image;
    public Background() {
        image = new ImageIcon("C:\\Users\\Aditya Maulana\\Documents\\NetBeansProjects\\Pemrograman Visual\\background.jpg").getImage();
        
    }
    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        
        Graphics gd = (Graphics2D) g.create();
        
        gd.drawImage(image, 0, 0, getWidth(),getHeight(), this);
        
        gd.dispose();
    }
}
