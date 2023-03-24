class Calculation
{
	int a=20,b=10,add,sub,mul,div;
	void add1()
	{
		add=a+b;
		System.out.println("Addition is:"+add);
	}
	void sub1()
	{
		sub=a-b;
		System.out.println("substraction is:"+sub);

	}
	void mul1()
	{
		mul=a*b;
		System.out.println("multiplication is:"+mul);
	}
	void div1()
	{
		div=a/b;
		System.out.println("division is:"+div);
	}
}
class MainCalculation2
{
	public static void main(String args[])
	{
	 Calculation c1=new Calculation();
	 c1.add1();
	 c1.sub1();
	 c1.mul1();
	 c1.div1();

	}
}
	 

	