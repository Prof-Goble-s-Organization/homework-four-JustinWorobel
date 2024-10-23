package hw04;

/**
 * Find the key associated with the minimum value in a tree.
 */
public class MinKeyFinder implements CS232Visitor<String, Integer> {
	private String minKey;
	private Integer minValue;

	public MinKeyFinder() {
		minKey = null;
		minValue = 2140000000;
	}
	

	/**
	 * {@inheritDoc}
	 */
	public void visit(String key, Integer value) {
		if(value < minValue){
			minValue = value;
			minKey = key;
		}
	}

	/**
	 * Get the key associated with the minimum value in the tree.
	 * 
	 * @return the key associated with the minimum value.
	 */
	public String getMinKey() {
		return this.minKey;
	}
	
	public static void main(String[] args) {
		String[] key = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		Integer[] val = {1, 3, 6, 8, 2, 4, 0, 9, 3, 2};
		CS232LinkedBinaryTree<String, Integer> tree = new CS232LinkedBinaryTree<>(key, val);

		MinKeyFinder find = new MinKeyFinder();

		tree.visitPreOrder(find);
		System.out.println(find.getMinKey());

	}
}
