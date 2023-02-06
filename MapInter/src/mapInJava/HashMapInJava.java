package mapInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hm=new HashMap<>();
		
		
		//System.out.println(hm);
		
		System.out.println(hm.put(10, "del"));//null
		//System.out.println(hm.put(10, "del"));//null
		//System.out.println(hm.put(10, "mum"));//del
		
		System.out.println(hm);// {10-mum}

	}

}
