import java.io.*;
import java.util.*;
/*
 * @author Edson Zandamela
 * This prigram performs basic method/function calls 
*/
	
public class Methods{
	//methods cannot be defined inside the main's scope', its more structrable
	//Having them outside the Main's Scope
	//Prints simple statement
	public static void printName(String name){
		System.out.println("Name is: " + name);
	}

	public static void add(int a, int b, int c){
		//System.out.println(a "+" b "=" a+b);
		//System.out.println("Sum of:" + a + "," + b + "and" + c  "is: " + a + b + c);
		System.out.println("Sum is: " + a + b + c);
	}

	public static int mult(int a, int b, int c){
		int result;
		result = (a * b * c);
		return result;
	}
	//Main
	public static void main(String[]args){
		System.out.println("Printout from Main");
		//Calls Methods passing values
		printName("Edson");	//Advantages of methods/functions
		printName("Francisco");	//is that they Allow you to call them
		printName("de");	//Multiple times and pass different
		printName("Aguiar");	 //values
		printName("Zandamela");
		add(5, 5, 5);
		add(50, 50, 50);
		add(100, 100, 100);
		//Calls method returning values
		System.out.println("-----ALL UPCOMING FUNCTION CALLS RETURN VALUES-----");
		System.out.println("Product returns: " + mult(50, 50, 50));
		
	}

}
