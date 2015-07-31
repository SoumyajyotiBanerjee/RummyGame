import java.util.ArrayList;

public class RummyHand {
	
	Card cardsinHand[];
	
	RummyHand() {
		cardsinHand = new Card[13];
	}
	public Card[] generateInput() {
		return new Card[13];
	}

	boolean isNatural(ArrayList<Card> cards ){
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


	ArrayList<ArrayList<Card>> getAllValidSequence(ArrayList<Card> cards) {
		
		Collections.sort(cards);			 
		ArrayList<ArrayList<Card>> cardSequences =  new  ArrayList<ArrayList<Card>>();
		
		return cardSequences;
	}


	public static void main(String[] args){
    	
		RummyHand hand = new RummyHand();
		
		//hand.noOfCardsForDeclaration();
	}	

}
