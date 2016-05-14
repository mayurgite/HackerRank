package com.io.programs;

import java.util.Scanner;

public class Solutions {
	
		public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	String A = sc.next();
	String B = sc.next();

	boolean ret = isAnagram(A, B);
	if (ret)
		System.out.println("Anagrams");
	else
		System.out.println("Not Anagrams");

}

static boolean isAnagram(String A, String B) {
	boolean flag = false;
	char[] aR = A.toCharArray();
	char[] bR = B.toCharArray();
	for (int i = 0; i < aR.length; i++) {
		if (Character.valueOf(aR[i])> Character.valueOf(aR[++i<aR.length ? ++i : i])) {
			Character temp = aR[i];
			aR[i] = Character.toLowerCase(aR[i++]);
			aR[i++] = Character.toLowerCase(aR[i]);
		}
	}
	for (int i = 0; i < bR.length; i++) {
		if (Character.valueOf(bR[i])> Character.valueOf(bR[++i<bR.length ? ++i : i])) {
			Character temp = bR[i];
			bR[i] = Character.toLowerCase(bR[i++]);
			bR[i++] = Character.toLowerCase(bR[i]);
		}
	}

	if (aR.equals(bR))
		flag = true;

	return flag;
}
}
