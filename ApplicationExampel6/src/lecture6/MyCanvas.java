package lecture6;
import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends JComponent {
	int x = 0;
	int y = 0;
	
	@Override
		protected void paintComponent(Graphics g){

		int w = getWidth()/2;
		int h = getHeight()/2;
		
		g.setColor(Color.BLUE); // decide the color of the lines of the rectangle
		g.drawRect(x, y, w, h); // decide the size of your rectangle, drawn
		g.fillRect(x,y,getWidth()/3,getHeight()/3); // drawing a filled Rectangle
		
		g.setColor(Color.ORANGE); // changes the color of next object to ORANGE
		g.drawOval(x, y, w, h); // Draws a circle
		
		g.setColor(Color.RED);
		g.drawString("this is my canvas",50,150);
		
	}
	
	public void setNewPosition(int x, int y){
		this.x = x; //this equals the instant variable outside of this function
		this.y = y; //this equals the instant variable outside of this function
	
		
	}
	
}
