package FinalReview;

import java.util.ArrayList;

public class CookMeal {
	
	public static void main(String [] args)
	{
		cookDinnerForYouAndMe();
	}
	 
	public static void cookDinnerForYouAndMe()
	{
		ArrayList<String> myIngredients = new ArrayList<String>(); 
		myIngredients.add("Pasta"); 
		myIngredients.add("Tomato");
		myIngredients.add("Basil");
		myIngredients.add("Cheese");
		
		ArrayList<String> yourIngredients = new ArrayList<String>(); 
		yourIngredients.add("Ravioli");
		yourIngredients.add("Alfredo");
		yourIngredients.add("Oregano"); 
		
		Meal myPastaDinner = new Meal(myIngredients, 3, 2); 
		
		Meal yourPastaDinner = new Meal(yourIngredients, 0, 1); 
		
		//myPastaDinner.addIngredient("Parsley");
		
		myPastaDinner.setCooked();
		try { 
		myPastaDinner.addIngredient("Oregano");
	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		while ( ((myPastaDinner).getSaltiness()) != 5)
		{
			myPastaDinner.addSalt();
		}
		
		
	}

}
