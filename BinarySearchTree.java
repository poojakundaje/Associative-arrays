
public class BinarySearchTree<K extends Comparable<K>, V> extends BinarySearchTreeNode<K,V>{

	//instance variable for root node 
	protected BinarySearchTreeNode<K,V> root;


	/**
	 * constructor initializes the root node 
	 */
	public BinarySearchTree () {
		root=null;  
	}

	/**
	 * Constructor with one node parameter (set root to node).
	 * @param node
	 */
	public BinarySearchTree (BinarySearchTreeNode<K,V> node) {
		root=node;
	}

	/**
	 * Get the root node of the tree
	 * @return BinaryTreeNode that is the first node of the tree
	 */
	public BinarySearchTreeNode<K,V> getRoot() {
		return root;
	}

	/**
	 * Set the root of the node 
	 */
	public void setRoot(BinarySearchTreeNode<K,V> root) {
		this.root=root;

	}

	
	/**
	 * inserts an entry into the tree
	 */
    public void insert( Entry<K,V> d ) {
        if( getRoot() == null ) {
            setRoot( new BinarySearchTreeNode(d));
        } else {
            getRoot().insert(d);
        }
    }

    /**
	 * finds and returns the minimum element in the tree of type T
	 */
	public BinarySearchTreeNode<K,V> tree_minimum (BinarySearchTreeNode<K,V> node) {
		if(node==null){
			return null;
		}
		else {

			while(node.getLeft()!=null){
				node=   node.getLeft();
			}
			return node;
		}
	}
	
	/**
	 * calls successor method from binarySearchTreeNode class
	 * @param N
	 * @return
	 */
    public BinarySearchTreeNode<K,V> successor(BinarySearchTreeNode<K,V> N) {
	     return N.successor();
    }
    
    public void inorder() {
        if(getRoot() == null)
          return;
        root.inorder();
        return;
      }

    		
    	/**
    	 * searches for a particular node by looking for the key that is passed in 
    	 * @param key
    	 * @param node
    	 * @return
    	 */
    	public BinarySearchTreeNode<K,V> searchNode (K key ,BinarySearchTreeNode<K,V> node) {
    		//BinarySearchTreeNode<K,V> node= new BinarySearchTreeNode<K,V>();
    		if(root==null) {
    			return null;
    		}
    		else {
    			if (node==null || key.compareTo(node.getKey())==0 ) {
    				return node;
    			}
    			else if(key.compareTo(node.getKey())<0) {
    				return searchNode(key, node.getLeft());

    			}
    			else {
    				return searchNode(key, node.getRight());
    			}
    		}
    	}

        /**
         * Transplants the 2 nodes that it takes in
         * 
         * @param u
         * @param v
         */
    	public void transplant(BinarySearchTreeNode<K, V> u, BinarySearchTreeNode<K, V> v) {

    		if (u.getParent() == null) { // if the transplanting with the root
    			setRoot(v); // reset the root
    		} else if (u == u.getParent().getLeft()) { // if u is the left child
    			u.getParent().setLeft(v);
    		} else { // if u is the right child
    			u.getParent().setRight(v);
    		}
    		if (v != null) {
    			v.setParent(u.getParent());
    		}
    	}

    	/**
    	 * remove method takes in a node and a key and then recursively parses through the 
    	 * tree and deletes the node when it finds the node with the key that was input
    	 * @param root
    	 * @param key
    	 * @return
    	 */
    	public void delete(BinarySearchTreeNode<K, V> z) {

    		BinarySearchTreeNode<K, V> y;

    		if (z.getLeft() == null) { // if the left subtree is empty
    			transplant(z, z.getRight());
    		} else if (z.getRight() == null) { // if the right subtree is empty
    			transplant(z, z.getLeft());
    		} else { // if neither subtree is empty
    			y = tree_minimum(z.getRight());
    			if (y.getParent() != z) {
    				transplant(y, y.getRight());
    				y.setRight(z.getRight());
    				y = y.getRight(); // set y
    			}
    			transplant(z, y); // transplant z and y
    			y.setLeft(z.getLeft());
    			y.getLeft().setParent(y);
    		}

    	}
        

}
