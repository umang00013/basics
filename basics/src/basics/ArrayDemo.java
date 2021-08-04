package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] num= {10,20,30,40}; //array declaration
System.out.println("The length of array is:"+num.length);
System.out.println("The first element in array:"+num[0]);
System.out.println("The last element in array:"+num[num.length-1]);
System.out.println("The array contents:");


for(int i=0;i<num.length;i++)
{
	System.out.println(num[i]+" ");
	
}
int n,i;
Scanner s=new Scanner(System.in);
System.out.println();
System.out.println("Enter Array size: ");
n=s.nextInt();

int num1[]=new int[n]; //declaring array and allocate a memory

System.out.println("Enter array elments: ");
for(i=0;i<=n-1;i++)
{
	num1[i]=s.nextInt();
}

System.out.println("***2nd Array Contents****");
for(int j=0;j<num1.length;j++)
{
	System.out.println(num1[j]+" ");
	
}
System.out.println("Display array contents without loops:");
System.out.println(Arrays.toString(num1));
}

	

	}


