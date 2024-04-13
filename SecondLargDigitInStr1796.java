import java.util.HashSet;
public class SecondLargDigitInStr1796 {
    // public static void secondHighest(String s) {
    //     HashSet<Integer> hash=new HashSet<>();
    //     for (int i=0;i<s.length();i++){
    //         if(Character.isDigit(s.charAt(i))){
    //             hash.add(Character.getNumericValue(s.charAt(i)));
    //         }
    //     }
    //     int max2=-1;
    //     int max=-1;
    //     for(int i: hash){
    //         if(i>max){
    //             if(max>max2){
    //                 max2=max;
    //             }
    //             max=i;
    //         }
    //     }
    //     System.out.println(max2);
    // }
    public int secondHighest(String s) {
        int flag=2;
        for(char ch='9';ch>='0';ch--) {
            if(s.indexOf(ch)!=-1) flag--;
            if(flag==0) return ch-'0';
        }
        return -1;
    }
    public static void main(String[] args) {
        secondHighest("dfa12321afd");
        secondHighest("abc1111");
    }
}
