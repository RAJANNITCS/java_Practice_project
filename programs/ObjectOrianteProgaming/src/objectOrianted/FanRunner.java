package objectOrianted;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("usha",0.34567,"white",true,1);
		System.out.println(fan);
		fan.increseSpeed();
		System.out.println(fan);
		fan.isOff();
		System.out.println(fan);
		fan.isOn();
		System.out.println(fan);
	}
}
