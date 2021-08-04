package basics;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int a,b;
	
	Scanner s=new Scanner(System.in);
		System.out.println("Enter two nos:");
		a=s.nextInt();
	    b=s.nextInt();
	System.out.println("Enter Operator:");
    String op =s.next();
    switch(op)
    {
    case "+" : System.out.println("Addition is:"+(a+b));
    break;
    
    case "-" : System.out.println("Subtraction is:"+(a-b));
    break;
    
    case "*" : System.out.println("Multiplication is:"+(a*b));
    break;
    
    case "/" : System.out.println("Division is:"+(a/b));
 
    break;
    default: System.out.println("Invalid Operator");
    break;
    
    
    
    
    }
}
}