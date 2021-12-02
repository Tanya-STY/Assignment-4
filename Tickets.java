
public class Tickets {
	
	
	static double	regular_ticket = 3.50;	
	static double	junior_ticket  = 2.00;
	static double	senior_ticket  = 1.00;
	static double 	daily_ticket   = 10.00;
	static double	weekly_ticket  = 40.00;	
	private int nb_RegTicket;
	private int nb_JunTicket;
	private int nb_SenTicket;
	private int nb_DailyTicket;
	private int nb_WeeklyTicket;
	
	public Tickets()
	{
		this.nb_RegTicket       = 0;
		this.nb_JunTicket       = 0;
		this.nb_SenTicket       = 0;
		this.nb_DailyTicket 	= 0;
		this.nb_WeeklyTicket 	= 0;
	}
	
	public Tickets (int nb_RegTicket, int nb_JunTicket, int nb_SenTicket, int nb_DailyTicket, int nb_WeeklyTicket)
	{
		this.nb_RegTicket      = nb_RegTicket;
		this.nb_JunTicket      = nb_JunTicket;
		this.nb_SenTicket      = nb_SenTicket ;
		this.nb_DailyTicket    = nb_DailyTicket;
		this.nb_WeeklyTicket  = nb_WeeklyTicket;
	}
	
	//copy constructor
	public Tickets (Tickets a)
	{
		this.nb_RegTicket = a.nb_RegTicket;
		this.nb_JunTicket  = a.nb_JunTicket;
		this.nb_SenTicket   = a.nb_SenTicket ;
		this.nb_DailyTicket   = a.nb_DailyTicket;
		this.nb_WeeklyTicket  = a.nb_WeeklyTicket;
	}
	
	//Accessor and mutator
	
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
	
	
	//add tickets
	public void addTickets (int nb_RegTicket, int nb_JunTicket, int nb_SenTicket, int nb_DailyTicket, int nb_WeeklyTicket)
	{
		this.nb_RegTicket      += nb_RegTicket;
		this.nb_JunTicket      += nb_JunTicket;
		this.nb_SenTicket      += nb_SenTicket ;
		this.nb_DailyTicket    += nb_DailyTicket;
		this.nb_WeeklyTicket   += nb_WeeklyTicket;
	}
	
	//tickets total
	public double ticketsTotal()
	{
		return (regular_ticket*nb_RegTicket) + 
		       (junior_ticket*nb_JunTicket) + 
		       (senior_ticket*nb_SenTicket) + 
		       (daily_ticket*nb_DailyTicket) + 
		       (weekly_ticket*nb_WeeklyTicket);
	}
	
	public String toString()
	{
	return "Tickets:\n" + 
			this.nb_RegTicket + " regular tickets\n" +
			this.nb_RegTicket  + " junior tickets\n" +
			this.nb_SenTicket  + " senior tickets\n" +
			this.nb_DailyTicket   + " daily tickets\n +" +
			this.nb_WeeklyTicket  + "weekly tickets\n";
	}
	
	//equal method
	public boolean equals (Tickets same)
	{
	return (this.nb_RegTicket   == same.nb_RegTicket &&
		   this.nb_JunTicket    == same.nb_JunTicket &&
		   this.nb_SenTicket    == same.nb_SenTicket &&
		   this.nb_DailyTicket  == same.nb_DailyTicket &&
		   this.nb_WeeklyTicket == same.nb_WeeklyTicket);
	}
	
}
