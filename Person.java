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

public class Person {
	
	//instance variables for name, height, weight
	private String name;
	private double height;
	private double weight;
	
	//constructor
	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
		
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//getter for name
	public String getName() {
		return this.name;
	}
	
	//setter for height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter for height
	public double getHeight() {
		return this.height;
	}
	
	//setter for weight
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//getter for weight
	public double getWeight() {
		return this.weight;
	}
	
	//toSring method returns Person data in database-ready format
	@Override
	public String toString() {
		String personData = String.format("%-10s %10.0f %10.0f", name, height, weight);
		return personData;
	}
}