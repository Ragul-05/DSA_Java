package strings;

import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text (type '*' to end):");
        StringBuilder text = new StringBuilder();

       
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("*")) break;
            text.append(line).append("\n");
        }

        String inputText = text.toString();
        int charCount = inputText.length();
        int wordCount = inputText.split("\\s+").length;
        int lineCount = inputText.split("\n").length;

        
        System.out.println("\nThe total count of words is: " + wordCount);
        System.out.println("The total count of lines is: " + lineCount);
        System.out.println("The total count of characters is: " + charCount);
    }
}

