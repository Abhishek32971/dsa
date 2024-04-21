import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

// import java.util.Integer;
class TwoSum1 {
    // public static int[] twoSum(int[] nums, int target) {
    //     Map<Integer,Integer> map= new HashMap<>();
    //     int[] final1=new int[2];
    //     for (int i=0;i<nums.length;i++){
    //         if(!map.isEmpty()){
            
    //             for(Map.Entry<Integer,Integer> e: map.entrySet()){
    //                 // System.out.println("the value of e : key:"+e.getKey()+" value:"+e.getValue());
    //                 // System.out.println("the value of nums[i]:"+nums[i]+" i:"+i+" targer:"+target);
    //                 if(e.getValue()==target-nums[i]){    
    //                     final1[0]=i;
    //                     final1[1]=e.getKey();
    //                     Arrays.sort(final1);
    //                     return final1;
    //                 }
    //             }
    //         }
    //         if(!map.containsKey(i)){
    //             map.put(i,nums[i]);
    //         }
    //     }
    //     return new int[0];
    // }
    //beats 5%
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
    

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        int[] arr2={3,2,4};
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
        int[] arr3={-1000,1000,-999,999,1001,-1001,2,-1002,1004,5,18,-1000000};
        System.out.println(Arrays.toString(twoSum(arr3, 7)));
    }
}