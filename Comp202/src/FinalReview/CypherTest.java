package FinalReview;

import java.util.Scanner;

public class CypherTest {
	public static void main(String[] args){
		boolean keep_encrypting = true;
		while (keep_encrypting){ 
			Scanner myScanner = new Scanner(System.in);
			System.out.println("Enter the text you'd like to encrypt!");
			String s = myScanner.nextLine(); 
			char[] toEncrypt = s.toCharArray();
			System.out.println("Enter the cypher!");
			s = myScanner.nextLine();
			char [] cypher = s.toCharArray(); 
			char[] encrypted = Cypher.encrypt(toEncrypt, cypher);
			System.out.println("Your text has been encrypted to: " + encrypted.toString());
			System.out.println("Would you like to encrypt more strings?");
			s = myScanner.nextLine();
			if(!s.startsWith("y")){
				keep_encrypting = false;
			}
		}

	}

}
