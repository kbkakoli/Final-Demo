package practice;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20, b=10 ,Ch;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter any Number");
         Ch=input.nextInt();
	
		switch(Ch)
		{
		case 1:System.out.println("Addition"+"  "+(a+b));
		break;
		case 2:System.out.println("Sub"+"    "+(a-b));
		break;
		case 3:System.out.println("Multi"+"    " +(a*b));
		break;
		case 4:System.out.println("Div"+"  "+(a/b));
		break;
		default:System.out.println("Invalid Case");	
		
		System.out.println("Out of Switch");
		
		

	}

}
}