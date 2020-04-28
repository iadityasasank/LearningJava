
public class Car {
	
	int maxSpeed=120;
	int minSpeed=0;
	
	double weight=1000;
	
	boolean EngineOn=false;
	char condition='A';
	
	String nameOfCar = "Dark Hunter";
	
	
	
	
	public void printValues()
	{
		System.out.println("Name of Car : "+ nameOfCar);
		System.out.println("Maximum Speed : " + maxSpeed);
		System.out.println("Minimum Speed : " +minSpeed);
		System.out.println("Weight of Car : " + weight);
		System.out.println("Is Engine On : "+EngineOn);
		System.out.println("Rating of Car Condition : "+condition);
	}
	
	public void wrekCar() {
		condition ='C';
	}
	
	public void UpgradeMinSpeed() {
		minSpeed = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Mine = new Car();
		System.out.println("Family Car Details ");
		Mine.printValues();
		Car Sandeep = Mine;
		Mine.wrekCar();
		Mine.UpgradeMinSpeed();
		System.out.println("Sandeep's Car Details ");
		Sandeep.printValues();
		
	}

}
