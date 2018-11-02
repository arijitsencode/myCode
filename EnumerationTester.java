import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EnumerationTester {

   public static void main(String args[]) {
      Iterator days;Iterator days1;
      Map dayNames = new HashMap();
      dayNames.put("Sunday", new String ("1"));
      dayNames.put("Monday", new String ("2"));
      dayNames.put("Tuesday", new String ("3"));
      dayNames.put("Wednesday", new String ("4"));
      dayNames.put("Thursday", new String ("5"));
      dayNames.put("Friday", new String ("6"));
      dayNames.put("Saturday", new String ("7"));
      days = dayNames.values().iterator();
      while (days.hasNext()){
         System.out.println(days.next()); 
      }
      days1 = dayNames.keySet().iterator();
      while (days1.hasNext()){
         System.out.println(days1.next()); 
      }
   }
}