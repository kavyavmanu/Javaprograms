//input-1234
//output-1
// 2
// 3
// 4
// sum=10
//
class Exercise1 
{
	

	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String size="";

		System.out.println("Enter the number of integers giving space between each digit");
		size = sc.nextLine();
		String[] anArray = new String[5];
		anArray=size.split(" ");
		for(String value:anArray)
			System.out.println(value);
		
		int sum=0;
		int j=0;
		for(String i:anArray){
			j=Integer.parseInt(i);
		    sum=sum+j;
		}
		System.out.println(sum);

	}
}
