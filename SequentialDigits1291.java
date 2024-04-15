import java.util.List;
import java.util.ArrayList;
public class SequentialDigits1291 {
    // public static boolean IfNumber(int j){
    //     char[] charArray= String.valueOf(j).toCharArray();
    //     // System.out.println(charArray.length);
    //     int index=0;
    //     for (int i=0;i<(charArray.length-1);i++){
    //         // System.out.println("value of next digit"+(Character.getNumericValue(charArray[i+1])));
    //         // System.out.println("value of current digit"+(Character.getNumericValue(charArray[i])));
    //         if ((Character.getNumericValue(charArray[i+1]))==(Character.getNumericValue(charArray[i])+1)){ 
    //             index+=1;
    //         }
    //     }
    //     if(index== charArray.length-1){
    //         return true;
    //     }
    //     return false;
    // }
        // exceededs time limit for 10 to 100000





    // public static void sequentialDigits(int low, int high) {
    //     List<Integer> L= new ArrayList<>();
    //     for(int i=low;i<high;i++){
    //         int length= String.valueOf(i).length();
    //         String ones="";
    //         for (int j=0;j<length;j++){
    //             ones+="1";
    //         }
    //         if((i+Integer.parseInt(ones))<=high && (i+Integer.parseInt(ones))>=low){
    //             L.add(i);
    //             L.add((i+Integer.parseInt(ones)));
    //         }
    //     }
    //     System.out.println(L.toString());
    // }

// misunderstood the question



    // public static void sequentialDigits(int low, int high) {
    //     List<Integer> L= new ArrayList<>();
    //     for(int i=low;i<high;i++){
    //         if(IfNumber(i)){
    //             L.add(i);
    //         }
    //     }
    //     System.out.println(L.toString());
    // }

    // part of the exceeding time limit;


    // public static void sequentialDigits(int low, int high) {
    //     List<Integer> L= new ArrayList<>();
    //     for(char i='1';i<'9';i++){
    //         String val="";
    //         for (char j=i;j<='9';j++){
    //             val+=j;
    //             if(Integer.parseInt(val)<=high && Integer.parseInt(val)>=low){
    //                 L.add(Integer.parseInt(val));
    //             }
    //         }
    //     }
    //     System.out.println(L.toString());
    // }

    // runtime is too high 

    public static void main(String[] args) {
        sequentialDigits(100, 300);
        // System.out.println("the bool :"+ IfNumber(123));
    }
}
