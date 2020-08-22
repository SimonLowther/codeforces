import java.util.Scanner;

public class Tram {
    
    static Scanner scanner = new Scanner(System.in);
    static int stops = scanner.nextInt();
    static int capacity;
    static int maxCapacity = 0;

    public static void main(String[] args) {
	
	for (int i = 1; i <= stops; i++) {
	    int off = scanner.nextInt();
	    int on = scanner.nextInt();
	    capacity = capacity - off + on;
	    if(capacity > maxCapacity) maxCapacity = capacity;
	    
	}
	
	System.out.println(maxCapacity);
    }

}
