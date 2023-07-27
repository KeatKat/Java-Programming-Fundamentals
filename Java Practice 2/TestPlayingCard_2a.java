class TestPlayingCard_2a
{
	private static final int NO = 52;
	private static final String Suit = "SHDC";
	private static final String Rank = "23456789TJQKA";
	
	public static void main (String [ ] args)
	{
		// declare a playing card array, assume our playing card array is a string array
		String[] playingCard = new String[NO];
		
		// construct the playing card
		int k = 0;
		for (int i = 0; i < Suit.length(); i++)
		{
			for (int j = 0; j < Rank.length(); j++)
			{
				playingCard[k] = "" + Suit.charAt(i) + Rank.charAt(j);
				++k;
			}
		}
		
		// display the playing cards
		k = 0;
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
}