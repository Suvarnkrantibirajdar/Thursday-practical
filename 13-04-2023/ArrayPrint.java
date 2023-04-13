/*
 * Create two thread.one thread is finding average of first 50 numbers 
 * and other thread is printing square of number store in array arr={10,15,20,25,30}.
 */
package sk; // create package.

class AverageFind extends Thread // create a Class and extends Thread
{
	float i,total,avg;  // declare variables.
	public void run() // override run() method.
	{
		for(i=1;i<=50;i++) // run for loop 50 times
		{
			total=total+i; // calculate total .
		}
		avg=(total/50); // calculate Average.
		System.out.println("Average is :"+avg); // print Average.
	}
}
class ArrayPrint extends Thread  // create class extends thread.
{
	int arr[]= {10,15,20,25,30}; // initialize array with elements.
	
	public void run() // override run() method.
	{
		for(int i=0;i<arr.length;i++) // run loop up to array length.
		{
			System.out.println(arr[i]*arr[i]); // print array elements with squares.
		}
	}
}
public class ArrayPrintThread { // main class.

	public static void main(String[] args) { // main method.
		AverageFind a=new AverageFind(); // create object of AverageFind class.
		a.start(); // call start() method.
		ArrayPrint ar=new ArrayPrint(); // create ArrayPrint Class.
		ar.start(); // call start() method.
	}

}
