
public class TimeFormat {
	public static void main(String[] args) {
		
	     String  time = args[0]; 
     
        int h = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int m = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        String period = (h < 12) ? "AM" : "PM";
      
        h = h % 12;
        if (h == 0) {
            h = 12;
        }
    
      
        System.out.print(h + ":");
        if (m < 10) System.out.print("0");
        System.out.print(m + " " + period + "\n");
    }
}

    

    