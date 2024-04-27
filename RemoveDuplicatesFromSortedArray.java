import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    // public static int removeDuplicates(int[] nums) {
    //     int[] newArr=new int[nums.length];
    //     int duplicate=Integer.MIN_VALUE;
    //     int j=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]!=duplicate){
    //             newArr[j]=nums[i];
    //             j++;
    //             duplicate=nums[i];
    //         }
    //     }
    //     for(int i=0;i<newArr.length;i++){
    //         nums[i]=newArr[i];
    //     }
    //     System.out.println(Arrays.toString(newArr));
    //     System.out.println(Arrays.toString(nums));
    //     return j;
    // }

    // runtime beats 72% - 1ms , not the optimal solution.

    public static int removeDuplicates(int[] nums){
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
