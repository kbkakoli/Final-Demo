package eight;

import java.util.Scanner;

public class ArithmaticOp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1=20;
		int num2=10;
		int result=(num1+num2);
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter First Number :");
		num1=input.nextInt();
		
		System.out.print("Enter Second Number :");
		num2=input.nextInt();
		
		
		 result =num1 + num2;
		System.out.println("Sum="+result);
		
		
		result=num1-num2;
		System.out.println("Sub="+result);
		
		result=num1*num2;
		System.out.println("multiplication="+result);
		
		result=num1/num2;
		System.out.println("Div="+result);
		

		result=num1%num2;
		System.out.println("Rem="+result);
				
		

		

	}

}
