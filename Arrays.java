public class Arrays{
	//Main
	public static void main(String[] args){
		int myArray[] = {10, 20, 30, 40, 50};	//creates a new integer array
		Array(myArray);	//Name on function call does not have to be the same as on method declaration
		for(int i : myArray){
			System.out.println(i);	//Prints every element
		}
	}

	//Cann only store values of the same datatype
	//Arrays in methods
	public static void Array(int a[]){	//Methods takes an Arr as input
		for(int  j = 0; j < a.length; j++){	//loops through it
			a[j] += 5;			//Adds 5 to each element of the Arr
		}
	}
	
}
