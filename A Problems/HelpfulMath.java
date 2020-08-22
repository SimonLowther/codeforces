package simon.lowther;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {
    
    static Scanner scanner = new Scanner(System.in);
    static String string = scanner.next();
   

    public static void main(String[] args) {
	
	StringBuilder sb = new StringBuilder();
	char[] array = string.toCharArray();
	Arrays.sort(array);
	for (char c : array) {
	    if (c ==  '+') continue;
	    sb.append(c + "+");
	    
	}
	
	if (sb.charAt(sb.length()-1)=='+') sb.deleteCharAt(sb.length()-1);
	System.out.println(sb.toString());
	

    }

}
