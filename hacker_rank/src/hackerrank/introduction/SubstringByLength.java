package hackerrank.introduction;

import java.util.Scanner;

public class SubstringByLength
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:\t");
		String str = sc.next();

		System.out.println("Enter the start index and end index:\t");
		int startIdx = sc.nextInt();
		int endIdx = sc.nextInt();

		System.out.println(substringWithLength(str, startIdx, endIdx));

		sc.close();
	}

	public static String substringWithLength(String str, int startIdx, int len)
	{
		if (str == null || str.isEmpty())
		{
			throw new IllegalArgumentException("Input string cannot be null.");
		} else if ((startIdx < 0) || (startIdx >= str.length()))
		{
			throw new StringIndexOutOfBoundsException("Invalid inputs for start index and end index.");
		}

		int endIdx = Math.min(startIdx + len, str.length());

		return str.substring(startIdx, endIdx);
	}
}
