package creational.adapter;

/**
 * 
 * @author alex
 *
 */

public class BicycleAdapter implements Van {

	private Bicycle bicycle;

	public BicycleAdapter() {
		bicycle = new Bicycle();
	}

	@Override
	public void drive() {
		bicycle.ride();
	}
}
