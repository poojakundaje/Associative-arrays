
public class AssocArray<K extends Comparable<K>,V> implements AArray<K,V>{
	
	private BinarySearchTree<K,V> tree;
	
	
	/**
	 * contructor provides that creates a tree
	 */
	public AssocArray() {
		tree= new BinarySearchTree<K,V>();
	}
	
	/**
	 * adds new (key,value) pair to the collection, binding new key and value together 
	 * @param key
	 */
	@Override
	public void add(Entry<K, V> a) {
		tree.insert(a);
		
	}
	
	/**
	 * removes the key value pair given a key
	 * @param key
	 */
	@Override
	public void remove(K key) {
		//create a node that is stores what is searched in the tree
		//delete node 
		 BinarySearchTreeNode<K,V> node=  new BinarySearchTreeNode<K,V>();
		node = tree.searchNode(key, tree.getRoot());
		tree.delete(node);
		
	}
	
	/**
	 * given a key and a value, replaces the associated value with a new one that is provided 
	 * @param key
	 * @param value
	 */
	@Override
	public void modify(Entry<K,V> a, V val) {
		 BinarySearchTreeNode<K,V> node= new BinarySearchTreeNode<K,V>();
		node=tree.searchNode(a.getKey(), tree.getRoot());
		node.setValue(val);
		
	}
	
	/**
	 * returns the value of the key that is input
	 * @param key
	 * @return
	 */
	@Override
	public V lookup(K key) {
		BinarySearchTreeNode<K,V> node= new BinarySearchTreeNode<K,V>();
		node=tree.searchNode(key, tree.getRoot());
		return node.getValue();
	}
	
	/**
	 * prints out the inorder tree 
	 */
	public void string() {
        tree.getRoot().inorder();
        
    }
	
	/**
	 * checks whether tree is empty
	 * @return
	 */
	public boolean isEmpty() {
		return tree.getRoot()==null;
		
	}
}