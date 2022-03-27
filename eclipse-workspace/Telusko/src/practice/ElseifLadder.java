package practice;

import java.util.Scanner;

public class ElseifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int marks;
		 System.out.println("enter the marks");
		Scanner Res=new Scanner(System.in);
		marks=Res.nextInt();
		
		if(marks>90)
		{ System.out.println("Topper");
		}
	  else if (marks<90&&marks >=70 ) {
		  System.out.println("First"); 
	  }
	  else {
		  System.out.println("Average");
		  
	  }
}
}