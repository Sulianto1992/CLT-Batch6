package packA;

public class MyClassC extends MyClassA{

	void accessMyClassA() { // within the class
		
		
	    MyClassA refMyClassA = new MyClassA();
	    
		// System.out.println(refMyClassA.number1); // can't access, since it is private
		//System.out.println(refMyClassA.number2); // can't access, since it is default
		System.out.println(super.number3); // to call super class data member
		System.out.println(refMyClassA.number4); //public can access outside the package
		
	}
}
