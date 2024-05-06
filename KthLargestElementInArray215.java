import java.util.Arrays;
public class KthLargestElementInArray215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,2};
        Arrays.sort(arr);
        int a=3;
        System.out.println(arr[arr.length-a]);
    }
}
