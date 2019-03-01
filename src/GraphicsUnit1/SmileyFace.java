package GraphicsUnit1;
//Name - John Gharib
//Date - 2/27/2019
//Class - Period 1
//Lab  - Yes
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLACK);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.yellow);
      window.fillOval( 210, 100, 400, 400 );
      
      window.setColor(Color.white);
      window.fillOval( 250, 200, 100, 100 );
      
      window.fillOval( 450, 200, 100, 100 );
 
      window.setColor(Color.BLACK);
      window.fillOval( 260, 210, 80, 80 );
      
      window.fillOval( 460, 210, 80, 80 );
      
      window.drawArc(255, 195, 100, 100, 0,90);
      
      window.drawArc(445, 195, 100, 100, 90,90);
      
      window.setColor(Color.white);
      window.fillOval( 268, 218, 15, 15 );
      
      window.fillOval( 468, 218, 15, 15 );

      window.setColor(Color.BLACK);
      window.fillOval(270,350, 300,50);
      
      window.setColor(Color.yellow);
      window.fillRect(270,350, 310,30);
      
      window.setColor(Color.white);
      window.fillRect(450,380, 20,30);
   }
}