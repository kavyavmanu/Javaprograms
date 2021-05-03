//The fibonacci sequence is defined by the following rule.The first 2 values in the sequence are1,1.
//Every subsequent value is the sum of the 2 values preceding it.
//write a java program that uses both recursive and non recursive functions to print the nth value of the Fibonacci sequence
class Assignment2{
	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		int num=6;
		System.out.println("Using recursive method");
		System.out.print(n1+" "+n2);

		recursive(num-2); //because two numbers are already printed
		int num1=0,num2=1,num3;
		System.out.println(" ");
		System.out.println("Using non recursive method");
		System.out.print(num1+" "+num2);
		

		
		//non-recurive function
		for(int i=2;i<num;++i)
		{
		    num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}
	public static void recursive(int num) //using recursive method-a recursice method is nothing but function calling itslef
	{
		if(num>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+ n3);
			recursive(num-1);

		}
	}

}
