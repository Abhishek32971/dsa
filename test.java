public class test {
    public static void main(String[] args) {
        int[] j={1,2,3,4,3,2,8,1,3};
        int max2=-1;
        int max=-1;
        for(int i: j){
            if(i>max){
                if(max>max2){
                    max2=max;
                }
                max=i;
            }
        }
        System.out.println("max"+max+"max2"+max2);
    }
}
