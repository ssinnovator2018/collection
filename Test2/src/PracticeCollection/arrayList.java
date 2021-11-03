package PracticeCollection;

import java.util.ArrayList;

public class arrayList {
public static void main(String[] args) {
	

	ArrayList <String> a=new ArrayList<String>();
	a.add("shubham");
	a.add("Sunil");
	a.add("Sawant");
	a.add("Santgaon");
	a.add("Sangli");
	a.add("Sinhgad");
	
	System.out.println(a);
	for (int m=0; m<a.size(); m++)
	{
		System.out.println(a.get(m));
	}
	System.out.println("Added modifications");
}
}