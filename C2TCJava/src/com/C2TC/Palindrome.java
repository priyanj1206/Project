package com.C2TC;
import java.util.Scanner;
public class Palindrome 
{
	
	public static void main(String[] args) 
	{
		int num=readNum();

		if(isPalindrome(num))
			 System.out.println( num + " isa palindrome");
		 else
			 System.out.println(num + "not palindrome");
    }
        public static int readNum()
		{
        Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num =sc.nextInt();
		return num;
		}



        public static boolean isPalindrome(int num)	
	 {

        int rem, rev=0, temp=num;
		while(num > 0)
		{
			rem =num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev == temp;
		 
	}

	
}



