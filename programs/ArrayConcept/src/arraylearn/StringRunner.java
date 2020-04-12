package arraylearn;

public class StringRunner {
	public static void main(String[] args) {
		String [] days = {"Sunday","Monday","Tuesday",
				"Wednesday","Thursday","Friday","Saturday"};
		String dayWithMostCharacterString = "";
		
		for(String day:days) {
			if(day.length() > dayWithMostCharacterString.length()) {
				dayWithMostCharacterString = day;
			}
		}
		System.out.println(dayWithMostCharacterString);
		
		for(int i = days.length-1;i>=0;i--) {
			System.out.println(days[i]);
		}
	}
}

