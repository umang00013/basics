package basics;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		int number;
		String size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit:");
		number =s.nextInt();
		int i=1,sum=0;
		while(i<=number)
		{
			sum=sum+i;
			i=i+1;
		
		}
		System.out.println("The sum of series is: " +sum);
		s.close();
	}

}
