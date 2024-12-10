package strings;
import java.util.Scanner;
import java.util.Arrays;

public class SortStudentNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

       
        Arrays.sort(names);

        
        System.out.println("\nNames of the students in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

