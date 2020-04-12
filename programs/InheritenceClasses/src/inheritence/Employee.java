package inheritence;

public class Employee extends Person {
	
	private String titleString;
	private String employeeString;
	private int employeeGrade;
	private int salary;
	
	public Employee(String name,String email,String title) {
		super(name, email);
		this.titleString = title;
	}
	
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public String getEmployeeString() {
		return employeeString;
	}
	public void setEmployeeString(String employeeString) {
		this.employeeString = employeeString;
	}
	public int getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(int employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [titleString=" + titleString + ", employeeString="
				+ employeeString + ", employeeGrade=" + employeeGrade
				+ ", salary=" + salary + ", getNameString()=" + getNameString()
				+ ", getEmailString()=" + getEmailString()
				+ ", getPhoneNumberString()=" + getPhoneNumberString() + "]";
	}
	
	
	
}
