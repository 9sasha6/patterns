package structural.composite;

/**
 * 
 * Composite pettern, implementation of
 * {@link https://github.com/iluwatar/java-design-patterns/tree/master/composite} repository
 * 
 * @author alex
 *
 */

 class Composite {
	public static void main(String[] args) {

		LetterComposite orcMessage = new Messenger().messageFromOrcs();
		orcMessage.print();

		LetterComposite elfMessage = new Messenger().messageFromElves();
		elfMessage.print();
	}
}
