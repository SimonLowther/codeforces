import java.util.Scanner;

public class word {

    static Scanner scanner = new Scanner(System.in);
    static int upper = 0;
    static int lower = 0;
    static String answer;

    public static void main(String[] args) {
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {

            Character character = string.charAt(i);
            if (Character.isUpperCase(character)) {
                upper++;
            } else {
                lower++;
            }
        }

        if (upper > lower) {
            answer = string.toUpperCase();
        } else {
            answer = string.toLowerCase();
        }
        System.out.println(answer);

    }

}
