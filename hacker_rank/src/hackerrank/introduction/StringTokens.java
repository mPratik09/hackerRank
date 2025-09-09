package hackerrank.introduction;

import java.util.Scanner;

public class StringTokens
{

	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);

		String str = "He is a very very good boy, isn't he?";

		str = str.trim();
		if (str.length() == 0)
		{
			System.out.println(0);
			return;
		}

		String[] words = str.split("[^a-zA-Z]+");

		System.out.println(words.length);
		for (String word : words)
		{
			System.out.println(word);
		}

//		sc.close();
	}

}
