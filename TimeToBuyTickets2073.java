import java.util.Arrays;

class TimeToBuyTickets2073{

    // public static void timeRequiredToBuy(int[] tickets, int k) {
    //     int flag=0;
    //     while(tickets[k]!=0){
    //         for (int i=0;i<tickets.length ;i++){
    //             if(tickets[i]!=0){
    //                 tickets[i]-=1;
    //                 flag+=1;
    //             }
    //         }
    //     }
    //     System.out.println(flag);
    // }


    // wrong answer for the test case [84,49,5,24,70,77,87,8] k=3   this is happening because the queue starts from the right not the left . 
    

    // public static void timeRequiredToBuy(int[] tickets, int k) {
    //     int flag=0;
    //     while(tickets[k]!=0){
    //         for (int i=tickets.length-1;i>=0 ;i--){
    //             if(tickets[i]!=0){
    //                 tickets[i]-=1;
    //                 flag+=1;
    //             }
    //         }
    //     }
    //     System.out.println(flag);
    // }

    // still wont fix . i just replace the order . since the while loop is present the code will reduce 1 from the whole queue and then check tickets[k]

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int flag=0;
        while(true){
            for (int i=0;i<tickets.length ;i++){
                
                if(tickets[k]==0){
                    System.out.println(flag);
                    return flag;
                }
                if(tickets[i]!=0){
                    tickets[i]-=1;
                    flag+=1;
                }
                System.out.println("flag"+flag);
                System.out.println(Arrays.toString(tickets));
            }
            
        }
    }
    
    
    public static void main(String[] args) {
        int[] tickets={84,49,5,24,70,77,87,8};
        System.out.println(timeRequiredToBuy(tickets, 3));
    }
}