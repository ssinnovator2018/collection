package PracticeCollection;

import java.util.HashSet;
import java.util.Iterator;

public class Hastset {

	public static void main(String[] args) {
	
		HashSet <String> hash= new HashSet <String>();
		hash.add("shubham");
		hash.add("Sunil");
		hash.add("Sawant");
		hash.add("Santgaon");
		hash.add("Sangli");
		hash.add("Sinhgad");
		
		System.out.println(hash);
		
		Iterator<String> i=hash.iterator();
		
		for (String d: hash)
		{
			System.out.println(i.next());
		}
		
				
	}
}