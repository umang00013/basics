// program to find sum and avg of 3 nos
package basics;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
int a,b,c,sum;
float avg;
Scanner scan=new Scanner(System.in);
System.out.println("Enter 3 nos:");
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
sum=a+b+c;
avg=(float)sum/3;
System.out.println("The sum of 3 nos is:"+sum);
System.out.println("The avg of 3 nos is:"+
String.format("%.2f",avg));
scan.close();

	}

}
