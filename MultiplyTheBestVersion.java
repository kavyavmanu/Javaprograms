class MultiplyTheBestVersion{
	public static void main(String[] args)
	{
         new MultiplyTheBestVersion().input();
	}
	void input()
	{
		System.out.println("Enter any two numbers");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int firstValue=sc.nextInt();
		int secondValue=sc.nextInt();
		multiply(firstValue,secondValue);


	}
	void multiply(int firstValue,int secondValue)
	{
           outputDisplay(firstValue*secondValue);
	}
	void outputDisplay(int result)
	{
		System.out.println("the result is"+ result);
	}
}
