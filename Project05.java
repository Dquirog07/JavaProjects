import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Color;


public class Project05 extends Frame implements ActionListener
{
	//  Objects
	String command = "";
	Rectangle r; Line l; Ellipse e; Polygon p; Sphere s; Cube cu; Cone co; Cylinder cy;

	// Colors
	JColorChooser colorChooser = new JColorChooser();
	Color backgroundColor = new Color(0,0,0);
	Color foregroundColor = new Color(255,255,255);
		
	public static void main(String[] args)
	{
		Frame frame = new Project05();	
		frame.setResizable(true);
		frame.setSize(1000,840);
		frame.setVisible(true);
		
	}
	
	public Project05()
	{
		setTitle("Graphics - Quiroga");
		
		// Create Menu
		   			
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		Menu fileMenu = new Menu("File");
		mb.add(fileMenu);
		
		MenuItem miAbout = new MenuItem("About");
		miAbout.addActionListener(this);
		fileMenu.add(miAbout);
		
		MenuItem miColor = new MenuItem("Color");
		miColor.addActionListener(this);
		fileMenu.add(miColor);
		
		MenuItem miExit = new MenuItem("Exit");
		miExit.addActionListener(this);
		fileMenu.add(miExit);
		// 2D Shapes menu
		
		Menu twoDMenu = new Menu("2D Shapes");
		mb.add(twoDMenu);
		
		MenuItem miLine = new MenuItem("Line");
		miLine.addActionListener(this);
		twoDMenu.add(miLine);
		
		MenuItem miRectangle = new MenuItem("Rectangle");
		miRectangle.addActionListener(this);
		twoDMenu.add(miRectangle);
		
		MenuItem miEllipse = new MenuItem("Ellipse");
		miEllipse.addActionListener(this);
		twoDMenu.add(miEllipse);
		
		MenuItem miPolygon = new MenuItem("Polygon");
		miPolygon.addActionListener(this);
		twoDMenu.add(miPolygon);

	
		
		// 3D Shapes Menu
		
		Menu threeDMenu = new Menu("3D Shapes");
		mb.add(threeDMenu);
		
		MenuItem miSphere = new MenuItem("Sphere");
		miSphere.addActionListener(this);
		threeDMenu.add(miSphere);
		
		MenuItem miCube = new MenuItem("Cube");
		miCube.addActionListener(this);
		threeDMenu.add(miCube);
		
		MenuItem miCone = new MenuItem("Cone");
		miCone.addActionListener(this);
		threeDMenu.add(miCone);
		
		MenuItem miCylinder = new MenuItem("Cylinder");
		miCylinder.addActionListener(this);
		threeDMenu.add(miCylinder);
		// End program when window is closed
		
		WindowListener l = new WindowAdapter()
		{
						
			// window closed - exit program						
						public void windowClosing(WindowEvent ev)
						{
							System.exit(0);
						}
						// menu option selected - go to redraw and display method
						public void listener(WindowEvent ev)
						{
							repaint();
						}
						// window resized or refocused - redraw
						public void windowStateChanged(WindowEvent ev)
						{
							repaint();
						}
		
		};
		
		ComponentListener k = new ComponentAdapter()
		{
			public void componentResized(ComponentEvent e) 
			{
        		repaint();           
    		}
		};
		
		// register listeners
			
		this.addWindowListener(l);
		this.addComponentListener(k);

	}
	
//******************************************************************************
//  called by windows manager whenever the application window performs an action
//  (select a menu item, close, resize, ....
//******************************************************************************

public void actionPerformed (ActionEvent ev)
	{
	// figure out which command was issued
	
	command = ev.getActionCommand();
	
	// take action accordingly
	switch (command)
	{
	case "About":
	{
		repaint();
		break;
	}
	case "Exit":
	{
		System.exit(0);
	}
	case "Color":
	{
		backgroundColor = JColorChooser.showDialog(
									                     null,
									                     "Choose Background Color",
									                     colorChooser.getBackground());

		foregroundColor = JColorChooser.showDialog(
									                     null,
									                     "Choose Drawing Color",
									                     colorChooser.getBackground());
		repaint();
		break;
	}
	case "Rectangle":
	{
		r = new Rectangle();
		r.getAttributes();
		repaint();
		
		break;
	}
	case "Line":
	{
		l = new Line();
		l.getAttributes();
		repaint();
		
		break;
	}
	
	case "Ellipse":
	{
		e = new Ellipse();
		e.getAttributes();
		repaint();
		
		break;
	}
	
	case "Polygon":
	{
		p = new Polygon();
		p.getAttributes();
		repaint();
		break;
	}
	
	case "Sphere":
	{
		s = new Sphere();
		s.getAttributes();
		repaint();
		
		break;
	}
	
	case "Cube":
	{
		cu = new Cube();
		cu.getAttributes();
		repaint();
		
		break;
	}
	
	case "Cone":
	{
		co = new Cone();
		co.getAttributes();
		repaint();
		
		break;
	}
	
	case "Cylinder":
	{
		cy = new Cylinder();
		cy.getAttributes();
		repaint();
		
		break;
	}
	}//switch
}//action performed
//********************************************************
// called by repaint() to redraw the screen
//********************************************************
		
public void paint(Graphics g)
{
	
	// Check Command issued, take action accordingly
	switch(command)
	{
	case "About":
	{
		g.drawString(" Geometric Shapes",400, 100);
		g.drawLine (350,120, 550,120);
		g.drawString(" This program supports the entry of values of primary attributes and calculation of secondary " , 200, 140);
		g.drawString(" attributes (sides, angels, perimeter, area, surface, volume of the following shapes: " , 200, 160);
		
		g.drawString(" 1.      Line", 400, 200);
		g.drawString(" 2.      Rectangle", 400, 220);
		g.drawString(" 3.      Ellipse", 400, 240);
		g.drawString(" 4.      Regular Polygon", 400, 260);
		g.drawString(" 5.      Sphere", 400, 280);
		g.drawString(" 6.      Cube", 400, 300);
		break;
	}
	case "Color":
	{
		this.setBackground(backgroundColor);
		this.setForeground(foregroundColor);
		break;	
	}
	case "Rectangle":
	{
		g.drawString("Rectangle Properties", 110,105);
		g.drawLine(75, 120, 255, 120);
		g.drawString("TopLeft Corner", 85,140);
		g.drawString("= ("+ r.getxTopLeft()+","+r.getyTopLeft()+")", 170,140);
		g.drawString("Width", 85,160);
		g.drawString("= "+ r.getWidth(), 170,160);
		g.drawString("Height", 85,180);
		g.drawString("= "+ r.getHeight(), 170,180);
		g.drawString("Perimeter", 85,200);
		g.drawString("= "+ r.getPerimeter(), 170,200);
		g.drawString("Area", 85,220);
		g.drawString("= "+ r.getArea(), 170,220);
		g.drawRect(70,80,190,150);
		g.drawRect(r.getxTopLeft(), r.getyTopLeft(), r.getWidth(), r.getHeight());
		g.drawString("("+r.getxTopLeft()+","+r.getyTopLeft() +")", r.getxTopLeft()-10, r.getyTopLeft()-10);
		g.drawString(""+r.getWidth(), (r.getWidth()/2)+r.getxTopLeft(), r.getyTopLeft()-10);
		g.drawString(""+r.getHeight(), (r.getxTopLeft())-30, (r.getHeight()/2)+r.getyTopLeft());
		break;
	}
	case "Line":
	{
		g.drawString("Line Properties", 120, 105);
		g.drawLine(75, 120, 255, 120);
		g.drawString("First Point", 85,140);
		g.drawString("= ("+ l.getX1()+","+l.getY1()+")", 170,140);
		g.drawString("Second Point", 85,160);
		g.drawString("= ("+ l.getX2()+","+l.getY2()+")", 170,160);
		g.drawString("Length", 85,180);
		g.drawString("= "+ l.getLength(), 170,180);
		g.drawRect(70,80,190,110);
		g.drawLine(l.getX1(), l.getY1(), l.getX2(), l.getY2());
		g.drawString("("+ l.getX1() +","+ l.getY1() + ")", l.getX1(), l.getY1());
		g.drawString(""+l.getLength(),(l.getX1()+l.getX2())/2,(l.getY1()+l.getY2())/2 );
		g.drawString("("+ l.getX2() +","+ l.getY2() + ")", l.getX2(), l.getY2());
		break;
	}
	
	case "Ellipse":
	{
		g.drawString("Ellipse Properties", 120, 105);
		g.drawLine(75, 120, 255, 120);
		g.drawString("Top Left Corner", 85,140);
		g.drawString("= ("+ e.getX()+","+e.getY()+")", 170,140);
		g.drawString("Width", 85,160);
		g.drawString("= "+ e.getW(), 170,160);
		g.drawString("Height", 85,180);
		g.drawString("= "+ e.getH(), 170,180);
		g.drawString("Perimeter", 85,200);
		g.drawString("= "+ e.getPerimeter(), 170,200);
		g.drawString("Area", 85,220);
		g.drawString("= "+ e.getArea(), 170,220);
		g.drawRect(70,80,190,150);
		g.drawOval(e.getX(), e.getY(), e.getW(), e.getH());
		g.drawString("" + e.getH(), e.getX()+(e.getW()/2)+10, e.getY()+(e.getW()/2));
		g.drawString("" + e.getW(), e.getX()+e.getW()-30, e.getY()+(e.getH()/2)-10);
		g.drawString("(" + e.getX() + "," + e.getY() + ")", e.getX()+5, e.getY()+(e.getH()/2)+15);
		g.drawLine(e.getX()+(e.getW()/2), e.getY()+e.getH(),e.getX()+(e.getW()/2), e.getY());
		g.drawLine(e.getX(), e.getY()+(e.getH()/2),e.getX()+e.getW(), e.getY()+(e.getH()/2));
		break;
	}
	case "Sphere":
	{
		g.drawString("Sphere Properties", 115, 105);
		g.drawLine(75, 120, 255, 120);
		g.drawString("Center", 85,140);
		g.drawString("= ("+ s.getX()+","+s.getY()+")", 150,140);
		g.drawString("Radius", 85,160);
		g.drawString("= "+ s.getR(), 150,160);
		g.drawString("Surface", 85,180);
		g.drawString("= "+ s.getSurfaceArea(), 150,180);
		g.drawString("Volume", 85,200);
		g.drawString("= "+ s.getVolume(), 150,200);
		g.drawRect(70,80,190,130);
		g.drawOval(s.getX(), s.getY(), (int)(s.getR()*Math.PI)/2, (int)(s.getR()*Math.PI)/2);
		g.drawOval(s.getX(), s.getY()+((int)(s.getR()*Math.PI)/3)/2, (int)(s.getR()*Math.PI)/2, s.getR()/2);
		g.drawString("(" + s.getX()+","+s.getY()+")", s.getX()+((int)(s.getR()*Math.PI)/2)/3, s.getY()+((int)(s.getR()*Math.PI)/2)/2+15);
		g.drawString("" + s.getR(), s.getX()+((int)(s.getR()*Math.PI)/2)/4-15, s.getY()+s.getR()/2+20);
		g.drawLine(s.getX(), s.getY()+((int)(s.getR()*Math.PI)/4),s.getX()+s.getR()-20, s.getY()+((int)(s.getR()*Math.PI)/4));
		break;
	}
	case "Cube":
	{
		g.drawString("Cube Properties", 120,105);
		g.drawLine(75, 120, 255, 120);
		g.drawString("Top Left Corner", 85,140);
		g.drawString("= ("+ cu.getX()+","+cu.getY()+")", 175,140);
		g.drawString("Side", 85,160);
		g.drawString("= "+ cu.getS(), 175,160);
		g.drawString("Surface", 85,180);
		g.drawString("= "+ cu.getSurface(), 175,180);
		g.drawString("Volume", 85,200);
		g.drawString("= "+ cu.getVolume(), 175,200);
		g.drawRect(70,80,190,130);
		g.drawRect(cu.getX(), cu.getY(), cu.getS(), cu.getS());
		g.drawLine(cu.getX(), cu.getY(), cu.getX()+(cu.getS()/4), cu.getY()-(cu.getS()/4));
		g.drawLine(cu.getX()+(cu.getS()/4), cu.getY()-(cu.getS()/4), cu.getX()+cu.getS()+(cu.getS()/4), cu.getY()-(cu.getS()/4));
		g.drawLine(cu.getX()+cu.getS()+(cu.getS()/4), cu.getY()-(cu.getS()/4),cu.getX()+cu.getS(),cu.getY());
		g.drawLine(cu.getX()+cu.getS()+(cu.getS()/4), cu.getY()-(cu.getS()/4),cu.getX()+cu.getS()+(cu.getS()/4),cu.getY()+cu.getS()-(cu.getS()/3));
		g.drawLine(cu.getX()+cu.getS()+(cu.getS()/4),cu.getY()+cu.getS()-(cu.getS()/3),cu.getX()+cu.getS(),cu.getY()+cu.getS());
		g.drawString("( " + cu.getX() + "," + cu.getY() + " )", cu.getX()-20, cu.getY()-10);
		g.drawString("" + cu.getS(), cu.getX()-25, cu.getY()+(cu.getS()/2));
		break;
	}
	
	case "Polygon":
	{
		int sides = (p.getS()*20);
		g.drawString("Polygon Properties", 115,105);
		g.drawLine(75, 120, 255, 120);
		g.drawString("Center Point", 85,140);
		g.drawString("= ("+ p.getX()+","+p.getY()+")", 170,140);
		g.drawString("Radius", 85,160);
		g.drawString("= "+ p.getR(), 170,160);
		g.drawString("# Sides", 85,180);
		g.drawString("= "+ p.getS(), 170,180);
		g.drawLine(75, 190, 240, 190);
		g.drawString("Vertices", 130,210);
		g.drawLine(75, 220, 240, 220);
		g.drawRect(70,80,190,(sides+220));
		g.drawLine(75, sides+230, 240, sides+230);
		g.drawString("Side", 85,sides+250);
		g.drawString("= "+ p.getSideLength(), 170,sides+250);
		g.drawString("Perimeter", 85,sides+270);
		g.drawString("= "+ p.getPerimeter(), 170,sides+270);
		g.drawString("Area", 85,sides+290);
		g.drawString("= "+ p.getArea(), 170,sides+290);
		g.drawLine(p.getX(), p.getY(), p.getX()+p.getR(), p.getY());
		g.drawString("( "+ p.getX()+ "," + p.getY() + ")", p.getX()-20,p.getY()+20);
		g.drawString("" + p.getR(), p.getX()+40,p.getY()-20);
		g.drawString("" + p.getSideLength(), p.getX()+85,p.getY()-50);
		int pos = 220;
		for (double i=0 ; i < p.getS(); i++) {
			g.drawString("Point " + (int)(i+1) + " = (" + p.getVerticeX(i) + "," + p.getVerticeY(i) + ")", 85,pos = pos+20);	
			g.drawLine(p.getVerticeX(i), p.getVerticeY(i), p.getVerticeX(i-1),p.getVerticeY(i-1) );
		}
		
		break;
		
	}
	
	case "Cylinder":
	{
		g.drawString("Cylinder Properties",110,105);
		g.drawLine(75, 120, 255, 120);
		g.drawString("Center", 85,140);
		g.drawString("= ("+ cy.getX()+","+cy.getY()+")", 150,140);
		g.drawString("Radius", 85,160);
		g.drawString("= "+ cy.getR(), 150,160);
		g.drawString("Height", 85,180);
		g.drawString("= "+ cy.getH(), 150,180);
		g.drawString("Surface", 85,200);
		g.drawString("= "+ cy.getSurfaceArea(), 150,200);
		g.drawString("Volume", 85,220);
		g.drawString("= "+ cy.getVolume(), 150,220);
		g.drawRect(70,80,190,150);
		g.drawOval(cy.getX(), cy.getY(), cy.getR()*2, 30);
		g.drawOval(cy.getX(), cy.getY()+cy.getH(), cy.getR()*2, 30);
		g.drawLine(cy.getX(),cy.getY()+15,cy.getX(),cy.getY()+cy.getH()+15);
		g.drawLine(cy.getX()+cy.getR()*2,cy.getY()+15,cy.getX()+cy.getR()*2,cy.getY()+cy.getH()+15);
		g.drawLine(cy.getX()+cy.getR(),cy.getY()+cy.getH()+15, cy.getX()+cy.getR()*2,cy.getY()+cy.getH()+15);
		g.drawLine(cy.getX()+cy.getR(), cy.getY()+15, cy.getX()+cy.getR(), cy.getY()+cy.getH()+15);
		g.drawString(""+cy.getH(), cy.getX()+cy.getR(), cy.getY()+cy.getH()/2);
		g.drawString(""+cy.getR(), cy.getX()+cy.getR()*6/4, cy.getY()+cy.getH());
		break;
	}
	
	case "Cone":
	{
		g.drawString("Cone Properties",125,105);
		g.drawLine(75, 120, 255, 120);
		g.drawString("Center", 85,140);
		g.drawString("= ("+ co.getX()+","+co.getY()+")", 150,140);
		g.drawString("Radius", 85,160);
		g.drawString("= "+ co.getR(), 150,160);
		g.drawString("Height", 85,180);
		g.drawString("= "+ co.getH(), 150,180);
		g.drawString("Surface", 85,200);
		g.drawString("= "+ co.getSurfaceArea(), 150,200);
		g.drawString("Volume", 85,220);
		g.drawString("= "+ co.getVolume(), 150,220);
		g.drawRect(70,80,190,150);
		g.drawOval(co.getX(), co.getY(), co.getR()*2, co.getR()/4);
		g.drawLine(co.getX(), co.getY()+(co.getR()/8), co.getX()+co.getR(), co.getY()+(co.getR()/8)-co.getH());
		g.drawLine(co.getX()+co.getR(), co.getY()+(co.getR()/8)-co.getH(),co.getX()+co.getR()*2,co.getY()+(co.getR()/8));
		g.drawLine(co.getX()+co.getR(), co.getY()+(co.getR()/8)-co.getH(),co.getX()+co.getR(),co.getY()+(co.getR()/8));
		g.drawLine(co.getX()+co.getR(),co.getY()+(co.getR()/8),co.getX()+co.getR()*2,co.getY()+(co.getR()/8));
		g.drawString(""+ co.getR(), co.getX()+co.getR()+(co.getR()/2),co.getY()+(co.getR()/8)-5);
		g.drawString(""+co.getH(), (co.getX()+co.getR())+10, co.getY()+(co.getR()/8)-co.getH()+(co.getH()/2));
		break;
	}
	}//switch
}//paint
		
}
