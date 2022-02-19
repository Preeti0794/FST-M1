package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car car = new Car();
		car.make = 2014;
		car.color = "Black";
		car.transmission = "Manual";
    
        //Using Car class method
		car.displayCharacteristics();
		car.accelarate();
		car.brake();
    }

	}


