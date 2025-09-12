package hackerrank.introduction;

import java.util.Scanner;

public class JavaSubstring
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int startIdx = sc.nextInt();
		int endIdx = sc.nextInt();

		System.out.println(str.substring(startIdx, endIdx));

		sc.close();
	}
}
