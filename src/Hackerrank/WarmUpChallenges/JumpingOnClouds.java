package Hackerrank.WarmUpChallenges;
//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
import java.util.Arrays;

public class JumpingOnClouds {

	public static void main(String[] args) {



		int[] c = {0,0,1,0,0,1,0};
		int jump=0;
		int i=0;
		while(i<c.length-1)
		{
			System.out.println(i);
			if(i<c.length-2 && c[i+2]!=1) {
				i=i+2;
			}
			else
				i++;

			jump++;
		}

		System.out.println(Arrays.toString(c));
		System.out.println(jump);


//// OR ////

		int count = -1;
		for (int j = 0; j < c.length; j++, count++) {
			if (j<c.length-2 && c[j+2]==0) j++;
		}
		System.out.println(count);


		
		
////////////////////////////////////////////////		
	}

}