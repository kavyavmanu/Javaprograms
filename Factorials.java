class Factorials{
	public static void main(String[] args)
	{
		int i,fact=1;
		System.out.println("enter a number");
		int num=new java.util.Scanner(System.in).nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;

		}
		System.out.print(fact);
	}
}
