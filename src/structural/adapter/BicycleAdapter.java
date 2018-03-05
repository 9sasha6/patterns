package structural.adapter;

/**
 * 
 * @author alex
 *
 */

 class BicycleAdapter implements Van {

	private Bicycle bicycle;

	public BicycleAdapter() {
		bicycle = new Bicycle();
	}

	@Override
	public void drive() {
		bicycle.ride();
	}
}
