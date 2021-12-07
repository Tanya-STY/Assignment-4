public class Ticketbooth {
	
	private Tickets Ticket;
	private OPUSCard[] Card;
	
	public Ticketbooth() 
	{
		Ticket = new Tickets(Ticket);
		Card = new OPUSCard[0]; 
	}

	public Ticketbooth(Tickets Ticket, OPUSCard[] Cards) 
	{
		this.Ticket = Ticket;
		Card = new OPUSCard[Cards.length]; 
		for (int i = 0; i < Cards.length; i++)
		{
			Card[i] = Cards[i];
		}
	}
	// method that verifies if the values of two ticketbooths are the same
	public boolean equalValues(Ticketbooth T) {
		if (this.Ticket.ticketsTotal() == T.Ticket.ticketsTotal()) {
			return true;
		}
		return false;
	}
	// method that verifies if the number of each type of tickets of two ticketbooths are the same
	public boolean equalNumber(Ticketbooth T)
	{
		if (this.Ticket.equals(Ticket) == T.Ticket.equals(Ticket)) {
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
	
	public int addOpusCard(OPUSCard card)
	{
		for (int i = 0; i < Card.length; i++)
		{
			if (Card[i] == null) {
			Card[i] = card;
			return (i + 1);
			}
		}
		//else {
			OPUSCard[] addition = new OPUSCard[Card.length + 1];
			int i;
			for (i = 0; i < Card.length; i++) {
				addition[i] = Card[i];
			}
			addition[i] = card;
			Card = addition;
			return (i + 1);
		//}
	}
	
	// method that removes an opus card from the ticketbooth, returns true if the removal is succesful
	
	public boolean removeCard(int minus)
	{
		int count = 0;
		if (Card.length == 0) {
			return false;
		}
			OPUSCard[] addition = new OPUSCard[Card.length - 1];
			for (int j = 0; j < Card.length; j++)
			{	
				if (j != minus)
				{
					addition[count] = Card[j];
					count++;
				}
			}
			Card = addition;
			return true;
		}
	// method to update the expiry month and year of an opus card
	public void updateExpiry (int exp_year, int exp_month, String y)
	{
		for (int i = 0; i < Card.length; i++)
		{
		Card[i].setExp_Month(exp_month);
		Card[i].setExp_Year(exp_year);
		}
	}
	
	// Method that adds tickets to ticket booth
	public double  addTickets (int nb_RegTicket, int nb_JunTicket, int nb_SenTicket, int nb_DailyTicket, int nb_WeeklyTicket) 
	{
		Ticket.addTickets(nb_RegTicket, nb_JunTicket, nb_SenTicket, nb_DailyTicket, nb_WeeklyTicket);
		return Ticket.ticketsTotal();
	}
	// method that verifies if the total value of tickets and the number of opus cards tickets of two ticketbooth objects are equal
	public boolean equalAll(Ticketbooth ticketbooth) {
		if ((this.Ticket.getNb_RegTicket() + this.Ticket.getNb_JunTicket() + this.Ticket.getNb_SenTicket() + this.Ticket.getNb_DailyTicket() +
			 this.Ticket.getNb_WeeklyTicket() == ticketbooth.Ticket.getNb_RegTicket() + ticketbooth.Ticket.getNb_JunTicket() + ticketbooth.Ticket.getNb_SenTicket() +
			 ticketbooth.Ticket.getNb_DailyTicket() + ticketbooth.Ticket.getNb_WeeklyTicket()) && this.Card.length == ticketbooth.Card.length)
				return true;
		return false;	
		}
	
	
	public String toString() 
	{
		StringBuilder breakdown = new StringBuilder();
		breakdown.append(" ");
		breakdown.append(Ticket);
		breakdown.append('\n');
		
		if (Card.length == 0)
		{
			breakdown.append("\nNo OPUS Cards");
			return breakdown.toString();
		}
		else if (Card[0] == null) 
		{
			breakdown.append("No OPUS Cards");
			return breakdown.toString();
		}
		else
		{
			for (int i = 0; i < Card.length; i++)
			{
				breakdown.append("\n");
				breakdown.append(Card[i].toString());
			}
	
			return breakdown.toString();			
		}	
	}
	public String breakdown_toString()
	{
		return Ticket.toString();
	}

}
	
	
    
