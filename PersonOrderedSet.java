/*
Jade Walters
CSCI 2251
Assignment: Human Resources
Purpose: to practice creating classes and using inheritence
Sources: --I referenced some of my past assignments such as 
HurricaneRowData and TicTacToe
--I watched a Coding with John tutorial about interfaces and abstract class
source: https://www.youtube.com/watch?v=HvPlEJ3LHgE
--I looked at a GeeksforGeeks page for help on parseDouble method
source: https://www.geeksforgeeks.org/convert-string-to-double-in-java/
--I got help on the toString method for array lists from PrepInsta
source: https://prepinsta.com/java/arraylist-tostring-method/
--I got help with string.concat from GeeksforGeeks
source: https://www.geeksforgeeks.org/java-string-concat-examples/
--Found formula for converting cm to inches and kg to pounds on WikiHow
source: https://www.wikihow.com/Convert-Centimeters-to-Inches
source: https://www.wikihow.com/Convert-Kilograms-to-Pounds
--I got help with bubble sort from GeeksforGeeks
source: https://www.geeksforgeeks.org/sorting-strings-using-bubble-sort-2/
*/

public class PersonOrderedSet extends PersonSet {

	//method adds Person objects to an aplabetical array list
	@Override
	public void add(Person person) { 
		
		//add person to personSet
		super.add(person);
		
		//sort into alphabetical order
		//https://www.geeksforgeeks.org/sorting-strings-using-bubble-sort-2/
		//create temp variables
		String name1;  //for name comparison
		String name2;
		
		/* UGH I WAS DOING TOO MUCH
		String tempName;  //for temp storage
		double tempHeight;
		double tempWeight;
		*/
		
		//bubble sort
		for(int j=0; j<personSet.size()-1; j++) {
			for(int i=j+1; i<personSet.size(); i++) {
				name1 = personSet.get(j).getName();
				name2 = personSet.get(i).getName();
				if(name1.compareToIgnoreCase(name2) > 0) {
					
					/*MESS, swap entire object, not individual variables
					//set info from index j to temp variables
					tempName = personSet.get(j).getName();
					tempHeight = personSet.get(j).getHeight();
					tempWeight = personSet.get(j).getWeight();
					
					//set index i info to index j
					personSet.get(j).setName(personSet.get(i).getName());
					personSet.get(j).setHeight(personSet.get(i).getHeight());
					personSet.get(j).setWeight(personSet.get(i).getWeight());
				
					//set temp info to index i
					personSet.get(i).setName(tempName);
					personSet.get(i).setHeight(tempHeight);
					personSet.get(i).setWeight(tempWeight);
					*/
			
					//swap
					//syntax is object.set(index to set, object to set it to)
					Person temp = personSet.get(i);
					personSet.set(i, personSet.get(j));
					personSet.set(j, temp);
				}
			}
		}
	}
	
	//toString method returns formatted array data with column headers
	@Override
	public String toString() {
		String orderedString = String.format
			("%-8s %-15s %15s\n", "Name", "Height (cm)", "Weight (kg)");
		orderedString = orderedString + super.toString();
		return orderedString;
	}
}


