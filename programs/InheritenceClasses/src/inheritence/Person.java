package inheritence;

public class Person extends Object{
	private String nameString;
	private String emailString;
	private String phoneNumberString;
	
	public Person(String name,String email) {
		super();
		this.nameString = name;
		this.emailString = email;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public String getPhoneNumberString() {
		return phoneNumberString;
	}
	public void setPhoneNumberString(String phoneNumberString) {
		this.phoneNumberString = phoneNumberString;
	}
	@Override
	public String toString() {
		return "Person [nameString=" + nameString + ", emailString="
				+ emailString + ", phoneNumberString=" + phoneNumberString
				 + "]";
	}
	
	
}
