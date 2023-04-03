/* Create a parent class called "Person" with attributes such as name, age, and a method 
called "speak". Create a child class called "Student" that inherits from Person 
and has an additional attribute called "grade" and a method called "study". 
Create an object of the Student class and call both the "speak" and "study" methods. */
class Person1   // create a Person1 class.
{
	 String name; // declare a variables.
	 int age;
	 void speak(String name,int age) // create a speak() method.
	 {
		 this.name=name;
		 this.age=age;
		 System.out.println("Name :"+name+" age:"+age);
	 }
}
class Student extends Person1 // create Student class and extends Person1.
{
	String grade;
	void study(String name,int age,String grade) //create study() method.
	{
		this.name=name;
		this.age=age;
		this.grade=grade;
		System.out.println("\nName :"+name+" Age :"+age+" Grade :"+grade);
		
	}
}

class parson     //Create a main class.
 {
	public static void main(String[] args) // create a main() method.	{
        Student s=new Student();  // create an object of Student.
        s.speak("sk", 22);  // call speak() method.
        s.study("sk",22,"A"); // call study() method.
        
	}
 }
