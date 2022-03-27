package practice;

public class IfElseNestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=40,c=50;
		
		if(a>b)
		{if(a>c)
		{System.out.println(a);
		}
		else {
			System.out.println(c);	
		}
	}else
		if(b>c)
		{System.out.println(b);	
	
		}
		else {System.out.println(c);	
			}

}
}