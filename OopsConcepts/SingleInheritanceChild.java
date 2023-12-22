package OopsConcepts;

// childClassName extends ParentClass

public class SingleInheritanceChild extends SingleInheritanceParent {
	
	 SingleInheritanceChild() {
		
		 this("ABCDEFG");     // this() method is used to call the parameterized and non parameterized constructor of same class
		 System.out.println("Single Inheritance child Constructor");
	}
	
	SingleInheritanceChild(String s){
		super(s);   // super() method is used to call the parameterized constructor of parent class
		            // if super() method not written then it will call non parameterized parent constructor class
		            // also we can use super method in only constructor on first line
		
		System.out.println("Single Inheritance Child Constructor with parameter "+s);
		
	}

	public static void main(String[] args) {
	
		SingleInheritanceChild singleinheritancechild = new SingleInheritanceChild();
		singleinheritancechild.m1();  // called parent m1 non static method
		m2();                         // called parent m2  static method
		System.out.println(singleinheritancechild.a); // called parent int value of a
		
		
	}
	
	// 1.after execution it will first call parent constructor by default
	// 2. second it will call parent parameterized constructor
	// 3. It will call child constructor then m1 ,m2 and value of a
}
