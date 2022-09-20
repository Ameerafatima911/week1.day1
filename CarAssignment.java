package week1;

public class CarAssignment {
	public void driverCar() {
		System.out.println("car Running Successfully");
	}
	public void applyBreak() {
		System.out.println("Put the Break");
	}
	public void soundHorn() {
		System.out.println("Press the Horn");
	}
	public void isPancture() {
		System.out.println("My car is not Puncture");
	}
	public static void main(String[] args) {
		CarAssignment car = new CarAssignment();
		car.driverCar();
		car.applyBreak();
		car.soundHorn();
		car.isPancture();
		
	}

}
