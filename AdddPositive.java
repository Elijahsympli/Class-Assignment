package Assignments;

public class AdddPositive {
	int AdddTwoPositive(int a,int b) {
		if((a<0 &&b>0)|| (a>0 &&b<0) ||(a<0 &&b<0)) {
			throw new ArithmeticException("Non-positive integer sent");
		}
		
				return a+b;
		}
	public static void main(String args[]) {
		
		System.out.println("Sum:"+new AdddPositive().AdddTwoPositive(4, -5));
	}
	}

