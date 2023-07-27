/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.Random;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.Calendar;

/**
 *
 * @author eid.emary
 */
public class CircleAnimation extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setTitle("hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applete =new CircleAnimation();
        applete.init();
        frame.getContentPane().add(applete);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void init(){
        JPanel panel=new JApp1Panel();
        getContentPane().add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class JApp1Panel extends JPanel implements ActionListener{
    int r1=150;
    int n=0;
    Timer time=new Timer(40,this);
    AffineTransform af=new AffineTransform();
public JApp1Panel(){
   setPreferredSize(new Dimension(1440,1080));
   time.start();
    
    setPreferredSize(new Dimension(1440,1080));
    setBackground(Color.gray);
        setPreferredSize(new Dimension(1440,1080));
    setBackground(Color.white);
}
   @Override
  public void actionPerformed(ActionEvent e) {
    if (n<=40){
        n+=1;
        
    } else {
        n=0;
    }
    repaint();
  }
  
  @Override
  public void paintComponent(Graphics g){
super.paintComponent(g);
Graphics2D g2=(Graphics2D) g;
g2.translate(300,300);
int x1=(int) r1;int y1=0;
int x0=(int) r1;int y0=0;
int x2;int y2;
for (int i=0;i<n;i++){
    double t=i/(Math.PI*2);
    x2= (int) ((r1)* Math.cos(t));
    y2= (int) ((r1)*(Math.sin(t)));
    g2.drawLine(x1,y1,x2,y2);
    x1=x2;y1=y2;
}
g2.drawLine(x0,y0,x1,y1);
g2.fillOval(x1, y1, 30, 30);


  }


}// end of JApp1Panel class
