package Arrays;

/*

//Brute force approach
class Check_Sort {
    static boolean isSorted(int arr[], int n) {
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          if (arr[j] < arr[i])
            return false;
        }
      }
  
      return true;
    }
  
    public static void main(String args[]) {
      int arr[] = {1, 2, 3, 4, 5}, n = 5;
  
      System.out.println(isSorted(arr, n));
    }
  }
*/

//Optimal soln

class Check_Sort {
    static boolean isSorted(int arr[], int n) {
      for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1])
          return false;
      }
  
      return true;
    }
  
    public static void main(String args[]) {
      int arr[] = {1, 2, 3, 4, 5}, n = 5;
  
      System.out.println(isSorted(arr, n));
    }
  }


//Brute force  --> O(N^2)
//Optimal soln --> O(N)
