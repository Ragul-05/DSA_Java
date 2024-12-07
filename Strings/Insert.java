package Strings;

class GfG {
    static String insertChar(String s, char c, int pos) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
      
            
            if (i == pos) 
                res.append(c);
      
         
            res.append(s.charAt(i));
        }
  
        
        if (pos >= s.length()) 
            res.append(c);
      
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Geeks";
        System.out.println(insertChar(s, 'A', 3));
    }
}