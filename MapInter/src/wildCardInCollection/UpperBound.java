package wildCardInCollection;

import java.util.Arrays;
import java.util.List;

public class UpperBound {
	//Only Number and it's child class are only can call this method
public static void fun1(List<? extends Number> list) {
		
		System.out.println("inside fun1...");
		
		
		for(Number n1:list) {
		
			System.out.println(n1);
		}
		
		
	}
	
	public static void main(String[] args) {
		
	
		List<Integer> ilist= Arrays.asList(10,20,30,40);
		
		List<String> slist= Arrays.asList("a","b","c","d");
		
		
		fun1(ilist);
		
		//fun1(slist); that's why it is not applicable
		
	}
}
