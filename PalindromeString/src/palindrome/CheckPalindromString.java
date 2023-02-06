package palindrome;

import java.util.Scanner;

public class CheckPalindromString {
	
	public static boolean isPalindrome(String str)
	{
		String s =new StringBuilder(str).reverse().toString();
		if(s.equals(str))
		{
			//System.out.println(sb);
			return true;
		}
		else
			return false;
			//System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		//isPalindrome(str);
		if(isPalindrome(str))
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
