package objectOrianted;

public class Book {
	private int noOfCopy;

	public Book() {
		this.noOfCopy = 0;
	}
	public Book(int noOfCopy) {
		this.noOfCopy = noOfCopy;
	}
	public int getNoOfCopy() {
		return this.noOfCopy;
	}

	public void setNoOfCopy(int noOfCopy) {
		if(noOfCopy < 0 ) {
			this.noOfCopy = noOfCopy * -1;
		} else {
			this.noOfCopy = noOfCopy;
		}
	}
	public void incriseBookCopy(int howMuch) {
		if(howMuch > 0 ) {
			setNoOfCopy(getNoOfCopy()+howMuch);
		} else {
			System.out.println("invalide entry");
		}
	}
}
