import java.util.Arrays;
public class ChocolateDistributionProblem {
    public static void distribute(int[] arr,int n){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        System.out.println("array"+Arrays.toString(arr)+ "i end "+ (arr.length-n));
        for(int i=0;i<=arr.length-n;i++){
            if((arr[i+n-1]-arr[i])<min){
                min=arr[i+n-1]-arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int[] arr1= {7,3,2,4,9,12,56};
        int m1=3;
        int[] arr2= {12,4,7,9,2,23,25,41,30,40,28,42,30,44,48,43,50};
        int m2=7;
        int[] arr3= {3,4,1,9,56,7,9,12};
        int m3=5;

        distribute(arr1,m1);
        distribute(arr2,m2);
        distribute(arr3,m3);
    }
}
