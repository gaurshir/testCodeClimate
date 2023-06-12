import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class decimal {


    public static void main(String args[]) {

        Map<String, Object> map =  new HashMap<>();
        map.put("test", true);
        Object test1 = "true";
        Object test = (String) test1.toString();

        Object flag = map.get("test");
        String h4 =  flag.toString();
        if(flag == null) {
            System.out.println("null");
        } else {
            String h =  flag.toString();
            System.out.println(flag.toString());

        }

        System.out.print(test);

      }

}
