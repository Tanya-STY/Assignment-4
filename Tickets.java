
public class Tickets {
	
	
	static double	regular_ticket = 3.50;	
	static double	junior_ticket  = 2.00;
	static double	senior_ticket  = 1.00;
	static double 	daily_ticket   = 10.00;
	static double	weekly_ticket  = 40.00;
	
	
	
	public Tickets()
	{
		this.regular_ticket = 0;
		this.junior_ticket  = 0;
		this.senior_ticket  = 0;
		this.daily_ticket 	= 0;
		this.weekly_ticket 	= 0;
	}
	
	public Tickets (int regular_ticket, int junior_ticket, int senior_ticket, int daily_ticket, int weekly_ticket)
	{
		this.regular_ticket = regular_ticket;
		this.junior_ticket  = junior_ticket;
		this.senior_ticket  = senior_ticket;
		this.daily_ticket   = daily_ticket;
		this.weekly_ticket  = weekly_ticket;
	}
	
	//copy constructor
	public Tickets (Tickets a)
	{
		this.regular_ticket = a.regular_ticket;
		this.junior_ticket  = a.junior_ticket;
		this.senior_ticket  = a.senior_ticket;
		this.daily_ticket   = a.daily_ticket;
		this.weekly_ticket  = a.weekly_ticket;
	}
	
	//add tickets
	public void addTickets (int regular_ticket, int junior_ticket, int senior_ticket, int daily_ticket, int weekly_ticket)
	{
		this.regular_ticket += regular_ticket;
		this.junior_ticket 	+= junior_ticket;
		this.senior_ticket 	+= senior_ticket;
		this.daily_ticket 	+= daily_ticket;
		this.weekly_ticket 	+= weekly_ticket;
	}
	
	//tickets total
	public double ticketsTotal()
	{
		return regular_ticket + junior_ticket + senior_ticket + daily_ticket + weekly_ticket;
	}
	
	public String toString()
	{
	return "Tickets:\n" + 
						this.regular_ticket + " regular tickets\n" +
						this.junior_ticket  + " junior tickets\n" +
						this.senior_ticket  + " senior tickets\n" +
						this.daily_ticket   + " daily tickets\n +" +
						this.weekly_ticket  + "weekly tickets\n";
	}
	
}
