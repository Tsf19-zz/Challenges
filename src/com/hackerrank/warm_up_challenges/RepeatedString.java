package com.hackerrank.warm_up_challenges;

//https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class RepeatedString {

	public static void main(String[] args) {
		
		String s = "aba";
		int n = 10;
		long count = 0;
		
		for(char c : s.toCharArray())
			if(c  == 'a')
				count++;

		long factor = (n/s.length());
		long rem = (n%s.length());

		count = count * factor ;

		for(int i = 0 ;i<rem; i++) {
			if(s.charAt(i)=='a')
				count++;
		}

		System.out.println("Count is :"+count);
		
/////////////////////////////////////////	
	}
}
