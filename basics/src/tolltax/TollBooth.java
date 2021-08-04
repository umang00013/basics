package tolltax;

interface TollBooth
{
public void showdata();
public void calculation(Truck t);
}
interface Truck
{
public int calaxles();
public int calweight();
}

//Now we will make two classes as specified

class Toll implements TollBooth
{
Toll()
{
  counttruck=0;
  receipts=0;
}

public void calculation(Truck t)
{
  int axles=t.calaxles();
  int weight=t.calweight();
  int dueamount=5*axles+((weight/500)*10);
  System.out.println("No. of axles: "+axles+" axles");
  System.out.println("weight of the truck: "+weight+"kg");
  counttruck=counttruck+1;
  receipts=receipts+dueamount;
  System.out.print("Amount due for truck "+counttruck+": ");
  System.out.println(dueamount);
}

public void showdata()
{
  System.out.println("No. of trucks pass the toll: "+counttruck);
  System.out.println("Total Amount of receipts when "+counttruck+" trucks passes the toll: "+receipts);
}
int receipts;
int counttruck;
}
class Truck1 extends Toll implements Truck
{
Truck1(int axles, int weight)
{
  this.axles=axles;
  this.weight=weight;  
}

public int calaxles()
{
  return axles;
}

public int calweight()
{
  return weight;
}

int axles;
int weight;
}
