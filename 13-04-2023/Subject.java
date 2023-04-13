/*Write a program to take input of marks of 3 subjects from the user. Check if the total of marks given by the user is greater than 50 else throw an exception saying "You Failed". Or else print Grade is A if the total is greater than 280. Grade B if the total is greater than 200. Grade C if the total is greater than 150.  Grade D if the total is greater than 50*/

 package sk;  //Create a package.
import java.util.Scanner;  //import a scanner class.
public class subjectCalEx // create a main class.
{

	public static void main(String[] args) {
		int s1,s2,s3,total;  // declare a variable.
		Scanner s=new Scanner(System.in);  //create an object of scanner class.
		System.out.println("Enter the subject 1 marks:");  // take sub marks 1 from the user.
		s1=s.nextInt();  // Store the value s1 variable.
		System.out.println("Enter the subject 2 marks:");  // take sub marks 2 from the user.
		s2=s.nextInt();  // Store the value s2 variable.
		System.out.println("Enter the subject 3 marks:");  // take sub marks 3 from the user.
		s3=s.nextInt();  // Store the value s3 variable.
		total=(s1+s2+s3); //calculate a marks of 3 subject
		//System.out.println(total);
		if(total>280)  // check the marks greater than 280 or not
		{
			System.out.println("Grade is A.");
		}
		else if(total>200)  // check the marks greater than 200 or not.
		{
			System.out.println("Grade is B.");
		}
		else if(total>150)  // check the total  marks greater than 150 or not.
		{
			System.out.println("Grade is C.");
		}
		else if(total>50)  // check the total marks greater than 50 or not
		{
			System.out.println("Grade is D.");
		}
		else if(total<50)	// check the total marks less than 500 if is 50 then throw exception.
		{
			throw new ArithmeticException("You Failed.");
		}
		
		
		

	}

}
