//Write a java program that prompts the user for an integer and then prints out all the prime numbers up to that integer
class Assignment3{
	static void primenum(int n)
	{ int i,j,flag;

		for( i=1;i<n;i++)
		{
			if(i==0||i==1)
		{
			continue;
		}
		flag=1;
			for(j=2;j<=i/2;++j){
			if(i%j==0)
		    {
				flag=0;
				break;
				
			}
		}
		if(flag==1)
		{
			System.out.println(i+" ");
		}
		}
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		primenum(num);
    
	
	}
}
