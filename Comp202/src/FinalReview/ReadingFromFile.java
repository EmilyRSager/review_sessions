package FinalReview;


import java.io.FileReader;

import java.util.Scanner;

public class ReadingFromFile {

	public static void main(String[] args)
	{

		String fileName = "Example.txt";
		try {
			FileReader f = new FileReader(fileName);
			Scanner sc = new Scanner(f);
			while(sc.hasNext()){
				String s = sc.nextLine();
				System.out.println(s);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
