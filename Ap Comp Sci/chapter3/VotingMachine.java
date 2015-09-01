/**
 * 
 * Virtual voting machine
 *
 */
public class VotingMachine
{
	int Dvotes;
	int Rvotes;
	
	/**
	 * Add's votes to the democratic party
	 * @param n number of votes to add
	 */
	public void addDvote(int n)
	{
		this.Dvotes += n;
	}
	
	/**
	 * Add's votes to the republican party
	 * @param n number of votes to add
	 */
	public void addRvote(int n)
	{
		this.Rvotes += n;
	}
	
	/**
	 * Clears votes for all parties
	 */
	public void Clear()
	{
		this.Dvotes = 0;
		this.Rvotes = 0;
	}
	
	/**
	 * Returns the number of votes for the democratic party
	 * @return votes for the democratic party
	 */
	public int getDvotes()
	{
		return this.Dvotes;
	}
	
	/**
	 * Returns the number of votes for the democratic party
	 * @return votes for the democratic party
	 */
	public int getRvotes()
	{
		return this.Rvotes;
	}
}
