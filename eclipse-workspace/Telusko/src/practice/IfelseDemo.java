package practice;

import java.util.Scanner;

public class IfelseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the Num  :");
		num = r.nextInt();

		if (num >= 0) {
			System.out.println("positive Num :"+num);
		} else

		{
			System.out.println("Negative Num: "+num);
		}
	}
}