// Represents the hh:mm time format using an AM/PM format. 

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeFormat {
	public static void main(String[] args) {
		
		String hhmm = (args[0]);

          LocalTime t = LocalTime.parse(args[0], DateTimeFormatter.ofPattern("H:mm"));
       
          String out = t.format(DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH));
        
          System.out.println(out); 
    
    }
		
	}