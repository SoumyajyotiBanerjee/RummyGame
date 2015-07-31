import java.util.ArrayList;

public class RummyHand {
	
	Card cardsinHand[];
	
	RummyHand(int noOfCards) {
		cardsinHand = new Card[noOfCards];
		for(int i=0;i<noOfCards;++i) {
			int randomCard=Util.generateRandomNumber(53);
			
		}
	}

	private void printCards() {
		// TODO Auto-generated method stub
		for(Card c:cardsinHand){
			System.out.println(c.suit+""+c.rank);
		}
		
	}
	private void sortByCardID() {
		ArrayList<Card> al=new ArrayList<Card>();
		for(Card c:cardsinHand){
			al.add(c);
		}
		//Collections.sort(al);
		
	}
	private void sortBySuit() {
		
		
	}
	int noCardsForNatural(ArrayList<Card> cards ){
		
		
		return -1;	
	}	
	
	boolean isImproper( ArrayList<Card> cards) {
		return true;
	}
	
	boolean isCanasta( ArrayList<Card> cards ){
		return true;
	}
	
	boolean isSet( ArrayList<Card> cards ){
		return true;
	}
	
	public int noOfCardsForDeclaration( Card[] cards) {
		return 0;
	}
	
	public ArrayList<Integer> getpair(int index, ArrayList<Integer> cards,int length) {
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		if(cards.size() <= index)
			return sequence;		

		
		sequence.add(new Integer(cards.get(index)));

		while( index+1< cards.size() && sequence.size()< length ) {
				
				if( cards.get(index+1) == cards.get(index)) {	
					
					sequence.add(cards.get(index+1));
				}
				else {
					if( sequence.size() >= 2)
                                        	return sequence;
                                	else
                                        	return new ArrayList<Integer>();
				}

			index++;
		}
		return sequence;
	}	
	
	public ArrayList<Integer> getpair(int index, ArrayList<Integer> cards,int length) {
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		if(cards.size() <= index)
			return sequence;		

		
		sequence.add(new Integer(cards.get(index)));

		while( index+1< cards.size() && sequence.size()< length ) {
			if( cards.get(index+1)-cards.get(index) <= ( length - sequence.size() ) ){
				
				if( cards.get(index+1) != cards.get(index)) {	
					int dst =  cards.get(index+1)-cards.get(index) -1;
					while( dst > 0 )
					{	
						sequence.add(-1);
						dst--;
					}
					
					sequence.add(cards.get(index+1));
				}
			}
			else
				if( sequence.size() >= 2)
					return sequence;
				else
					return new ArrayList<Integer>();

			index++;
		}	
		return sequence;
	}

	public ArrayList<Integer> remainAll(ArrayList<Integer> cards, ArrayList<Integer> pair ) {
		 ArrayList<Integer> subset = new ArrayList<Integer>();
		 subset.addAll(cards);
		 for( int i : pair ) {
			if(subset.indexOf(i)>=0) {
				subset.remove(subset.indexOf(i));
			}
		}	
		 return subset; 
	}
	
	public ArrayList<ArrayList< ArrayList<Integer>>> getSubsetCombination(int length,  ArrayList<Integer> cards ) {
		ArrayList<ArrayList<ArrayList<Integer>>> cardsList = new ArrayList<ArrayList<ArrayList<Integer>>>(); 
		for (int i = 0 ; i < length; i++) {

			ArrayList<Integer> pair = getpair(i, cards, length);
			ArrayList<Integer> canastaPair = getCanastapair(i, cards, length);
			
			if(pair.size()<2)
				continue;		

			ArrayList<Integer> subset = remainAll(cards, pair);
			ArrayList<Integer> canastaSubset = remainAll(cards, pair);
			ArrayList<ArrayList<ArrayList<Integer>>> combinations;
			
			if( subset.size()  >= 2 ) {	
				combinations  =  getSubsetCombination ( length,  subset);
			}
			else {
				combinations = new ArrayList<ArrayList<ArrayList<Integer>>>();
				ArrayList<ArrayList<Integer>> row  = new ArrayList<ArrayList<Integer>>();
				row.add(pair);
				cardsList.add(row);
			}
				
	
			for ( ArrayList<ArrayList<Integer>> comb : combinations) {
				ArrayList<ArrayList<Integer>> row  = new ArrayList<ArrayList<Integer>>();
				row.add(pair);
				row.addAll(comb);
				cardsList.add(row);
			}
		}
		return cardsList;
		
	}

	ArrayList<ArrayList<ArrayList<Card>>> getAllValidSequence() {
		
		ArrayList<ArrayList<Card>> cardSequences =  new  ArrayList<ArrayList<Card>>();
		return getSubsetCombination(5,<pass sorted card ids> );
	}


	public static void main(String[] args){
    	
		RummyHand hand = new RummyHand(13);
		ArrayList<Integer> cards = new  ArrayList<Integer>();
		cards.add(1);
		cards.add(2);
		cards.add(4);
		cards.add(4);
		cards.add(6);
		cards.add(7);
		cards.add(8);
		ArrayList<ArrayList<ArrayList<Integer>>>  combinations = hand.getSubsetCombination(5,cards);
		for ( ArrayList<ArrayList<Integer>> row : combinations) {
			for ( ArrayList<Integer> pair : row) {
				System.out.print(pair);
			}
			System.out.println();
		}


		//hand.noOfCardsForDeclaration();
	}	

}
