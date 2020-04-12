package objectOrianted;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public String toString() {
		return String.format("length=%d\nwidth=%d\narea=%d\nperamiter=%d\n",length,width,area(),perimeter());
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int area() {
		return length*width;
	}
	public int perimeter() {
		return 2 *(length + width);
	}
}
