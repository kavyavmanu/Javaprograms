//create a method to accept date and print the duration in days,months, and years with regards to current system date
//for ex date=07/06/1998 output shld be 23 years,
import java.time.*;
import java.util.*;

public class Assignment4{  
   public static void main(String[] args)
    {
    	java.util.Scanner sc=new java.util.Scanner(System.in);
    	java.util.Scanner ab=new java.util.Scanner(System.in);

    	java.util.Scanner cd=new java.util.Scanner(System.in);
    	System.out.println("Enter year");
    	int year=sc.nextInt();
    	System.out.println("Enter month");
    	int month=ab.nextInt();
    	System.out.println("Enter date");
    	int date=cd.nextInt();
    	getdate(year,month,date);

       
  }
  public static void getdate(int year,int month,int date)
  {
  	 LocalDate pdate = LocalDate.of(year,month,date);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}
