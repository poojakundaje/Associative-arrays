
public interface EntryInterface<K,V> {
	
	/**
	 * Method to get key of an entry
	 * @return key of the entry
	 */
	K getKey();   
	
	/**
	 * Method to get value of an entry
	 * @return value of the entry
	 */
    V getValue();
    
    /**
	 * Method to set key of an entry
	 * @param key to be set
	 */
    void setKey(K key); 
    
    /**
   	 * Method to set value of an entry 
   	 * @param value to be set
   	 */
    void setValue(V value); 
}
