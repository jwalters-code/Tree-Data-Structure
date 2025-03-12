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

public interface PersonList {
	
	//add method takes Person as input and returns void
	public abstract void add(Person person);
	
	//get method takes an int as input and returns Person at that index
	public abstract Person get(int index);
}