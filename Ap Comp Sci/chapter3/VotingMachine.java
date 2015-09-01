
public class VotingMachine
{
	int Dvotes;
	int Rvotes;
	
	public void addDvote(int n)
	{
		this.Dvotes += n;
	}
	
	public void addRvote(int n)
	{
		this.Rvotes += n;
	}
	
	public void Clear()
	{
		this.Dvotes = 0;
		this.Rvotes = 0;
	}
	
	public int getDvotes()
	{
		return this.Dvotes;
	}
	
	public int getRvotes()
	{
		return this.Rvotes;
	}
}
