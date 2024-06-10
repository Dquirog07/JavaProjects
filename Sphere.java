import javax.swing.JOptionPane;

public class Sphere {
	private int x;
	private int y;
	private int r;
	
	public Sphere() 
	{
	x = 0;
	y = 0;
	r = 0;
		
	}
	
	public Sphere(int a, int b, int c) 
	{
		x = a;
		y = b;
		r = c;
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
	    			"Radius", JOptionPane.QUESTION_MESSAGE
	    			);
   	 r = Integer.parseInt(userInput3);
	}//getAttr.
	
	public int getX() 
	{
		return x;
	}//get1
	
	public int getY() 
	{
		return y;
	}//get2
	
	public int getR() 
	{
		return r;
	}//get3

	
	public double getSurfaceArea()
	{
		return RoundDigits(4.00*Math.PI*Math.pow(r, 2));
	}//get area
	
	public double getVolume()
	{
		return RoundDigits((4.00/3.00)*Math.PI*Math.pow(r, 3));
	}//get volume
	
	public static double RoundDigits(double input)
	{
		return (double) Math.round(input*100)/100;
	}
}
