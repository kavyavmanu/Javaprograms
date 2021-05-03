class Assignment1
{
	public static void main(String[] args) {
		System.out.println("Please enter the colour");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String color=sc.nextLine();
		switch(color){
			case "red":System.out.println("stop");
			break;
			case "yellow":System.out.println("ready");
			break;
			case "green":System.out.println("go");
			break;
			default:
			System.out.println("invalid color");




		}

	}
}
