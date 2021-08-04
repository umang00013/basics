// Program to display ur name n times & find sum of series

package basics;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of N:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.println(i+ "- Umang");
			
		}
		System.out.println("The sum of series is:"+sum);
		
		s.close();
		
		
		
		
		
		
	}

}
