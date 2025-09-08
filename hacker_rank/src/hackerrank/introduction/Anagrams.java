package hackerrank.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        
        char[] aCharArr = a.toLowerCase().toCharArray();
        char[] bCharArr = b.toLowerCase().toCharArray();
        
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
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
