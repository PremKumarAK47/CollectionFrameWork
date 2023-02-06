package mapInJava;

import java.util.HashMap;
import java.util.Map;

public class AddObjectInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student>hm= new HashMap<>();
		hm.put("Maharastra",new Student(10,"Ganesh",950));
	       hm.put("Tamilnadu",new Student(12,"Surya",850));
	       hm.put("Telangana",new Student(15,"Venkat",920));
	       hm.put("Haryana",new Student(16,"Dinesh",910));
	       hm.put("Kerla",new Student(18,"Srinu",880));
	       System.out.println(hm );
	       
	       Map<String,Student>  resultMap= sortMapUsingValue(hm);

	}

	private static Map<String, Student> sortMapUsingValue(HashMap<String, Student> hm) {
		// TODO Auto-generated method stub
		return null;
	}

}
