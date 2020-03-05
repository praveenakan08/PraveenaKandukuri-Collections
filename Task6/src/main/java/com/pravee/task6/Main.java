package com.pravee.task6;

public class Main 
{
	public static void main(String[] args) 
	{
		//10 elements in the list initialized with default values
		CustomCollectionList<Integer> a=new CustomCollectionList<Integer>();
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(11);
		a.add(30);
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(11);
		a.add(30);
		a.add(40);
		
		System.out.println(a.get(4)); 
		System.out.println(a.remove(50));  //ArrayIndexOutOfBoundsException
		a.print();
		System.out.println("size of the list "+a.size()); 
		System.out.println("\n");
		
		CustomCollectionList<String> b=new CustomCollectionList<String>();
		b.add("Joy");
		b.add("Keith");
		b.add("Blue");
		b.add("Jay");
		b.add("Pary");
		b.add("Winter");
		b.add("Ellen");
		
		
		System.out.println(b.get(11)); //ArrayIndexOutOfBoundsException
		System.out.println(b.remove(6));    
		b.print();
		System.out.println("size of the list "+b.size());
		
		
	}

}
