package basics;

import java.util.Arrays;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		int[] n1= {2,3,4,12,12,-2};
	       
        int[] n3=new int[5];
       
        int[] n2=new int[n1.length]; // array n2 with size of n1
       
        System.out.println("n1 = "+Arrays.toString(n1));
        // copy entire array n1 to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
       
        // convert array to string and print
        System.out.println("n2 = "+Arrays.toString(n2));
       
        // Copy partial array contents
        System.arraycopy(n1, 2, n3, 1, 3);
        System.out.println("n3 = "+Arrays.toString(n3));
        
        // sort an array
        Arrays.sort(n2);
        System.out.println("Sorted n2 array:"+ Arrays.toString(n2));

	}

}
