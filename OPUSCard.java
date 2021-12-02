
public class OPUSCard {
	
	static String OPUSCard;
	static String card_holder;
	static int    exp_month;
	
	static int exp_year;
	
	public OPUSCard()
	{
		this.OPUSCard    = null;
		this.card_holder = null;
		this.exp_month   = 0;
		this.exp_year    = 0;
	}
	
	//constructor with 4 parameters
	public OPUSCard(String card_holder, int exp_month, int exp_year)
	{
		this.OPUSCard    = OPUSCard;
		this.card_holder = card_holder;
		this.exp_year    = exp_year;
		
		if (exp_month < 1 || exp_month > 12)
		{
			this.exp_month = 0;
		}
		else
			this.exp_month = exp_month;
	}
	
	public  OPUSCard(OPUSCard b)
	{
		this.OPUSCard    = b.OPUSCard;
		this.card_holder = b.card_holder;
		this.exp_month   = b.exp_month;
		this.exp_year    = b.exp_year;
	}
	
	public String getCard_Opus()
	{
		return OPUSCard;
	}
	
	public String getCard_Holder()
	{
		return card_holder;
	}
	
	public int getExp_Month()
	{
		return exp_month;
	}
	
	public int getExp_Year()
	{
		return exp_year;
	}
	
	public void setExp_Month(int exp_month)
	{
		if (exp_month < 1 || exp_month > 12)
		{
			this.exp_month = 0;
		}
		else
			this.exp_month = exp_month;
	}
	
	public void setExp_Year(int exp_year)
	{
		this.exp_year = exp_year;
	}
	
	//if the month number is less than 10, it must be preceded by a zero
	
	public String toString()
	{
		if(exp_month<10) 
			return "The type of OPUS card: " + OPUSCard +
					"\n The name of the owner: " + card_holder +
					"\n The expiry date: 0" + exp_month + "/" + exp_year;
		
		else
			return "The type of OPUS card: " + OPUSCard +
					"\n The name of the owner: " + card_holder +
					"\n The expiry date: " + exp_month + "/" + exp_year;
		
	}
	
	public boolean equals(Object obj)
	{
		OPUSCard t = (OPUSCard) obj;
		if((this.OPUSCard.equals(t.OPUSCard)) &&
				(this.card_holder.equals(t.card_holder)) && 
				(this.exp_month == t.exp_month) && 
				(this.exp_year == t.exp_year))
		{
		return true;
		}
		return false;
	}
	
}

	

