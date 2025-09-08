package hackerrank.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

////	Approach 1:

//	Function to check whether the string is anagram or not??
	static boolean isAnagram_01(String a, String b)
	{
		char[] aCharArr = a.toLowerCase().toCharArray();
		char[] bCharArr = b.toLowerCase().toCharArray();

		// sort String A alphabetically
		String aStr = new String(sortString(aCharArr));
		// sort String B alphabetically
		String bStr = new String(sortString(bCharArr));

		// Comparing strings lexicographically for equality
//		if ((aStr.compareTo(bStr)) == 0)
//		{
//			return true;
//		} else
//		{
//			return false;
//		}

		return aStr.equals(bStr);

	}

//	This function sorts the string alphabetically
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


////		Approach 2:
	
//	function to check whether the strings are anagram or not by Arrays.sort() method
    static boolean isAnagram_02(String a, String b) {
        
        char[] aCharArr = a.toLowerCase().toCharArray();
        char[] bCharArr = b.toLowerCase().toCharArray();
        
//   	Sort strings lexicographically
        Arrays.sort(aCharArr);
        Arrays.sort(bCharArr);

        String aStr = new String(aCharArr);
        String bStr = new String(bCharArr);
        
        if((aStr.compareTo(bStr) == 0)){
            return true;
        } else {
            return false;
        }
        
    }

    
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram_01(a, b);
//        boolean ret = isAnagram_02(a, b);
        
        
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
