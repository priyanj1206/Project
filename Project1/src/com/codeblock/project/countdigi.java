// Recursion for counting the digits
package com.codeblock.project;

import java.util.Scanner;
class countdigi 
{

	public static void main(String[] args) 
	{
		int num =readNum();
		int totalDigit = countDigit(num);
		if(totalDigit < 0)
			System.out.println("TotalDigit + is a Negative Number");
		else
			System.out.println("Total Number of Digits in the number is :" + totalDigit);
	}
	public static int readNum()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		return sc.nextInt();
	}
	public static int countDigit(int num)
	{
		int countDig =0, count=0;
		if(num < 0) {
			System.out.println("please enter positive number");
			return num;
			
		}
		else if(num == 0)
			return 1;
		else
		{
			while(num > 0) {
				num /=10;
				countDig = count + countDigit(num / 10);
				count++;
			}
			return countDig;
			}
		}
		
}


