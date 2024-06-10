# JavaProjects
Java Graphics Application

Developed a Java-based graphical application with an interactive GUI using AWT and Swing. The application features a menu-driven interface allowing users to draw and display properties of various 2D and 3D shapes, including lines, rectangles, ellipses, polygons, spheres, cubes, cones, and cylinders. Key features include:

Dynamic Shape Drawing: Users can select different shapes from the menu and input attributes to draw and display their properties. Each shape is encapsulated in its own class, such as the Polygon class.
Color Customization: Integrated a color chooser for users to select background and drawing colors.
Event Handling: Implemented action listeners and window listeners to manage user interactions, including resizing and closing the application.
Interactive UI: Created an intuitive user interface with options to display shape-specific properties such as dimensions, perimeter, area, surface area, and volume.
Object-Oriented Design: Utilized OOP principles to create shape classes (Rectangle, Line, Ellipse, Polygon, Sphere, Cube, Cone, Cylinder) encapsulating attributes and methods for calculation and display.
Example: Polygon Class
The Polygon class is a prime example of the object-oriented approach taken in this project. This class encapsulates the attributes and methods necessary for creating and manipulating a polygon shape:

Attributes:

x and y: Coordinates of the center of the polygon.
s: Number of sides.
r: Radius of the circumscribing circle.
Methods:

getAttributes(): Uses JOptionPane dialogs to gather user input for the polygon's attributes.
getX(), getY(), getS(), getR(): Getter methods for the polygon's attributes.
getSideLength(), getArea(), getPerimeter(): Methods to calculate and return the polygon's side length, area, and perimeter, respectively.
getVerticeX(double i), getVerticeY(double i): Methods to calculate the coordinates of the polygon's vertices.
User Interaction: When a user selects the "Polygon" option from the menu, they are prompted to input the necessary attributes through dialog boxes. The application then calculates and displays the polygon's properties and its graphical representation.

This project demonstrates proficiency in Java GUI development, event-driven programming, and the application of object-oriented principles to create a user-friendly graphical application.

