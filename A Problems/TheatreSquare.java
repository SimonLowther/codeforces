import java.util.Scanner;

public class TheatreSquare {
    
    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();
    static int m = scanner.nextInt();
    static int a = scanner.nextInt();

    public static void main(String[] args) {
	double length = Math.ceil((double) n/a);
	double width = Math.ceil((double)m/a);
	double stones = length*width;
	System.out.println((long)stones);
    }

}
