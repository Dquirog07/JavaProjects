import javax.swing.JOptionPane;

public class Ellipse 
{
		private int x;
		private int y;
		private int w;
		private int h;
		
		public Ellipse() 
		{
		x = 0;
		y = 0;
	    w = 0;
		h = 0;
			
		}
		
		public Ellipse(int a, int b, int c, int d) 
		{
			x = a;
			y = b;
			w = c;
			h = d;
		}
		
		public void getAttributes()
		{
	    	 String userInput1 = JOptionPane.showInputDialog(null,
		    			"Please enter an integer:",
		    			"Top Left X Corner of Ellipse", JOptionPane.QUESTION_MESSAGE
		    			);
	    	 x = Integer.parseInt(userInput1);
	    	 
	    	 String userInput2 = JOptionPane.showInputDialog(null,
		    			"Please enter an integer:",
		    			"Top Left Y Corner of Ellipse", JOptionPane.QUESTION_MESSAGE
		    			);
	    	 y = Integer.parseInt(userInput2);
	    	 
	    	 String userInput3 = JOptionPane.showInputDialog(null,
		    			"Please enter an integer:",
		    			"Width of the Ellipse", JOptionPane.QUESTION_MESSAGE
		    			);
	    	 w = Integer.parseInt(userInput3);
	    	 
	    	 String userInput4 = JOptionPane.showInputDialog(null,
		    			"Please enter an integer:",
		    			"Height of the Ellipse", JOptionPane.QUESTION_MESSAGE
		    			);
	    	 h = Integer.parseInt(userInput4);
		}//getAttr.
		
		public int getX() 
		{
			return x;
		}//get1
		
		public int getY() 
		{
			return y;
		}//get2
		
		public int getW() 
		{
			return w;
		}//get3
		
		public int getH() 
		{
			return h;
		}//get4
		
		public double getPerimeter()
		{
			double a = w/2.00, b = h/2.00;
			return RoundDigits(Math.PI*((3.00*(a+b))-Math.sqrt((3.00*a+b)*(a+3.00*b)))); 
		}//get perimeter
		
		public double getArea()
		{
			double area = Math.PI*(w/2.00)*(h/2.00);
			return RoundDigits(area);
		}//get area
		
		public static double RoundDigits(double input)
		{
			return (double) Math.round(input*100)/100;
		}
		
	
}//class
