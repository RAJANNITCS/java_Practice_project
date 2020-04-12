package objectOrianted;

public class MoterBike {
//	state
private int speed;

//	Behavior

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
	if(howMuch > 0 ) {
		this.speed = this.speed + howMuch;
	} else {
		System.out.println("not valid");
	}
}
public 
}