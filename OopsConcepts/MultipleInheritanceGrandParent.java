package OopsConcepts;

public class MultipleInheritanceGrandParent {
	
	public MultipleInheritanceGrandParent() {
		
		System.out.println("Grandparent non parameterized constuctor class ");
          
	}
	
    public MultipleInheritanceGrandParent(String s) {
		
		System.out.println("Grandparent parameterized constuctor class "+s);
          
	}
	
	public void print() {
		System.out.println("Grandparent class print method");
	}
	
	public static void average() {
		
		System.out.println("Grandparent class Avg method");
		
	}
	
	public static void main(String[] args) {
		average();
		
		MultipleInheritanceGrandParent  grand = new MultipleInheritanceGrandParent();
		grand.print();
		
		
	}

}
