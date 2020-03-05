package com.pravee.task6;


import java.util.*;

public class CustomCollectionList<T> extends AbstractList<T> 
{
	
	T a[];
	T val;
	int index=0;
	@SuppressWarnings("unchecked")
	
	public CustomCollectionList()
	{
		a=(T[])new Object[10];
		Arrays.fill(a,val);
	}
	
	@SuppressWarnings("unchecked")
	
	public boolean add(T element)
	{
			T b[]=(T[])new Object[a.length];
			for(int i=0;i<b.length;i++)
				b[i]=a[i];
			
			if(index==a.length)
			{
				a=(T[])new Object[a.length+1];
				for(int i=0;i<b.length;i++)
					a[i]=b[i];
			}
			
			else 
			{
				for(int i=0;i<b.length;i++)
					a[i]=b[i];
			}
			
			a[index]=element;
			index++;
			
		return true;
	}

	@SuppressWarnings("unchecked")
	public T get(int i) 
	{
		if(i<0 || i>a.length)
			return (T)"Element cannot be fetched";
		return (T)("Element fetched at index "+i+" is "+a[i]);
	}
	
	
	@SuppressWarnings("unchecked")
	public T remove(int i) 
	{
		if(i<0 || i>a.length)
			return (T)"Element cannot be removed";
		
		T b[]=(T[])new Object[a.length];
			
		for(int j=0;j<b.length;j++)
			b[j]=a[j];
			
		for(int j=0;j<b.length;j++)
		{
			if(j==i)
				a[j]=null;
				
			else if(j>i)
				a[j-1]=a[j];
		}
			
		index--;
		return (T)("Element removed at index "+i+" is "+b[i]);
		
	}

	public int size() 
	{
		return a.length;
	}
	
	public void print()
	{
		
		System.out.println("Elements present in the list are:");
		for(int i=0;i<index;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
	
}
