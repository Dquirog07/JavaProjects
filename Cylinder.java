import javax.swing.JOptionPane;

public class Cylinder
{
	private int x;
	private int y;
	private int r;
	private int h;
	
	public  Cylinder()
	{
		x = 0;
		y = 0;
		r = 0;
		h = 0;
	}
	public  Cylinder(int a,int b, int c, int d)
	{
		x = a;
		y = b;
		r = c;
		h = d;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getR()
	{
		return r;
	}
	public int getH()
	{
		return h;
	}
	public double getSurfaceArea()
	{
		return  roundDigits((2*Math.PI*r*(r+h)),2);
	}
	public double getVolume()
	{
		return roundDigits((Math.PI*r*r*h),2);
	}
	public static double roundDigits(double x,int d)
	{
	return ((long)(x*Math.pow(10,d)))/Math.pow(10,d);
	}
	
	public void getAttributes()
	{
		String input;
		
	    input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"X-Coordinate of the Center",JOptionPane.QUESTION_MESSAGE);
        x=Integer.parseInt(input);
	    input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Y-Coordinate of the Center",JOptionPane.QUESTION_MESSAGE);
        y=Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Radius of the Cylinder",JOptionPane.QUESTION_MESSAGE);
        r=Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the Cylinder",JOptionPane.QUESTION_MESSAGE);
        h = Integer.parseInt(input);
        
	}
	
}//end of Cylinder

