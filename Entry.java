import java.util.Comparator;

public class Entry<K extends Comparable<K>, V> implements Comparable<Entry<K,V>>{
	
	private K k; 
	private V v; 
	
	/**
	 * constructor
	 * @param key key of entry
	 * @param value value of entry 
	 */
	public Entry(K key, V value) {
		k = key;
		v = value;
	}
	
	
	public K getKey() {
		return k;
	}

	
	public V getValue() {
		return v;
	}
	

	public void setKey(K key) {
		k = key;
	}

	
	public void setValue(V value) {
		v = value; 
	}


	@Override
	public int compareTo(Entry<K, V> a) {
		return this.getKey().compareTo(a.getKey());
	}

}
