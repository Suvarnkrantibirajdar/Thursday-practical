/*Write a program to create thread. Where you will take the input from the user and 
find if the number is odd or even.*/
package sk;  // create a package.

import java.util.Scanner;  //import a scanner class.

class EvenOdd extends Thread  // create a thread.
{
	int no; //
	Scanner sc=new Scanner(System.in);  //create an a object scanner class.
	public void run() //override run() method.
	{
		System.out.println("Enter Number :"); 
		no=sc.nextInt();
		if(no%2==0)  //check no is even or odd.
		{
			System.out.println("Number is Even.");  // print the number is even.
		}
		else
		{
			System.out.println("Number is Odd.");  // print the number is odd
		}
	}
}
public class checkEvenOddEx   // create a main class.
{

	public static void main(String[] args) // main method.
	{
		EvenOdd e=new EvenOdd();// create object of EvenOdd Class.
		e.start(); // call start() method.
	}

}
