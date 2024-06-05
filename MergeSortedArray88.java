import java.util.*;
public class MergeSortedArray88 {
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //     if(nums1.length==0){
    //         System.out.println("[]");
    //         return;
    //     }
    //     if(nums2.length==0){
    //         System.out.println(Arrays.toString(nums1));
    //         return;
    //     }
    //     int i=0;
    //     int j=0;
    //     int count=0;
    //     while(i <=m && j<n){
    //         count++;
    //         if(nums1[i]<=nums2[j]){
    //             i++;
    //         }
    //         else if(nums1[i]>nums2[j]){
    //             int temp=nums1[i];
    //             nums1[i]=nums2[j];
    //             nums2[j]=temp;
    //             i++;
    //             j++;
    //             // System.out.println(Arrays.toString(nums1)+" "+count);

    //         }

    //     }
    //     Arrays.sort(nums2);
    //     for(int k =m, q = 0; q < nums2.length && k < nums1.length; k++, q++) {
    //         nums1[k] = nums2[q];
    //         // System.out.println("in for");
    //     }
        
    //     System.out.println(Arrays.toString(nums1));
    // }

    // no solution . the solution was too complex 


//     public static void merge(int[] nums1, int m, int[] nums2, int n) {
//         if(nums1.length==0){
//             System.out.println("[]");
//             return;
//         }
//         if(nums2.length==0){
//             System.out.println(Arrays.toString(nums1));
//             return;
//         }
//         int i=m-1;
//         int j=n-1;
//         int k=m+n-1;
//         while(j>=0){
//             if(nums1[i]>nums2[j]){
//                 nums1[k--]=nums1[i--];
//             }
//             else{
//                 nums1[k--]=nums2[j--];
//             }
//             // System.out.println(Arrays.toString(nums1));
//         }
//         System.out.println(Arrays.toString(nums1));
// }
// did not include i>=0 this is needed in the 3rd case when nums1=[0] m=0 nums2=[1] n=1 the output should be [1] but we 
//get a wrong answer as error since the index is out of bounds

// public static void merge(int[] nums1, int m, int[] nums2, int n) {
//     if(nums1.length==0){
//         System.out.println("[]");
//         return;
//     }
//     if(nums2.length==0){
//         System.out.println(Arrays.toString(nums1));
//         return;
//     }
//     int i=m-1;
//     int j=n-1;
//     int k=m+n-1;
//     while(j>=0){
//         if(i>=0 && nums1[i]>nums2[j]){
//             nums1[k--]=nums1[i--];
//         }
//         else{
//             nums1[k--]=nums2[j--];
//         }
//         // System.out.println(Arrays.toString(nums1));
//     }
//     System.out.println(Arrays.toString(nums1));
// }



// the initial cases are not needed



public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i=m-1;
    int j=n-1;
    int k=m+n-1;
    while(j>=0){
        if(i>=0 && nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
        }
        else{
            nums1[k--]=nums2[j--];
        }
    }
}


// final solution


    public static void main(String[] args) {
        // int[] nums1={1,2,3,0,0,0};
        // int m=3;
        // int[] nums2={2,5,6};
        // int n=3;
        // merge(nums1, m, nums2, n);

        //[1, 2, 2, 3, 5, 6]

        // int[] nums1={1};
        // int m=1;
        // int[] nums2=new int[0];
        // int n=0;
        // merge(nums1, m, nums2, n);

        // [1]

        int[] nums1={0};
        int m=0;
        int[] nums2={1};
        int n=1;
        merge(nums1, m, nums2, n);

        //[1]

        // int[] nums1={2,0};
        // int m=1;
        // int[] nums2={1};
        // int n=1;
        // merge(nums1, m, nums2, n);
        // int[] nums1={4,0,0,0,0,0};
        // int m=1;
        // int[] nums2={1,2,3,5,6};
        // int n=5;
        // merge(nums1, m, nums2, n);
    }
}
