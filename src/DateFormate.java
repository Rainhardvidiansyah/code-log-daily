import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormate {

    public static void main(String[] args) throws ParseException {
//        Date now = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy || hh:mm");
//        String printDate = simpleDateFormat.format(now);
//        System.out.println(printDate);

        String pattern = "dd-MM-yyyy-hh:mm";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String formattedDate = dateFormat.format(new Date());
        System.out.println(formattedDate);


    }
}
