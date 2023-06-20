package hillel.lesson5;
import java.util.Date;
import java.util.Calendar;
public class GfG {
    // main method
    public static void main(String[] args) throws InterruptedException {
  
        // creating a Calendar object
        Calendar c = Calendar.getInstance();
  
        // set Month
        // MONTH starts with 0 i.e. ( 0 - Jan)
        c.set(Calendar.MONTH, 11);
  
        // set Date
        c.set(Calendar.DATE, 05);
  
        // set Year
        c.set(Calendar.YEAR, 1996);
  
        // creating a date object with specified time.
        Date dateOne = c.getTime();
  
        // creating a date of object
        // storing the current date
        Date currentDate = new Date();
        Thread.sleep(3000);
        Date currentDate2 = new Date();

        System.out.print("Is currentDate after date one : ");
  
        // if currentDate is after dateOne
        System.out.println(currentDate2.after(currentDate));
    }
}