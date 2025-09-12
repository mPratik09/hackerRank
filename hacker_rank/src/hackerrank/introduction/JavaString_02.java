package hackerrank.introduction;

import java.util.Scanner;

public class JavaString_02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:\t");
		String str = sc.next();

		System.out.println("Enter the start index and end index:\t");
		int startIdx = sc.nextInt();
		int endIdx = sc.nextInt();

		String substring = substringWithLength(str, startIdx, endIdx);

		System.out.println(substring);
		sc.close();
	}

	public static String substringWithLength(String str, int startIdx, int len)
	{
		int endIdx = Math.min(startIdx + len, str.length());

		return str.substring(startIdx, endIdx);
	}
}
