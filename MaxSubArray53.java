public class MaxSubArray53 {
    
        public static int maxSubArray(int[] nums) {
            // int currsum=0;                                        205/210 passed test cases
            // int maxsum=Integer.MIN_VALUE;
            // for (int i=0;i<nums.length;i++){
            //     currsum=0;
            //     for (int j=i;j<nums.length;j++){
            //         currsum=currsum+nums[j];
            //         maxsum=maxsum>currsum?maxsum:currsum;
            //     }
            // }
            // return maxsum;
            int max=Integer.MIN_VALUE;
            int max_till_now=0;
            for (int i=0;i<nums.length;i++){
                max_till_now= nums[i]>nums[i]+max_till_now? nums[i]: nums[i]+max_till_now;
                max=max>max_till_now?max:max_till_now;
            }
            return max;
        }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={-1,-2,-3,4,-5,-6};
        int j=maxSubArray(arr1);
        int k=maxSubArray(arr2);
        System.out.println("j:"+j);
        System.out.println("k"+k);

    }
}
