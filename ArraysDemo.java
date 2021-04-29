class ArraysDemo{
	public static void main(String[] args) {

		 java.util.Scanner scan = new java.util.Scanner(System.in);

		 int []arr = new int[5];

		 System.out.println("Enter 5 numbers:");

		for(int index = 0; index < arr.length; index++){
			arr[index] = scan.nextInt();
		}

	
		for(int value : arr){
			System.out.println(value);
		}
	}
}
