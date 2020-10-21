package lab2q6;

public class Car extends Vehicle
{
	int noofdoor;
	public Car(int noofwheels,int noofpassenger,int model,String make,int noofdoor)
	{
		super(noofwheels,noofpassenger,model,make);
		this.noofdoor=noofdoor;
	}
	void display() {
		super.display();
		System.out.println("noofdoors: "+ noofdoor);
	}
}

