/*
 * @Author Edson Zandamla
 * @ ArrayLists
*/
//import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
public class ArrLst{
	//Can shrink and/or collapse dinamically
	public static void main(String[]args){
		ArrayList<Integer> myArrayList = new ArrayList<Integer>(4); //declaration
		myArraylist.add(20);	//Adds arguments to first index position
		myArraylist.add(30);
		myArraylist.add(40);
		myArraylist.add(50);
		myArraylist.add(60);
		myArraylist.add(70);

		for(int num : myArrayList){
			System.out.println(num);
		}
	}
}
