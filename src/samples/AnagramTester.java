package samples;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AnagramTester {

	public static void main(String[] args) throws IOException {
		int ch = 0;
		boolean flag=true;
		String s1 = null, s2 = null, distinctOne = null, distinctTwo = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataInputStream in = new DataInputStream(System.in);
		int i=0;
		while(true)
		{
		
			System.out.println("1.No.of Occurances of a character in a String");
			System.out.println("2.Anagrams or Not");
			System.out.println("Enter your choice:");
			ch = Integer.parseInt(br.readLine());
			switch (ch) {
			case 1:
				System.out.println("Enter strings to check");
				s1 = br.readLine();
				System.out.println("Enter the a character");
				byte b = in.readByte();
				char c = (char) b;
				calculateOccurance(s1, c);
				break;
			case 2:
				System.out.println("Enter strings to check");
				s1 = br.readLine();
				System.out.println("Enter string2");
				s2 = br.readLine();
				if(s1.length()==s2.length())
				{
				distinctOne = removeDuplicate(s1);
				distinctTwo = removeDuplicate(s2);
				isAnagramNot(distinctOne, distinctTwo);
				}
				else
				{
					System.out.println("Lengths are different");
				}
				break;
			}
		
		System.out.println("C r N");
		Scanner s=new Scanner(System.in);
		String sm=s.nextLine();
		//System.out.println("S:"+s);
		if(sm=="N")
		{
			System.out.println("Game Over!!!Please play it again!!!”);
			break;
		}
			//i++;
		}
		}

	

	private static void isAnagramNot(String distinctOne, String distinctTwo) {
		String s1 = distinctOne;
		String s2 = distinctTwo;
		int counterj = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < distinctOne.length(); i++) {
				for (int j = 0; j < distinctTwo.length(); j++) {
					if (distinctOne.charAt(i) == distinctTwo.charAt(j)) {

						counterj++;
					}

				}

			}
System.out.println(counterj);
			if (counterj == distinctOne.length()) {
				System.out.println("Anagrams!!!");
			} else {
				System.out.println("Not Valid");

			}
		} else {
			System.out.println("Poor words!! Failed At Length Itself");
		}

		return;
	}

	private static String removeDuplicate(String s1) {

		String m = s1, tmp = "";

		int len = m.length();
		for (int j = 0; j < len; j++) {
			if (tmp.indexOf(s1.charAt(j)) == -1) {
				tmp += s1.charAt(j);
			}

		}
		System.out.println(tmp);
		return tmp;
	}

	private static int calculateOccurance(String s1, char c) {

		int counter1 = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (c == s1.charAt(i)) {
				counter1++;
			}

		}
		System.out.println("No.of Occurances" + counter1);
		return counter1;
	}

}
