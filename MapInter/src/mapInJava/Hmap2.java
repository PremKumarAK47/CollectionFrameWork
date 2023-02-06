package mapInJava;

import java.util.HashMap;

public class Hmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<Integer, String> hm=new HashMap<>();
		
		
		hm.put(10, "del");
		hm.put(20, "mum");
		hm.put(30, "che");
		hm.put(40, "del");
		hm.put(null, "pun");
		hm.put(null, "chandigarh");
		
		System.out.println(hm);

	}

}
