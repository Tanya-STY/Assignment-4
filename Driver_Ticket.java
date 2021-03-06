// -------------------------------------------------------
// Assignment 4
// Written by: Shamma Sarah Markis (ID# 40211998) and Tanya So Tin Yan (ID# 40208954)
// For COMP 248 Section PJ-X – Fall 2021
// Date: December 6th, 2021
// --------------------------------------------------------

/* General explanation of what my program does:
 *   This is the ticketbooth driver which enables the user to a Ticketbooth simulator in which 
 *   he/she can access different types and quantities of tickets and OPUS cards. The user also has
 *   many other options like updating an expired date, adding new tickets and Opus cards, and many more. */

import java.util.Scanner;

public class Driver_Ticket {
	public static void main(String[] args) {
//Welcome message
		System.out.println("=======================================================================\n\n"
				+ "\tWelcome to Concordia Fall Geek's Ticketbooth Application\n\n"
				+ "=======================================================================");
//Ticketbooth 0
		Tickets tickets1 = new Tickets(5, 1, 0, 1, 1);
		OPUSCard[] opusCards1 = { new OPUSCard("STL-", "M. Cola-", 6, 2023),
				new OPUSCard("RTL-", "C. Venus-", 3, 2025) };
		OPUSCard[] opusCards2 = { new OPUSCard("STL-", "M. Cola-", 6, 2023),
				new OPUSCard("STM-", "Z. Poker-", 3, 2025) };
		Ticketbooth[] ticketbooths = new Ticketbooth[5];
		ticketbooths[0] = new Ticketbooth(tickets1, opusCards1);
		ticketbooths[1] = new Ticketbooth(tickets1, opusCards2);
//Ticketbooth 1
		Tickets tickets2 = new Tickets(5, 3, 5, 5, 0);
		OPUSCard[] opusCards3 = { new OPUSCard("RTL-", "F. Max-", 12, 2021), new OPUSCard("REM-", "T. Flona", 4, 2023),
				new OPUSCard("TRAMREM-", "S. EaFL", 11, 2021) };

		ticketbooths[2] = new Ticketbooth(tickets2, opusCards3);
//Ticketbooth 2
		Tickets tickets3 = new Tickets(0, 2, 1, 1, 1);
		OPUSCard[] opusCards4 = {};
//Ticketbooths 3 and 4
		ticketbooths[3] = new Ticketbooth(tickets3, opusCards4);
		ticketbooths[4] = new Ticketbooth(tickets3, opusCards4);

		boolean quit = true;

//Print the table of contents
		while (quit) {
			System.out.println("\nWhat would you like to do?");
			System.out.println("\t1. See the content of all ticketbooths");
			System.out.println("\t2. See the content of one ticketbooth");
			System.out.println("\t3. List ticketbooths with same amount of ticket's values");
			System.out.println("\t4. List Ticketbooths with same Ticket amount");
			System.out
					.println("\t5. List Ticketbooths with same amount of tickets values and same number of OPUS cards");
			System.out.println("\t6. Add a OPUS card to an existing OPUS Card");
			System.out.println("\t7. Remove an existing OPUS card from a ticketbooth");
			System.out.println("\t8. Update the expiry date of an existing OPUS Card");
			System.out.println("\t9. Add Tickets to a Ticketbooth");
			System.out.println("\t0. To Quit");
			System.out.print("Please enter your choice and press <Enter>: ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

//Switch case based on the user's choice from the table of content
			switch (choice) {
		//See the content of all the Ticketbooths	
			case 1: {

				System.out.println("Content of each Ticketbooth:");
				System.out.println("-----------------------------");
				int count = 0;
				for (int i = 0; i < ticketbooths.length; i++) {
					System.out.println("\nTicketbooth #" + count + '\n' + ticketbooths[i].toString());
					count++;
				}
				break;
			}
		//See the content of one selected Ticketbooth			
			case 2: {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Which Ticketbooth do you want to see the content of? (Enter the number 0 to 4): ");
				int n = scanner.nextInt();
				if (n > 4) {
					System.out.println("Sorry but there is no Ticketbooth number " + n);
					System.out.println("--> Try again: (Enter number 0 to 4): ");
					n = scanner.nextInt();
				}
				System.out.println(ticketbooths[n].toString());
				break;
			}
		//See the list of Ticketbooths with the same amount of tickets' values
			case 3: {
				System.out.println("List of Ticketbooths with same amount of money:\n");
				for (int i = 0; i < ticketbooths.length; i++) {
					for (int j = 1; j < ticketbooths.length; j++) {
						if (ticketbooths[i].equalValues(ticketbooths[j]) && i != j && i < j)
							System.out.println("\tTicketbooths " + i + " and " + j + " both have " + ticketbooths[i].totalTicket());
					}
				}
			}
				break;
		//See the list of Ticketbooths with same Tickets amount			
			case 4: {
				System.out.println("List of Ticketbooths with same Tickets amount:\n");
				for (int i = 0; i < ticketbooths.length; i++) {
					for (int j = 1; j < ticketbooths.length; j++) {
						if (ticketbooths[i].equalNumber(ticketbooths[j]) && i != j && i < j) {
							if (i == 0 || i == 1)
								System.out.println("Ticketbooths " + i + " and " + j + " both have " + tickets1);
							if (i == 2)
								System.out.println("Ticketbooths " + i + " and " + j + " both have " + tickets2);
							if (i == 3 || i == 4)
								System.out.println("Ticketbooths " + i + " and " + j + " both have " + tickets3);
						}
					}
				}

				break;
			}
		//See the list of Ticketbooths with same amount of tickets values and same number of OPUS cards
			case 5: {
				System.out.println("List of Ticketbooths with same amount of tickets values and same number of OPUS cards:");
				for (int i = 0; i < ticketbooths.length; i++) {
					for (int j = 1; j < ticketbooths.length; j++) {
						if ((ticketbooths[i].equalValues(ticketbooths[j]))
								&& (ticketbooths[i].totalOpusNum() == ticketbooths[j].totalOpusNum()) && i != j && i < j) {
							System.out.println("\tTicketbooths " + i + " and " + j); 
						}
					}
				}
				break;
			}
		//Case in which the user can add an OPUS card to an existing Ticketbooth
			case 6: {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Which Ticketbooth do you want to add a OPUS card to? (Enter number 0 to 4): ");
				int TickChoice = scanner.nextInt();
				scanner.nextLine();
				if (TickChoice > 4) {
					System.out.println("Sorry but there is no Ticketbooth number " + TickChoice);
					System.out.print("--> Try again: (Enter number 0 to 4): ");
					TickChoice = scanner.nextInt();
					scanner.nextLine();
				}
				System.out.println("Please enter the following information so that we may complete the transaction -");
				System.out.print("---> Type of OPUS card (STL, RTL, etc ..): ");
				String opusType = scanner.nextLine();
				
				System.out.print("---> Full name on OPUS card: ");
				String cardHolder = scanner.nextLine();
				
				System.out.print("---> Expiry month number and year (seperate by a space): ");
				int month = scanner.nextInt();
				int year = scanner.nextInt();
				
				System.out.println("You now have " + ticketbooths[TickChoice].addOpusCard(new OPUSCard(opusType, cardHolder, month, year)) + " OPUS cards");
				break;
			}
		//Case in which the user removes an existing OPUS card from a Ticketbooth
			case 7: {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Which Ticketbooth do you want to remove a OPUS card from? (Enter number 0 to 4): ");
				int n = scanner.nextInt();
				if (ticketbooths[n].totalOpusNum() == 0)
					System.out.println("Sorry that Ticketbooth has no cards");
				else {
					System.out.print("(Enter card number 0 to 1): ");
					int cardMinus = scanner.nextInt();
						if (ticketbooths[n].removeCard(cardMinus))
							System.out.println("Card was removed successfully");
				}
				break;
			}
		//Case in which the user can update the expiry date of an existing OPUS card
			case 8: {
				
				int AddCard;
				int AddCard2;
				Scanner keyboard = new Scanner(System.in);
				do
				{
					System.out.print("Which ticketbooth do you want to update an OPUS card from? (Enter number 0 to 4): ");
					AddCard = keyboard.nextInt();
				}
				while(AddCard < 0 || AddCard > 4);
				if(AddCard == 0)
				{
					if(opusCards1.length == 0)
					{
						System.out.println("The ticketbooth has no cards!\n");
					}
					else
					{
						System.out.print("Which card do you want to update? (Enter card number 0 to " + (opusCards1.length -1) + "): ");
						AddCard2 = keyboard.nextInt();
						while (AddCard2 < 0 || AddCard2 > opusCards1.length - 1 )
						{
							System.out.println("The is no card number " + AddCard2);
							System.out.print("--> Try Again: " + "\n(Enter card number 0 to " + (opusCards1.length -1) + "): ");
							AddCard2 = keyboard.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int NewMonth = keyboard.nextInt();
						int NewYear = keyboard.nextInt();
						
						opusCards1[AddCard2].setExp_Month(NewMonth);
						opusCards1[AddCard2].setExp_Year(NewYear);
						
						System.out.println("Expire date updated.\n");
					}
				}
				if(AddCard == 1)
				{
					if(opusCards2.length == 0)
					{
						System.out.println("The ticketbooth has no cards!\n");
					}
					else
					{
						System.out.print("Which card do you want to update? (Enter card number 0 to " + (opusCards2.length -1) + "): ");
						AddCard2 = keyboard.nextInt();
						while (AddCard2 < 0 || AddCard2 > opusCards2.length - 1 )
						{
							System.out.println("The is no card number " + AddCard2);
							System.out.print("--> Try Again: " + "\n(Enter card number 0 to " + (opusCards2.length -1) + "): ");
							AddCard2 = keyboard.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int NewMonth = keyboard.nextInt();
						int NewYear = keyboard.nextInt();
						
						opusCards2[AddCard2].setExp_Month(NewMonth);
						opusCards2[AddCard2].setExp_Year(NewYear);
						
						System.out.println("Expire date updated.\n");
					}
				}
				if(AddCard == 2)
				{
					if(opusCards2.length == 0)
					{
						System.out.println("The ticketbooth has no cards!\n");
					}
					else
					{
						System.out.print("Which card do you want to update? (Enter card number 0 to " + (opusCards3.length -1) + "): ");
						AddCard2 = keyboard.nextInt();
						while (AddCard2 < 0 || AddCard2 > opusCards3.length - 1 )
						{
							System.out.println("The is no card number " + AddCard2);
							System.out.print("--> Try Again: " + "\n(Enter card number 0 to " + (opusCards3.length -1) + "): ");
							AddCard2 = keyboard.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int NewMonth = keyboard.nextInt();
						int NewYear = keyboard.nextInt();
						
						opusCards3[AddCard2].setExp_Month(NewMonth);
						opusCards3[AddCard2].setExp_Year(NewYear);
						
						System.out.println("Expire date updated.\n");
					}
				}
				if(AddCard == 3)
				{
					if(opusCards3.length == 0)
					{
						System.out.println("The ticketbooth has no cards!\n");
					}
					else
					{
						System.out.print("Which card do you want to update? (Enter card number 0 to " + (opusCards3.length -1) + "): ");
						AddCard2 = keyboard.nextInt();
						while (AddCard2 < 0 || AddCard2 > opusCards3.length - 1 )
						{
							System.out.println("The is no card number " + AddCard2);
							System.out.print("--> Try Again: " + "\n(Enter card number 0 to " + (opusCards3.length -1) + "): ");
							AddCard2 = keyboard.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int NewMonth = keyboard.nextInt();
						int NewYear = keyboard.nextInt();
						
						opusCards3[AddCard2].setExp_Month(NewMonth);
						opusCards3[AddCard2].setExp_Year(NewYear);
						
						System.out.println("Expire date updated.\n");
					}
				}
				if(AddCard == 4)
				{
					if(opusCards4.length == 0)
					{
						System.out.println("The ticketbooth has no cards!\n");
					}
					else
					{
						System.out.print("Which card do you want to update? (Enter card number 0 to " + (opusCards4.length -1) + "): ");
						AddCard2 = keyboard.nextInt();
						while (AddCard2 < 0 || AddCard2 > opusCards4.length - 1 )
						{
							System.out.println("The is no card number " + AddCard2);
							System.out.print("--> Try Again: " + "\n(Enter card number 0 to " + (opusCards4.length -1) + "): ");
							AddCard2 = keyboard.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int NewMonth = keyboard.nextInt();
						int NewYear = keyboard.nextInt();
						
						opusCards4[AddCard2].setExp_Month(NewMonth);
						opusCards4[AddCard2].setExp_Year(NewYear);
						
						System.out.println("Expire date updated.\n");
					}
				}
				
				break;
			}
		//Case in which the user can add Tickets to a Ticketbooth
			case 9: {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Which Ticketbooth do you want to add tickets to? (Enter number 0 to 4): ");
				int n = scanner.nextInt();
				System.out.print("How many regular, junior, senior, daily and weekly do you want to add? (Enter 5 numbers seperated by a space): ");
				int regular = scanner.nextInt();
				int junior = scanner.nextInt();
				int senior = scanner.nextInt();
				int daily = scanner.nextInt();
				int weekly = scanner.nextInt();
				
				System.out.print("You now have $" + ticketbooths[n].addTickets(regular, junior, senior, daily, weekly) + '\n');
				break;
			}
		//Switch case to leave the application
			case 0:
				quit = false;
				System.out.println("Thank you for using Concordia Fall Geek's Ticketbooth application!!");
				break;
			default:
				System.out.println("Sorry that is not a valid choice. Please try again.");
			}
		}
	}
}
