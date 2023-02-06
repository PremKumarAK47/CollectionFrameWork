package wildCardInCollection;

import java.util.Arrays;
import java.util.List;

public class LowerBound {

	public static void fun1(List<? super Integer> list) {
		
		System.out.println("inside fun1...");
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
	/*
	 * only parent or itself are allowed not any other	
	 */
		
	
	}
 public static void fun2(List<? super Student> list) {
		
		System.out.println("inside fun1...");
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		/*
		 * --here we can call the above method by passing List of Student or 
List of Person or List of Object.
		 */
		
	
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> ilist= Arrays.asList(10,20,30,40);
		
		List<Number> nlist= Arrays.asList(10,20,30,40);
		
		List<Object> olist= Arrays.asList(10,20,30,40);
		
		List<Double> dlist= Arrays.asList(10.55,20.44,30.33,40.33);
		
		
		
		fun1(olist);
		fun1(nlist);
		fun1(ilist);
		
		
		//fun1(dlist); //CE
		
List<Student> students= Arrays.asList(
				
				new Student(12, "N1", 500),
				new Student(13, "N2", 500),
				new Student(14, "N3", 500),
				new Student(15, "N4", 500)
				);
		
		fun2(students);
		
		
		
		
	}

}
