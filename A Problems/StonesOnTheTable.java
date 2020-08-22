package simon.lowther;

import java.util.Scanner;

public class StonesOnTheTable {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	
	int total = 0;
	int numberOfStones = scanner.nextInt();
	String stonesString = scanner.next();
	char[] arrayOfStones = new char[numberOfStones];
	for (int i = 0; i < numberOfStones; i++) {
	    arrayOfStones[i] = stonesString.charAt(i);
	}
	
	for(int j = 0; j < numberOfStones-1; j++) {
	    if (arrayOfStones[j]==arrayOfStones[j+1]) total++;
	}	
	System.out.println(total);
    }

}
