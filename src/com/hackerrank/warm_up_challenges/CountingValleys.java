package com.hackerrank.warm_up_challenges;
//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup

public class CountingValleys {

	public static void main(String[] args) {

		String s1 = "UDUDDDUDUU";
		String s2 = "UUDDDDUUUDDUUUDD";
		String s3 = "DUDDUUDDUDUUUD";
		int lvl = 0;
		int v = 0;
		for(char c : s3.toCharArray()) {

			if(c=='U')
				lvl++;
			if(c=='D')
				lvl--;
			//If Recent Move is UP and Level is 0 means Coming from Valley
			if(c=='U' && lvl==0)
				v++;
		}
		System.out.println("\nValley : "+v);

		//OR//

		int level = 0;
		int v2 = 0;
		for(int i = 0; i < s3.length(); i++) {

			if(s3.charAt(i) == 'U'){
				level++;
			}
			else
				if(s3.charAt(i) == 'D') {
					//If is at Ground Level and next Move is Down means Going to Valley
					if(level == 0){
						v2++;
					}
					level--;
				}
		}
		System.out.println("\nValley : "+v2);

	}
}
