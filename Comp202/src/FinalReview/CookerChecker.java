package FinalReview;

public class CookerChecker {

	public static boolean CheckIfCooked(Meal aMeal)
	{
		if (!aMeal.getCooked()){

			return false;
		}
		return true; 
	}


}
