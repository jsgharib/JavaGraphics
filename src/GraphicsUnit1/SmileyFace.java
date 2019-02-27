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

      window.setColor(Color.GREEN);
      window.fillOval( 210, 100, 400, 400 );
      
      window.setColor(Color.white);
      window.fillOval( 250, 200, 100, 100 );
      
      window.setColor(Color.white);
      window.fillOval( 450, 200, 100, 100 );
 
      window.setColor(Color.black);
      window.fillOval( 260, 210, 80, 80 );
      
      window.setColor(Color.black);
      window.fillOval( 460, 210, 80, 80 );
      
      window.setColor(Color.white);
      window.fillOval( 260, 210, 10, 10 );
      
      window.setColor(Color.white);
      window.fillOval( 470, 220, 10, 10 );


   }
}