public class test {
    public static int ConvertToNumber(int[] arr){
        String str="";
        for(int i=0;i<arr.length;i++){
            str+=Integer.toString(arr[i]);
        }
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        int[] i={0,1};
        System.out.println(((i.length-1)/2));
        System.out.println(ConvertToNumber(i));
    }
}
