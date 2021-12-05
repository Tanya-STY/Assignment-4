import java.util.Scanner;

public class Ticketbooth {
	
	private Tickets Ticket;
	private OPUSCard[] Card;
	
	public Ticketbooth() 
	{
		Ticket = new Tickets(Ticket);
		Card = new OPUSCard[0]; 
	}

	public Ticketbooth(Tickets Ticket, OPUSCard[] Card) 
	{
		Ticket = new Tickets(Ticket);
		Card = new OPUSCard[Card.length]; 
		for (int i = 0; i < Card.length; i++)
		{
			Card[i] = opusCard[i];
		}
	}
	// method that verifies if the values of two ticketbooths are the same
	public boolean equalValues(Ticketbooth T1, Ticketbooth T2) {
		if (T1.Ticket.ticketsTotal() == T2.Ticket.ticketsTotal()) {
			return true;
		}
		return false;
	}
	// method that verifies if the number of each type of tickets of two ticketbooths are the same
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
