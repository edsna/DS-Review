import java.util.*; 	
/*
 * @author: Edson Zandamale
 * This program implements the contains() method from a Hash table >> Checks weather or not avalue exists in the Hashtable
*/

public class hashCOntains{ 
	public static void main(String[] arg) 
	{ 
		// creates a Hashtable
		Hashtable myHasT = new Hashtable(); 
			
		// enter name/myHashT pair 
		myHasT.put("Edson", new Integer(100)); 
		myHasT.put("Francisco", new Double(150)); 
		myHasT.put("de", new Integer(80)); 
		myHasT.put("Aguiar", new Double(120.88)); 
		myHasT.put("Zandamela", new Integer(1000)); 
			
		
		// check whether a value exists or not 
		if (myHasT.contains(1000)) 
			System.out.println("Value found in table");
		else{
			System.out.println("Sorry!!! Your value was not found in the table");
		}
		
	} 
}

