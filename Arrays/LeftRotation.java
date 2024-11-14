package Arrays;
// Brute Force Approach
/*
  import java.util.*;

class TUF{
static void solve(int arr[], int n) {
  int temp[]=new int[n];
  for (int i = 1; i < n; i++) {
    temp[i - 1] = arr[i];
  }
  temp[n - 1] = arr[0];
  for (int i = 0; i < n; i++) {
    System.out.print(temp[i]+" ");
  }
  
}
public static void main(String args[]) {
  int n=5;
  
  int arr[]= {1,2,3,4,5};
  solve(arr, n);
}
}
 */


 // Optimal Approach
import java.util.*;
 public class LeftRotation {
     static void rotate(int arr[],int n){
        int temp = arr[0];
        for(int i = 1 ; i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i = 0 ; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
           arr[i] = sc.nextInt();
        }
        LeftRotation.rotate( arr,n);

    }
    
 }


//Time complexity
//Brute force -- >  O(N)
//Optimal App -- >  O(N)