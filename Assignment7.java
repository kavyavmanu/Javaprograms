//Create a method which accepts an array of integer elements and return the second smallest element in the array
class Assignment7
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int arr[]=new int[5];
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Secondsmallest(arr,5);
	}

	public static void Secondsmallest(int[] arr,int n)
	{   int temp=0;
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j <n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The second smallest number is");
        System.out.println(arr[1]);
	}

}
