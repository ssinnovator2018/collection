package PracticeCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
public static void main(String[] args) {

	HashMap <Integer, String> hm= new HashMap <Integer, String>();
	hm.put(1, "Shubham");
	hm.put(2, "Sunil");
	hm.put(3, "Sawant");
	
	System.out.println(hm);
	
	for (Entry<Integer, String> d: hm.entrySet())
	{
		System.out.println("Key: "+d.getKey()+"    Value: " +d.getValue());
	}
	
}
}
