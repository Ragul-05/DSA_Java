package strings;

public class CountOfSubString {
    public static void main(String[] args) {
        String ones = "10111000";
        int result = countSubStringOfBinary(ones);
        System.out.println("The count of substring of binary is: " + result);
    }

    static int countSubStringOfBinary(String str){
       /* int count = 0;
        int n = str.length();
        for(int i =0 ; i< n; i++){
            if(str.charAt(i) == '1'){
                for(int j = i+1; j <n ; j++){
                    if(str.charAt(j) == '1'){
                        count++;
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        return count;*/

        int onesCount = 0;
        for(int i = 0 ; i <str.length(); i++){
            if(str.charAt(i) == '1'){
                onesCount++;
            }
        }
        return (onesCount * (onesCount - 1))/2;
    }
}
