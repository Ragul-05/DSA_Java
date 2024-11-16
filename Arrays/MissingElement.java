package Arrays;
//brute force 
/*
import java.util.*;

public class MissingElement {
    public static int missingNumber(int []a, int N) {

        
        for (int i = 1; i <= N; i++) {

            int flag = 0;

            //Search the element using linear search:
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {

                    flag = 1;
                    break;
                }
            }

            if (flag == 0) return i;
        }

        return -1;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}  */

//Better solution
/*
import java.util.*;

public class MissingElement {
    public static int missingNumber(int []a, int N) {

        int hash[] = new int[N + 1]; //hash array

        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}
 */

 import java.util.*;

public class MissingElement {
    public static int missingNumber(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}


//Time complexity 
// Brute force --> O(N^2)
// Better soln --> O(2N)
// Optimal     --> O(N)