// -------------------------------------------------------
// Assignment 4
// Written by: Shamma Sarah Markis (ID# 40211998) and Tanya So Tin Yan (ID# 40208954)
// For COMP 248 Section PJ-X – Fall 2021
// --------------------------------------------------------

/* General explanation of what my program does:
 *   The Tickets class includes the constants variables which represent the cost for each type
 *   of ticket. It also takes into account the number of tickets for each type ticket which will 
 *   later be used in the driver; in order to get different quantity of tickets for each ticketbooth.
 *   This class also takes into account the total tickets which can be used in the driver to find 
 *   the total of cost of each ticketbooth. */

public class Tickets {

	//Static Constants: values of the tickets
	private static double	regular_ticket = 3.50;	
	private static double	junior_ticket  = 2.50;
	private static double	senior_ticket  = 1.00;
	private static double 	daily_ticket   = 10.00;
	private static double	weekly_ticket  = 40.00;	
	
	//Private variables for the number of tickets
	private int nb_RegTicket;
	private int nb_JunTicket;
	private int nb_SenTicket;
	private int nb_DailyTicket;
	private int nb_WeeklyTicket;
	
	//The Default Constructor
	public Tickets()
	{
		this.nb_RegTicket       = 0;
		this.nb_JunTicket       = 0;
		this.nb_SenTicket       = 0;
		this.nb_DailyTicket 	= 0;
		this.nb_WeeklyTicket 	= 0;
	}
	
	//The Constructor with 5 parameters
	public Tickets (int nb_RegTicket, int nb_JunTicket, int nb_SenTicket, int nb_DailyTicket, int nb_WeeklyTicket)
	{
		this.nb_RegTicket      = nb_RegTicket;
		this.nb_JunTicket      = nb_JunTicket;
		this.nb_SenTicket      = nb_SenTicket;
		this.nb_DailyTicket    = nb_DailyTicket;
		this.nb_WeeklyTicket   = nb_WeeklyTicket;
	}
	
	//Copy Constructor
	public Tickets (Tickets Ticket)
	{
		this.nb_RegTicket = Ticket.nb_RegTicket;
		this.nb_JunTicket  = Ticket.nb_JunTicket;
		this.nb_SenTicket   = Ticket.nb_SenTicket ;
		this.nb_DailyTicket   = Ticket.nb_DailyTicket;
		this.nb_WeeklyTicket  = Ticket.nb_WeeklyTicket;
	}
	
	//Accessors and mutators
	
	public int getNb_RegTicket()
	{
		return nb_RegTicket;
	}
	
	public int getNb_JunTicket()
	{
		return nb_JunTicket;
	}
	
	public int getNb_SenTicket()
	{
		return nb_SenTicket;
	}
	
	public int getNb_DailyTicket()
	{
		return nb_DailyTicket;
	}
	
	public int getNb_WeeklyTicket()
	{
		return nb_WeeklyTicket;
	}
	
	public void setNb_RegTicket(int nb_RegTicket)
	{
		this.nb_RegTicket = nb_RegTicket;
	}
	
	public void setNb_JunTicket(int nb_JunTicket)
	{
		this.nb_JunTicket = nb_JunTicket;
	}
	
	public void setNb_SenTicket(int nb_SenTicket)
	{
		this.nb_SenTicket = nb_SenTicket;
	}
	
	public void setNb_DailyTicket(int nb_DailyTicket)
	{
		this.nb_DailyTicket = nb_DailyTicket;
	}
	
	public void setNb_WeeklyTicket(int nb_WeeklyTicket)
	{
		this.nb_WeeklyTicket = nb_WeeklyTicket;
	}
	
	
	//addTickets() method: increase the number of each tickets by the indicated number
	public void addTickets (int nb_RegTicket, int nb_JunTicket, int nb_SenTicket, int nb_DailyTicket, int nb_WeeklyTicket)
	{
		this.nb_RegTicket      += nb_RegTicket;
		this.nb_JunTicket      += nb_JunTicket;
		this.nb_SenTicket      += nb_SenTicket;
		this.nb_DailyTicket    += nb_DailyTicket;
		this.nb_WeeklyTicket   += nb_WeeklyTicket;
	}
	
	//ticketsTotal() method: total value of the tickets in the ticketbooth 
	public double ticketsTotal()
	{
		return (regular_ticket*nb_RegTicket) + 
			   (junior_ticket*nb_JunTicket) + 
			   (senior_ticket*nb_SenTicket) +
			   (daily_ticket*nb_DailyTicket) + 
			   (weekly_ticket*nb_WeeklyTicket);
	}
	
	//toString() method: indicating the count of each ticket in the ticketbooth
	public String toString()
	{
	return this.nb_RegTicket + " x $" + regular_ticket + " + " + this.nb_RegTicket + " x $" + junior_ticket + " + " + this.nb_SenTicket  + " x $" + senior_ticket + " + " + 
			this.nb_DailyTicket  + " x $" + daily_ticket + " + " + this.nb_WeeklyTicket + " x $" + weekly_ticket;
	}
	
	//equals() method: check if two objects of type Tickets have the same distribution
	public boolean equals (Tickets same)
	{
	return (this.nb_RegTicket   == same.nb_RegTicket &&
		   this.nb_JunTicket    == same.nb_JunTicket &&
		   this.nb_SenTicket    == same.nb_SenTicket &&
		   this.nb_DailyTicket  == same.nb_DailyTicket &&
		   this.nb_WeeklyTicket == same.nb_WeeklyTicket);
	}
	
}
