import java.time.LocalDateTime;

public class TernaryOperator {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();


        String perioada = ora >= 12 ? "PM" : "AM";

        System.out.println(ora + ":" + minute);
        System.out.println(perioada);

        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }
    }
}
