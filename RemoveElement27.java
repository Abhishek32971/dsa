// Example 1:

// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Example 2:

// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
// Note that the five elements can be returned in any order.
// It does not matter what you leave beyond the returned k (hence they are underscores).

import java.util.Arrays;

public class RemoveElement27 {
    // public static void RemoveN(int[] arr,int N){
    //     int flag=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] == N){
    //             arr[i]=101;
    //             flag+=1;
    //         }
    //     }
    //     Arrays.sort(arr);
    //     System.out.println(arr.length-flag);
    // }


    // it has a higher runtime and memory


    public static void RemoveN(int[] arr,int N){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=N){
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(j);
    }
    public static void main(String[] args) {
        int[] arr1={3,2,2,3};
        int k1=3;
        int[] arr2={0,1,2,2,3,0,4,2};
        int k2=2;
        RemoveN(arr1,k1);
        RemoveN(arr2,k2);
    }
}
