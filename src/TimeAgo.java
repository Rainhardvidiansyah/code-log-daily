import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeAgo{

    public static void dateTimeAgo()throws ParseException{

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date past = format.parse("20/7/2022");
            Date now = new Date();


            System.out.println(TimeUnit.MILLISECONDS.toMillis(now.getTime() - past.getTime()) + " milliseconds ago");
            System.out.println(TimeUnit.MILLISECONDS.toMinutes(now.getTime() - past.getTime()) + " minutes ago");
            System.out.println(TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime()) + " hours ago");
            System.out.println(TimeUnit.MILLISECONDS.toDays(now.getTime() - past.getTime()) + " days ago");
            long a = TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime());
            System.out.println("From variable a: " + a);
            if(TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime()) == 32){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
    }

    public static void main(String[] args)  {
        try{
            System.out.println("=====");
            dateTimeAgo();
            System.out.println("=====");
        }catch (Exception c){
            c.printStackTrace();
        }


    }

}
