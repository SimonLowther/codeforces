import java.util.Scanner;

public class BoyOrGirl {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	
	StringBuilder sb = new StringBuilder();
	String name = scanner.next();
	char[] nameArray = name.toCharArray();
	for (char letters:nameArray) {
	    if(sb.indexOf(Character.toString(letters))>=0) continue;
	    else {
		sb.append(letters);
	    }
	}
			
	if(sb.length() % 2 == 0) System.out.println("CHAT WITH HER!");
	else System.out.println("IGNORE HIM!");
	
    }

}
