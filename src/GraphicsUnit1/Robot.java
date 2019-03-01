package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.yellow);
      window.fillOval( 305, 50, 200, 200 );
      
      window.setColor(Color.white);
      window.fillOval( 325, 100, 50, 50 );
      window.fillOval( 425, 100, 50, 50 );
 
      window.setColor(Color.BLACK);
      window.fillOval( 330, 105, 40, 40 );
      window.fillOval( 430, 105, 40, 40 );
      window.drawArc(328, 98, 50, 50, 0,90);
      window.drawArc(423, 98, 50, 50, 90,90);
      
      window.setColor(Color.white);
      window.fillOval( 334, 109, 8, 8 );
      window.fillOval( 434, 109, 8, 8 );
      
      window.setColor(Color.BLACK);
      window.fillOval(335,175, 150,25);
      
      window.setColor(Color.yellow);
      window.fillRect(335,175, 155,15);
      
      window.setColor(Color.white);
      window.fillRect(425,190, 10,15);


		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
        window.setColor(Color.yellow);
        window.fillRect(150, 300, 500, 50);
        window.setColor(Color.CYAN);
        window.fillRect(355, 250, 100, 200);
        window.fillRect(250, 300, 300, 50);
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.black);
       window.drawLine(355,450,355,600);
       window.drawLine(455,450,455,600);

   }
}