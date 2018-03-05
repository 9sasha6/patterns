package structural.composite;

import java.util.List;

/**
 * 
 * @author alex
 *
 */

 class Sentence extends LetterComposite {

	public Sentence(List<Word> words) {
		for (Word w : words) {
			this.add(w);
		}
	}

	@Override
	public void printThisAfter() {
		System.out.print(".");
	}
}
