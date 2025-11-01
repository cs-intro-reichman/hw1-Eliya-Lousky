// Represents the hh:mm time format using an AM/PM format. 

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
	public static void main(String[] args) {
		
		String hhmm = (args[0]);
    
        LocalTime time = LocalTime.parse(hhmm, DateTimeFormatter.ofPattern("H:m"));

      
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("hh:mm a");

      
        System.out.println(time.format(outputFormat));
    }
		
	}