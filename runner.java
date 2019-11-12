package Designpattern_Factory;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println("enter first num");
		
		int a=input.nextInt();
		
		System.out.println("enter second num");
	
		int b=input.nextInt();
		
		System.out.println("add or minus");
		
		CalculateFactory cal= new CalculateFactory();
		Calculate obj=cal.getCalculation(input.next());//here next is used for string
		
		obj.calculate(a, b);
		
	}

}
