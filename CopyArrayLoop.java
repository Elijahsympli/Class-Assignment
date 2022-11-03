package com.java;

//2. Write a Java program to copy an array by iterating the array.
public class CopyArrayLoop {
public static void main(String args[]) {
	 int a[]={2,1,3,6,7};
	 int cp[]=new int[a.length];
	  System.out.println("Element of an array:");
	  for(int i=0;i<a.length;i++)//loop for printing the original array
		  System.out.print(a[i]+" ");

	 
	  
	  for(int i=0;i<a.length;i++) {//loop for copying array to new array
		 
			cp[i]=a[i];
		  }
	  System.out.println("\nElement of copy array:");
	  for(int i=0;i<cp.length;i++)//loop for printing the new array
		  System.out.print(cp[i]+" ");
	  }
	
}

