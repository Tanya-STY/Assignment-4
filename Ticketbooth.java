import java.util.Scanner;

public class Ticketbooth {
	
	private Tickets Ticket;
	private OPUSCard[] OPUSCards;
	
	Scanner sc = new Scanner(System.in);
	int value = sc.nextInt();
	
	public Ticketbooth() {
		Tickets obj = new Tickets();
		OPUSCards = new OPUSCard[value];
	}

	public Ticketbooth(Tickets Ticket, OPUSCard card[]) 
	{
		Tickets obj = new Tickets(Ticket);
		card = null; 
	}

	public boolean equalValues(Ticketbooth T1, Ticketbooth T2) {
		if (T1.Ticket.ticketsTotal() == T2.Ticket.ticketsTotal()) {
			return true;
		}
		return false;
	}
	
	public boolean equalNumber(Ticketbooth T1, Ticketbooth T2)
	{
		if (T1.Ticket.equals(Ticket) == T2.Ticket.equals(Ticket)) {
			return true;
		}
		return false;
	}
	
	public double totalTicket() {
		return Ticket.ticketsTotal();
	}
	
}
