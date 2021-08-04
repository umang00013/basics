package tolltax;


//First we will create two interfaces truck and TollBooth

public class TestTollBooth {

	public static void main(String[] args) {
		
		Toll booth=new Toll();
		Truck1 Ford=new Truck1(5,12500);
		Truck1 nissan=new Truck1(2,5000);
		Truck1 daewoo=new Truck1(6,17000);
		System.out.println("Welcome to Alleghany TollBooth");
		
		System.out.println("********************");
		System.out.println("FORD TRUCK ARRIVAL:");
		booth.calculation(Ford);
		booth.showdata();
		
		System.out.println("********************");
		System.out.println("NISSAN TRUCK ARRIVAL:");
		booth.calculation(nissan);
		booth.showdata();
		
		System.out.println("********************");
		System.out.println("DAEWOO TRUCK ARRIVAL:");
		booth.calculation(daewoo);
		booth.showdata();

	}
	
}