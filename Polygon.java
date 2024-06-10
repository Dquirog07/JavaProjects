import javax.swing.JOptionPane;



public class Polygon {
	private int x;
	private int y;
	private int s;
	private int r;
	
	
	public Polygon() 
	{
	x = 0;
	y = 0;
	s = 0;
	r = 0;
		
	}
	
	public Polygon(int a, int b, int c, int d) 
	{
		x = a;
		y = b;
		s = c;
		r = d;

	}
	
	public void getAttributes() 
	{
   	 String userInput1 = JOptionPane.showInputDialog(null,
	    			"Please enter an integer:",
	    			"X-Coordinate of the Center", JOptionPane.QUESTION_MESSAGE
	    			);
   	 x = Integer.parseInt(userInput1);
   	 
   	 String userInput2 = JOptionPane.showInputDialog(null,
	    			"Please enter an integer:",
	    			"Y-Coordinate of the Center", JOptionPane.QUESTION_MESSAGE
	    			);
   	 y = Integer.parseInt(userInput2);
   	 
   	 String userInput3 = JOptionPane.showInputDialog(null,
	    			"Please enter an integer:",
	    			"Number of Sides", JOptionPane.QUESTION_MESSAGE
	    			);
   	 s = Integer.parseInt(userInput3);
   	 
   	 String userInput4 = JOptionPane.showInputDialog(null,
	    			"Please enter an integer:",
	    			"Radius of Bouncing Circle", JOptionPane.QUESTION_MESSAGE
	    			);
   	 r = Integer.parseInt(userInput4);
   	 
	}//getAttr.
	
	public int getX() 
	{
		return x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public int getS() 
	{
		return s;
	}
	
	public int getR() 
	{
		return r;
	}
	
	public double getSideLength()
	{
		return RoundDigits(getPerimeter()/s);
	}//Side Length

	public double getArea()
	{
		return RoundDigits(.50*s*Math.pow(r, 2)*Math.sin(2*Math.PI/s));
	}//Area
	
	public double getPerimeter()
	{
		return RoundDigits(2*s*r*Math.sin(Math.PI/s));
	}//Perimeter
	
	public static double RoundDigits(double input)
	{
		return (double) Math.round(input*100)/100;
	}
	
	
	public int getVerticeX(double i)
	{
			double x = (Math.cos(i/this.getS()*(2*Math.PI)))*this.getR()+this.getX();
			
		return (int)x;

	}
	
	public int getVerticeY(double i)
	{		
			double y = (Math.sin(-i/this.getS()*(2*Math.PI)))*this.getR()+this.getY();

		return (int)y;

	}
	

}
