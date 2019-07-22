package day06;

//nested (inner class)

// a. non-static inner class
// b. static inner class
// c. method local inner class
// d. anonymous inner class

// example of non-static, static and method local inner class

class JPMorgan{
	
	void adminAccess() {
		
		class AdminJPMC{
			void display() {
				System.out.println("Hello I am in Admin");
			} //end of display
			
		 } //end of AdminJPMC
		
		// create object of AdminJPMC
		AdminJPMC refAdminJPMC = new AdminJPMC();
		refAdminJPMC.display();
		
	} //end of adminAccess
	
	static void adminAccess2() {
		
		class FinanceJPMC{
			
			void display() {
				System.out.println("Hello I am in Finance");
			} //end of display
			
		 } //end of FinanceJPMC
		
		// Create object of FinanceJPMC
		FinanceJPMC refFinanceJPC = new FinanceJPMC();
		refFinanceJPC.display();
	   
	} //end of adminAccess2
  } //end of JPMorgan
	

public class NestedClassExample01 {
	
	public static void main(String[] args) {
		
		// how to call display method and get the output?
		
		JPMorgan.adminAccess2(); //Invoke method
		
		JPMorgan refJPmorgan = new JPMorgan(); //Create a new object of the class
		refJPmorgan.adminAccess(); //Invoke method
		
	}

}
