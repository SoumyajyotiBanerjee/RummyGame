import java.util.ArrayList;

public class RummyHand {
	
	Card cardsinHand[];
	
	RummyHand(int noOfCards) {
		cardsinHand = new Card[noOfCards];
		for(int i=0;i<noOfCards;++i){
			int randomCard=Util.generateRandomNumber(53);
			
			cardsinHand[i]=new Card(randomCard);
		}
	}

	private void printCards() {
		// TODO Auto-generated method stub
		for(Card c:cardsinHand){
			System.out.println(c.suit+""+c.rank);
		}
		
	}

	int noCardsForNatural(ArrayList<Card> cards ){
		
		
		return true;	
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

	ArrayList<ArrayList<Card>> getAllValidSequence(Card [] cards) {
		return new  ArrayList<ArrayList<Card>>();
	}


	public static void main(String[] args){
    	
		RummyHand hand = new RummyHand();
		
		//hand.noOfCardsForDeclaration();
	}	

}
