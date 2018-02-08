package creational.abstractFactory;

/**
 * 
 * @author alex
 *
 */

public class CarFacatory {

	public static Car getCar(CarAbstractFactory carFactory) {
		return carFactory.createCar();
	}
}
