
/**
 * node class 
 * @author poojakundaje
 *
 * @param <T>
 */

public class BinarySearchTreeNode<K extends Comparable<K>, V>{

	//instance variable for key
	protected K key; 
	
	//instance variable for value
	protected V value;
	
	//instance variable for left node 
	protected BinarySearchTreeNode<K,V> left;
	//instance variable for left node 
	protected BinarySearchTreeNode<K,V> right;
	//instance variable for left node 
	protected BinarySearchTreeNode<K,V> parent;
	
	
	/**
	 * initially sets the nodes to null
	 */
	public BinarySearchTreeNode(){
		
	}
	
	/**
	 * node contains data which is assigned to this data 
	 * @param data
	 */
	public BinarySearchTreeNode (Entry<K,V> entry) {
		this.key= entry.getKey();
		this.value=entry.getValue();
	}
	
	/**
	 * Get the key stored at this node.
	 * @return Object key.
	 */
	public K getKey() {
		return key;
	}
	
	/**
	 * Get the value stored at this node.
	 * @return Object value.
	 */
	public V getValue() {
		return value;
	}

	/**
	 * Set the data stored at this node.
	 * @param data
	 */
	public void setKey (K key) {
		this.key = key;
	} 
	
	

	/**
	 * Set the data stored at this node.
	 * @param data
	 */
	public void setValue (V value) {
		this.value = value;
	} 
	
	/**
	 * Get the left child.
	 * @return BinaryTreeNode that is left child,
	 * or null if no child.
	 */
	public BinarySearchTreeNode<K,V> getLeft() {
		return left;
	}


	/**
	 * Get the right child.
	 * @return BinaryTreeNode that is right child,
	 * or null if no child.
	 */
	public BinarySearchTreeNode<K,V> getRight() {
		// TODO Auto-generated method stub
		return right;
	}

	/**
	 * Set the left child.
	 */
	public void setLeft(BinarySearchTreeNode<K,V> left) {
		this.left=left;

	}


	/**
	 * Set the right child.
	 */
	public void setRight(BinarySearchTreeNode<K,V> right) {
		// TODO Auto-generated method stub
		this.right=right;
	}


	/**
	 * Get the parent node.
	 * @return BinaryTreeNode that is parent,
	 * or null if no child.
	 */
	public BinarySearchTreeNode<K,V> getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	/**
	 * Set the parent node 
	 */
	public void setParent (BinarySearchTreeNode<K,V> parent) {
		this.parent=parent;

	}
	
	/**
	 * inserts a new node into the tree
	 * @param entry
	 */
	public void insert(Entry<K,V> entry) {
        if( key.compareTo(entry.getKey()) > 0) {
            if( left == null ) {
                this.setLeft(new BinarySearchTreeNode(entry));
                left.setParent(this);
            } else {
                left.insert(entry);
            }
        } else {
            if( right == null ) {
                this.setRight(new BinarySearchTreeNode(entry));
                right.setParent(this);
            } else {
                right.insert(entry);
            }
        }
    }
    
	/**
	 * finds the node with the smallest key in the tree
	 * @return
	 */
   public BinarySearchTreeNode<K,V> minimum() {
	     if (left == null)
	       return this;
	     else
	       return left.minimum();
    }

   /**
    * gets the following node
    * @return
    */
    public BinarySearchTreeNode<K,V> successor() {
	     if (this.right != null){
         return (this.right).minimum();
       }
	     else {
	    // There is no right child.
	    // else have to follow parent pointers until get
	    // to ancestor that has this node in left s.t.,
	    // return that ancestor.  If node is not in a left s.t.,
	    // then return null
	       BinarySearchTreeNode<K,V> N = this;
	       if (N.parent == null)  // node is root, has no successor
		       return null;
	       else {
		      while (N.equals(N.parent.right)) { // while N is a right child
		        N = N.parent;      // move up right spine to its parent
          }
		      // when N is no longer a right child, it is either the left
          // child of its parent (and parent is successor) or it is
          // the root (and there is no successor)
          if (N.equals(N.parent.left))
		        return N.parent;
		      return null;
	    }
	}
    }

    /**
     * places tree inorder and prints the key and value of each node 
     */
    public void inorder() {
        if (left != null)
          left.inorder();
        System.out.println(getKey() + ", "+ getValue() );
        if (right != null)
          right.inorder();
        return;
      }
  
    
    
}
