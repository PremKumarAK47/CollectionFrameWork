package reverseStringCheck;

import java.util.Scanner;

public class ReverseString {
	public static boolean checkPalindrome(String str)
	{
		String s=new StringBuilder(str).reverse().toString();
		if(s.equals(str))
		{
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter String to Check for Palindrome");
	  String str= sc.nextLine();
	  
	  boolean s=checkPalindrome(str);
	  if(s) {
		  System.out.println("Yes");
	  }
	  else {
		  System.out.println("No");
	  }
	}

}
