package simon.lowther;

import java.util.Scanner;

public class BeautifulMatrix {
    
    static Scanner scanner = new Scanner(System.in);
    static int answer;
    
    public static void main(String[] args) {
	int [][] matrix = new int[5][5];
	for(int i = 0; i<5; i++)
	    for(int j = 0; j<5; j++) {
		matrix[i][j] = scanner.nextInt();
		if (matrix[i][j] == 1) {
		    answer = Math.abs(j - 2) + Math.abs(i-2);
		}
	    }
	System.out.println(answer);
    }

}
