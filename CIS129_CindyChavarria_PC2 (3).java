
import java.util.Scanner;

public class CIS129_CindyChavarria_PC2 
{
  
	public static void main(String[] args)
	{
	  // First Question
	  Scanner SC = new Scanner(System.in);
	  System.out.println("Hello, Cindy's Travel company appreciates your visit. Are you wanting to go on a vacation today?");
	  String wantToGoOnVaction=SC.nextLine();
	
	
		if (wantToGoOnVaction.equalsIgnoreCase("Yes"))
		{
		  System.out.println("Wonderful!");
		
		}
		 
		else {
		  System.out.println("That Sucks!");
		}
		// Second Question 
		System.out.println( "How much money do you want to spend?");
		System.out.println( "A. 0-2999");
		System.out.println("B. 3000-4999");
		System.out.println("C. 5000+");  
	    
	    String moneySpentOnVacation=SC.nextLine();
	  
	    if(moneySpentOnVacation.equalsIgnoreCase ( "A"))
	    {
	    	System.out.println("With that range on cash, you can afford a staycation");
	        System.out.println("Do you want to go on a staycation?");
	        String staycation=SC.nextLine();
	        if (staycation.equalsIgnoreCase("Yes"))
	        {
	        	System.out.println("Great, let us plan this out!");
	        }
	        else 
	        {
	        	System.out.println("I understand, save up some money and then we can plan for a vacation.");
	        }
	    }
	
	
	    if (moneySpentOnVacation.equalsIgnoreCase ( "B"))
	    {
	    	System.out.println("Trip to Texas");
	    	System.out.println("Do you want to go to Texas?");
	    	String texas =SC.nextLine();
	    	if (texas.equalsIgnoreCase("Yes"))
	    	{
	    		System.out.println("Great, let us plan this Texas trip out!"); 
	    	}
	    	else
	    	{
	    		System.out.println("I understand, save up some money and then we can plan for a vacation.");
	    	}
	    }
	    if (moneySpentOnVacation.equalsIgnoreCase ( "C"));
	    {
	    	System.out.println("Cruise");
	    	System.out.println("Do you want to go on a cruise vacation?");
	    	String cruise =SC.nextLine();
	        if (cruise.equalsIgnoreCase("Yes"))
	        {
	        	System.out.println("Great, let us plan this cruise vaction out!");
	        }
	        else
	        {
	        	System.out.println("I understand, save up some money and then we can plan for a vacation.");
	        }
	    }
	}
}

