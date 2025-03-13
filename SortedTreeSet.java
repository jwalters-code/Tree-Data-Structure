
public class SortedTreeSet implements SortedTreeSetInterface {
	
	//instance variables
	private Tree root;
	private Tree leftBranch;
	private Tree rightBranch;
	private boolean hasPerson;  //has person data
	private Person person; //takes person object
	
	//default constructor
	public SortedTreeSet() {
		this.root = null
		this.leftBranch = null;
		this.rightBranch = null;
		this.hasPerson = false;
		this.person = null;
	}
	
	//returns person data
	public Person getPerson() {
		return person;
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

	//sets person data
	public void add(Person p) {
		
	}
	

}