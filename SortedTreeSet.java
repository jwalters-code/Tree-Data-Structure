
public class SortedTreeSet implements SortedTreeSetInterface {
	
	//instance variables
	private SortedTreeSet root;
	private SortedTreeSet leftBranch;
	private SortedTreeSet rightBranch;
	//private boolean hasPerson;  //has person data  //TODO DELETE IF METHOD VERSION WORKS
	private Person person; //takes person object
	
	//default constructor
	public SortedTreeSet() {
		this.root = null;
		this.leftBranch = null;
		this.rightBranch = null;
		//this.hasPerson = false;  //TODO DELETE IF METHOD VERSION WORKS
		this.person = null;
	}
	
	//returns person data
	public Person getPerson() {
		return person;
	}
	
	//IS THIS BETTER??? DOES IT WORK???
	//returns true if person data is not null
	public boolean hasPerson() {
		return person != null;
	}
	
	//returns true if has a left branch
	public boolean hasLeft() {
		return leftBranch != null;
	}
	
	//sets leftBranch
	public void setLeft(SortedTreeSet left) {
		this.leftBranch = left;
	}
	
	//returns leftBranch
	public SortedTreeSet getLeft() {
		return leftBranch;
	}

	//returns true if has a right branch
	public boolean hasRight() {
		return rightBranch != null;
	}
	
	//sets rightBranch
	public void setRight(SortedTreeSet right) {
		this.rightBranch = right;
	}
	
	//returns rightBranch
	public SortedTreeSet getRight() {
		return rightBranch;
	}

	//adds new person to tree in alphabetical order
	public void add(Person p) {
		
		//if current tree has no person, set person
		if(!hasPerson()) {
			this.person = p;
		}
		
		//check if duplicate
		else if(!isDuplicate(p)) {
			
			//if p is alphabetically before person, set p to left branch
			if(p.getName().compareToIgnoreCase(person.getName()) < 0) { 
				
				//if leftBranch is null, create it
				if(leftBranch == null) {
					leftBranch = new SortedTreeSet();
					leftBranch.root = this;
				}
				
				//else call add on leftBranch
				leftBranch.add(p);
			}
			
			//if p is alphabetically after or equal to person, set p to right branch
			else if(p.getName().compareToIgnoreCase(person.getName()) >= 0) {
				
				//if rightBranch is null, create it
				if(rightBranch == null) {
					rightBranch = new SortedTreeSet();
					rightBranch.root = this;
				}
				
				//else call add on rightBranch
				rightBranch.add(p);
			}
		}
	}

	//checks if duplicate person
	public boolean isDuplicate(Person p) {
		
		//return false is person is null
		if(!hasPerson()) {
			return false;
		}
		
		//compare person attributes, return true if all match
		else if(person.getName().equalsIgnoreCase(p.getName())) {
			if(person.getHeight() == p.getHeight()) {
				if(person.getWeight() == p.getWeight()) {
					return true;
				}
			}
		}
		return false;  //not same attributes
	}
	
	//toString method
	@Override 
	public String toString() {
		
		//create sorted tree String
		String treeString = "";
		
		//move down left branch
		if(hasLeft()) {
			treeString += leftBranch.toString();
		}
		
		//concat current person
		treeString += person + "\n";
		
		//move down right branch
		if(hasRight()) {
			treeString += rightBranch.toString();
		}
		return treeString;
	}
}