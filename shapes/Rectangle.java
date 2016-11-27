package shapes;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle(int a, int b){
		width = a;
		height = b;
	}
	public int getArea(){
		return width * height;
	}
}