
public class Calculator {
	//add
	public int add (int a, int b) {
		 return a + b;
		}
	//subtract
	public int subtract (int a, int b) {
		 return a - b;
		}
	//multiply
	public int multiply (int b, int a) {
		 return b * a;
		}
	//divide
	public int divide (int a, int b) {
		if(b==0) {
			throw new IllegalArgumentException("Division by zero is not supported");
		}
		 return a / b;
		}



}
