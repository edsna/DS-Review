/*
 * @Author Edson Zandamla
 * @ Multidimenssional Arrays||2D Arrays - make tables || when 
*/
public class MultDimArr{
	
	public static void main(String[]args){
		int myArray[][] = {{2, 4, 6, 8, 10}, {3, 6, 9, 12}, {55}, {3, 6, 9, 12}, {2, 4, 6, 8, 10}};
		System.out.println(myArray[0][4]); //Prints single Elem
		System.out.println("Here are my tables");
		Solution(myArray);
		
	}

	public static void Solution(int a[][]){
		for(int row = 0; row < a.length; row++){
			for(int column = 0; column < a[row].length; column++){
				System.out.print(a[row][column] + "\t");
			}
			System.out.println();	//Jumps to a new row so it can look like a table
		}
	}
}
