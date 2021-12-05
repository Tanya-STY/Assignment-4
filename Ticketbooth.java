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
	// method that returns the total value of tickets in ticketbooth
	public double totalTicket() {
		return Ticket.ticketsTotal();
	}
	
	// method that returns the number of opus cards in ticketbooth
	public int totalOpusNum() 
	{
		return Card.length;
	}
	
	// method that adds a new opus card to a ticketbooth and returns the number of opus cards after the addition
	
	public int addOpusCard(OPUSCard cardA)
	{
		if (Card.length == 0) 
		{
			OPUSCard[] addition = new OPUSCard[1];
			addition[0] = cardA;
			Card = addition;
			return Card.length;
		}
		
		else {
			OPUSCard[] addition = new OPUSCard[Card.length + 1];
			for (int i = 0; i < Card.length, i++) {
				addition[i] = Card[i];
			}
			addition[addition.length - 1] = cardA;
			Card = addition;
			return Card.length;
		}
	}
	
	// method that removes an opus card from the ticketbooth, returns true if the removal is succesful
	
	public boolean removeCard(int minus)
	{
		int count = 0;
		if (Card.length == 0)
		{
			return false;
		}
		else {
			OPUSCard[] addition = new OPUSCard[Card.length-1];
			for (int i = 0; i < (card.length); i++)
			{
				if (i != minus)
				{
					addition[count] = Card[i];
					count ++;
				}
			}
			Card = addition;
			return true;
		}
	}
	// method to update the expiry month and year of an opus card
	public void updateExpiry (int year, int month, int y)
	{
		Card[i].setExp_Month(month);
		Card[i].setExp_Year(year);
	}
	
	// Method that adds tickets to ticket booth
	public double  addTickets (int a, int b, int c, int d, int e) 
	{
		Ticket.addTickets(a,b,c,d,e);
		return ticketsTotal();
	}
	// method that verifies if the total value of tickets and the number of opus cards tickets of two ticketbooth objects are equal
	public boolean equalAll(Ticketbooth one, Ticketbooth two) {
		if (!equalValues(one,two)) 
		{
			return false;
		}
		return one.totalOpusNum() == two.totalOpusNum();
	}
	
	public String toString() 
	{
		StringBuilder sc = new StrinBuilder("").append(Ticket).append('\n');
		if (Card.length == 0)
		{
			sc.append("\nNo OPUS Cards");
		}
		else
			for (int i = 0; i < Card.length; i++)
			{
				sc.append("\n").append(Card[i].toString());
			}
	}
	return sc.toString();			
}	
}
