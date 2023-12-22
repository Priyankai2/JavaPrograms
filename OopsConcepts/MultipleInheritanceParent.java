package OopsConcepts;

public class MultipleInheritanceParent extends MultipleInheritanceGrandParent {
public MultipleInheritanceParent() {
	this("XXXX");
		System.out.println("Parent non parameterized constuctor class ");
          
	}
	
    public MultipleInheritanceParent(String s) {
    
    	 
		System.out.println("Parent parameterized constuctor class " +s);
          
	}
	
	public void Number() {
		System.out.println("Parent class Number method");
	}
	
	public static void Output() {
		
		System.out.println("Parent class Output method");
		
	}
	
	public static void main(String[] args) {
		Output();
		
		MultipleInheritanceParent  parent = new MultipleInheritanceParent();
		parent.Number();
		
		MultipleInheritanceGrandParent.main(null);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
