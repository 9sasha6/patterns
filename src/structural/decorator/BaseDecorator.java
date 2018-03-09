package structural.decorator;

/**
 * 
 * @author alex
 *
 */

class BaseDecorator implements Notificator {

	private Notificator wrapper;

	public BaseDecorator(Notificator notificator) {
		this.wrapper = notificator;
	}

	@Override
	public String send() {
		return wrapper.send();
	}
}
