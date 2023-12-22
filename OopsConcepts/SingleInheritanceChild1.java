package OopsConcepts;

public class SingleInheritanceChild1 extends SingleInheritanceParent {  // here we create same method which are already created in parent class
	public void m1() {
		
		System.out.println("Single Inheritance Child m1 method");
	}
	
	public void run() {
		super.m1();  // this will call parent m1 method
		this.m1(); // this will call child1 m1 method
		super.m2(); // this will call parent m2 method
	}
	
	
	public static void main(String[] args) {
		SingleInheritanceChild1 singleinheritancechild1 = new SingleInheritanceChild1();
		singleinheritancechild1.m1();// called child1 m1 non static method becuse m1 method is present in child1 class
		m2();                         // called parent m2  static method because m2 method is not present in child1 class
		
		singleinheritancechild1.a =100; // this will show you the updated value which is initialized in same class so a =100, in parent a=121
		System.out.println(singleinheritancechild1.a);
		
		singleinheritancechild1.run();
		
		SingleInheritanceParent parentChild = new SingleInheritanceChild1();// whenever you create parent class object it will first call parent class constructor
		System.out.println(parentChild.a); // then will call value of a
		
		
	}
	
	
	

}
