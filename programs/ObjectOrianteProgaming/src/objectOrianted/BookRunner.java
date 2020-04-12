package objectOrianted;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputerPrograming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		artOfComputerPrograming.setNoOfCopy(39);
		effectiveJava.setNoOfCopy(50);
		cleanCode.setNoOfCopy(20);
		artOfComputerPrograming.incriseBookCopy(5);
		effectiveJava.incriseBookCopy(8);
		cleanCode.incriseBookCopy(3);
		System.out.println(artOfComputerPrograming.getNoOfCopy());
		System.out.println(effectiveJava.getNoOfCopy());
		System.out.println(cleanCode.getNoOfCopy());
	}
}
