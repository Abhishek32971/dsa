import java.util.Arrays;

// public class NextPermutation31 {
//     public static int ConvertToNumber(int[] arr){
//         String str="";
//         for(int i=0;i<arr.length;i++){
//             str+=Integer.toString(arr[i]);
//         }
//         return Integer.parseInt(str);
//     }
//     public static boolean CheckIfAllIntPresent(int[] arr,int n){
//         String original=Integer.toString(ConvertToNumber(arr));
//         String newOne=Integer.toString(n);
//         for(char c: original.toCharArray()){
//             if(newOne.indexOf(c)==-1){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static boolean LargestChar(int[] nums){
//         if(nums.length==1){
//             return true;
//         }
//         for (int i=1;i<nums.length-1;i++){
//             if(nums[i-1]<nums[i]){
//                 return false;
//             }
            
//         }
//         return true;
//     }
//     public static int[] charArrayToIntArray(char[] charArray) {
//         int[] intArray = new int[charArray.length];
//         for (int i = 0; i < charArray.length; i++) {
//             intArray[i] = (int) charArray[i] - '0';
//         }
//         return intArray;
//     }
//     public static int[] reverse(int a[], int n) 
//     { 
//         int[] b = new int[n]; 
//         int j = n; 
//         for (int i = 0; i < n; i++) { 
//             b[j - 1] = a[i]; 
//             j = j - 1; 
//         } 
  
//         // printing the reversed array 
//         return b;
//     }
//     public static int[] GetAns(int[] nums){
//         if(LargestChar(nums)){
//             return reverse(nums,nums.length);
//         }
//         int original=ConvertToNumber(nums);
//         int a=Integer.toString(original).length();
//         String s="";
//         for(int i=0;i<a;i++){
//             s+="9";
//         }
//         int end=Integer.parseInt(s);
//         int largest2nd=original;
        
//         for(int i=original;i<end;i++){
//             if(CheckIfAllIntPresent(nums,i)){
//                 if(i>original){
//                     return charArrayToIntArray(Integer.toString(i).toCharArray());
//                 }
//             }
//         }
//         return new int[0];

//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,3};
//         System.out.println(Arrays.toString(GetAns(arr)));
//     }
// }


// the platform expects me to pass the int[] by value and not i cannot assign the same array name to differnt values all of a sudden. 

// class NextPermutation31 {
//     public static int ConvertToNumber(int[] arr){
//         String str="";
//         for(int i=0;i<arr.length;i++){
//             str+=Integer.toString(arr[i]);
//         }
//         return Integer.parseInt(str);
//     }
//     public static boolean CheckIfAllIntPresent(int[] arr,int n){
//         String original=Integer.toString(ConvertToNumber(arr));
//         String newOne=Integer.toString(n);
//         for(char c: original.toCharArray()){
//             if(newOne.indexOf(c)==-1){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static boolean LargestChar(int[] nums){
//         if(nums.length==1){
//             return true;
//         }
//         for (int i=1;i<=nums.length-1;i++){
//             if(nums[i-1]<nums[i]){
//                 return false;
//             }
            
//         }
//         return true;
//     }
//     public static int[] charArrayToIntArray(char[] charArray) {
//         int[] intArray = new int[charArray.length];
//         for (int i = 0; i < charArray.length; i++) {
//             intArray[i] = (int) charArray[i] - '0';
//         }
//         return intArray;
//     }
//     public static void swap(int[] original,int[] newOne){
//         for(int i=0;i<newOne.length;i++){
//             original[i]=newOne[i];
//         }
//     }
//     public static int[] reverse(int a[], int n) 
//     { 
//         int[] b = new int[n]; 
//         int j = n; 
//         for (int i = 0; i < n; i++) { 
//             b[j - 1] = a[i]; 
//             j = j - 1; 
//         } 

//         // printing the reversed array 
//         return b;
//     }
//     public static void nextPermutation(int[] nums) {
//         if(LargestChar(nums)){
//             swap(nums,reverse(nums,nums.length));
//             System.out.println(Arrays.toString(nums));
//             return;
//         }
//         int original=ConvertToNumber(nums);
//         int a=Integer.toString(original).length();
//         String s="";
//         for(int i=0;i<a;i++){
//             s+="9";
//         }
//         int end=Integer.parseInt(s);
//         int largest2nd=original;
        
//         for(int i=original;i<end;i++){
//             if(CheckIfAllIntPresent(nums,i)){
//                 if(i>original){
//                     swap(nums,charArrayToIntArray(Integer.toString(i).toCharArray()));
//                     System.out.println(Arrays.toString(nums));
//                     return;
//                 }
//             }
//         }
        
//     }
//     public static void main(String[] args) {
//                 int[] arr={1,2,3};
//                 nextPermutation(arr);
//             }
// }

//fixed the previous error using the newly created swap() method but , this solution does not handle duplicate values in the array

class NextPermutation31 {





    
}
