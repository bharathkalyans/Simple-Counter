public class Counter {
    public static void main(String[] args) throws InterruptedException {
        int seconds=00,minutes=00,hours=00;
        System.out.println("Hours : Minutes : Seconds");
        while(true){
            System.out.println(hours +" : "+minutes +" : "+ seconds);

            Thread.sleep(1000);
            seconds +=1;
            if(seconds==60){
                minutes +=1;
                seconds=00;
            }
            if(minutes==60){
                hours +=1;
                minutes=00;
            }
        }
    }
}
