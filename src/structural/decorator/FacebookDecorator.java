package structural.decorator;

/**
 * 
 * @author alex
 *
 */

class FacebookDecorator extends BaseDecorator {

	private String settings;

	public FacebookDecorator(Notificator notificator) {
		super(notificator);

	}

	@Override
	public String send() {
		return setFacebookSettings(super.send());
	}

	public String setFacebookSettings(String str) {
		settings = "setting some configs for facebook ";
		System.out.println(settings + str);
		return new String(settings + str);
	}
}
