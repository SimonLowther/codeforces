package simon.lowther;

import java.util.Scanner;

public class NextRound {
    
    static Scanner scanner = new Scanner(System.in);
    static int total;
    
    public static void main(String[] args) {
	int n = scanner.nextInt();
	int k = scanner.nextInt();
	int[] scores = new int[n];
	
	for (int i = 0; i<n; i++) {
	    scores[i]=scanner.nextInt();
	}
	
	int min = scores[k-1];
	
	for(int score:scores) {
	    if(score >= min && score > 0) total++;
	}
	
	System.out.println(total);

    }

}
