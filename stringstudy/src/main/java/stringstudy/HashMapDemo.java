package stringstudy;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "sumit");
		hm.put(2, "sagar");
		hm.put(3, "shweta");

		System.out.println(hm);// {1=sumit, 2=sagar, 3=shweta}
		
		System.out.println((hm.get(1)));//sumit
		
		System.out.println((hm.get(100)));//null if searching non existent key
		
		
		

		for (Entry m : hm.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
//    	1 sumit
//    	2 sagar
//    	3 shweta

		}
	}
}
