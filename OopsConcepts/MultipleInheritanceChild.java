package OopsConcepts;

public class MultipleInheritanceChild extends MultipleInheritanceParent {
	
public MultipleInheritanceChild() {
		this("AAAA");
		System.out.println("Child non parameterized constuctor class ");
          
	}
	
    public MultipleInheritanceChild(String s) {
		super(s);
		System.out.println("Child parameterized constuctor class " +s);
          
	}
	
	public void M1() {
		System.out.println("Child class M1 method");
	}
	
	public static void M2() {
		
		System.out.println("Child class M2 method");
		
	}
	
	public static void main(String[] args) {
		M2();
		
		MultipleInheritanceChild  child = new MultipleInheritanceChild();
		child.M1();
		
		MultipleInheritanceGrandParent.main(args);;
		MultipleInheritanceParent.Output();
		MultipleInheritanceParent.average();
		
		
	}

	
	
	
	

}
