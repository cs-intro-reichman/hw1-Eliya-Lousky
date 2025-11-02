
// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = (args[0]);
		
        int hour12;
		String suffix;
		
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
		
		int minutes = Integer.parseInt("" +time.charAt(3) + time.charAt(4));
		 
        if (hours < 12) {
            suffix = "AM";
        } else {
            suffix = "PM";
        }
		if (hours == 0) {
            hour12 = 0;
        } else if (hours > 12) {
            hour12 = hours - 12; 
        } else {
            hour12 = hours;
        }
		 if (minutes < 10) {
            System.out.println(hour12 + ":0" + minutes + " " + suffix);
        } else {
            System.out.println(hour12 + ":" + minutes + " " + suffix);
}   

        }    
              }          

