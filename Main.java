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

/*Your task is to create a self-sorting, binary tree set that can be used in place of the PersonOrderedSet used in the Nintendo Human Resources assignment.

If implemented correctly, minimal changes to Main.java will be needed to your Human Resources code.

An interface is provided to guide your design of SortedTreeSet. Your SortedTreeSet.java class should implement the interface and also have a toString method. You can add more methods if you wish.

IMPORTANT: You do NOT need to implement the get method in your tree. You can remove any calls to get from Main.java. You do NOT need to implement anything equivalent to the PersonImperialSet and all code related to the PersonImperialSet can either be deleted from Main or left alone.

IMPORTANT 2: The data in the tree MUST remain sorted at all times and must never contain duplicate names. In other words, as the data is added to the tree, it must be automatically inserted in sorted order. You will not get full credit for sorting or removing duplicates after all the data has been inserted.

IMPORTANT 3: Turn in all of your human resources code including the adjusted Main.java along with SortedTreeSet.java.


Although the following is optional, you might consider adding the following methods and attributes:

A reference to a Tree node's parent and getParent method.

A method to check if the Tree is balanced...
https://www.digitalocean.com/community/tutorials/balanced-binary-tree-check
...and possibly another method to balance the tree if it is unbalanced!

If you implement a get method that gets values from the tree based on an index then the SortedTreeSet could implement the PersonList interface! Again, this is not mandatory.
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
		
		//personSet options
		//instantiate a PersonOrderedSet
		//PersonOrderedSet orderedSet = new PersonOrderedSet();
		
		//TODO SortedTreeSet option
		//instantiate a SortedTreeSet
		
		
		
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
				Person tempPerson = new Person(name, height, weight);
				
				
				//PersonOrderedSet option
				//add tempPerson to orderedSet
				//orderedSet.add(tempPersonO);
				
				//TODO SortedTreeSet Option
				
				
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
			//fileWriterOrder.write(personTree.toString());
			fileWriterOrder.close(); //close fileWriter
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
		
		/*
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
		}*/
		
		//personSet option
		//print orderedSet
		//System.out.println(orderedSet.toString());
		
		//print imperialSet
		//System.out.println(imperialSet.toString());
		
		//TODO SortedTreeSet option
		//print SortedTreeSet
		//System.out.println(personTree.toString());
		
		
		
	}
}
