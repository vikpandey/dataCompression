package dataCompression.HuffmanEncoding;

public class HuffmanLeaf extends HuffmanTree {

	private char value;

	HuffmanLeaf(int frequency) {
		super(frequency);
	}

	HuffmanLeaf(int frequency, char value) {
		super(frequency);
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
