package Strings;

class Search {
  
    
    static int findChar(String s, char ch) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
          
           
            if (s.charAt(i) == ch)
                return i;
        }

      
        return -1;
    }

    public static void main(String[] args) {
        String s = "Letskbegin";
        char ch = 'k';
      
        System.out.println(findChar(s, ch));
    }
}