package FinalReview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	private String cityName; 
	private HashMap<String, String> aPhoneBook;
	
	public PhoneBook(String pCityName, String fileName){
		//set the cityName for this specific PhoneBook to be equal to the parameter pCityName
		this.cityName = pCityName; 
		this.aPhoneBook = readFile(fileName);
		
	}

	public HashMap<String, String> readFile(String fileName){
		HashMap<String, String> rPhoneBook = new HashMap<String, String>();
		try {
			FileReader f = new FileReader(fileName);
			Scanner sc = new Scanner(f);
			while(sc.hasNext()){
				String s = sc.nextLine();
				String [] sA = s.split(",");
				rPhoneBook.put(sA[0], sA[1]);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist!");
		}
		return rPhoneBook;
	
	}
	
	public String getNumber(String name){
		return this.aPhoneBook.get(name);
	}

}
