import java.util.Arrays;

public class RepeatAndMissingNumberArray {
    public static int[] getArray(int[] arr,int n){
        int[] temp=new int[n+1];
        int repeaingnumber=0;
        for(int i=0;i<n;i++){
            if(temp[arr[i]]!=1){
                temp[arr[i]]=1;
            }
            else{
                repeaingnumber=arr[i];
            }
        }
        int missing=0;
        for(int i=1;i<n;i++){
            if(temp[i]==0){
                missing=i;
            }
        }
        return new int[] {repeaingnumber,missing};
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,2};
        System.out.println(Arrays.toString(getArray(arr,arr.length)));
    }
}
