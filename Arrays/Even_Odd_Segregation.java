package Arrays;
import java.util.*;

public class Even_Odd_Segregation {
    //Segregate even and odd numbers using Lomuto’s Partition Scheme
    static void arrayEvenAndOdd(int arr[], int n)
    {

        int i = -1, j = 0;
        while (j != n) {
            if (arr[j] % 2 == 0) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        
        for (int k = 0; k < n; k++)
            System.out.print(arr[k] + " ");
    }

   
    public static void main(String args[])
    {
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int n = arr.length;
        arrayEvenAndOdd(arr, n);
    }
}

