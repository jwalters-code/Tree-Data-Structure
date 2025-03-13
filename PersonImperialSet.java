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

public class PersonImperialSet extends PersonSet {
	
	//method converts metrics to Imperial and adds person object to array list
	@Override
	public void add(Person person) {
	
		/* convert height cm to inches & weight kg to pounds
		 * cast to int to round/truncate so duplicate method will work
		 * source: https://www.wikihow.com/Convert-Centimeters-to-Inches
		 * source: https://www.wikihow.com/Convert-Kilograms-to-Pounds */
		person.setHeight((int)(person.getHeight() * 0.394));
		person.setWeight((int)(person.getWeight() * 2.2));
		
		//add imperialPerson to personSet
		super.add(person);
	}
	
	//toString method returns formatted array data with column headers
	@Override
	public String toString() {
		String imperialString = String.format("%-8s %-15s %15s\n", "Name", "Height (in)", "Weight (lbs)");
		imperialString = imperialString + super.toString();
		return imperialString;
	}
}