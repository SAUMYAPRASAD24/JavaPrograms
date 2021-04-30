class SomeExampleByUsingThis{
	
	int firstNum, secondNum, result;
	public static void main(String[] args) {

		new SomeExampleByUsingThis().userInput();
	
	}

	void userInput(){
		java.util.Scanner theScan = new java.util.Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		this.firstNum = theScan.nextInt();	
		this.secondNum = theScan.nextInt();
		this.multiply();
		this.takeModulus();
	}
	void multiply(){
		this.result = firstNum * secondNum;
		System.out.println(this.result);
		 this.displayOutput();
	}
	void takeModulus(){
		this.result = firstNum % secondNum;
		System.out.println(this.result);
		 this.displayOutput();
	}

	void displayOutput(){
		System.out.println("Result is : " + this.result);
		System.out.println(this.firstNum);
	}
}