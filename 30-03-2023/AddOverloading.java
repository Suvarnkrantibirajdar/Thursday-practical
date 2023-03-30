class Overloading
{
 public void add(int a,int b)
  {
    System.out.println("print method with 2 parameters:");
  }
  public void add(int a, int b,int c)
  {
    System.out.println(" print method with 3 parameters:");
  }
}
public class AddOverloading
{
   public static void main(String args[])
   {
     Overloading a=new Overloading();
	 a.add(50,60);
	 a.add(10,40,60);
   }
}
