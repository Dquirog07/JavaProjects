import javax.swing.JOptionPane;

public class Cone
{
	private int x;
	private int y;
	private int r;
	private int h;
	
	public  Cone()
	{
		x = 0;
		y = 0;
		r = 0;
		h = 0;
	}
	public  Cone(int a,int b, int c, int d)
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
		return RoundDigits(Math.PI*r*(r+Math.sqrt(Math.pow(h, 2)+Math.pow(r, 2))));
	}
	public double getVolume()
	{
		return RoundDigits(Math.PI*Math.pow(r, 2)*h/3);
	}
	public static double RoundDigits(double input)
	{
		return (double) Math.round(input*100)/100;
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
			"Radius of the Cone",JOptionPane.QUESTION_MESSAGE);
        r=Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the Cone",JOptionPane.QUESTION_MESSAGE);
        h = Integer.parseInt(input);
        
	}
	
}//end of Cone