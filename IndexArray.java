package com.java;

import java.util.Scanner;

//1. Write a Java program to find the index of an array element.
public class IndexArray {
public static void main(String args[]) {
	
	int l=0;
	  int a[]={2,1,3,6,7};
	  System.out.println("Element of an array:");
	  for(int i=0;i<a.length;i++)
		  System.out.print(a[i]+" ");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("\nThe index of an array:");
	 
	  
	  for(int i=0;i<a.length;i++) {
		
			  System.out.println(" a["+i+"]="+a[i] );
		
		  
	  }
	  
	  
	}
	

	
}

