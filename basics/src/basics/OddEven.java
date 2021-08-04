package basics;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number=10;
		
		int i=1;
		
		System.out.println("ODD \tEven");
		System.out.println("----\t----");
		while(i<=number)
		{
			if(i%2==1) 
			{
			System.out.print(i+"\t");
			}
		else
		{
		System.out.println(i);
			
	}
		
		i++;

		}
	}}