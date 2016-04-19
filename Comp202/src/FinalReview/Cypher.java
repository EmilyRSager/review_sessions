package FinalReview;

public class Cypher {
	
	public static int getPosition(char c){
		return c - 65;
	}
	public static char[] encrypt(char[] toEncrypt, char [] pCypher){ 
		for(int i = 0; i<toEncrypt.length; i++){
			toEncrypt[i] = Character.toUpperCase(toEncrypt[i]);
			if (toEncrypt[i] >=65 && toEncrypt[i]<=91){ 
				int cypherIndex = getPosition(toEncrypt[i]); 
				toEncrypt[i] = pCypher[cypherIndex];
			}
		}	
		return toEncrypt; 
	}
	

}
