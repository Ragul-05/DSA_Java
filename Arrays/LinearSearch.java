package Arrays;

import java.util.*;
public class LinearSearch {
    public static void linear(int arr[],int n,int s){
        for(int i=0;i<n;i++){
            if(arr[i] == s){
                System.out.println("The element in the position at index " +i+" "+ "and value is"+ " "+s);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        System.out.print("Enter the element to search : ");
        int s = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n ; i++){
            arr[i] = sc.nextInt();
        }

        linear(arr,n,s);
    }
}
