import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
	public static void main(String[] args) {
	   String hourFormat = args[0];

      
        int hourDigits = Integer.parseInt("" + hourFormat.charAt(0) + hourFormat.charAt(1));
        int minDigits = Integer.parseInt("" + hourFormat.charAt(3) + hourFormat.charAt(4));

       
        int newFormatHour = hourDigits % 12;
        if (newFormatHour == 0) {
            newFormatHour = 12;
        }

      
        String newFormatMin;
        if (minDigits < 10) {
            newFormatMin = "0" + minDigits;
        } else {
            newFormatMin = "" + minDigits;
        }

     
        System.out.print(newFormatHour + ":" + newFormatMin);

        
        if (hourDigits >= 12) {
            System.out.println(" PM");
        } else {
            System.out.println(" AM");
        }
    }

}
