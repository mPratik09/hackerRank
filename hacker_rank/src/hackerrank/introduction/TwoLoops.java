package hackerrank.introduction;

import java.util.Scanner;

public class TwoLoops
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int lines = sc.nextInt();
		
		for(int i=0; i<lines; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			int res = a;
			int pow = 1;

			for(int j=0; j<n; j++) {
				res = res + pow * b;
				pow = pow * 2;

				System.out.print(res + " ");
			}
		}
		
	}
}
