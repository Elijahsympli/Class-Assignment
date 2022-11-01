package com.java;
//write a java program to test if an array contains a specific value.
import java.util.Scanner;

public class ArrayCheckValue {
public static void main(String args[]) {
int l=0;
  int a[]={2,1,3,6,7};
  System.out.println("Element of an array:");
  for(int i=0;i<a.length;i++)
	  System.out.println(a[i]);
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number to check its present in an array:");
  int src=sc.nextInt();
  
  for(int i=0;i<a.length;i++) {
	  if(a[i]==src) {
		  System.out.println(a[i]+" is present in an array");
		  l++;
	  }
  }
  if(l==0) 
	  System.out.println(src+" is not present in an array");
  
}
}
