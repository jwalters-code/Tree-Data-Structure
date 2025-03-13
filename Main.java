/*
Jade Walters
CSCI 2251
Assignment: Human Resources/Tree Data Structure
Purpose: to practice creating classes and using inheritence, 
using a binary tree to sort data
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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
	
		//personSet options
		//instantiate a PersonOrderedSet
		//PersonOrderedSet orderedSet = new PersonOrderedSet();
		
		//sortedTreeSet option
		//instantiate a SortedTreeSet
		SortedTreeSet sortedTree = new SortedTreeSet();
	
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
				//orderedSet.add(tempPerson);
				
				//SortedTreeSet Option
				//add tempPerson to Sorted Tree
				sortedTree.add(tempPerson);
			}
			
		}
		catch(IOException|ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter a valid file");
			System.exit(1);
		}
		
		//sortedTreeSet option
		//create header for sorted tree
		String headerString = String.format
			("%-10s %10s %10s\n", "Name", "Height(cm)", "Weight(kg)");
	
		//write set to file
		try
		{	
			FileWriter fileWriterOrder = new FileWriter
				("hr_ordered_set_output.txt");
			fileWriterOrder.write(headerString + sortedTree.toString());
			fileWriterOrder.close(); //close fileWriter
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
		
		//personSet option
		//print orderedSet
		//System.out.println(orderedSet.toString());
		
		//SortedTreeSet option
		//print SortedTreeSet, add header
		System.out.println(headerString + sortedTree.toString());
	}
}
