package strings;

public class SubSets {
    public static void main(String[] args) {
        //subSeq("", "abc");
        String str = "abc";
        int count = countSubSets(str,0);
        System.out.println("Total subsets:"+ count);
    }

    /*static void subSeq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch , up.substring(1));
        subSeq(p,up.substring(1));
    }*/

    static int countSubSets(String str, int ind){
        if(ind == str.length()){
            return 1;
        }
        int include = countSubSets(str, ind + 1);
        int exclude = countSubSets(str, ind + 1);
        return include + exclude;
    }


}
