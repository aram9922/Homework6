import shapes.*;
import utils.Math;

class Driver{
	public static void main(String[ ] args) {
		
		double n = 15.6;
		
		Square square = new Square(100);
		Rectangle rectangle = new Rectangle(50,80);
		
		System.out.println(square.getArea());
		System.out.println(rectangle.getArea());
		System.out.println("factorial with recursion: "+Math.factorial((int) n));
		System.out.println("factorial with loop: "+Math.factorialLoop((int) n));
	}
}