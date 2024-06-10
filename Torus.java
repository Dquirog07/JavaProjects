import javax.swing.JOptionPane;

public class Torus
{
	private int x;
	private int y;
	private int r;
	private int R;
	
	public  Torus()
	{
		x = 0;
		y = 0;
		r = 0;
		R = 0;
	}
	public  Torus(int a,int b, int c, int d)
	{
		x = a;
		y = b;
		r = c;
		R = d;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getr()
	{
		return r;
	}
	public int getR()
	{
		return R;
	}
	public double getSurfaceArea()
	{
		return RoundDigits(4*Math.pow(Math.PI,2)*R*r);
	}
	public double getVolume()
	{
		return RoundDigits(2*Math.pow(Math.PI, 2)*R*Math.pow(r, 2));
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
			"Radius of the inner circle",JOptionPane.QUESTION_MESSAGE);
        r=Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the outer circle",JOptionPane.QUESTION_MESSAGE);
        R = Integer.parseInt(input);
        
	}
	
}//end of Torus