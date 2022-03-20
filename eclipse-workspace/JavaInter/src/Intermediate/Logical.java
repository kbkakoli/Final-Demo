package Intermediate;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
		char ch;
		System.out.print("Enter any letter :");
		ch=input.next().charAt(0);
		
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.print("vowel");
		
	}else
		System.out.print("consonant");
	
	}

}
