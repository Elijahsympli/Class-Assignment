package com.java;
//3. Write a Java program to find the second smallest element in an array.
public class Array2ndSmallestEl {
public static void main(String args[]) {
	 int a[]={2,1,3,6,7};
	 int sm=0;
	 
	  System.out.println("Element of an array:");
	  for(int i=0;i<a.length;i++)
		  System.out.print(a[i]+" ");

	 
	  for (int i = 0; i < a.length; i++) {     
          for (int j = i+1; j < a.length; j++) {     
             if(a[i] > a[j]) {    
                 sm = a[i];    
                 a[i] = a[j];    
                 a[j] = sm;    
             }     
          } 
	  }
	  System.out.println("\nSecond smallest element of an array is:"+a[1]);
	  
		 
	

}
}
