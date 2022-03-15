package Collections;

import java.util.HashMap;

public class Day2HashMap {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	 // Print keys
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	    
	   // Print values
	    //  for (String i : capitalCities.values()) {
	      //  System.out.println(i);
	     // }
		
	    }

	}

}