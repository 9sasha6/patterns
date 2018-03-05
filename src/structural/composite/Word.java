package structural.composite;

import java.util.List;

/**
 * 
 * @author alex
 *
 */

 class Word extends LetterComposite {

	public Word(List<Letter> letters) {
		for (Letter l : letters) {
			this.add(l);
		}
	}

	@Override
	public void printThisBefore() {
		System.out.print(" ");
	}
}
