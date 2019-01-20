
public class HW7 {
	
	//creates an integer array with int entries
	static AssocArray<Integer, Integer> intAr= new AssocArray<Integer, Integer>();
	static Entry<Integer, Integer> entry1= new Entry(20, 50);
	static Entry<Integer, Integer> entry2= new Entry(14, 65);
	static Entry<Integer, Integer> entry3= new Entry(232, 54);
	static Entry<Integer, Integer> entry4= new Entry(67, 43);
	
	//creates a string array with string entries
	static AssocArray<String, String> stringAr= new AssocArray<String, String>();
	static Entry<String, String> entry5= new Entry("camel", "llama");
	static Entry<String, String> entry6= new Entry("car", "shed");
	static Entry<String, String> entry7= new Entry("doha", "qatar");
	static Entry<String, String> entry8= new Entry("strings", "int");
	
	/**
	 * main method that tests the 4 methods in AssocArray and tests whether the 
	 * AssocArray is generic
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//test add method
		System.out.println("printing the integer array inorder of the key:");
		intAr.add(entry1);
		intAr.add(entry2);
		intAr.add(entry3);
		intAr.add(entry4);
		intAr.string();
		
		//test remove method
		System.out.println("Removing entry with 232,54");
		intAr.remove(232);
		intAr.string();
		
		//test modify method 
		System.out.println("modify 14,65 to 14, 89");
		intAr.modify(entry2, 89);
		intAr.string();
		
		//test lookup method 
		System.out.println("lookup key 20 so the value 50 should print");
		System.out.println(intAr.lookup(20));
		System.out.println("lookup key 67 so the value 43 should print");
		System.out.println(intAr.lookup(67));
		


		//test add method
		System.out.println("printing the string array inorder:");
		stringAr.add(entry5);
		stringAr.add(entry6);
		stringAr.add(entry7);
		stringAr.add(entry8);
		stringAr.string();

		//test remove method
		System.out.println("Removing entry with car,shed");
		stringAr.remove("car");
		stringAr.string();

		//test modify method 
		System.out.println("modify camel,llama to camel, alpaca");
		stringAr.modify(entry5, "alpaca");
		stringAr.string();

		//test lookup method 
		System.out.println("lookup key strings so the value int should print");
		System.out.println(stringAr.lookup("strings"));
		System.out.println("lookup key doha so the value qatar should print");
		System.out.println(stringAr.lookup("doha"));

	}
}
