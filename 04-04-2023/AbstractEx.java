/* "Create an abstract class called "Shape" with an abstract method called "calculateArea". 
Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and implement
 the "calculateArea" method. Create objects of both the Circle and Rectangle classes and call their respective "calculateArea" methods. */
abstract class Shape    // creat a abstract shape calss
{
	abstract void calculateArea();  //diclear a abstract calculateArea() method
}
class Circle extends Shape   //creat a circle class and extands shape
{
	void calculateArea()  // implement calculateAre() mathod for circle class
	{
		double area,r;
		r=10;
		area=3.14*r*r;
		System.out.println("Area of Circle :"+area);
	}
}
class MRectangle extends Shape   //creat a MRectangle class and extands shape
{
	void calculateArea()  //implement calculateAre() mathod for MRectangle class
	{
		double area1,l,b;
		l=10;
		b=5;
		area1=(l*b);
		System.out.println("Area of Rectangle :"+area1);
		
	}
}
public class AbstractEx {  // creat a main class

	public static void main(String[] args) {  // creata main method
		Circle c=new Circle();  // creat an object for circle class
		c.calculateArea();   // call calculateAre() method for Circle class.
		MRectangle r=new MRectangle();// creat an object for MRectangle class
        r.calculateArea();  // call calculateAre() method for MRectangle class.
	}

}
