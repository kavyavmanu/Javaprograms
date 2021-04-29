class Calculate{
	public static void main(String[] args) {
		Calculate ref = new Calculate();

		
		System.out.println("Addition of numbers is : " + ref.add(6,8));
	}

	int add(int firstValue, int secondValue){
		return firstValue + secondValue;
	}

	int add(int firstValue, int secondValue, int thirdValue){
		return firstValue + secondValue + thirdValue;
	}

	int add(int firstValue, int secondValue, int thirdValue, int fourthValue){
		return firstValue + secondValue + thirdValue + fourthValue;
	}

	int add(int firstValue, int secondValue, int thirdValue, int fourthValue, int fifthValue){
		return firstValue + secondValue + thirdValue + fourthValue + fifthValue;
	}
}
