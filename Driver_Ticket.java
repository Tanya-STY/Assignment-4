import java.util.Scanner;

public class Driver_Ticket {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to The Ticketbooth Simulator!");
		int choice;
		String ans = "";

		// 1st ticketbooth: 2 ticketbooths have exactly the same ticket distribution and
		// the same number of OPUS CARDS.
		Tickets T1 = new Tickets(4, 3, 2, 1, 0); // 33.5$
		Tickets T2 = new Tickets(4, 3, 2, 1, 0);
		OPUSCard O1 = new OPUSCard("STM", OPUSCard.card_holder, 2023, 10);
		OPUSCard O2 = new OPUSCard("STM", OPUSCard.card_holder, 2022, 11);
		OPUSCard O3 = new OPUSCard("STM", OPUSCard.card_holder, 2023, 10);
		OPUSCard O4 = new OPUSCard("STM", OPUSCard.card_holder, 2022, 11);
		OPUSCard[] array_1 = { O1, O2 };
		OPUSCard[] array_2 = { O3, O4 };
		Ticketbooth Tb1 = new Ticketbooth(T1, array_1);
		Ticketbooth Tb2 = new Ticketbooth(T2, array_2);

		Tickets T3 = new Tickets(1, 4, 0, 2, 0); // 33.5 $, t3 = t1 (value)
		OPUSCard O5 = new OPUSCard("STM",OPUSCard.card_holder, 2023, 10);
		OPUSCard O6 = new OPUSCard("TMS",OPUSCard.card_holder, 2023, 10);
		OPUSCard O7 = new OPUSCard("MTS",OPUSCard.card_holder, 2023, 10);
		OPUSCard O8 = new OPUSCard("MTS",OPUSCard.card_holder, 2023, 10);
		OPUSCard[] array_3 = { O5, O6, O7, O8 };
		Ticketbooth Tb3 = new Ticketbooth(T3, array_3);
		
		Tickets T4 = new Tickets();
		Tickets T5 = new Tickets(0,0,40,0,0);
	    OPUSCard[] array_4 = {};
	    OPUSCard[] array_5 = {};
	    Ticketbooth Tb4 = new Ticketbooth(T4, array_4);
	    Ticketbooth Tb5 = new Ticketbooth(T5, array_5); 
	    
