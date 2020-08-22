package simon.lowther;

import java.util.Scanner;

public class BitPP {
    
    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();
    
    public static void main(String[] args) {
	int x = 0;
	for(int i = 0; i<n ; i++) {
	    String operation = scanner.next();
	    if(operation.startsWith("-") || operation.endsWith("-")) x--;
	    if(operation.startsWith("+") || operation.endsWith("+")) x++;
	}
	System.out.println(x);
    }

}
