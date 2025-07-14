package Search;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        System.out.println("Element is present at index: " + binarySearch(arr, 0, arr.length - 1, 10));
    }

    static int binarySearch(int arr[], int left, int right, int x) {
        if (left > right) {
            return -1; 
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == x) {
            return mid;
        }
        if (arr[mid] > x) {
            return binarySearch(arr, left, mid - 1, x);
        }
        return binarySearch(arr, mid + 1, right, x);
    }
}
