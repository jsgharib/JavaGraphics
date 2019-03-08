package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color = Color.MAGENTA;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
                                    color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.drawRect(xPos, yPos, width, height);
      window.fillOval(xPos, yPos, width, height);
      window.drawLine(xPos, yPos+ height, xPos + width, yPos);
      window.drawLine(xPos, yPos, xPos + width, yPos + height);
      newShape1(xPos,yPos,width,height, color, window);
      newShape2(xPos,yPos,width,height, color, window);
   }
   
   public static void newShape1(int xPos, int yPos, int width, int height, Color color, Graphics window){
       xPos += 150;
       yPos += 150;
       width += 150;
       height += 150;
       color = Color.BLUE;
       
      window.setColor(color);
      window.drawRect(xPos, yPos, width, height);
      window.fillOval(xPos, yPos, width, height);
      window.drawLine(xPos, yPos+ height, xPos + width, yPos);
      window.drawLine(xPos, yPos, xPos + width, yPos + height);
   }
      public static void newShape2(int xPos, int yPos, int width, int height, Color color, Graphics window){
       xPos += 400;
       yPos += 50;
       width /= 5;
       height /= 5;
       color = Color.MAGENTA;
       
      window.setColor(color);
      window.drawRect(xPos, yPos, width, height);
      window.fillOval(xPos, yPos, width, height);
      window.drawLine(xPos, yPos+ height, xPos + width, yPos);
      window.drawLine(xPos, yPos, xPos + width, yPos + height);
   }


   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}