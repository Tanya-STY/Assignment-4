import java.util.Scanner;

public class Driver_Ticket {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to The Ticketbooth Simulator!");
		Boolean valid;
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
			int choice = sc.nextInt();

			if (choice >= 0 && choice <= 9)
				valid = true;

			else {
				valid = false;
				System.out.println("\nThe entered choice is not an option. Please enter a new choice!");
			}

			switch (choice) {

			case 1: {
				System.out.println("Content of all Ticketbooths:");
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
				break;
			}

			case 6: {
				break;
			}

			case 7: {
				break;
			}

			case 8: {
				break;
			}

			case 9: {
				break;
			}

			case 0: {
				System.out.println("Thank you for using The Ticketbooth Simulator!");
				break;
			}

			}
		} while (valid == false || ans.equals("yes"));

		sc.close();
	}
}
