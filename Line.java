import javax.swing.JOptionPane;

public class Line 
{

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Line()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	
	public Line(int a, int b, int c, int d) //arg
	{
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
	}
	
	public void getAttributes() //no arguments
	{
	 String input;
   	 input = JOptionPane.showInputDialog(null,
   	"Please Enter the X-Coordinate of the First Point (INTEGER)",
   	"X (Start Point of Line)", JOptionPane.QUESTION_MESSAGE
   			);
   	 x1 = Integer.parseInt(input);
   	 
   	 input = JOptionPane.showInputDialog(null,
   	"Please Enter the Y-Coordinate of the First Point (INTEGER)",
   	"Y (Start Point of Line)", JOptionPane.QUESTION_MESSAGE
   			);
   	 y1 = Integer.parseInt(input);
   	 
   	input = JOptionPane.showInputDialog(null,
   	"Please Enter the X-Coordinate of the Second Point (INTEGER)",
   	"X (End Point of Line)", JOptionPane.QUESTION_MESSAGE
   			);
   	 x2 = Integer.parseInt(input);
   	 
   	input = JOptionPane.showInputDialog(null,
   	"Please Enter the Y-Coordinate of the Second Point (INTEGER)",
   	"Y (End Point of Line)", JOptionPane.QUESTION_MESSAGE
   			);
   	 y2 = Integer.parseInt(input);
	}
	
	public int getX1()
	{
		return x1;
	}
	
	public int getY1()
	{
		return y1;
	}
	
	public int getX2()
	{
		return x2;
	}
	
	public int getY2()
	{
		return y2;
	}
	
	public double getLength()
	{
		double pt1 = x2 - x1;
		double pt2 = y2 - y1;
		double length = Math.sqrt(Math.pow(pt1,2)+Math.pow(pt2,2));
		return RoundDigits(length);
	}//getlength()
	
	public static double RoundDigits(double input)
	{
		return (double) Math.round(input*100)/100;
	}

}