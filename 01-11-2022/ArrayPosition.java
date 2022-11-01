package com.java;

/*
 we need to print the elements of the array which are present in odd position
 
 */

public class ArrayPosition {
	public static void main(String args[]) {

		  int a[]={2,1,3,6,2};
		  System.out.print("Element of an array:");
		  for(int i=0;i<a.length;i++)
			  System.out.print(a[i]+" ");
		  System.out.println("\nElement of an array which are present in odd position:");
		  for(int i=0;i<a.length;i+=2)
			  System.out.println(a[i]);
		 
		  
		}
}
