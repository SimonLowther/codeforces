package simon.lowther;

import java.util.Scanner;

public class SoldierAndBananas {
    
    static Scanner scanner = new Scanner(System.in);
    static int k = scanner.nextInt();
    static int n = scanner.nextInt();
    static int w = scanner.nextInt();
    static int amount;
    static int borrow;

    public static void main(String[] args) {
	
	for(int i = 1; i <= w; i++) {
	    amount = amount + (i * k);
	}
	
	borrow = amount - n;
	if (borrow < 0) borrow = 0;
	
	System.out.println(borrow);
    }

}
