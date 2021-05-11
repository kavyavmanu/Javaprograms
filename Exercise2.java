
import java.util.Arrays;
 
public class Exercise2 {
  static boolean CheckingAlphabetorder(String s)
    {int n = s.length();
       
    char c[] = new char [n];
       
         for (int i = 0; i < n; i++) 
        {
            c[i] = s.charAt(i);
        }
       
       Arrays.sort(c);
     for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) 
                return false;
               
        return true;    
    }
     
    public static void main(String args[])
    {
       java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.println("Please enter string");
       String s=sc.nextLine();
         
       
        if (CheckingAlphabetorder(s))
           System.out.println("Yes it is in alphabetical order");
        else
            System.out.println("No it is not in alphabetical order");
           
    }
    
}
