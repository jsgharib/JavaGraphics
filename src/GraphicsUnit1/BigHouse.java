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

public class BigHouse extends Canvas
{
   public BigHouse(){  //constructor - sets up the class
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window ){
    bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );
      
      window.setColor(Color.black);
      window.fillRect(175, 100, 50, 100);
      window.fillOval(150, 150, 500, 100);

      window.setColor(Color.red);

      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.black);
      window.fillRect(175, 100, 50, 100);
      window.fillRect(250, 250, 25, 100);
      window.fillRect(465, 250, 25, 100);
      window.fillRect(505, 250, 25, 100);
      window.fillRect(250, 450, 25, 100);
      window.fillRect(300, 475, 25, 75);
      window.fillRect(465, 450, 25, 100);
      window.fillRect(505, 500, 75, 25);
      
      window.setColor(Color.white);
      window.fillRect(375,450,50,125);

   }
}