//create a method to find the sum of the cubes ofthe digits of an n digit number
//123-------->1^3+2^3+3^3=36
class Assignment5{
	
	static int sum=0;
	static int temp=0;
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		while(num>0)
		{                         //1st                    2nd               3rd
			
			temp=num%10; //123%10=3 i.e,temp=3           temp=12%10=2         temp=1%10=1

			num=num/10;  //123/10=12 i.e. num=12        num=12/10=1            num=1/10=0.1=0
			sum=sum+(temp*temp*temp);//sum=27            sum=27+2^3=35         sum=35+1=36
}
		System.out.println(sum);
	}
}
