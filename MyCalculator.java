package Assignments;

public class MyCalculator {
long power (int n,int p) {
	if((n<0 &&p>0)|| (n>0 &&p<0)) 
		throw new ArithmeticException("n or p should not be negative");
	else if (n==0 && p==0)
		throw new ArithmeticException("n and p should not be zero");
	
	return (long) Math.pow(n, p);
	
}
public static void main(String args[]) {
	int n=5,p=0;
System.out.println(n+"^"+p+"="+new MyCalculator().power(n, p));
}
}
