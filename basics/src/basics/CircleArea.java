package basics;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double r,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		r=s.nextDouble();
		area=3.141*r*r;
		System.out.println("Area is " + area);
	}

}
