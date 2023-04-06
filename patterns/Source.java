package patterns;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class InAmsterdam {
	int countAm(String str) {
		int count = 0;
		
		String str1[] = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("am")) {
				count++;
			}
		}
		return count;
	}
}

public class Source {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		InAmsterdam a = new InAmsterdam();
		System.out.println(a.countAm("I Am in Amsterdam am I?"));

	}
}