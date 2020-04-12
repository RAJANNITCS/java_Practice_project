package objectOrianted;

public class MoterBike {
//	state
private int speed;

//	Behavior

public MoterBike() {
	this.speed = 0;
}
public MoterBike(int speed) {
	this.speed = speed;
}
public void start() {
	System.out.println("bike start" + this.speed);
	}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	if(speed < 0) {
		this.speed = speed * - 1;
	} else {
		this.speed = speed;
	}
   }
public void incriseSpeed(int howMuch) {
	setSpeed(howMuch+this.speed);
}
public void decriseSpeed(int howMuch) {
	if(howMuch <= this.speed && howMuch >= 0) {
		setSpeed(getSpeed()-howMuch);
	} else {
		System.out.println("invalid Entry");
	}
}
}