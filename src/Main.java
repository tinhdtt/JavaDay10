import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = sc.nextLine();
        removeDuplicateChars(str);


    }

    public static void removeDuplicateChars(String input) {
        String output = new String();
        for (int i = 0; i < input.length(); i++) {
            boolean isDuplicate = false;
            String str = String.valueOf(input.charAt(i));
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) == output.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false) {
                output = output.concat(str);
            }
        }
        System.out.println("Output = " + output);
    }
}


