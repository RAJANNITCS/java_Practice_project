package objectOrianted;

public class Fan {
	//sate
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private int speed;
	
	//creation 
	public Fan(String name,double radius,String color,boolean isOn,int i) {
		this.make = name;
		this.radius = radius;
		this.color = color;
		this.isOn = isOn;
		this.speed = i;
	}
	public String toString() {
		return "make="+make+"\nradius="+radius+"\ncolor="+color+"\nisOn="+isOn+"\nspeed="+speed;
	}
	public void isOn() {
		this.isOn = true;
		this.speed = 5;
	}
	public void isOff() {
		this.isOn = false;
		this.speed = 0;
	}
	public void increseSpeed() {
		if(this.speed <= 5) {
			this.speed++;
	   }
	}
	public void decriseSpeen() {
		if(this.speed > 0) {
			this.speed--;
		}
	}
	
}
