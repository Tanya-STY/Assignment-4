// -------------------------------------------------------
// Assignment 4
// Written by: Shamma Sarah Markis (ID# 40211998) and Tanya So Tin Yan (ID# 40208954)
// For COMP 248 Section PJ-X – Fall 2021
// Date: December 6th, 2021
// --------------------------------------------------------

/* General explanation of what my program does:
 *   The OPUSCard class includes all the methods related to the
 *   different types of opus cards such as RTL, REM, STM, etc. This 
 *   class also takes into account the name of the card holder, 
 *   the expiry month and the expiry year.  */

public class OPUSCard {

	//Attributes
	private String card_type;
	private String card_holder;
	private int exp_month;
	private int exp_year;
	
	//Default Constructor
	public OPUSCard()
	{
		this.card_type    = null;
		this.card_holder = null;
		this.exp_month   = 0;
		this.exp_year    = 0;
	}
	
	//Constructor with 4 parameters
	public OPUSCard(String card_type, String card_holder, int exp_month, int exp_year)
	{
		this.card_type   = card_type;
		this.card_holder = card_holder;
		this.exp_year    = exp_year;
		
		if (exp_month < 1 || exp_month > 12)
		{
			this.exp_month = 0;
		}
		else
			this.exp_month = exp_month;
	}
	
 	//Copy Constructor
	public  OPUSCard(OPUSCard b)
	{
		this.card_type   = b.card_type;
		this.card_holder = b.card_holder;
		this.exp_month   = b.exp_month;
		this.exp_year    = b.exp_year;
	}

	//Accessor methods
	
	public String getCard_Type()
	{
		return card_type;
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
	
	//Mutator for the expiry month
	public void setExp_Month(int exp_month)
	{
		if (exp_month < 1 || exp_month > 12)
		{
			this.exp_month = 0;
		}
		else
			this.exp_month = exp_month;
	}
	
	//Mutator for the expiry year
	public void setExp_Year(int exp_year)
	{
		this.exp_year = exp_year;
	}
	
	//if the month number is less than 10, it must be preceded by a zero
	//toString() method to indicate the type of OPUS card, the name of the card holder, and the expiry date
	public String toString()
	{
		if(exp_month<10) 
			return card_type + " - " + card_holder + " - 0" + exp_month + "/" + exp_year;
		
		else
			return card_type + " - " + card_holder + " - " + exp_month + "/" + exp_year;
		
	}
	
	//equals() method to compare if two objects of type OPUSCard are identical
	public boolean OPUSEqual(OPUSCard something)
	{
		
		return((this.card_type == something.card_type) &&
				(this.card_holder == something.card_holder) && 
				(this.exp_month == something.exp_month) && 
				(this.exp_year == something.exp_year));
	}
	
}
