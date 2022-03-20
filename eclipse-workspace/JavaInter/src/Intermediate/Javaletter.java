package Intermediate;

import java.util.Scanner;

public class Javaletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
		char ch;
		System.out.print("Enter any letter :");
		ch=input.next().charAt(0);
		
		if(ch>='a'&&ch<='b')  {
		System.out.println("Letter is small");
			
			
		} else if(ch>='A'&& ch<='B'){
		
			System.out.println("Letter is Capital");
			
		}else {
		
			System.out.println("Not a letter");	
		}
		

	}

}
