package kata1_jonayms;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Person {
  private final String name;
  private final Calendar Birthdate;
  private final long Millisperyear=(long)(1000*60*60*24*365.25);
    public Person(String name, Calendar Age) {
        this.name = name;
        this.Birthdate = Age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Calendar now= GregorianCalendar.getInstance();  
        return (int) (millisecondsToYear(now.getTimeInMillis()-Birthdate.getTimeInMillis()));
    }
    
    private long millisecondsToYear(long mil){
            return mil-Millisperyear;
    }
    public void setBirthday(int Edad,int Mes, int dia){
        
    }
}
