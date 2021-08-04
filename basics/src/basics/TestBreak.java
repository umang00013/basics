package basics;

public class TestBreak {

	public static void main(String[] args) {
		//for loop
		for(int i=1; i<=10;++i){
			// if th value of i is 5 the loop terminates
			if(i == 5)
			{
			      //break;
				continue;
			}
			System.out.println(i);
		}
	}

}
