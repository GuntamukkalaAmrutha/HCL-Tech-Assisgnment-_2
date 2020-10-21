package lab2q6;
import java.util.Scanner;
public class Tester {
public static void main(String[]args) {
	int select;
	System.out.println("Select case from 1 to 4");
	Scanner scan=new Scanner(System.in);
	select =scan.nextInt();
	switch(select) {
	case 1:
		Vehicle vehicle=new Vehicle(1,2,345,"Audi");
		vehicle.display();
		break;
	case 2:
		Car car=new Car(2,3,456,"Benz",6);
		car.display();
		break;
	case 3:
		Convertible convert =new Convertible(2,3,345,"Mini bus",3,true);
		convert.display();
		break;
	case 4:
		SportCar sportcar=new SportCar(3,4,4656,"scoda",2);
		sportcar.display();
		break;
	}
	scan.close();
}
}
