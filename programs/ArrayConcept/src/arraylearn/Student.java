package arraylearn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<>();

	public Student(String name, int[] marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return this.marks.size();
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
		return Collections.max(marks);
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0 ;
		for(int i : marks) {
			sum += i;
		}
		return sum;
	}
//	
//
	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum = getTotalSumOfMarks();
		int num = getNumberOfMarks();
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(num),3,RoundingMode.UP);
		return average;
	}

	public int getMinimumMark() {
		// TODO Auto-generated method stub
		return Collections.min(marks);
	}

	public void addNewMark(int i) {
		// TODO Auto-generated method stub
		this.marks.add(i);
		
	}

	public void removeMarkAtIndex(int i) {
		// TODO Auto-generated method stub
		this.marks.remove(i);
		
	}
	public String toString() {
		return name + marks;
	}

//	public void printMarks() {
//		// TODO Auto-generated method stub
//		for(int i:marks) {
//			System.out.println(i);
//		}
//		
//	}
	

}
