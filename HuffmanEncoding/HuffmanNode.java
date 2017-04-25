package dataCompression.HuffmanEncoding;

public class HuffmanNode extends HuffmanTree {

	private HuffmanTree leftTree;
	private HuffmanTree rightTree;

	HuffmanNode(HuffmanTree leftTree, HuffmanTree rightTree) {
		super(rightTree.getFrequency() + leftTree.getFrequency());
		this.leftTree = leftTree;
		this.rightTree = rightTree;
	}

	public HuffmanTree getLeftTree() {
		return leftTree;
	}

	public void setLeftTree(HuffmanTree leftTree) {
		this.leftTree = leftTree;
	}

	public HuffmanTree getRightTree() {
		return rightTree;
	}

	public void setRightTree(HuffmanTree rightTree) {
		this.rightTree = rightTree;
	}

}
