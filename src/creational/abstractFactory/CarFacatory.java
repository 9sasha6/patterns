package creational.abstractFactory;

/**
 * 
 * @author alex
 *
 */

 class CarFacatory {

	public static Car getCar(CarAbstractFactory carFactory) {
		return carFactory.createCar();
	}
}
