package com.congnizant.tax;

public class Student {
	int i=1;
	//method to calculate exemption
public void calculateFeesStructure(Long studentId,Character stgrade,Double mFees,Boolean isScholarshipEligible,Double fees) {
	
	System.out.println("Test Cases  "+"StudentId  "+"grade  "+"montlyFees  "+"isScholarshipEligible");
	if(studentId!=0 && stgrade=='A') {
		fees=mFees-(mFees*10/100);
		System.out.println("Test Case "+ (i++)+"   "+studentId+"        "+stgrade+"         "+mFees+"          "+isScholarshipEligible +"                "+"10% of fees is exempted,the calculated fees is "+fees);
}
	else if(studentId!=0 && stgrade=='B') {
		fees=mFees-mFees*8/100;
		System.out.println("Test Case "+ (i++)+"   "+studentId+"        "+stgrade+"         "+mFees+"          "+isScholarshipEligible  +"                "+"8% of fees is exempted,the calculated fees is "+fees);

	}
	else if(studentId!=0 && stgrade=='C') {
		fees=mFees-(mFees*6/100);
		System.out.println("Test Case "+ (i++)+"   "+studentId+"        "+stgrade+"         "+mFees+"          "+isScholarshipEligible +"                " +"6% of fees is exempted,the calculated fees is "+fees);

	}
	else if(studentId!=0 && stgrade=='D') {
		fees=mFees-mFees*4/100;
		System.out.println("Test Case "+ (i++)+"   "+studentId+"        "+stgrade+"         "+mFees+"          "+isScholarshipEligible  +"                "+"4% of fees is exempted,the calculated fees is "+fees);

	}
	else 
		System.out.println("Test Case "+ (i++)+"   "+studentId+"        "+stgrade+"         "+mFees+"          "+isScholarshipEligible  +"                "+"Not Eligible for Exemption");

		System.out.println();
}
public void compareMark(Long Maths,Double English) {
	Integer math=(int)Maths.longValue();//converting Long value to Integer
	Integer Eng=(int)English.doubleValue();//converting Double value to Integer
	if(Eng>math) {
		System.out.println("English mark is higher than Maths");
		
	}
	else if(English<Maths) {
		System.out.println("Maths mark is higher than English");
		
	}
	else
	System.out.println("Both are equal");
	System.out.println();
}

//method to check if fees infinity or not
public void validateFees(Double fees) {
	if(fees.isInfinite()) {//checking if the infinity with isInfinite method
		System.out.println("Fees is infinite");
	}
	else {
		System.out.println("Fees is not infinite");
	
	System.out.println(fees.byteValue());//getting byte value of fees
	}

}
public static void main(String args[]) {
	Student obj=new Student();
	obj.calculateFeesStructure(new Long(234), new Character('C'),  new Double(600), new Boolean(true),new Double(0) );
	obj.calculateFeesStructure(115l, 'B',  909.50,true,0d );
	obj.calculateFeesStructure(980l, 'G',  1810d, false,0d );

	obj.compareMark(new Long(60),new Double(70));
	obj.compareMark(80l, 70d);
	obj.compareMark(80l, 80d);

	obj.validateFees(new Double(1023));
}
}