		do {
			System.out.println("\nWhat would you like to do?" + "\n\t 1. See the content of all Ticketbooths"
					+ "\n\t 2. See the content of one Ticketbooth"
					+ "\n\t 3. List Ticketbooths with same amount of tickets' values"
					+ "\n\t 4. List Ticketbooths with same Tickets amount"
					+ "\n\t 5. List Ticketbooths with same amount of tickets values and same number of OPUS cards"
					+ "\n\t 6. Add a OPUS card to an existing Ticketbooth"
					+ "\n\t 7. Remove an existing OPUS card from a Ticketbooth"
					+ "\n\t 8. Update the expiry date of an existing OPUS card" + "\n\t 9. Add Tickets to a Ticketbooth"
					+ "\n\t 0. To quit");

			System.out.print("\nPlease enter your choice and press <Enter>: ");
			choice = sc.nextInt();
			
			int Tb_choice = 0;
			
			boolean switch_valid = true;
			boolean card_valid = true;

			switch (choice) {

			case 1: {
				System.out.println("Content of all Ticketbooth:");
				System.out.println("-----------------------------");
				System.out.println("\nTicketbooth #0\n----------------------\n" + Tb1);
				System.out.println("\nTicketbooth #1\n----------------------" + Tb2);
				System.out.println("\nTicketbooth #2\n----------------------" + Tb3);
				System.out.println("\nTicketbooth #3\n----------------------" + Tb4);
				System.out.println("\nTicketbooth #3\n----------------------" + Tb5);
				break;
			}

			case 2: {
				break;
			}

			case 3: {
				if (Tb1.equalNumber(Tb1, Tb2) == true)
				{
					System.out.println("Ticketbooths 1 and 2 have $" + Tb1.totalTicket());
				}
				if (Tb1.equalNumber(Tb1, Tb3) == true)
				{
					System.out.println("Ticketbooths 1 and 3 have $" + Tb1.totalTicket());
				}
				if (Tb1.equalNumber(Tb1, Tb4) == true)
				{
					System.out.println("Ticketbooths 1 and 4 have $" + Tb1.totalTicket());
				}
				if (Tb1.equalNumber(Tb1, Tb5) == true)
				{
					System.out.println("Ticketbooths 1 and 5 have $" + Tb1.totalTicket());
				}
				if (Tb2.equalNumber(Tb2, Tb3) == true)
				{
					System.out.println("Ticketbooths 2 and 3 have $" + Tb2.totalTicket());
				}
				if (Tb2.equalNumber(Tb2, Tb4) == true)
				{
					System.out.println("Ticketbooths 2 and 4 have $" + Tb2.totalTicket());
				}
				if (Tb2.equalNumber(Tb2, Tb5) == true)
				{
					System.out.println("Ticketbooths 2 and 5 have $" + Tb2.totalTicket());
				}
				if (Tb3.equalNumber(Tb3, Tb4) == true)
				{
					System.out.println("Ticketbooths 3 and 4 have $" + Tb3.totalTicket());
				}
				if (Tb3.equalNumber(Tb3, Tb5) == true)
				{
					System.out.println("Ticketbooths 3 and 5 have $" + Tb3.totalTicket());
				}
				if (Tb4.equalNumber(Tb4, Tb5) == true)
				{
					System.out.println("Ticketbooths 4 and 5 have $" + Tb4.totalTicket());
				}
				
				else
				{
					System.out.println("There are no two Ticketbooths that are equal in ticket value");
				}
				break;
			}

			case 4: {
				if (Tb1.equalNumber(Tb1, Tb2) == true)
				{
					System.out.println("Ticketbooths 1 and 2 have " + T1);
				}
				if (Tb1.equalNumber(Tb1, Tb3) == true)
				{
					System.out.println("Ticketbooths 1 and 3 have " + T1);
				}
				if (Tb1.equalNumber(Tb1, Tb4) == true)
				{
					System.out.println("Ticketbooths 1 and 4 have " + T1);
				}
				if (Tb1.equalNumber(Tb1, Tb5) == true)
				{
					System.out.println("Ticketbooths 1 and 5 have " + T1);
				}
				if (Tb2.equalNumber(Tb2, Tb3) == true)
				{
					System.out.println("Ticketbooths 2 and 3 have " + T2);
				}
				if (Tb2.equalNumber(Tb2, Tb4) == true)
				{
					System.out.println("Ticketbooths 2 and 4 have " + T2);
				}
				if (Tb3.equalNumber(Tb3, Tb4) == true)
				{
					System.out.println("Ticketbooths 3 and 4 have " + T3);
				}
				if (Tb3.equalNumber(Tb3, Tb5) == true)
				{
					System.out.println("Ticketbooths 3 and 5 have " + T3);
				}
				
				if (Tb4.equalNumber(Tb4, Tb5) == true)
				{
					System.out.println("Ticketbooths 4 and 5 have " + T4);
				}
				
				else 
				{
					System.out.println("There are no two Ticketbooths with the same tickets distribution");
				}
				
				break;
			}

			case 5: {
				if (Tb1.equals(Tb2) == true)
				{
					System.out.println("Ticketbooths 1 and 2 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb1.equals(Tb3) == true)
				{
					System.out.println("Ticketbooths 1 and 3 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb1.equals(Tb4) == true)
				{
					System.out.println("Ticketbooths 1 and 4 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb1.equals(Tb5) == true)
				{
					System.out.println("Ticketbooths 1 and 5 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb2.equals(Tb3) == true)
				{
					System.out.println("Ticketbooths 2 and 3 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb2.equals(Tb4) == true)
				{
					System.out.println("Ticketbooths 2 and 4 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb2.equals(Tb5) == true)
				{
					System.out.println("Ticketbooths 2 and 5 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb3.equals(Tb4) == true)
				{
					System.out.println("Ticketbooths 3 and 4 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb3.equals(Tb5) == true)
				{
					System.out.println("Ticketbooths 3 and 5 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				if (Tb4.equals(Tb5) == true)
				{
					System.out.println("Ticketbooths 4 and 5 have the same amount of Ticket values and the same number of OPUS Cards");
				}
				else 
				{
					System.out.println("There are no two Ticketbooths whose content are equal");
				}
				break;
			}

			case 6: {
				while (switch_valid)
				{
					System.out.println("\nWhich Ticketbooth would you like to add an OPUS card to? (Enter number 0 to 4): ");
					Tb_choice = sc.nextInt()-1;
					
				//ticketbooth #0	
					if(Tb_choice ==0)
					{
						System.out.println("Please enter the following information so that we may complete the transaction - ");
						System.out.print(" --> Type of OPUS card (STL, RTL, etc ...): ");
						String tb6_type = sc.next();
						System.out.print(" --> Full name on OPUS card: ");
						String tb6_name = sc.nextLine();
						System.out.print(" --> Expiry month number and year (separate by a space): ");
						int tb6_expMonth = sc.nextInt();
						int tb6_expYear = sc.nextInt();
						
						OPUSCard newOpus = new OPUSCard(tb6_type, tb6_name, tb6_expMonth, tb6_expYear);
						int length_card = Tb1.addOpusCard(newOpus);
						
						System.out.println("You now have " + (length_card) + " OPUS cards.");
						System.out.println(Tb1.toString());
						switch_valid = false;
						break;
					}
					
				//ticketbooth #1
					if(Tb_choice ==1)
					{
						System.out.println("Please enter the following information so that we may complete the transaction - ");
						System.out.print(" --> Type of OPUS card (STL, RTL, etc ...): ");
						String tb6_type = sc.next();
						System.out.print(" --> Full name on OPUS card: ");
						String tb6_name = sc.nextLine();
						System.out.print(" --> Expiry month number and year (separate by a space): ");
						int tb6_expMonth = sc.nextInt();
						int tb6_expYear = sc.nextInt();
						
						OPUSCard newOpus = new OPUSCard(tb6_type, tb6_name, tb6_expMonth, tb6_expYear);
						int length_card = Tb2.addOpusCard(newOpus);
						
						System.out.println("You now have " + (length_card) + " OPUS cards.");
						System.out.println(Tb2.toString());
						switch_valid = false;
						break;
					}
					
				//ticketbooth #2
					if(Tb_choice ==2)
					{
						System.out.println("Please enter the following information so that we may complete the transaction - ");
						System.out.print(" --> Type of OPUS card (STL, RTL, etc ...): ");
						String tb6_type = sc.next();
						System.out.print(" --> Full name on OPUS card: ");
						String tb6_name = sc.nextLine();
						System.out.print(" --> Expiry month number and year (separate by a space): ");
						int tb6_expMonth = sc.nextInt();
						int tb6_expYear = sc.nextInt();
						
						OPUSCard newOpus = new OPUSCard(tb6_type, tb6_name, tb6_expMonth, tb6_expYear);
						int length_card = Tb3.addOpusCard(newOpus);
						
						System.out.println("You now have " + (length_card) + " OPUS cards.");
						System.out.println(Tb3.toString());
						switch_valid = false;
						break;
					}
					
				//ticketbooth #3
					if(Tb_choice ==3)
					{
						System.out.println("Please enter the following information so that we may complete the transaction - ");
						System.out.print(" --> Type of OPUS card (STL, RTL, etc ...): ");
						String tb6_type = sc.next();
						System.out.print(" --> Full name on OPUS card: ");
						String tb6_name = sc.nextLine();
						System.out.print(" --> Expiry month number and year (separate by a space): ");
						int tb6_expMonth = sc.nextInt();
						int tb6_expYear = sc.nextInt();
						
						OPUSCard newOpus = new OPUSCard(tb6_type, tb6_name, tb6_expMonth, tb6_expYear);
						int length_card = Tb4.addOpusCard(newOpus);
						
						System.out.println("You now have " + (length_card) + " OPUS cards.");
						System.out.println(Tb4.toString());
						switch_valid = false;
						break;
					}
					
				//ticketbooth #4
					if(Tb_choice ==4)
					{
						System.out.println("Please enter the following information so that we may complete the transaction - ");
						System.out.print(" --> Type of OPUS card (STL, RTL, etc ...): ");
						String tb6_type = sc.next();
						System.out.print(" --> Full name on OPUS card: ");
						String tb6_name = sc.nextLine();
						System.out.print(" --> Expiry month number and year (separate by a space): ");
						int tb6_expMonth = sc.nextInt();
						int tb6_expYear = sc.nextInt();
						
						OPUSCard newOpus = new OPUSCard(tb6_type, tb6_name, tb6_expMonth, tb6_expYear);
						int length_card = Tb5.addOpusCard(newOpus);
						
						System.out.println("You now have " + (length_card) + " OPUS cards.");
						System.out.println(Tb5.toString());
						switch_valid = false;
						break;
					}
					
				}
				
				
				break;
			}

			case 7: {
				while (switch_valid)
				{
					System.out.println("\nWhich Ticketbooth would you like to remove an OPUS card from?");
					Tb_choice = sc.nextInt()-1;
					
					if (Tb1.totalOpusNum() == 0)
					{
						System.out.println("Sorry, there are no OPUS Cards in this Ticketbooth");
						card_valid = false;
						switch_valid = false;
						break;
					}
					while (card_valid)
					{
						System.out.println("\nWhich card would you like to remove?");
						int card_choice = sc.nextInt()-1;
						
						if (card_choice > (Tb1.totalOpusNum()-1))
						{
							System.out.println("Card " + (card_choice + 1) + " does not exist, please try again!");
							
							card_valid = true;
							switch_valid = true;
						}
						else
						{
							for (int i = 0; i < Tb1.totalOpusNum(); i++)
							{
								if(card_choice == i)
								{
									Tb1.removeCard(card_choice);
									System.out.println("Card was removed successfully");
									System.out.println(Tb1.toString());
									card_valid =  false;
									switch_valid = false;
									break;
								}
							}
						}
					}
					break;
				}
				if (Tb_choice == 1)
				{
					if (Tb2.totalOpusNum() == 0)
					{
						System.out.println("Sorry, there are no Opus Cards in this Ticketbooth");
						card_valid = false;
						switch_valid = false;
						break;
					}
					while (card_valid)
					{
						System.out.println("\nWhich card would you like to remove?");
						int card_choice = sc.nextInt()-1;
						if (card_choice > Tb2.totalOpusNum()-1)
						{
							System.out.println("Card" + (card_choice + 1) + " does not exist, please try again");
							card_valid = true;
							switch_valid = true;
						}
						else
						{
							for (int i = 0; i < Tb2.totalOpusNum(); i++)
							{
								if (card_choice == i)
								{
									Tb2.removeCard(card_choice);
									System.out.println("Card was removed successfully");
									System.out.println(Tb2.toString());
									card_valid = false;
									switch_valid = false;
									break;
								}
							}
						}
					}
					break;
				}
				if (Tb_choice == 2)
				{
					if (Tb3.totalOpusNum() == 0)
					{
						System.out.println("Sorry, there are no Opus Cards in this Ticketbooth");
						card_valid = false;
						switch_valid = false;
						break;
					}
					while (card_valid)
					{
						System.out.println("\nWhich card would you like to remove?");
						int card_choice = sc.nextInt()-1;
						if (card_choice > Tb3.totalOpusNum()-1)
						{
							System.out.println("Card" + (card_choice + 1) + " does not exist, please try again");
							card_valid = true;
							switch_valid = true;
						}
						else
						{
							for (int i = 0; i < Tb3.totalOpusNum(); i++)
							{
								if (card_choice == i)
								{
									Tb3.removeCard(card_choice);
									System.out.println("Card was removed successfully");
									System.out.println(Tb2.toString());
									card_valid = false;
									switch_valid = false;
									break;
								}
							}
						}
					}
					break;
				}
				if (Tb_choice == 3)
				{
					if (Tb4.totalOpusNum() == 0)
					{
						System.out.println("Sorry, there are no Opus Cards in this Ticketbooth");
						card_valid = false;
						switch_valid = false;
						break;
					}
					while (card_valid)
					{
						System.out.println("\nWhich card would you like to remove?");
						int card_choice = sc.nextInt()-1;
						if (card_choice > Tb4.totalOpusNum()-1)
						{
							System.out.println("Card" + (card_choice + 1) + " does not exist, please try again");
							card_valid = true;
							switch_valid = true;
						}
						else
						{
							for (int i = 0; i < Tb4.totalOpusNum(); i++)
							{
								if (card_choice == i)
								{
									Tb4.removeCard(card_choice);
									System.out.println("Card was removed successfully");
									System.out.println(Tb4.toString());
									card_valid = false;
									switch_valid = false;
									break;
								}
							}
						}
					}
					break;
				}
				if (Tb_choice == 4)
				{
					if (Tb5.totalOpusNum() == 0)
					{
						System.out.println("Sorry, there are no Opus Cards in this Ticketbooth");
						card_valid = false;
						switch_valid = false;
						break;
					}
					while (card_valid)
					{
						System.out.println("\nWhich card would you like to remove?");
						int card_choice = sc.nextInt()-1;
						if (card_choice > Tb5.totalOpusNum()-1)
						{
							System.out.println("Card" + (card_choice + 1) + " does not exist, please try again");
							card_valid = true;
							switch_valid = true;
						}
						else
						{
							for (int i = 0; i < Tb5.totalOpusNum(); i++)
							{
								if (card_choice == i)
								{
									Tb5.removeCard(card_choice);
									System.out.println("Card was removed successfully");
									System.out.println(Tb5.toString());
									card_valid = false;
									switch_valid = false;
									break;
								}
							}
						}
					}
					break;
				}
				else 
				{
					Tb_choice++;
					System.out.println("Sorry, there is no Ticketbooth " + Tb_choice + ", please try again");
				}
			}
				break;
			
			case 8: {
				while (switch_valid)
				{
					System.out.println("\nWhich Ticketbooth would you like to update? (1-5)");
					Tb_choice = sc.nextInt()-1;
					if (Tb_choice == 0)
					{
						if (Tb1.totalOpusNum()== 0)
							System.out.println("Sorry, there are no OPUS Cards in this Ticketbooth");
							card_valid = false;
							switch_valid = false;
							break;
					}
					while (card_valid)
					{
						System.out.println("\nWhich card would you like to update?");
						int card_choice = sc.nextInt()-1;
						if (card_choice > (Tb1.totalOpusNum()-1))
						{
							System.out.println("Card " + (card_choice + 1) + " does not exist, please try again");
							card_valid = true;
							switch_valid = true;
						}
						else 
						{
							System.out.println("--->Please enter new expiry year: ");
							int new_year = sc.nextInt();
							System.out.println("--->Please enter new expiry month: ");
							int new_month = sc.nextInt();
							Tb1.updateExpiry(new_year, new_month, card_choice);
							System.out.println("Expiry Date Updated.");
							System.out.println("new Tb1: " + Tb1.toString());
							card_valid = false;
							switch_valid = false;
							break;
						}
					}
					break;
				}
				if (Tb_choice == 1)
				{
					if (Tb2.totalOpusNum()== 0)
					{
						System.out.println("Sorry, there are no OPUS Cards in this Ticketbooth");
						card_valid = false;
						switch_valid = false;
						break;
				}
				while (card_valid)
				{
					System.out.println("\nWhich card would you like to update?");
					int card_choice = sc.nextInt()-1;
					if (card_choice > (Tb2.totalOpusNum()-1))
					{
						System.out.println("Card " + (card_choice + 1) + " does not exist, please try again");
						card_valid = true;
						switch_valid = true;
					}
					else 
					{
						System.out.println("--->Please enter new expiry year: ");
						int new_year = sc.nextInt();
						System.out.println("--->Please enter new expiry month: ");
						int new_month = sc.nextInt();
						Tb1.updateExpiry(new_year, new_month, card_choice);
						System.out.println("Expiry Date Updated.");
						System.out.println("new Tb2: " + Tb2.toString());
						card_valid = false;
						switch_valid = false;
						break;
					}
				}
				break;
			}
			if (Tb_choice == 0)
			{
				if (Tb1.totalOpusNum()== 0)
				{
					System.out.println("Sorry, there are no OPUS Cards in this Ticketbooth");
					card_valid = false;
					switch_valid = false;
					break;
			}
			while (card_valid)
			{
				System.out.println("\nWhich card would you like to update?");
				int card_choice = sc.nextInt()-1;
				if (card_choice > (Tb1.totalOpusNum()-1))
				{
					System.out.println("Card " + (card_choice + 1) + " does not exist, please try again");
					card_valid = true;
					switch_valid = true;
				}
				else 
				{
					System.out.println("--->Please enter new expiry year: ");
					int new_year = sc.nextInt();
					System.out.println("--->Please enter new expiry month: ");
					int new_month = sc.nextInt();
					Tb1.updateExpiry(new_year, new_month, card_choice);
					System.out.println("Expiry Date Updated.");
					System.out.println("new Tb1: " + Tb1.toString());
					card_valid = false;
					switch_valid = false;
					break;
				}
			}
			break;
			}
			if (Tb_choice == 2)
			{
				if (Tb3.totalOpusNum()== 0)
				{
					System.out.println("Sorry, there are no OPUS Cards in this Ticketbooth");
					card_valid = false;
					switch_valid = false;
					break;
			}
			while (card_valid)
			{
				System.out.println("\nWhich card would you like to update?");
				int card_choice = sc.nextInt()-1;
				if (card_choice > (Tb3.totalOpusNum()-1))
				{
					System.out.println("Card " + (card_choice + 1) + " does not exist, please try again");
					card_valid = true;
					switch_valid = true;
				}
				else 
				{
					System.out.println("--->Please enter new expiry year: ");
					int new_year = sc.nextInt();
					System.out.println("--->Please enter new expiry month: ");
					int new_month = sc.nextInt();
					Tb1.updateExpiry(new_year, new_month, card_choice);
					System.out.println("Expiry Date Updated.");
					System.out.println("new Tb3: " + Tb3.toString());
					card_valid = false;
					switch_valid = false;
					break;
					}
				}
				break;
			}
				if (Tb_choice == 3)
				{
					if (Tb1.totalOpusNum()== 0)
					{
						System.out.println("Sorry, there are no OPUS Cards in this Ticketbooth");
						card_valid = false;
						switch_valid = false;
						break;
					}
					while (card_valid)
					{
						System.out.println("\nWhich card would you like to update?");
						int card_choice = sc.nextInt()-1;
						if (card_choice > (Tb4.totalOpusNum()-1))
					{
						System.out.println("Card " + (card_choice + 1) + " does not exist, please try again");
						card_valid = true;
						switch_valid = true;
					}
					else 
					{
						System.out.println("--->Please enter new expiry year: ");
						int new_year = sc.nextInt();
						System.out.println("--->Please enter new expiry month: ");
						int new_month = sc.nextInt();
						Tb4.updateExpiry(new_year, new_month, card_choice);
						System.out.println("Expiry Date Updated.");
						System.out.println("new Tb4: " + Tb4.toString());
						card_valid = false;
						switch_valid = false;
						break;
					}
				}
				break;
			}
			if(Tb_choice==4)
			{
				if (Tb5.totalOpusNum() == 0)
				{
				System.out.println("Sorry, there are no OPUS Cards in this Ticketbooth");
				card_valid = false;
				switch_valid = false;
				break;
			}
			while(card_valid)
			{
				System.out.println("\nWhich card would you like to update?");
				int card_choice = sc.nextInt() - 1;
				if (card_choice > (Tb5.totalOpusNum() - 1)) {
					System.out.println("Card " + (card_choice + 1) + " does not exist, please try again");
					card_valid = true;
					switch_valid = true;
				} 
				else 
				{
					System.out.println("--->Please enter new expiry year: ");
					int new_year = sc.nextInt();
					System.out.println("--->Please enter new expiry month: ");
					int new_month = sc.nextInt();
					Tb5.updateExpiry(new_year, new_month, card_choice);
					System.out.println("Expiry Date Updated.");
					System.out.println("new Tb5: " + Tb5.toString());
					card_valid = false;
					switch_valid = false;
					break;
					}
				}
				break;
			}
			else
			{
				Tb_choice++;
				System.out.println("Sorry, there is no Ticketbooth " + Tb_choice + ", please try again");
				switch_valid = true;
				}
			}
			
			break;
			case 9:
				while (switch_valid)
				{
					System.out.println("\nWhcih Ticketbooth would you like to add tickets to? (1-5)");
					Tb_choice = sc.nextInt()-1;
					if (Tb_choice == 0)
					{
						System.out.println("--->Please enter the number of regular tickets you would like to add:");
						int regular = sc.nextInt();
						
						System.out.println("--->Please enter the number of junior tickets you would like to add:");
						int junior = sc.nextInt();
						
						System.out.println("--->Please enter the number of senior tickets you would like to add:");
						int senior = sc.nextInt();
						
						System.out.println("--->Please enter the number of daily tickets you would like to add:");
						int daily = sc.nextInt();
						
						System.out.println("--->Please enter the number of weekly tickets you would like to add:");
						int weekly = sc.nextInt();
						
						double newTotal = Tb1.addTickets(regular, junior, senior, daily, weekly);
						System.out.println("You now have $" + newTotal);
						switch_valid = false;
						break;
					}
					if (Tb_choice == 1)
					{
						System.out.println("--->Please enter the number of regular tickets you would like to add:");
						int regular = sc.nextInt();
						
						System.out.println("--->Please enter the number of junior tickets you would like to add:");
						int junior = sc.nextInt();
						
						System.out.println("--->Please enter the number of senior tickets you would like to add:");
						int senior = sc.nextInt();
						
						System.out.println("--->Please enter the number of daily tickets you would like to add:");
						int daily = sc.nextInt();
						
						System.out.println("--->Please enter the number of weekly tickets you would like to add:");
						int weekly = sc.nextInt();
						
						double newTotal = Tb2.addTickets(regular, junior, senior, daily, weekly);
						System.out.println("You now have $" + newTotal);
						switch_valid = false;
						break;
					}
					if (Tb_choice == 2)
					{
						System.out.println("--->Please enter the number of regular tickets you would like to add:");
						int regular = sc.nextInt();
						
						System.out.println("--->Please enter the number of junior tickets you would like to add:");
						int junior = sc.nextInt();
						
						System.out.println("--->Please enter the number of senior tickets you would like to add:");
						int senior = sc.nextInt();
						
						System.out.println("--->Please enter the number of daily tickets you would like to add:");
						int daily = sc.nextInt();
						
						System.out.println("--->Please enter the number of weekly tickets you would like to add:");
						int weekly = sc.nextInt();
						
						double newTotal = Tb3.addTickets(regular, junior, senior, daily, weekly);
						System.out.println("You now have $" + newTotal);
						switch_valid = false;
						break;
					}
					if (Tb_choice == 3)
					{
						System.out.println("--->Please enter the number of regular tickets you would like to add:");
						int regular = sc.nextInt();
						
						System.out.println("--->Please enter the number of junior tickets you would like to add:");
						int junior = sc.nextInt();
						
						System.out.println("--->Please enter the number of senior tickets you would like to add:");
						int senior = sc.nextInt();
						
						System.out.println("--->Please enter the number of daily tickets you would like to add:");
						int daily = sc.nextInt();
						
						System.out.println("--->Please enter the number of weekly tickets you would like to add:");
						int weekly = sc.nextInt();
						
						double newTotal = Tb4.addTickets(regular, junior, senior, daily, weekly);
						System.out.println("You now have $" + newTotal);
						switch_valid = false;
						break;
					}
					if (Tb_choice == 4)
					{
						System.out.println("--->Please enter the number of regular tickets you would like to add:");
						int regular = sc.nextInt();
						
						System.out.println("--->Please enter the number of junior tickets you would like to add:");
						int junior = sc.nextInt();
						
						System.out.println("--->Please enter the number of senior tickets you would like to add:");
						int senior = sc.nextInt();
						
						System.out.println("--->Please enter the number of daily tickets you would like to add:");
						int daily = sc.nextInt();
						
						System.out.println("--->Please enter the number of weekly tickets you would like to add:");
						int weekly = sc.nextInt();
						
						double newTotal = Tb5.addTickets(regular, junior, senior, daily, weekly);
						System.out.println("You now have $" + newTotal);
						switch_valid = false;
						break;
					}
					else
					{
						Tb_choice++;
						System.out.println("Sorry, there is no Ticketbooth " + Tb_choice + ", please try again");
					}
				}
				break;

			case 0:
				System.out.println("Thank you for using The Ticketbooth Simulator!");
				break;
				
			default:
				System.out.println("\nThe entered choice is not an option. Please enter a new choice!");
				break;
			}
		
		}
		while(choice > 9||ans.equals("yes"));
		
	
		sc.close();

			}
		}
