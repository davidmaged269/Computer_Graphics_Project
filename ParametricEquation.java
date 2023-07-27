/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skel;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;
import java.awt.font.GlyphVector;
import javax.swing.*;
import java.awt.geom.*;
import java.util.Random;
import java.awt.font.FontRenderContext;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.RescaleOp;
import java.awt.image.ShortLookupTable;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import static jdk.internal.org.jline.utils.Colors.s;

/**
 *
 * @author eid.emary
 */
public class ParametricEquation extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setTitle("TM240");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applete =new Skel();
        applete.init();
        frame.getContentPane().add(applete);
        frame.pack();
        frame.setVisible(true);
    }
    public void init(){
        JPanel panel=new JApp1Panel();
        getContentPane().add(panel);
    }
    
}
class JApp1Panel extends JPanel{
public JApp1Panel(){
    setPreferredSize(new Dimension(1000,1000));
}
public void paintComponent(Graphics g){ 

super.paintComponent(g); 

Graphics2D g2=(Graphics2D) g; 

g2.translate(200,200); 

int n = 1000; 

int x=135,y=0,x1,y1; 

double t=0; 

for(int i=0; i<n;i++){ 

    t=12*i*Math.PI/n; 

    x1 =(int) (100*(Math.cos(6*t)+Math.cos(6*t)/2+Math.sin(10*t)/3)); 

    y1 =(int) (100*(Math.sin(6*t)+Math.sin(6*t)/2+Math.cos(10*t)/3)); 

    g2.drawLine(x,y,x1,y1); 

    x=x1; 

    y=y1; 

}}} 