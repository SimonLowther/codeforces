package simon.lowther;

import java.util.Scanner;

public class Watermelon {
    
   static Scanner scanner = new Scanner(System.in);
   static int w = scanner.nextInt();

    public static void main(String[] args) {
	
	if(test(w))
	    System.out.println(new String("YES"));
	else
	    System.out.println(new String("NO"));
	    

    }
    
    static boolean test(int w) {
	boolean answer = false;
	for(int i=1; i < w; i++) {
	    for(int j = w; j >= 1; j--) {
		if (i + j == w && i % 2 == 0 && j % 2 == 0) answer = true;
		
	    }
	}
	return answer;
    }

}
