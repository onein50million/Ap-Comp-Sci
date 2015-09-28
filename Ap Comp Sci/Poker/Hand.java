
public class Hand
{
	private String hand;
	private int[] strength;
	
	public Hand(String hand)
	{
		this.hand = hand;
		this.strength = checkHand(this.hand);
	}
	
	private int[] checkHand(String hand)
	{
		royalFlush(this.hand);
		int[] a = new int[10];
		return a;
	}
	
	private static boolean royalFlush(String hand)
	{
		return true;
	}
}
