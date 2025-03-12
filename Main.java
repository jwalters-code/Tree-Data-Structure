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

/*
Q1: Car and Engine are related
by which, Inheritance or Composition?
Composition

Q2: Color and Red are related
by which, Inheritance or Composition?
Inheritance

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
Inheritance

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
Inheritance

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
Composition
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		
		/*
		//test code, instantiate a test Person object
		Person testPerson = new Person("Fabio", 191, 63);
		
		//test code, check if duplicates are excluded
		Person testPerson2 = new Person("Fabio", 191, 63);
		Person testPerson3 = new Person("notFabio", 191, 63);
		
		//test code, print testPerson
		System.out.println(testPerson);
		
		//instantiate a test PersonSet object
		PersonSet testPersonSet = new PersonSet();
		
		//test code, add test persons and print
		testPersonSet.add(testPerson);
		testPersonSet.add(testPerson2); //duplicate, shouldn't add
		testPersonSet.add(testPerson3);
		
		System.out.println(testPersonSet.get(0));
		System.out.println(testPersonSet.get(1));
		
		System.out.println(); //blank line for readability
		
		//test code, check PersonSet toString method
		System.out.println(testPersonSet.toString());
		*/
		
		//instantiate a PersonOrderedSet and a PersonImperialSet
		PersonOrderedSet orderedSet = new PersonOrderedSet();
		PersonImperialSet imperialSet = new PersonImperialSet();
		
		try {
			
			//read in from file
			File hrData = new File(args[0]);
			Scanner fileReader = new Scanner(hrData);
			
			//strip first line, headers
			fileReader.nextLine();
			
			while(fileReader.hasNext()) {
				
				//copy to variables
				String name = fileReader.next();
				double height = fileReader.nextDouble();
				double weight = fileReader.nextDouble();
				
				//create a tempPerson objects
				Person tempPersonO = new Person(name, height, weight);
				Person tempPersonI = new Person(name, height, weight);
				
				//add tempPerson to orderedSet
				orderedSet.add(tempPersonO);
				
				//add tempPerson to PersonImperialSet
				imperialSet.add(tempPersonI);
			}
			
		}
		catch(IOException|ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter a valid file");
			System.exit(1);
		}
	
		//write orderedSet to file
		try
		{	
			FileWriter fileWriterOrder = new FileWriter
				("hr_ordered_set_output.txt");
			fileWriterOrder.write(orderedSet.toString());
			fileWriterOrder.close(); //close fileWriter
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
		
		//write imperialSet to file
		try
		{	
			FileWriter fileWriterImperial = new FileWriter
				("hr_imperial_set_output.txt");
			fileWriterImperial.write(imperialSet.toString());
			fileWriterImperial.close(); //close fileWriter
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(2);
		}
		
		//print orderedSet
		System.out.println(orderedSet.toString());
		
		//print imperialSet
		System.out.println(imperialSet.toString());
	}
}
