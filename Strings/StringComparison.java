package strings;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

       
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 == len2) {
            int i = 0;
            boolean same = true;

            while (i < len1) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    same = false;
                    break;
                }
                i++;
            }

            if (same) {
                System.out.println("The two strings are equal");
            } else {
                
                if (str1.compareTo(str2) > 0) {
                    System.out.println("String 1 is greater than String 2");
                } else {
                    System.out.println("String 2 is greater than String 1");
                }
            }
        } else {
            System.out.println("The two strings are not equal");
        }

        scanner.close();
    }
}

