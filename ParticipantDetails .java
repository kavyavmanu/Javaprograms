package Kavya;
import java.util.*;

class Partcipant{    
int id;    
String name;    
String skill;    
public Partcipant(int id, String name, String skill) {    
    this.id = id;    
    this.name = name;    
    this.skill = skill;    
      
}   
@Override
public String toString()
{
	return this.id+" "+this.name+" "+this.skill;
}
}    
public class ParticipantDetails { 
public static void main(String[] args) {      
    TreeMap<Integer,Partcipant> map=new TreeMap<Integer,Partcipant>();  
    java.util.Scanner sc=new java.util.Scanner(System.in);
    java.util.Scanner ab=new java.util.Scanner(System.in);
    System.out.println("Hello,can we know your name?");
    String user_input=ab.nextLine();
    
//    while(user_input.equals("exit")==true) {
    	 System.out.println("Do you want to continue or exit?");
    	 String ui=ab.nextLine();
    	 user_input=ui;
    	
    System.out.println("Please enter number of participants");
    int n=sc.nextInt();
    for(int i=1;i<n+1;i++) {
   System.out.println("Please enter id,name and skills");
    int a=sc.nextInt();
    String b=ab.nextLine();
    String c=ab.nextLine();
    
    map.put(a,new Partcipant(a,b,c));
    }
  

    System.out.println(" Details are:");  
   
    for(Map.Entry<Integer,Partcipant> entry:map.entrySet())
    {    
        int key=entry.getKey();  
        Partcipant b=entry.getValue();  
       
        System.out.println(b.id+" "+b.name+" "+b.skill);   
    }    
    System.out.println("Do you want to update?");
     String str=ab.nextLine();
    if(str.equals("yes")) {
    
    System.out.println("How many entries do you want to enter?");
    int num=sc.nextInt();
    {for(int i=1;i<=num;i++) 
              {
    		   System.out.println("Please new enter id,name and skills");
    		    int a=sc.nextInt();
    		    String b=ab.nextLine();
    		    String c=ab.nextLine();    		    
    		    map.put(a,new Partcipant(a,b,c));
    		    }
    }
    }
    else
    	System.out.println("Thank you");
    System.out.println("do you want to delete any record?(yes/no)");
    String res=ab.nextLine();
    if(res.equals("yes")) 
    {
    	System.out.println("please enter the id of the record");
    	 int rec_no=sc.nextInt();
    	map.remove(rec_no);
    	 System.out.println("Record deletion is successfull");
    }
    else
    {
    	System.out.println("Thank you");
    }
    
    System.out.println("Updated details are:");
    for(Map.Entry<Integer,Partcipant> entry:map.entrySet()){    
        int key=entry.getKey();  
        Partcipant b=entry.getValue();  
       
        System.out.println(b.id+" "+b.name+" "+b.skill);   
    } 
//    }
    
   
    
    
    
    
    	
    	
} 

}    
