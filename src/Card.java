import java.util.Comparator;


public class Card implements Comparable{
	

     final String ORDEROFSUIT=new String("SHCD");
     int cardId;
     String suit;
     int rank;
     
     Card(int num){
    	 this.cardId=num;
    	 this.rank=(num%13)+1;
    	 this.suit=ORDEROFSUIT.charAt((num/13))+"";
    	 
     }

	


	@Override
	public int compareTo(Object secondCArd) {
		// TODO Auto-generated method stub
		return this.cardId-((Card)secondCArd).cardId;
	}

	
     
}
