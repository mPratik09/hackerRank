package hackerrank.introduction;

import java.util.Scanner;

public class StringsIntroduction
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

//	     1. Sum the lengths of A and B
		System.out.println(A.length() + B.length());

//	     2. Check whether A is lexicographically larger than B or not
		if (A.compareTo(B) > 0)
		{
			System.out.println("Yes");
		} else
		{
			System.out.println("No");
		}

//		Capitalize the first letter in A and B and print them on a single line separated by space
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

	}
}
