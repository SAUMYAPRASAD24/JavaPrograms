class betterVersionOfMethods
{
    public static void main(String[] args) {

		System.out.println("Result is : " + new betterVersionOfMethods().userInput());
	
	}

	 void userInput(){
    	    java.util.Scanner theScan = new java.util.Scanner(System.in);
    		System.out.println("Enter two numbers to multiply:");
    		int first = theScan.nextInt();	
    		int second = theScan.nextInt();
            multiply(first, second);
	}
}
    int multiply(int first, int second){
		return (first * second);
	}
