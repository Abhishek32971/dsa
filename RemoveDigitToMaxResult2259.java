public class RemoveDigitToMaxResult2259 {
    // public static void getMaxVal(String number,char digit){
    //     int[] strArray=new int[number.length()];
    //     int j=0;
    //     for (int i=0;i<number.length();i++){
    //         System.out.println(i);
    //         if(number.charAt(i)== digit){
    //             strArray[j]=Integer.parseInt(number.substring(0,i)+number.substring(i+1,number.length()));
    //             j++;
    //         }
    //     }
    //     System.out.println(strArray.toString());
    //     int max=strArray[0];
    //     for (int s: strArray){
    //         max=max<s?s:max;       // to get the max value 
    //     }
    //     System.out.println("the number"+number+"the digit"+digit+ "the answer"+ max);
    // }
    public static void getMaxVal(String number,char digit){
        // int[] strArray=new int[number.length()];
        // int j=0;
        String max="";
        for (int i=0;i<number.length();i++){
            // System.out.println(i);
            if(number.charAt(i)== digit){
                String str2=number.substring(0,i)+number.substring(i+1,number.length());
                max=max.compareTo(str2)>0?max:str2;
                // j++;
            }
        }
        System.out.println(max);
    
    }



    // optimal solution 
    public String removeDigit(String number, char digit) {
        StringBuilder builder = new StringBuilder(number);
        int n = number.length(), lastIndex = -1;
        for (int i = 0; i < n; i++) {
            char c = number.charAt(i);
            if (c == digit) {
                lastIndex = i;
                if (i == n - 1 || number.charAt(i + 1) > c) {
                    builder.deleteCharAt(i);
                    return builder.toString();
                }
            }
        }
        builder.deleteCharAt(lastIndex);
        return builder.toString();
    }

    public static void main(String[] args) {
        String str="2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471";
        String str2="1231";
        String str3="551";
        getMaxVal(str,'3');
        getMaxVal(str2,'1');
        getMaxVal(str3,'5');
    }
}
