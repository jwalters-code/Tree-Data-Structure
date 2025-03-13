/*
Jade Walters
CSCI 2251
Assignment: Human Resources/Tree Data Structure
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

import java.util.ArrayList;

public class PersonSet implements PersonList {
	
	//create Person ArrayList
	ArrayList<Person> personSet = new ArrayList<Person>();
	
	//add method takes Person as input and returns void
	@Override
	public void add(Person person) {
		
		//check for duplicate entry
		if(!duplicate(person, personSet)) {
			
			//add person to personSet
			personSet.add(person);
		}
	}
	
	//get method takes an int as input and returns Person at that index
	@Override
	public Person get(int index) {
		return personSet.get(index);
	}
	
	//method checks for duplicates in personList 
	//https://www.geeksforgeeks.org/convert-string-to-double-in-java/
	//https://prepinsta.com/java/arraylist-tostring-method/
	public boolean duplicate(Person person, ArrayList<Person> personSet) {
		if(personSet == null) {
			
			/*
			//test code
			System.out.println("null");
			*/
			
			return false; //empty array
		} else {
			for(int i=0; i<personSet.size();  i++) {
				String tempStr = personSet.get(i).toString();
				
				/*
				//test code, print tempStr for analysis
				System.out.println("tempStr: " + tempStr);
				*/
				
				String[] tempArr = tempStr.split(" ");
				
				/*
				//testcode, print out/compare tempArr and person
				System.out.println("tempArr: "); //tempArr start
				System.out.println(tempArr[0]);
				System.out.println(tempArr[1]);
				System.out.println(tempArr[2]);
				
				System.out.println("person info: ");  //person info start
				System.out.println(person.getName());
				System.out.println(person.getHeight());
				System.out.println(person.getWeight());
				System.out.println(); //blank line for readability
				*/
				
				double heightDoub = Double.parseDouble(tempArr[1]);
				double weightDoub = Double.parseDouble(tempArr[2]);
				if(tempArr[0].equals(person.getName()) 
					&& heightDoub == person.getHeight() 
					&& weightDoub == person.getWeight()) {
					return true; //is a duplicate
				}
			}
		}
		return false; //not duplicate
	}
	
	//method returns a string variable containing formatted personSet data
	@Override
	public String toString() {
		
		//create String variable
		String personSetStr = "";
		
		//add personSet array info to personSetStr
		//https://www.geeksforgeeks.org/java-string-concat-examples/
		for(int i=0; i<personSet.size(); i++) {
			personSetStr = personSetStr.concat(String.format
			("%-8s %-15.0f %15.0f\n", 
			personSet.get(i).getName(), 
			personSet.get(i).getHeight(),
			personSet.get(i).getWeight()));
		}
		
		//return personSetStr
		return personSetStr;
	}
}