/*
 * @Author Edson Zandamla
 * @ ArrayLists
*/
import java.util.ArrayList;

public class ArrL{
		//Can shrink and/or collapse dinamically
	public static void main(String[]args){
		ArrayList<Integer> myL = new ArrayList<Integer>(4); //declaration
		System.out.println("-----Adding Elements to Arraylist-----");
		myL.add(20);	//Adds arguments to first index position
		myL.add(30);
		myL.add(40);
		myL.add(50);
		myL.add(60);
		myL.add(70);
		//Access all elements of the Arraylist
		for(int num : myL){
			System.out.println(num);
		}
		//Get the size of the ArrayList
		System.out.println("Size of ArrayList is: " + myL.size());
		System.out.println("-----Removing certain Elements of Arraylist-----");
		myL.remove(2);	//Removes Element 2 from ArrayList
		myL.remove(3);	//Removes Element 3 ""     ""
		//Access all elements of the Arraylist
		for(int num : myL){
			System.out.println(num);
		}

		myL.clear();	//Deletes al elements of ArrayList
		System.out.println("-----Deleteing All Elements of Arraylist-----");
		System.out.println("Size of ArrayList is: " + myL.size());
		
		//Access all elements of the Arraylist
		for(int num : myL){
			System.out.println(num);
		}
		myL.add(20);	//Adds arguments to first index position
		myL.add(30);
		myL.add(40);
		myL.add(50);
		myL.add(60);
		myL.add(70);
		System.out.println("-----Changing certain Elements of Arraylist-----");
		myL.set(0, 1000);
		//Access all elements of the Arraylist
		for(int num : myL){
			System.out.println(num);
		}
		
	}
}
