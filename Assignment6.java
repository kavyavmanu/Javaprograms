//create a method which accepts an integer array,reverse the numbers in the array and returns the resulting
//array in sorted order
import java.util.*;
import java.lang.*;
class Assignment6{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int arr[]=new int[5];
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The reversed array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);  //reversing
		}
		
		for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j <arr.length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("sorted order");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + ",");
        }
        // System.out.print(a[arr.length- 1]);
    }
}

		
