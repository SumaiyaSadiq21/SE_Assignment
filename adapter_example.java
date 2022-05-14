package creational.pattern;

interface Shape
{
	void draw();
}


class Circle implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a circle drawn");
	 }
}


class Square implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a square drawn");
	 }
}

class Rectangle implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a rectangle drawn");
	 }
}


class ShapeFactory
{
 
	 public Shape getShape(String type) throws Exception
	 {
		 switch (type)
		 {
			 case "Circle":
				 return new Circle();
			 case "Square":
				 return new Square();
			 case "Rectangle":
				 return new Rectangle();
			 default:
				 throw new Exception( "Shape type : "+type+" cannot be instantiated");
		 }
	 }
}

class Painter
{
	 public static void main(String[] args) throws Exception
	 {
		 
		 ShapeFactory shapeFactory = new ShapeFactory();
		 Shape circle=shapeFactory.getShape("Circle");
		 circle.draw();
		 Shape square = shapeFactory.getShape("Square");
		 square.draw();
		 
		 Shape rombus = shapeFactory.getShape("Rombus");
		 rombus.draw();
	 }
}package structural;


class Rectangle
{
	public double l;
	public double w;
	public Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}


}


class Triangle
{
	public double b;//base
	public double h;//height

	public Triangle(int b, int h)
	{
		this.b = b;
		this.h = h;
	}
}

class Calculator
{
	Rectangle rectangle;
	 public double getArea(Rectangle r)
	 {
		 rectangle=r;
		 return rectangle.l * rectangle.w;
	 }
}


class CalculatorAdapter
{

	Calculator calculator;
	Triangle triangle;

	 public double getArea(Triangle t)
	 {
		 calculator = new Calculator();
		 triangle=t;

		 //Area of Triangle=0.5*base*height
		 double l = triangle.b;
		 double w = 0.5*triangle.h;

		 Rectangle r = new Rectangle(l,w);
		 return calculator.getArea(r);
	 }

}

class Client
{
	 public static void main(String[] args)
	 {
		 System.out.println("***Adapter Pattern Demo***");
		 CalculatorAdapter cal=new CalculatorAdapter();

		 Triangle t = new Triangle(20,10);
		 System.out.println("\nAdapter Pattern Example\n");
		 System.out.println("Area of Triangle is :" + cal.getArea(t));
	 }

}

public class HelloWorld {
    public static void main(String[] args) {
     System.out.println("Hello World");
    }
}

