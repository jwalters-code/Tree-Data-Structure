
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

	//TODO sets person data
	//TODO check for duplicates!!!!!!!!!!!!!
	public void add(Person p) {
		
		//if current tree has no person, set person
		if(!hasPerson()) {
			this.person = p;
		}
		
		//check if duplicate
		else if(!isDuplicate(p)) {
			
			//if current tree has person
			//and person is alphabetically before
			//current, set left branch
			
			////if current tree has person
			//and person is alphabetically after/same
			//set right branch
			
		}
	}
	
	//TODO check for duplicate method?????????????
	//method checks to see if person is 
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
	
	//TODO toString method
	
	

	

}