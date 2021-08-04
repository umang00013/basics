package basics;

public class NestedLoopDemo {

	public static void main(String[] args) {
		int week=3;
		int days=7;
		int i=1;
		
		
		// outer loop
		while(i<=week)
		{
			System.out.println("Week:" +i);
			
			// inner loop
			
			for( int j=1;j<=days;++j)
			{
				System.out.println("Days: "+j);
			}
			++i;
		}

	}


	}


