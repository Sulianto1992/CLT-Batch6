package day06;

public class NestedClassExample02 {
	
	class MyInnerClass1 { //non-static inner class
		void myMethod1() {
			System.out.println("I am in MyInnerClass1 ==> myMethod1");
			
		}
		/*
		static void myMethod2() { //compilation error, we can't write static method in non-static inner class
			
			
		}
		*/
		
	} //end of MyInnerClass1
	
	static class MyInnerClass2{ //static inner class
		
        void myMethod3() {
        	System.out.println("I am in MyInnerClass2 ==> myMethod3");
        	
        	MyInnerClass2 refMyInnerClass2 = new MyInnerClass2();
        	refMyInnerClass2.myMethod3();
		}
        
		static void myMethod4() { //compilation error, we can't write static method in non-static inner class
			System.out.println("I am in MyInnerClass2 ==> myMethod4");
			
		}
	} //end of MyInnerClass2
	
	void access() { //method local inner class
		
		class MyInnerClass3{ //method local inner class
			
			void myMethod5() {
				System.out.println("I am in MyInnerClass3 ==> myMethod5");
				
			}
			
			/*static void myMethod6() { //compilation error, we can't write static method inside non-static inner class
				
			}*/
			
		}// end of MyInnerClass3
	} //end of access

	
	public static void main(String[] args) {
		
		//TODO Auto-generated method stub
		//Invoke Method 1
		NestedClassExample02 outer = new NestedClassExample02();
		NestedClassExample02.MyInnerClass1 inner = outer.new MyInnerClass1();
		inner.myMethod1();
		
		//Invoke Method 3
		//NestedClassExample02 
		
		//Invoke Method 4
		NestedClassExample02.MyInnerClass2.myMethod4();
		
	}
	
}
