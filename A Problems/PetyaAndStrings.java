package simon.lowther;

import java.util.Scanner;

public class PetyaAndStrings {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	
	String string1 = scanner.next().toLowerCase();
	String string2 = scanner.next().toLowerCase();
	int answer = string1.compareTo(string2);
	
	if(answer < 0) answer = -1;
	if(answer > 0) answer = 1;
	
	System.out.println(answer);
	
    	}

}
