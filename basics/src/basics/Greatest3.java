package basics;

import java.util.Scanner;

public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three nos:");
		a=s.nextInt();
	    b=s.nextInt();
	    c=s.nextInt();
	    if(a>b && a>c) // logical operators are used to combine multiple conditions
	    {
	    	System.out.println(a + " is Greatest");
	    }
	    else if(b>c)
	    	{
	    	System.out.println(b + " is Greatest");
	    	}
	    else 
    	{
    	System.out.println(c + " is Greatest");
    	}
	}

}
