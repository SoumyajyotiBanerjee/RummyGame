import java.util.Random;


public class Util {

	
	
	  
	  public static final int generateRandomNumber(int max){
	  
	    int randomInt=0;
	    //note a single Random object is reused here
	    Random randomGenerator = new Random();
	    for (int idx = 1; idx <= 10; ++idx){
	      randomInt = randomGenerator.nextInt(max);
	      
	    }
	    
	    return randomInt;
	  }
	  
	 
	}
	 


