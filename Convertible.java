package lab2q6;

public class Convertible extends Car {
boolean ishoodopen;
public Convertible(int noofwheels,int noofpassenger,int model,String make,int noofdoor,boolean ishoodopen) {
	super(noofwheels,noofpassenger,model,make,noofdoor);
	this.ishoodopen=ishoodopen;
}
void display() {
	super.display();
	System.out.println("ishoodopen: "+ishoodopen);
}
}
