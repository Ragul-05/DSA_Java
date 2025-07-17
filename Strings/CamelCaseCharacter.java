package strings;
public class CamelCaseCharacter {
    public static void main(String[] args) {
        String str = "I am the fan of java programming language";
        String result = CamelCaseCharacters(str);
        System.out.println("The CamelCase Character as follows : " + result);
    }

    static String CamelCaseCharacters(String str1){
       //StringBuilder camelCase = new StringBuilder();
       //Boolean nextUpper = false;
       //for (String word : str1.split(" ")) {
       //    if (nextUpper) {
       //        camelCase.append(Character.toUpperCase(word.charAt(0)));
       //        nextUpper = false;
       //    } else {
       //        camelCase.append(Character.toLowerCase(word.charAt(0)));
       //    }
       //    for (int i = 1; i < word.length(); i++) {
       //        camelCase.append(Character.toLowerCase(word.charAt(i)));
       //    }
       //    nextUpper = true; 
       //    
       //}

       //return camelCase.toString();

       StringBuilder camelCase = new StringBuilder();
         boolean nextUpper = false;
         for(char ch : str1.toCharArray()){
            if(ch == ' '){
                nextUpper = true;
            }
            else if (nextUpper){
                camelCase.append(Character.toUpperCase(ch));
                nextUpper = false;
            }
            else{
                camelCase.append(Character.toLowerCase(ch));
            }
         }
         return camelCase.toString();
    }


}
