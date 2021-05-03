//create a method which can calculate the sum of first n natural number which are divisible by 3 or 5.
class Assignment8{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int num=sc.nextInt();
		calulation(num);
		
	}
	public static void calulation(int n)
	{ int sum=0;
		for(int i=0;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{ 
				sum=sum+i;

			}
		}
		System.out.println(sum);
	}
}
