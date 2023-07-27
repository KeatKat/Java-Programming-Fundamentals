class TestPlayingCard_1
{
	private static final String Suit = "SHDC";
	private static final String Rank = "23456789TJQKA";
	
	public static void main (String [ ] args)
	{
		// display the playing cards
		for (int i = 0; i < Suit.length(); i++)
		{
			for (int j = 0; j < Rank.length(); j++)
			{
				System.out.printf("%c%c  ", Suit.charAt(i), Rank.charAt(j));
			}
			
			System.out.println();
		}
	
	}
}