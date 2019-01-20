
public interface AArray<K extends Comparable <K>,V> {
	
	/**
	 * adds new (key,value) pair to the collection, binding new key and value together 
	 * @param key
	 */
	public void add(Entry<K,V> a);
	/**
	 * removes the key value pair given a key
	 * @param key
	 */
	public void remove(K key);
	/**
	 * given a key and a value, replaces the associated value with a new one that is provided 
	 * @param key
	 * @param value
	 */
	public void modify(Entry<K,V> a, V val);
	/**
	 * returns the value of the key that is input
	 * @param key
	 * @return
	 */
	public V lookup(K key);
	
}
