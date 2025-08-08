/*
  Author : Maria 
  Date   : 8 August 2025
  Description : Inheritance practice question2
 */
class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayInfo() {
		System.out.println("Brand: "+brand);
		System.out.println("model: "+model);
	}
}
 class Car extends Vehicle{
	String fueltype;
	Car(String brand,String model,String fueltype){
		super(brand,model);
		this.fueltype=fueltype;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel Type: "+fueltype);
	}
 }
 class ElectricCar extends Car{
	 double batteryCapacity;
	 ElectricCar(String brand,String model,String fueltype,double batteryCapacity){
		 super(brand,model,fueltype);
		 this.batteryCapacity=batteryCapacity;
	 }
	 public void displayInfo() {
		 super.displayInfo();
		 System.out.println("Battery Capacity: "+batteryCapacity+"kWh");
	 }
 }
	

public class Demo2 {
	public static void main(String[] args) {
		ElectricCar car1= new ElectricCar("Toyota","Corolla","Electric",8.8);
		car1.displayInfo();
	}

}
