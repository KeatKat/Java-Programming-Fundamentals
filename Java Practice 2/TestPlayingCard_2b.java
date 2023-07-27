class TestPlayingCard_2b
{
	private static final int NO = 52;
	private static final String Suit = "SHDC";
	private static final String Rank = "23456789TJQKA";
	
	private static void constructArray(String[] playingCard)
	{
		int k = 0;
		for (int i = 0; i < Suit.length(); i++)
		{
			for (int j = 0; j < Rank.length(); j++)
			{
				playingCard[k] = "" + Suit.charAt(i) + Rank.charAt(j);
				++k;
			}
		}
	}
	
	private static void displayArray(String[] playingCard)
	{
		int k = 0;
		for (int i = 0; i < Suit.length(); i++)
		{
			for (int j = 0; j < Rank.length(); j++)
			{
				System.out.printf("%-5s", playingCard[k]);
				k++;
			}
			
			System.out.println();
		} 
	}
	
	public static void main (String [ ] args)
	{
		// declare a playing card array, assume our playing card array is a string array
		String[] playingCard = new String[NO];
		
		// construct the playing card
		constructArray(playingCard);
		
		// display the playing cards
		displayArray(playingCard);
	}
}