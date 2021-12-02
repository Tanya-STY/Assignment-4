import java.util.Scanner;
public class Driver_Ticket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to The Ticketbooth Simulator!\n");
		Boolean valid;
		String ans= "";
	

	do 
	{
		System.out.println("What would you like to do?" +
						   "\n\t 1. See the content of all Ticketbooths" +
						   "\n\t 2. See the content of one Ticketbooth" +
						   "\n\t 3. List Ticketbooths with same amount of tickets' values" +
						   "\n\t 4. List Ticketbooths with same Tickets amount" +
						   "\n\t 5. List Ticketbooths with same amount of tickets values and same number of OPUS cards" +
						   "\n\t 6. Add a OPUS card to an existing Ticketbooth" +
						   "\n\t 7. Remove an existing OPUS card from a Ticketbooth" +
						   "\n\t 8. Update the expiry date of an existing OPUS card" +
						   "\n\t 9. Add Tickets to a Ticketbooth" +
						   "\n\t 0. To quit");
		
		System.out.print("\nPlease enter your choice and press <Enter>: ");
		int choice = sc.nextInt();
		
	if(choice>=0 && choice <=9)
		valid =true;
	
	else
	{
		valid=false;
		System.out.println("\nThe entered choice is not an option. Please enter a new choice!");
	}
	
	
	switch(choice)
		{
		
		case 1:
		{	
			break;
		}
		
		case 2:
		{	
			break;
		}
		
		case 3:
		{	
			break;
		}
		
		case 4:
		{	
			break;
		}
		
		case 5:
		{	
			break;
		}
		
		case 6:
		{	
			break;
		}
		
		case 7:
		{	
			break;
		}
		
		case 8:
		{	
			break;
		}
		
		case 9:
		{	
			break;
		}
		
		case 0:
		{	
			break;
		}
		
		}}
	while(valid ==false || ans.equals("yes"));
	
	
	}
	}
