
public class P3point8
{

	public static void main(String[] args)
	{
		VotingMachine vote = new VotingMachine();
		vote.addDvote(150);
		vote.addDvote(70);
		vote.addRvote(75);
		vote.addRvote(90);
		System.out.println(vote.getDvotes());
		System.out.println(vote.getRvotes());
		vote.Clear();
		System.out.println("Cleared votes");
		System.out.println(vote.getDvotes());
		System.out.println(vote.getRvotes());
	}

}
