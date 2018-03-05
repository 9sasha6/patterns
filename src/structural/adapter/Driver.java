package structural.adapter;

/**
 * 
 * @author alex
 *
 */

 class Driver implements Van {

	private Van van;

	public Driver() {}

	public Driver(Van van) {
		this.van = van;
	}

	@Override
	public void drive() {
		van.drive();
	}
}
