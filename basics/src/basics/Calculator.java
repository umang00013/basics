/* program to perform mathematic operation and demonstrate
 *  use of Scanner Class for input* */
package basics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1,num2,sum,sub,mul;// declarations
		float div;
		String user;
		Scanner s=new Scanner(System.in);
		//input
		System.out.println("********Calculator*********");
		System.out.println("Enter User Name:");
		
		user=s.next();//string input
		System.out.println("Enter 2 numbers:");
		num1=s.nextInt();
		num2=s.nextInt();// int input
		// process
		sum=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=(float)num1/num2; // type casting
		//output
		System.out.println("User :"+user);
		System.out.println("Addition of 2 nos ia:"+sum);
		System.out.println("Subtraction of 2 nis is:"+sub);
		System.out.println("Multiplication of 2 nos is:"+mul);
		System.out.println("Divison of 2 nos is:"+div);
		
		

	}

}
