package mapInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StrValPair {
//key as String and value as List:
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		HashMap<String, List<String>> hm = new HashMap<>();

	      
		List<String> cities = new ArrayList<>();
		cities.add("kolkata");
		cities.add("haldia");
		cities.add("durgapur");
		
		

  hm.put("Maharastra",Arrays.asList("pune","mumbai","amrawati") );
  hm.put("WestBengal", cities); 
  System.out.println(hm);
	}

}
