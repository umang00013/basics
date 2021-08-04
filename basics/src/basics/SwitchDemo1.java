// Java Program to check the size
// using the switch...case statement

package basics;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		int number;
		String size;
		Scanner s= new Scanner(System.in);
        System.out.println("Enter your shirt size:");
        number=s.nextInt();
        
        
     // switch statement to check size
        switch (number) {

          case 1:
          case 2:
          case 3:
            size = "Kids";
            break;
          case 29:
        	  size="Small";
        	  break;
          case 42:
            size = "Medium";
            break;

          // match the value of week
          case 44:
            size = "Large";
            break;

          case 48:
            size = "Extra Large";
            break;
          
          default:
            size = "Unknown";
            break;

        }
        System.out.println("Size: " + size);
      }
}
