package lab2q6;

public class Vehicle {
int noofwheels;
int noofpassenger;
int model;
String make;
public Vehicle(int noofwheels, int noofpassenger, int model, String make) {
	super();
	this.noofwheels = noofwheels;
	this.noofpassenger = noofpassenger;
	this.model = model;
	this.make = make;
}
void display()
{
	System.out.println("Wheels: "+noofwheels+ " no of seats: "+noofwheels+" model: "+ model + " make: "+make);
	
}

}
