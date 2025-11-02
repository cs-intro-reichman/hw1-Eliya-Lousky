import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
	public static void main(String[] args) {
		 String input = args[0]; 

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.parse(input, inputFormat);

       
        DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("h");
        DateTimeFormatter minuteFormat = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter ampmFormat = DateTimeFormatter.ofPattern("a");

    
        System.out.print(time.format(hourFormat)); 
        System.out.print(":");
        System.out.print(time.format(minuteFormat)); 
        System.out.print(" ");
        System.out.println(time.format(ampmFormat)); 
    }

}
