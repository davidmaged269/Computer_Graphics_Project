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
public class Skel extends JApplet{

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
BufferedImage img=null;

try{
    img=ImageIO.read(new File("C:\\Users\\David\\Downloads\\download.jpeg"));
}catch(IOException e){
}

g2.translate(200,0);

TexturePaint tp=new TexturePaint(img,new Rectangle2D.Double(0,250,250,250));// Texture for the plant pot.
g2.setPaint(tp);

g2.setStroke(new BasicStroke(2f));

Ellipse2D ellipse = new Ellipse2D.Float(30, 369, 185, 15);
g2.fill(ellipse);

GeneralPath gp=new GeneralPath();// Path for the plant pot.

gp.moveTo(35,400);
gp.lineTo(50,500);
gp.quadTo(125,525,200,500);
gp.lineTo(210, 400);
gp.quadTo(90,410,35,400);
gp.lineTo(30,375);
gp.quadTo(122, 390, 215, 375);
gp.lineTo(210,400);

g2.fill(gp);

BufferedImage img2=null;

try{
    img2=ImageIO.read(new File("C:\\Users\\David\\Desktop\\x.jpeg"));// Texture for the plant roots.
}catch(IOException e){   
}

TexturePaint tp2=new TexturePaint(img2,new Rectangle2D.Double(0,0,250,250));

g2.setPaint(tp2);

GeneralPath gp2=new GeneralPath();// Path for the Plant roots.

gp2.moveTo(130,383);
gp2.lineTo(180,290);
gp2.lineTo(168,273);
gp2.lineTo(130,355);
gp2.lineTo(130,258);
gp2.lineTo(110,258);
gp2.lineTo(110,353);
gp2.lineTo(85,295);
gp2.lineTo(60,295);
gp2.lineTo(110,383);
gp.lineTo(130,383);
g2.fill(gp2);

BufferedImage img3=null;
try{
    img3=ImageIO.read(new File("C:\\Users\\David\\Desktop\\e.jpeg"));// Texture for the plants.
}catch(IOException e){
    
}
TexturePaint tp3=new TexturePaint(img3,new Rectangle2D.Double(-200,100,600,500));
g2.setPaint(tp3);

Ellipse2D face1=new Ellipse2D.Double(95,185,50,50);
g2.fill(face1);

QuadCurve2D m1=new QuadCurve2D.Double(107,220,120,240,135,220);
g2.draw(m1);

QuadCurve2D m2=new QuadCurve2D.Double(105,222,112,220,110,215);
g2.draw(m2);

QuadCurve2D m3=new QuadCurve2D.Double(137,222,130,220,132,215);
g2.draw(m3);

Ellipse2D fe1=new Ellipse2D.Double(110,200,7,7);
g2.fill(fe1);

Ellipse2D fe2=new Ellipse2D.Double(120,200,7,7);
g2.fill(fe2);

Ellipse2D fc1=new Ellipse2D.Double(100,140,28,50);

AffineTransform af=new AffineTransform();

af.rotate(45*Math.PI/180,148,165);
af.translate(40, 12);

Shape fc2=af.createTransformedShape(fc1);
af.rotate(60*Math.PI/180,125,190);
af.translate(15, 3);

Shape fc3=af.createTransformedShape(fc1);
af.rotate(100*Math.PI/180,135,215);
af.translate(10, 30);

Shape fc4=af.createTransformedShape(fc3);
af.rotate(105*Math.PI/180,145,240);
af.translate(-5, 75);

Shape fc5=af.createTransformedShape(fc4);
af.translate(7,-2);

Shape fc6=af.createTransformedShape(fc5);
af.translate(-3,-5);

Shape fc7=af.createTransformedShape(fc6);

Area flower=new Area(face1);
Area curve1=new Area(fc1);
Area curve2=new Area(fc2);
Area curve3=new Area(fc3);
Area curve4=new Area(fc4);
Area curve5=new Area(fc5);
Area curve6=new Area(fc6);
Area curve7=new Area(fc7);

flower.add(curve1);
flower.add(curve2);
flower.add(curve3);
flower.add(curve4);
flower.add(curve5);
flower.add(curve6);
flower.add(curve7);

g2.fill(flower);

Area f2=new Area(flower);

AffineTransform af2=new AffineTransform();

af.rotate(30*Math.PI/180.0f);
af.translate(0, -70);

Shape flower2=af.createTransformedShape(f2);
g2.fill(flower2);

af.rotate(30*Math.PI/180.0f);

Ellipse2D face2=new Ellipse2D.Double(15,230,50,50);
g2.fill(face2);

Ellipse2D f2e1=new Ellipse2D.Double(25,245,7,7);
g2.fill(f2e1);

Ellipse2D f2e2=new Ellipse2D.Double(35,240,7,7);
g2.fill(f2e2);

QuadCurve2D m1f2=new QuadCurve2D.Double(30,265,50,285,55,255);
g2.draw(m1f2);

QuadCurve2D m2f2=new QuadCurve2D.Double(30,260,33,265,27,268);
g2.draw(m2f2);

QuadCurve2D m3f2=new QuadCurve2D.Double(55,250,55,255,60,258);
g2.draw(m3f2);

Ellipse2D face3=new Ellipse2D.Double(180,220,50,50);
g2.fill(face3);

af.rotate(30*Math.PI/180.0f);
af.translate(287, -343);

Shape flower3=af.createTransformedShape(flower);

Ellipse2D f3e1=new Ellipse2D.Double(210,235,7,7);
g2.fill(f3e1);

Ellipse2D f3e2=new Ellipse2D.Double(200,230,7,7);
g2.fill(f3e2);
Area flow3=new Area(flower3);

QuadCurve2D m1f3=new QuadCurve2D.Double(190,250,200,270,215,255);
g2.draw(m1f3);

QuadCurve2D m2f3=new QuadCurve2D.Double(190,245,193,250,187,253);
g2.draw(m2f3);

QuadCurve2D m3f3=new QuadCurve2D.Double(215,252,210,260,215,260);
g2.draw(m3f3);

af2.translate(-49,-12);
Shape flow3trans=af2.createTransformedShape(flow3);
g2.fill(flow3trans);


}}



        
     
// end of JApp1Panel class
