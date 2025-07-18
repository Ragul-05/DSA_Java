package strings;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char result = firstReapeatingCharacter(str);
        System.out.println("The first repeating character is: " + result);
    }

    static char firstReapeatingCharacter(String str1)  {
        int[] charCount = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = ch - 'a';

            if (charCount[index] != 0) {
                return ch;
            }
            charCount[index]++;
        }
        return '\0';
    }
}
