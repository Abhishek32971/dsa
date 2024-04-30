import java.util.*;
public class PlusOne66 {
    // public static int[] plusOne(int[] digits) {
    //     String str="";
    //     for (int i=0;i<digits.length;i++){
    //         str+=Integer.toString(digits[i]);
    //     }
    //     int eger=Integer.parseInt(str);
    //     eger+=1;
    //     if(Integer.toString(eger).length()==digits.length){
    //         for(int i=0;i<digits.length;i++){
    //             digits[i]=(Integer.toString(eger).charAt(i))-'0';
    //         }
    //         return digits;
    //     }
    //     int[] arr=new int[digits.length+1];
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=(Integer.toString(eger).charAt(i))-'0';
    //     }
    //     return arr;
    // }    

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        int[] digis= new int[digits.length+1];
        digis[0]=1;
        return digis;
    }
    public static void main(String[] args) {
        int[] arr= {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
