package arraylearn;

import java.math.BigDecimal;

public class studentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] marks = {97,98,100};
		Student student = new Student("rajan",marks);
		int number = student.getNumberOfMarks();
		System.out.println("number is= "+ number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum is= "+ sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("maximumMarks ="+maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("minimumMarks="+minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("average="+average);
		student.addNewMark(35);
		student.removeMarkAtIndex(2);
//		student.printMarks();
		System.out.println(student.toString());
	}

}
