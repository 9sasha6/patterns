package creational.abstractFactory;

/**
 * 
 * @author alex
 *
 */

 abstract class Car {

	public abstract String getLabel();

	public abstract String getTransmision();

	public abstract String getEnginePower();

	@Override
	public String toString() {
		return "Car [getLabel()=" + getLabel() + ", getTransmision()=" + getTransmision()
				+ ", getEnginePower()=" + getEnginePower() + "]";
	}
}
