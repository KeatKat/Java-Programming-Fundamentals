class PlayingCard
{
	private char suit;
	private char rank;
	
	
	public PlayingCard(char suit, char rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public PlayingCard(PlayingCard pc)
	{
		this(pc.suit, pc.rank);
	}
	
	public char getSuit()
	{
		return suit;
	}
	
	public char getRank()
	{
		return rank;
	}
	
	public void setInfo(char suit, char rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public void displayInfo()
	{
		System.out.printf("%c%c  ", suit, rank);
	}
}
	
class TestPlayingCard_3
{
	private static final int NO = 52;
	private static final String Suit = "SHDC";
	private static final String Rank = "23456789TJQKA";
	
	private static void constructArray(PlayingCard[] cardArray)
	{
		int k = 0;
		for (int i = 0; i < Suit.length(); i++)
		{
			for (int j = 0; j < Rank.length(); j++)
			{
				cardArray[k] = new PlayingCard(Suit.charAt(i), Rank.charAt(j));
				++k;
			}
		}
	}
	
	private static void displayArray(PlayingCard[] cardArray)
	{
		int k = 0;
		for (int i = 0; i < Suit.length(); i++)
		{
			for (int j = 0; j < Rank.length(); j++)
			{
				cardArray[k].displayInfo();
				k++;
			}
			
			System.out.println();
		} 
	}
	
	private static void shuffle(PlayingCard[] cardArray)
	{
		int i, j;
		
		for(int k = 1; k <= 1000; k++)
		{
			i = (int) (Math.random() * NO);
			j = (int) (Math.random() * NO);
			
			PlayingCard temp = cardArray[i];
			cardArray[i] = cardArray[j];
			cardArray[j] = temp;
		}
	}
	
	public static void main (String [ ] args)
	{
		// declare a playing card array 
		PlayingCard[] cardArray = new PlayingCard[NO];
		
		// construct the playing card
		constructArray(cardArray);
		
		// display the playing cards
		displayArray(cardArray);
		
		System.out.println("\nShuffle the card");
		shuffle(cardArray);
		displayArray(cardArray);
	}
}