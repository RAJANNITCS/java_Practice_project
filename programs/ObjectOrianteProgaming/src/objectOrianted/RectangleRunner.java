package objectOrianted;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(12,13);
		System.out.println(rectangle);
		rectangle.setLength(34);
		rectangle.setWidth(21);
		System.out.println(rectangle);
	}

}
