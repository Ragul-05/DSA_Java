package strings;
import java.util.Scanner;

public class SubstringExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

       
        System.out.print("Enter the position from which to start the substring: ");
        int start = scanner.nextInt();

      
        System.out.print("Enter the length of the substring: ");
        int length = scanner.nextInt();

       
        if (start < 0 || start >= mainString.length() || length <= 0) {
            System.out.println("Invalid starting position or length.");
            return;
        }

        
        int end = Math.min(start + length, mainString.length());
        String substring = mainString.substring(start, end);

       
        System.out.println("The substring is: " + substring);
    }
}

