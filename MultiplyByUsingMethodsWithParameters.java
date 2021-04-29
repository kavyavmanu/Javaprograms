class MultiplyByUsingMethodsWithParameters{
	public static void main(String[] args) {
		java.util.Scanner theScan = new java.util.Scanner(System.in);

		System.out.println("Enter two numbers to multiply:");

		int firstValue = theScan.nextInt();	
		int secondValue = theScan.nextInt();

		new MultiplyByUsingMethodsWithParameters().multiply(firstValue, secondValue);
	}

	void multiply(int firstValue, int secondValue){
		int result = firstValue * secondValue;

		System.out.println("Result is : " + result);
	}
}

