package genericsPractice;

public class PrintTypeEle {
//Generic Method
	// we have to define the type of return type 
 public static <T> void fun1(T[] tr) 
 {
		
		for(T t1:tr) 
		{
		System.out.println(t1);
		}
	}
 
//Generic Method
 public static <K,V> void fun2(K k, V v) {
		
		System.out.println(k+"========"+v);
		
		
	}
 
 //with return type:
 // according to return type it will return the value
	

	 public static <K,V> V fun3(K k, V v) {
	 		
	 		System.out.println(k+"========"+v);
	 		
	 		return v;
	 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //Primitives are not supported
				//int[] nums= {10,20,30,40};
				
				Integer[] nums= {10,20,30,40};
				
				String[] str= {"a","b","c"};
				
				fun1(str);
				
				fun1(nums);
				fun2(10, 20);
				
				fun2("Hello",20);
				
				fun2(10, new Student(10, "N1", 500));
				

	}

}
