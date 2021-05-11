//code to accept array of String objects and output should be left half should be in uppercase and other 
//half should be in lower case.If there are odd letter then (n/2)+1 should be uppercase
import java.util.Arrays;
class Exercise6{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Please enter the number of strings");
		int num=sc.nextInt();

		System.out.println("Please enter strings with space one after the other");
		String str=sc.nextLine();

		String[] abc=new String[num];
		abc=str.split(" ");
		String xyz=new String[num];
		String obj1="";
		String obj2=""; 
		int n=0;
		for(String value:abc){
			if((value.length())%2==0)
			{  n=value.length();
				obj1=value.substring(0,((n/2)+1));
				obj1=obj1.toUpperCase();
				obj2=value.substring((n/2)+1);
				obj2=obj2.toLoweCase();
			  }
			 else
			 {
			 	obj1=value.substring(0,((n/2)+2));
				obj1=obj1.toUpperCase();
				obj2=value.substring((n/2)+2);
				obj2=obj2.toLoweCase();
			 }

	}
	System.out.println(obj1+obj2);

}

