package creational.abstractFactory;

/**
 * 
 * @author alex
 *
 */

public class Factory {

	public static void main(String[] args) {

		Car honda = CarFacatory.getCar(new HondaFactory("Civic", "Manual", "2.5"));
		Car ford = CarFacatory.getCar(new HondaFactory("Focus", "Manual", "1.5"));

		System.out.format("%nhonda conf ->%s%n", honda);
		System.out.format("%nford conf ->%s%n", ford);
	}
}
