import java.util.ArrayList;

public class RummyHand {
	
	Card cardsinHand[];
	
	RummyHand() {
		cardsinHand = new Card[13];
	}
	public Card[] generateInput() {
		return new Card[13];
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
