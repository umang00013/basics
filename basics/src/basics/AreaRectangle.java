package basics;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		double a,b;
		int area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		a=s.nextDouble();
		System.out.println("Enter breadth:");
		b=s.nextDouble();
		area=(int)(a*b);
		System.out.println("Area of Rectangle:"+area);
	}

}
