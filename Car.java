
public class Car {
	
	int maxSpeed=120;
	int minSpeed=0;
	
	double weight=1000;
	
	boolean EngineOn=false;
	char condition='A';
	
	String nameOfCar = "Dark Hunter";
	
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg= 26.4; //Mass per Gallon(Mileage)
	
	int Passengers = 1;
	
	public Car(int S,double W,boolean C)
	{
		minSpeed = S;
		weight = W;
		EngineOn = C;
		
	}
	
	public Car(int S)
	{
		minSpeed = S;
		
	}
	
	
	public void printValues()
	{
		System.out.println("Name of Car : "+ nameOfCar);
		System.out.println("Maximum Speed : " + maxSpeed);
		System.out.println("Minimum Speed : " +minSpeed);
		System.out.println("Weight of Car : " + weight);
		System.out.println("Is Engine On : "+EngineOn);
		System.out.println("Rating of Car Condition : "+condition);
		System.out.println("No of Passengers : "+Passengers);
	}
	
	
	
	public void UpgradeMinSpeed() {
		minSpeed = 10;
	}
	
	public void getIn() {
		Passengers++;
	}
	
	public void getOut() {
		Passengers--;
	}
	
	public void FuelLevel()
	{
		System.out.println("Maximum Fuel : "+maxFuel);
		System.out.println("Current Fuel : "+currentFuel);
	}
	
	public double EmptyTankAt(){
		
		return mpg*currentFuel;
	}
	
	public double CanTravelMaxAt(){
		return mpg*maxFuel;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car present = new Car(10);
		Car Serviced = new Car(0,900,false);
		
		
		Serviced.getIn();
		System.out.println("This is Serviced Car");
		Serviced.printValues();
		
		System.out.println();
		System.out.println("This is Present Car");
		present.printValues();
		
		System.out.println();
		System.out.println("Fuel Level in Present Car");
		present.FuelLevel();
		
		
		
		
	}

}
