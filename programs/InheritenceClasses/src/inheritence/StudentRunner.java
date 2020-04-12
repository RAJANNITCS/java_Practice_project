package inheritence;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();
		student.setNameString("rajan");
		student.setEmailString("rajan.nit.cs@gmail.com");
		student.setPhoneNumberString("8808020941");
		student.setCollegeString("Nit Durgapur");
		student.setYear(2019);
		System.out.println(student);	
		Person person = new Person();
		System.out.println(person);
	}

}
