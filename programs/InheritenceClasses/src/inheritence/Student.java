package inheritence;

public class Student extends Person {
	
	private String collegeString;
	private int year;
	
	
	public String getCollegeString() {
		return collegeString;
	}
	public void setCollegeString(String collegeString) {
		this.collegeString = collegeString;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [collegeString=" + collegeString + ", year=" + year
				+ ", getNameString()=" + getNameString() + ", getEmailString()="
				+ getEmailString() + ", getPhoneNumberString()="
				+ getPhoneNumberString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
