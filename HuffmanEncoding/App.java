package dataCompression.HuffmanEncoding;

public class App {
	
	public static void main(String[] args) {
		
		String text = "my name is Vikas Pandey";
		int[] charFrequencies = new int[256];
		
		for(char c : text.toCharArray()) {
			++charFrequencies[c];
		}
		
		HuffmanCode code = new HuffmanCode();
		HuffmanTree tree = code.buildTree(charFrequencies);
		
		code.printCodes(tree, new StringBuilder());
		
	}

}
