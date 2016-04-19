package FinalReview;

import java.util.ArrayList;
import java.util.Stack;

	
public class Meal {
	
	private int saltiness; 
	private int pepperiness; 
	private ArrayList<String> ingredients; 
	private boolean isCooked; 
	
	public Meal()
	{
		
	}

	
	public Meal(ArrayList<String> pIngredients, int pSaltiness, int pPepperiness) 
	{
		this.saltiness = pSaltiness;
		pepperiness = pPepperiness; 
		ingredients = pIngredients;
		isCooked = false; 
	}
	
	public void addIngredient(String ingredient) throws CantAddIngredientToCookedMealException
	{
		CookerChecker.CheckIfCooked(this);
		if (!isCooked)
		{
		ingredients.add(ingredient); 
		}
		else throw new CantAddIngredientToCookedMealException(); 
	}
	
	public void setCooked()
	{
		isCooked = true; 
		System.out.println("hello");
	}
	public void setCooked(boolean x)
	{
		isCooked = x; 
		System.out.println("goodbye"); 
	}
	
	public boolean getCooked()
	{
		return isCooked; 
	}
	
	public int getSaltiness()
	{
		return saltiness; 
	}
	public void addSalt()
	{
		saltiness++; 
	}

}
