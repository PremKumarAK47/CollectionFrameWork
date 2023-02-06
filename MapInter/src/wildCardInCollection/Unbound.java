package wildCardInCollection;

import java.util.Arrays;
import java.util.List;

public class Unbound {
public static void fun1(List<?> list) {
		
		System.out.println("inside fun1...");
		
		//we can access the values from the unbounded type by using Object class
		//cause we don't know which value user will pass so we need to take care of that
		for(Object i1:list) {
		
			System.out.println(i1);
		}
		
		
	}
	
	public static void main(String[] args) {
		
	
		List<Integer> ilist= Arrays.asList(10,20,30,40);
		
		List<String> slist= Arrays.asList("a","b","c","d");
		
		
		fun1(ilist);
		fun1(slist);
		
	}
	/*
	 * --the above example (unbounded type) is simillar to not applying generics

ex:

public static void fun1(List list) {

}

--the above code we write wituout the wildcard also
ex:

public static <T> void fun1(List<T> list) {

}
	 */


}
