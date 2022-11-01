package com.java;

//write a java program to find the duplicate values of an array of integer values

public class ArrayDuplicateValue {
	public static void main(String args[]) {
int k=0;
		  int a[]={2,2,3,3,2};
		  System.out.println("Element of an array:");
		  for(int i=0;i<a.length;i++)
			  System.out.println(a[i]);
		 
		 
		  for(int j=0;j<a.length;j++) {
		  for(int i=j+1;i<a.length;i++) {
			  if(a[i]==a[j] && k!=a[i]) {
				  k=a[i];
				  System.out.println(a[i]+" is the duplicate value present in an array");
				  break;
			  }
		  }
		  }
		}
}
