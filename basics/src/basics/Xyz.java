package basics;

import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) {
		String Name,Interest;
		int Rollno;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		Name=s.next();
		System.out.println("Enter Rollno:");
		Rollno=s.nextInt();
		System.out.println("Enter Interest of field:");
		Interest=s.next();	
		System.out.println("Hey, My name is "+Name + " and my Rollno is "
		+Rollno + " My field of Interest are" +Interest);

	}

}
