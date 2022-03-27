package eight;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner (System.in);
	
	double base ,height ,area;
	System.out.print("Enter base value: ");
	base=input.nextDouble();
	
	System.out.print("Enter height value: ");
    height=input.nextDouble();
    
    area=0.5*base*height;
    
    System.out.print("Value of triangle:"+area);
	
			

	}

}
