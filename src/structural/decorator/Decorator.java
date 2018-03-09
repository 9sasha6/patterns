package structural.decorator;

/**
 * Here we see how too send an alarm notification through dynamics messengers;
 * 
 * @author alex
 *
 */

class Decorator {

	public static void main(String[] args) {

		Notificator notificator = new BaseDecorator(
				new FacebookDecorator(new Messege("Everything is goind to crash!!!")));
		notificator.send();

	}
}
