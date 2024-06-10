import javax.swing.JOptionPane;

public class Cube {
	private int x;
	private int y;
	private int s;
	
	public Cube() 
	{
	x = 0;
	y = 0;
	s = 0;
		
	}
	
	public Cube(int a, int b, int c, int d) 
	{
		x = a;
		y = b;
		s = c;
	}
	
	public void getAttributes() 
	{	 
   	 String userInput1 = JOptionPane.showInputDialog(null,
	    			"Please enter an integer:",
	    			"X-Coordinate of the TopLeft Corner", JOptionPane.QUESTION_MESSAGE
	    			);
   	 x = Integer.parseInt(userInput1);
   	 
   	 String userInput2 = JOptionPane.showInputDialog(null,
	    			"Please enter an integer:",
	    			"Y-Coordinate of The TopLeft Corner", JOptionPane.QUESTION_MESSAGE
	    			);
   	 y = Integer.parseInt(userInput2);
   	 
   	 String userInput3 = JOptionPane.showInputDialog(null,
	    			"Please enter an integer:",
	    			"Side of the Cube", JOptionPane.QUESTION_MESSAGE
	    			);
   	 s = Integer.parseInt(userInput3);
	}//getAttr.
	
	public int getX() 
	{
		return x;
	}//get1
	
	public int getY() 
	{
		return y;
	}//get2
	
	public int getS() 
	{
		return s;
	}//get3
	
	public double getSurface()
	{
		return RoundDigits(6*Math.pow(s, 2));
	}
	
	public double getVolume()
	{
		return RoundDigits(Math.pow(s, 3));
	}
	
	public static double RoundDigits(double input)
	{
		return (double) Math.round(input*100)/100;
	}
}