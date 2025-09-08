package hackerrank.introduction;

import java.util.Scanner;

public class Anagrams_02
{

	static boolean isAnagram(String a, String b)
	{
		char[] aCharArr = a.toLowerCase().toCharArray();
		char[] bCharArr = b.toLowerCase().toCharArray();

		// sorting String A alphabetically
		String aStr = new String(sortString(aCharArr));
		// sorting String B alphabetically
		String bStr = new String(sortString(bCharArr));

		// Comparing Strings lexicographically
		if ((aStr.compareTo(bStr)) == 0)
		{
			return true;
		} else
		{
			return false;
		}

	}

	public static char[] sortString(char[] arrToBeSort)
	{
		for (int i = 0; i < arrToBeSort.length - 1; i++)
		{
			for (int j = 0; j < arrToBeSort.length - 1 - i; j++)
			{
				if (arrToBeSort[j] > arrToBeSort[j + 1])
				{
					char temp = arrToBeSort[j];
					arrToBeSort[j] = arrToBeSort[j + 1];
					arrToBeSort[j + 1] = temp;
				}
			}
		}
		return arrToBeSort; // Array is sorted now
	}

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
