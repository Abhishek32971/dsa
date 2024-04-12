import java.util.Map;
import java.util.HashMap;
public class ContainsDuplicate217 {
    // using hashmap
    public static boolean ifDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int n : nums){
            if(map.containsKey(n) && map.get(n)==1){
                return true;
            }
            map.put(n,1);
        }
        return false;
    }
    // by checking consecutive elements after sorting 
    public static boolean ifDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){   // add -1 to prevent it from out of bounds error
            if(nums[i]==nums[i+1]){
                return true
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3};
        System.out.println(ifDuplicate(nums));
    }
}
