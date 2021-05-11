//To check whether the employee name ends with _job and there should be at least minimum of 8 characters to the left of the job
class Exercise3{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Please enter username");
		String str=sc.nextLine();
		if(Checkname(str))
		System.out.println("Employee username is valid");
		else
			System.out.println("Employee username is invalid");

	}
	
	public static boolean Checkname(String s)
	{
		int n=s.length();
		if(s.endsWith("_job") && s.substring(0,n-1).length()>=12)
		{
			return true;
		}
		return false;
			
	}
}

