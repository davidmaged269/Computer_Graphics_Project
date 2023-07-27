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
public class ImageProcessing1 extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setTitle("TM240");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applete =new ImageProcessing1();
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

BufferedImage img=null; 

try{ 

    img=ImageIO.read(new File("C:\\Users\\David\\Desktop\\image.jpeg")); 

}catch(IOException e){ } 

g2.drawImage(img,50,100,null); 

RescaleOp BrightnessControl=new RescaleOp(0.7f,0,null); 

BufferedImage img2=BrightnessControl.filter(img,null); 

g2.drawImage(img2,500,100,null); 

try { 

    File FinalImage = new File("C:\\Users\\David\\Desktop\\ProcessedImage.jpeg"); 

    ImageIO.write(img2, "jpeg", FinalImage); 

} 

catch(IOException ee){ 

}}} 
