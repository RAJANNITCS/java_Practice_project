package objectOrianted;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(1,"Object Oriented Programming with java","rajan");
		Reviews reviews = new Reviews(1,"Great Book",5);
		book.setReviews(reviews);
		System.out.println(book);
	}

}
