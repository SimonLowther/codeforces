package simon.lowther;


import java.util.Scanner;

public class Team {
    
    static Scanner scanner = new Scanner(System.in);
    static int[] list;
    static int total;
    public static void main(String[] args) {
	
	int length = scanner.nextInt();
	solve(length);
	System.out.println(total);
    }
    
    static void solve(int l){
	
	list = new int[l * 3];
	
	for (int i=0; i<(l * 3); i++) {
	    list[i] = scanner.nextInt();
	    
	}
	
	scanner.close();
	
	for (int i = 0; i<(l*3); i=i+3) {
	    int next = list[i] + list[i+1] + list[i+2];
	    if (next >= 2) {
		total++;
	    }	    
	    
	}
	
	    
    } 

}
