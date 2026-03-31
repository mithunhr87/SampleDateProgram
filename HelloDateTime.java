import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class HelloDateTime 
{    
    public static void main(String[] args) 
    {        // Get current date and time        
     LocalDateTime now = LocalDateTime.now();        
    // // Format date and time        
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");        
    // // Print message        
    System.out.println("Hello! Current date and time is: "                + now.format(formatter));    }}

